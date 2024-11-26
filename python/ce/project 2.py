import random
print("welcom to password generator")
character =["a","b","c","d","e","f"]
nu= ["1","2","3"]
sy = ["!","@","#"]
c= int(input('please enter how many letters do you need in your password generator'))
a= int(input('please enter how many letters do you need in your password generator'))
x= int(input('please enter how many letters do you need in your password generator'))
password = ""
for i in range(1,c+1):
 char = random.choice(character)
 password+=char
for i  in range(1,a+1):
 bar = random.choice(nu)
 password+=bar
for i in range(1,x+1):
 cor = random.choice(sy)
 password +=cor
print(password)