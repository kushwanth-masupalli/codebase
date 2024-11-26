from abc import ABC,abstractmethod
class Vehicle(ABC):
  def __init__(self,n):
   self.tyres=n
  @abstractmethod
  def start(self):
   pass

class Bike:
  def __init__(self):
    self.tyres=2  
  def start(self):    
    print("start with kick ")
class Scooty:
  def __init__(self):
    self.tyres=2
  
  def start(self):
    print("start with self start ")
class Car:
  def __init__(self):
    self.tyres=4
  
  def start(self):
    print("start with key ")
v=Vehicle()
