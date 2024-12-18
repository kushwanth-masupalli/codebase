     #for image face detection


# import cv2 as cv

# img = cv.imread('photos/me.jpg')

# gray = cv.cvtColor(img,cv.COLOR_BGR2GRAY)
# face_cascade = cv.CascadeClassifier(cv.data.haarcascades + 'haarcascade_frontalface_default.xml')

# faces = face_cascade.detectMultiScale(gray,scaleFactor=1.1,minNeighbors=5)

# for(x,y,w,h) in faces :
#     cv.rectangle(img,(x,y),(x+w,y+h),(0,0,255),2)
# cv.imshow('readed',img)
# cv.waitKey(0)



             #for video face detection

# Import OpenCV library
import cv2 as cv

# Video face detection
def video_face_detection():
    video = cv.VideoCapture(0)  # Capture from webcam
    face_cascade = cv.CascadeClassifier(cv.data.haarcascades + 'haarcascade_frontalface_default.xml')

    # Check if the cascade is loaded properly
    if face_cascade.empty():
        print("Error: Unable to load cascade classifier.")
        return
    
    if not video.isOpened():
        print("Error: Unable to access the webcam.")
        return

    while True:
        isTrue, frame = video.read()
        if isTrue:
            gray = cv.cvtColor(frame, cv.COLOR_BGR2GRAY)  # Convert to grayscale

            # Detect faces
            faces = face_cascade.detectMultiScale(gray, scaleFactor=1.1, minNeighbors=7)

            # Draw rectangles around faces
           
            for (x, y, w, h) in faces:
                 if w > 75 and h >75:  # Ignore very small detections
                  cv.rectangle(frame, (x, y), (x + w, y + h), (0, 0, 255), 2)
                  cv.putText(frame,"person",(x+10,y),cv.FONT_HERSHEY_COMPLEX,1.0,(0,0,255),3)


            cv.imshow('Face Detection', frame)

            # Break the loop on pressing 'd'
            if cv.waitKey(20) & 0xFF == ord('d'):
                print("Exiting...")
                break
        else:
            print("Error: Unable to read the frame.")
            break

    # Release resources
    video.release()
    cv.destroyAllWindows()

# Run the video face detection
video_face_detection()
