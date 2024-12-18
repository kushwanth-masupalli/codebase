
                          #image reading

#in this file we are going to learn how to read images and videos 
#first we will import the opencv module
import cv2 as cv

img = cv.imread('photos/cat.png')

#img is the variable that stores the image
#imread method will show us the respective photo with the 
#arguments is path 

cv.imshow('cat',img)  

#this method will show the image the first argument is the name of the image that you 
#want to dispaly second argument is the variable that stored the image

cv.waitKey(0)    
#this functino will take an integer as an input that is called 
#delay if you give 0 then it will display the image untill
#you press any key if you give any it integer it will stop
#that milliseconds of time


                   #video reading
import cv2 as cv

#variable to store the video 
#function VideoCapture(path) to store the video in the variable
capture = cv.VideoCapture('videos/dog.mp4')

#we can't directly show the video so we use a while loop and go frame by frame to see the video

while True:
    isTrue,frame = capture.read()   #function to read the video frame by frame
    if(isTrue):
     cv.imshow('video',frame)
    else :
       break
    if(cv.waitKey(20) & 0xFF==ord('d')):
        break
capture.release()
cv.destroyAllWindows()


              #image writing

img = cv.imread('photos/cat.png')
img = cv.cvtColor(img,cv.COLOR_BGR2GRAY)

cv.imwrite('photos/img.png',img)