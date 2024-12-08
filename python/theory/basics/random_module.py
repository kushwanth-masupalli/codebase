#random is module in python which provide some randomness 


import random
print(random.random())      #outputs a 0.0<=x<1.0
print(random.randrange(1,10,2))  #output :  a<=x<b with step
print(random.randrange(55))   #output : a<=x<=b


print(random.randint(1,2))  #the inputs are compulsory : output a<=x<=b

print(random.uniform(10,11))  #floating pointnumber  a<=x<b

a = [1,2,3,4,56,7,788888.777,555] #picks up a random thing from the sequence
print(random.choice(a))


random.shuffle(a)         #shuffle the give sequence
print(a)

