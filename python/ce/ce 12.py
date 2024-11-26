import random
a= input("please enter your names by separating it with a comma")
l = a.split(", ")
print(l)
c=len(l)
n=randint(0,c-1)
print(l[n])
