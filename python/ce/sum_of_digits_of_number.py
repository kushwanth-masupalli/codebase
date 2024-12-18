# a= input("please enter a two digit number")
# b= int(a[0])
# c= int(a[1])
# print(b+c)
#to seperate the individual character we use subscript


#if the input is a int or a number format
b = int(input("enter the number"))
sum = 0
while b>0:
    sum+=(b%10)
    b/=10
print(int(sum))


#if the input is in stirng format
sum=0
b = input("enter the number")
for i in range(len(b)):
    sum+=(int(b[i]))
print(sum)
