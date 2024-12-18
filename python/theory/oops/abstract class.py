from abc import ABC,abstractmethod
class Vehicle(ABC):
  def __init__(self,n):
   self.tyres=n
  @abstractmethod
  def start(self):
   pass
v=Vehicle()