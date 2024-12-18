f1= open("file1.txt","r+")  #the read mode is by default mode if you didnt give nothing it read
print(f1.tell())
#data =f1.read()
print(f1.read())
print(f1.tell())
f1.write(" this is my kingdom built by me")

