size = input("please enter the size of pizza do you want (s /m/l)?")
bill =0
if size == 's' or size == "S":
 bill += 100
elif size == 'm' or size == 'M':
 bill += 200
elif size == 'l' or size =='L':
 bill +=300
ppp = input("do you want any pepparoni(y/n)?")
if ppp == 'y' or ppp =='Y':
 if size == 'm' or size == 'M':
  bill += 50
 elif size == 'l' or size =='L':
  bill +=100
else :
 bill +=0
ex = input("do you need any extra cheese (y/n)")
if ex == 'y' or ex =='Y':
 bill +=20
else :
 bill +=0  
print(bill)