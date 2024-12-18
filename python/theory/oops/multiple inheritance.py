class Human:
  def __init__(self,num):
   self.numeyes= 2
   self.numnose=1
   self.num=num

  
  def eat(self):
   print("i can eat")
  def  work(self):
    print('i can work ')

class Male:
   def __init__(self,name):
    self.name=name
    
   
   def flirt(self):
    print("I CAN flirt") 
   def work(self):
    print("i can code")


class Boy(Human,Male):
 def __init__(self,name,num,language):
  Male.__init__(self,name)
  Human.__init__(self,num)
  self.language=language 
 def work(self):
   print("i can test")
 def display(self):
   
   print("hi my nameis",self.name,"i am learning",self.language) 

boy1= Boy("kush",11,"python")

#boy1.work()
#Male.work(boy1)       #easy way  to access the method opp to mro
                       #method resolution order print(Boy.mro())
#print(boy1.num)
#print(boy1.numeyes)
#print(boy1.language)