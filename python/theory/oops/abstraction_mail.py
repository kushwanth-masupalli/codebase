from abstract_class import vehicle
class Bike(Vehicle):
  def __init__(self,n,colour):
    super(),__init__(n)  
    self.colour=colour  
  def start(self):    
    print("start with kick ")
class Scooty(Vehicle):
  def __init__(self,n):
    self.tyres=n
  
  def start(self):
    print("start with self start ")
class Car(Vehical):
  def __init__(self,n,gears):
    super().__init__(n)
    self.gears=gears
    self.tyres=4
  
  def start(self):
    print("start with key ")
