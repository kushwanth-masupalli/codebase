#it is only used in  inheritance
#method name same arguments also same but different location
#it is rumtime polymorphism
#
class father:
 def sleep(self):
  print("father sleeps at 10")
 def eat(self):
  print("eating")
class son(father):
  def sleep(self):
   super().sleep()
   print("sleep at 2 am")
f= son()
f.eat()
f.sleep()