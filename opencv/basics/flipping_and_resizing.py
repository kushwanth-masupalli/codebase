import cv2 as cv

img = cv.imread('photos/cat.png')
cv.imshow('original',img)
flipped_img  = cv.flip(img,1)     # 1 for horizontal 0 for vertical -1 for both
cv.imshow('flipped image',flipped_img) 
cv.waitKey(0)



resized = cv.resize(img,(200,200),interpolation=cv.INTER_CUBIC) #inter_cubic is for smoothre
cv.imshow('resised',resized)                                    #than normal inter_linear
cv.waitKey(0)


