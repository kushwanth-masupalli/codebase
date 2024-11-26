#why we need inheritance 
#what is inheritance
# it is also means heridity 
#taking some qualities from your parents commonly called as jeans
# we are inhearing the behaviour of the parents
# in a class we have attributes and methods
#we are inheriting the attributes and methods from other class 
#the first one is the parent class
#the second one is child class or sub class
#syntax class derived class name (base class name)
#           class statements
class Human:
 def __init__(self,heart):
  self.numeye=2
  self.nose=1
  self.heart= heart
 def eat(self):
  print("i can eat")
 def Work(self):
  print("i can work ")
class Male(Human):
  def __init__(self,name,heart): 
   super().__init__(heart)
   self.name= name
  
  def sleep(self):
   print('i can sleep')
  def Work(self):
   super().Work()              #super mean super class 
   print("i can ruel")
Male1= Male("kushwanth",32)
#Male1.eat()
#Male1.Work()
#Male1.sleep()
print(Male1.numeye)  # it is accessing the numeye from parent class
