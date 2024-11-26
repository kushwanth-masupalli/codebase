class demo:          #same name but different no of arguments
 def add(self,*args):      #it is 
  total+=i
  for i in args:
   total+=i
  return total
d=demo()
print(d.add(2,3))
print(d.add(1,2,3))
print(d.add(1,1,1,1,1,1,1,1))

