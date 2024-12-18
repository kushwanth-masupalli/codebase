 #public  means anyone can use attributes and methods
 # protected with in the class and with in derived class also
 # private means only the class not even derived calss 
class student:
 def __init__(self,name,salary,age):
  self.name=name
  self.__salary=salary
  self._age=age
 def __display(self):
  print('my name is',self.name)
class branch(student):
  pass
"""def show():
  
 b=branch("kushwant",19)
 print(b.name)
 print(b._age)
show()"""
s1=student("kushwanth",300000,19)
