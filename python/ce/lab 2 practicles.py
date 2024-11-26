n= input("enter the number")
n1= int(n)
if n[1]=='0' :
 if n[2]=='0':
  if n[3]=='0':
   c= int(n[0])*2
   print(f"you have {c} no 500 notes")
elif  n[2]=='0':
  if n[3]=='5':
   if n[1]=='0':
    c1= int(n[0])*2
    d1= 1
    print(c1,d1)

elif n[3]=="0":
 c2= int(n[0])*2
 d2= int(n[1])*1
 e2 = int(n[2])*1
 print(c2 ,d2,e2)
elif n[3]=="5":
  c3= int(n[0])*2
  d3= int(n[1])*1
  e3 = int(n[2])*1
  f3= "1"
  print(c3,d3,e3,f3)

elif n[3]=="0":
  c2= int(n[0])*2
  d2= int(n[1])*1
  e2 = int(n[2])*1
  f2 = "2"
  print(c2,d2,e2,f2)
else:
 print("what is this shit")

"""
"""
n= input("enter the number " )
a= int(n[0])
b= int(n[-1])
print(a,b)
"""
n= input("enter the number")
nl= len(n) 
c=0
for i in range(0,nl):
 int(n[i])+=c
print(c)"""