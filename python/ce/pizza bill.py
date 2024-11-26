size = input("please enter the size of pizza do you want(s/m/l)?")
bill = 0
if size == 's' or size == 'S':
 bill +=100
if size == 'm' or size == 'M':
 bill +=200
if size == 'l' or size == 'L':
 bill+=300
add_ppp=input("do you want pepparoni (y/n)")
if add_ppp == 'y'or add_ppp =='Y':
 if size == 'm' or size == 'M':
  bill+=50
 if size =='l' or size == 'L':
  bill +=100
else :
 bill+=0
cc = input("do you want any extra cheese(y/n)")
if cc=='y' or cc=='Y':
 bill +=20
else :
 bill +=0
print(bill)