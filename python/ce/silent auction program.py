import os# in the name itself it is the meaning
a=1
while  a == 1 :

 bidder_data ={
 }
 name = input("enter your name")
 bid = int(input("enter your bid"))
 bidder_data[name]=bid
 bidder= input("is there are any bidder").lower()
 if bidder == "no":
    a== 2
 elif bidder== "yes":
  os.system('cls')
 for i in bidder_data:
  dd=bidder_data[i]
  c=0
  if c>0:
    c=c+i
  print(f" {i }and bid is {c}")