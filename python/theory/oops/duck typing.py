"""def square(x):
 return x*x
print(square())"""
# if you are specifiying the data type at the time of compling then it is called as static else it is called as dynamic
class duck:
 def swim(self):
  print("i can swim and i am  dog")
 def speaks(self):
  print("i can quack ")

class dog:
 def swim(self):
  print("i can swim and i am dog")
 def speaks(self):
  print("i can bark ")

def display(duck):
  duck.swim()
  duck.speaks()
  print("information displayed")
d=duck()
b=dog()
display(b)