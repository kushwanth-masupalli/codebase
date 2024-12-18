n = int(input("enter a number:\n"))
def pc(n):
 for i in range(2,n):
  if n%i == 0: 
   print("print it was not a prime number")
  else:
   print("it is a prime number")
pc(n)