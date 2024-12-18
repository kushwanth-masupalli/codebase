import cv2 as cv
img = cv.imread('photos/cat.png')
blur = cv.GaussianBlur(img,(7,7),0) 
cv.imshow('original',img)
cv.imshow('blur',blur)
cv.waitKey(0)


#edge detection
img2  = cv.imread('photos/domore.png') 
canny = cv.Canny(blur,50,150)  #using blur image here for better edges
cv.imshow('edges',canny)
cv.waitKey(0)