import cv2 as cv
import os
import numpy as np

# Initialize empty lists to store images and labels
images = []
labels = []
image_files = []  # List to store image file names

# Function to prepare images and labels
def prepare_images():
    folder_path = 'photos'  # Path to the folder containing images
    for f in os.listdir(folder_path):
        if f.endswith(('.jpg', '.png')):
            image_files.append(f)

    face_cascade = cv.CascadeClassifier(cv.data.haarcascades + 'haarcascade_frontalface_default.xml')

    current_label = 0  # Counter to assign unique labels

    for image_file in image_files:
        # Full path to the image file
        img_path = os.path.join(folder_path, image_file)
        
        # Read the image
        img = cv.imread(img_path)
        if img is None:
            print(f"Error: Image {img_path} not found!")
            continue
        
        gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)  # Convert image to grayscale
        
        images.append(gray)  # Add the grayscale image to the images list
        labels.append(current_label)  # Assign label
        current_label += 1  # Increment the label for the next image

# Function to train the recognizer
def train_recognizer():
    recognizer = cv.face.LBPHFaceRecognizer_create()

    # Train the recognizer with the images and corresponding labels
    recognizer.train(images, np.asarray(labels))

    # Save the trained model to a file
    recognizer.save('face_recognizer.yml')
    print("Model trained and saved as 'face_recognizer.yml'")

# Function to test the recognizer
def test_recognizer():
    recognizer = cv.face.LBPHFaceRecognizer_create()
    recognizer.read('face_recognizer.yml')  # Load the trained recognizer model

    test_img_path = 'photos/kush.jpg'  # Test image (you can change this to any image)
    test_img = cv.imread(test_img_path)
    
    if test_img is None:
        print("Error: Test image not found!")
        return
    
    gray_test = cv.cvtColor(test_img, cv.COLOR_BGR2GRAY)
    face_cascade = cv.CascadeClassifier(cv.data.haarcascades + 'haarcascade_frontalface_default.xml')
    
    # Detect faces in the test image
    faces = face_cascade.detectMultiScale(gray_test, scaleFactor=1.1, minNeighbors=5)
    
    if len(faces) == 0:
        print("No faces detected in the test image!")
    else:
        for (x, y, w, h) in faces:
            # Predict the label for the detected face
            roi_gray = gray_test[y:y+h, x:x+w]
            label, confidence = recognizer.predict(roi_gray)
            
            # Draw rectangle around the face
            cv.rectangle(test_img, (x, y), (x + w, y + h), (0, 0, 255), 2)

            # Use the label to find the corresponding image name
            image_name = image_files[label]  # Get the image file name using the label
            name_without_extension = os.path.splitext(os.path.basename(image_name))[0]  # Extract name without extension
            
            # Show the name on the image
            cv.putText(test_img, name_without_extension, (x, y - 10), cv.FONT_HERSHEY_SIMPLEX, 1, (0, 255, 0), 2)

            # Print the predicted label and confidence
            print(f"Predicted Label: {label}")
            print(f"Confidence: {confidence}")
            print(f"Recognized: {name_without_extension}")

    # Show the image with rectangles and names drawn around detected faces
    cv.imshow('Detected Faces', test_img)
    cv.waitKey(0)
    cv.destroyAllWindows()

# Main execution
prepare_images()
train_recognizer()
test_recognizer()
