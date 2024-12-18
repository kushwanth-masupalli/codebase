import cv2 as cv

img =cv.imread('photos/cat.png')

converted = cv.cvtColor(img,cv.COLOR_BGR2GRAY)
cv.imshow('convertd to gray',converted)
cv.waitKey(0)