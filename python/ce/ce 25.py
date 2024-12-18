dd= True
while dd == True:

 n= int(input("enter the year"))
 b=int(input("enter the month that you want to know how many days in it"))
 a=n%4
 if a == 0:
  if b==1 or b==3 or b==5 or b==7 or b==9 or b==11:
   print("you have 31 days in your selected month")
  if b==4 or b==6 or b==8 or b==10 or b==12 :
   print("you have 30 days in your selected month")
  if b==2:
   print("you have 29 days in your selected month")
 else:
  if b==1 or b==3 or b==5 or b==7 or b==9 or b==11:
   print("you have 31 days in your selected month")
  if b==4 or b==6 or b==8 or b==10 or b==12 :
   print("you have 30 days in your selected month")
  if b==2:
   print("you have 28 days in your selected month")
ff= input("do you want to stop enter \'no\'").lowercase
if ff=="no":
 dd= False