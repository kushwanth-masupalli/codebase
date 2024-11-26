# abstraction is hiding the unnecssary details to the user or the inner working of the operation
# its works at desiging level not at the programming level 
# it is said to sort what to be hide from the
from abc import ABC,abstractmethod
class Vehical(ABC):
  def __init__(self,n):
    self.tyres=n
  @abstractmethod    #abstract method have no definiton but it will declare
  def display(self):
                                             print("i am the king")
  def  start(self):
    pass
v = Vehical(3)