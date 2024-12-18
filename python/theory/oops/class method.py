class Instructor:
 followers=0 #class object variable
 def __init__(self,name,address):
   self.name= name
   self.address= address
  # self.followers= 0
# methods are just like fuctions
 def display(self,ddd):
  print("hi i am ",self.name,"i teach",ddd)
 def up(self,ma):
  self.followers+=2

Instructor1=Instructor("kush","kadiri")
print(Instructor1.name)
Instructor1.display("python")
#self keyword can hold attribute not any variables
Instructor1.up("kdjf")
print(Instructor1.followers)