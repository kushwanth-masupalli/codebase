class Human:
 def __init__(self,n):
  self.eyes=2
  self.n=n
 def eat(self):
  print("i can eat")
 def work(self):
  print("i can work")  
class Male(Human):
 def __init__(self,name):
  super().__init__(n)
  self.name=name
 
 def sleep(self):
  print("i can sleep")
class Boy(Male):
 def __init__(self,n,name):
  Human.__init__(n)
  Male.__init__(name)
 def work(self):
  Human.work(self)
  print(' i can code')
"""class Programmer(Boy):
 def work(self):
  print(" i can code")"""


b=Boy(1,"kush")
print(b.name)
print(b.n)