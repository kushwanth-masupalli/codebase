d= True
while d==True:
 
  def cal (r,e):
    if op=="+":
      print(a+b)
    elif op == "-":
      print(a-b)
    elif op == "*":
      print(a*b)
    elif op == "/":
      print(a/b)
    else:
      print("sorry the operation does not exists in this version")
  a=int(input("enter the first number"))
  b= int(input("enter the second number"))
  op=input("enter the operation that do you want to perform")


  cal(a,b)

  c= input("enter  \"0\" to exit or any key to countinue" )                                           
  if c== "0 ":
    d= False
  else:
    print()