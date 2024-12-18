#it is just resizing witha a scaling factor


import cv2 as cv

img = cv.imread('photos/cat.png')

cv.imshow('cat',img)  
 

def rescale(frame,scale = 0.7):
    width = int(frame.shape[1]*scale)
    height = int(frame.shape[0]*scale)

    dimensions=(width,height)
    return cv.resize(frame,dimensions,interpolation=cv.INTER_AREA)

img2  =rescale(img)
cv.imshow('rescaled',img2)
cv.waitKey(0)
cv.destroyAllWindows()



capture = cv.VideoCapture('videos/dog.mp4')

while True:
    isTrue,frame = capture.read()   #function to read the video frame by frame
    if(isTrue):
     cv.imshow('video',frame) 
     resimg = rescale(frame,0.2)
     cv.imshow('vidoe2',resimg)
    else :
       break
    if(cv.waitKey(20) & 0xFF==ord('d')):
        break
capture.release()
cv.destroyAllWindows()