import  random
a= input("please enter your names by separating it with a comma")
l = a.split(",") #this will create a list of name l with comma as the seperator
print(l)
c=len(l)
n=random.randint(0,c-1)
print(l[n])
