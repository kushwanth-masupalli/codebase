#it allows us to use built in operations 
#use with our built in objects and classes


#list=[1,0,-1]
#print(len(list))
#print(list)
#print(type(list))
class author:
 def __init__(self,name,book,pages):
   self.name=name
   self.book=book
   self.pages=pages
 def __str__(self):
  return f"{self.book} by {self.name}"
 def __len__(self):
  return self.pages
 def __call__(self):
  print("fi")                    #instance is also called as object

a= author("kush","devotion",300)
a()