import cv2 as cv
import numpy as np

# img = cv.imread('photos/image.png')  #this is for normal images
# cv.imshow('cat',img)
# now we will work with a blank image for this session

blank = np.zeros((500,500,3),dtype='uint8')
cv.imshow('blank',blank)
cv.waitKey(0)

#1.paint the image to certain colour
#blank[:]=0,255,0
blank[0:300,0:500] = 0,255,0  #[row_start:row_end ,column_start:column_end]
cv.imshow('paint',blank)
cv.waitKey(0)

#2.to draw a rectangle 
#           img, pt1-topleft, pt2 bottoright,grb,thickness
cv.rectangle(blank,(0,0),(200,200),(100,100,100),thickness=3)  #thickness = -1 for fill
cv.imshow('rectange',blank)
cv.waitKey(0)

# to draw a circle  
cv.circle(blank,(250,250),40,(225,0,0),thickness=5) #thickness =-1 for fill the circlce
cv.imshow('cricle',blank)
cv.waitKey(0)

#to draw a straight line
cv.line(blank,(0,0),(250,250),(0,0,255),thickness=5)
cv.imshow('line,',blank)
cv.waitKey(0)

#to write some text
text = np.zeros((500,500,3),dtype='uint8')
cv.putText(text,"i am iron man",(0,250),cv.FONT_HERSHEY_COMPLEX,1.0,(0,0,255),thickness=3) 
cv.imshow('text',text)
cv.waitKey(0)