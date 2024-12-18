from abc import ABC,abstractmethod
class Vehical(ABC):
  def __init__(self,n):
    self.tyres=n
  @abstractmethod    #abstract method have no definiton but it will declare
  def  start(self):
    pass

class Bike :
  def __init__(self):
    self.tyres=2
  def start(self):
    print("start with kick ")
class Scooty :
  def __init__(self):
    self.tyres=2  
  def start(self):
    print("  self start ")

class Car :
  def __init__(self):
   self.tyres=4
  
  def start(self):
    print( "   self  start  ")
v=Vehical(2)