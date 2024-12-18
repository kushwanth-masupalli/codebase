""" 
what is local scope and global scope:
local scope only used by local people 
gobal scope used by anyone


def display():
  a=10 
  print(a)
display()
b= 10 
here a is local scope
b is global scope
>a global variable can be used by a neighbour of local variable

def display(): 
  a= 123
  print(a)
display()
print(a)
"""
a=10
def display():
    
   
    def show():
       print(a)
    show()
display()













