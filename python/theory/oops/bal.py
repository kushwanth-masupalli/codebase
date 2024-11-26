"""n= input("enter the number")
a= n.split(",")
for i in range(1,len(a)):
  c= a.count(i)
  print(i ,c)
  a= input("enter the number")
e=int(a)
c=0
for i in range(0,len(a)):
   d= int(a[i])**3
   c+=d
print(c)
if c==e:
    print("it is armstrong number")
else:
    print("it is not an armstrong number")"""
n= input("enter the number")
nl= len(n)
c=""
for i in range(-1,-nl):
 d=n[i]
 c+=d
  
print(c)
