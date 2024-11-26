#abstract class is collection of abstract method
#abstract contain only declaration does not have any definition
#it should be instantiate 
#instantiate means you cant build a object of abstract class
from abc import ABC,abstractmethod

class Abstract_Demo(ABC):
  @abstractmethod
  def display(self):
  
    pass
  @abstractmethod
  def show(self):
    pass
class Abstract_Demo2(Abstract_Demo):
   def display(self):
     print("abstract demo 2")
   def show(self):
     print("i am from show")
a=Abstract_Demo2
a.show()