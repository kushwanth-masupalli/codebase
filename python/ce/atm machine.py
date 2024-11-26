n= input("enter a number ")
n1= len(n)
print(n1)
if int(n[1])==0 and int(n[2])==0 and int(n[3])==0: 
 if n1 == 4 :
   a= int(n[0])%2
   print(a)
   if a==0:
    c= int(n[0])//2
    print("you have",c,"two thousnad rupees note")
   elif a!=0 :
    d= int(n[0])*2
    print("you have " ,d," five hundread notes") 
elif int(n[2])==0 and int(n[3])==0:
 if n1 == 4 :
   a= int(n[0])%2
   print(a)
   if a==0:
    c= int(n[0])//2
    print("you have",c,"two thousnad rupees note")
   elif a!=0 :
    d= int(n[0])*2
    print("you have " ,d," five hundread notes") 
    s=int(n[1])
    print("you have ",s,"houndread rupees notes") 
elif int(n[3])==0:
 if n1 == 4 :
   a= int(n[0])%2
   print(a)
   if a==0:
    c= int(n[0])//2
    print("you have",c,"two thousnad rupees note")
   elif a!=0 :
    d= int(n[0])*2
    print("you have " ,d," five hundread notes") 
    s=int(n[1])
    print("you have ",s,"houndread rupees notes") 
    d1= int(n[2])
    d2= int(n[3])
    if d1!=0 and d2==0:
      print("you have ",d1,"ten rupee notes")
    if d1==0  and d2!= 0:
      if d2==0:
       print("you have",2,"5 rupee coins") 
      elif d2==1:
       print("you have",1,"5 rupee coin") 
elif int(n[1])==0 and int(n[2])==0 and int(n[0])!=0 and int(n[3])!=0:
 if n1 == 4 :
   a= int(n[0])%2
   print(a)
   if a==0:
    c= int(n[0])//2
    print("you have",c,"two thousnad rupees note")
   else :
    c= int(n[0])*2
    print("you have",c,"500 notes")  
    
    d2= int(n[3])
    if d2 == 5: 
       
        print("you have",1,"five rupee coin rupee coin") 
else:
  if n1 == 4 :
   a= int(n[0])%2
   print(a)
   if a==0:
    c= int(n[0])//2
    print("you have",c,"two thousnad rupees note")
   elif a!=0 :
    d= int(n[0])*2
    print("you have " ,d," five hundread notes")
    s=int(n[1])
    print("you have ",s,"houndread rupees notes")
    sq= int(n[2])
    print('you have ',sq,'ten rupee notes')
    print("you one five rupee coin")