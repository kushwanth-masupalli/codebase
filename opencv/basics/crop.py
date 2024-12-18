import cv2 as cv

img = cv.imread('photos/cat.png')

cropped_img = img[0:400,0:700] #[start_y:end, start_x:end]

cv.imshow('cropped image',cropped_img)
cv.waitKey(0)