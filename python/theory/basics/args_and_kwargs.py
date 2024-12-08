"""
def add(*numbers):
 c=0
 for i in numbers :
  c+=i 
 print(c)
add(1,2,3)
"""
def info(**kwargs):
 for key,value in kwargs.items() :
  print(key,value)

info(name= "kush",age = 30 ,dept= "cse")
  