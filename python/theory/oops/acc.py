class acc:
 def __init__(self,name,balance):
  self.name=name
  self.balance=balance
 def __str__(self):
  return f"acc holder name:{self.name}  \n balance {self.balance}"
 def deposite(self,amout=0):
  self.balance=self.balance+amout
  print(f"{self.balance}  depsited this one")
 def withd(self,amout):
  if amout>self.balance:
   print("not enough amoutn00")
  else:
   self.balance=self.balance-amout
   print(self.balance)

o=acc("kush",1000)

#o.deposite(200)
o.withd(100)
