#operators in python 

#airthmetic operators



#operators are used to perform operations
#like+,*,-,/,
#  % for reminder
# // this is called floor division which return int(divisor)
# ** for the power of a number
#if there is two are more operator in one line of code
#the we follow the rule "pemdas" presidency 
#     ()
#  r to l   **
#  l to r    * /  //  % 
#  l to r    +  - 
# if the presidency is same  the associvity comes into picture


#assignment operator 

### a=5 but 5=a is wrong\
""" a=a+2 is same as a+=2
    a=a-2 is same as a-=2
    """
a = 3
if a==3:
    print("i am fine")
else :
    print("i am not fine")

# == is used for matching


#comparison operator

#< > <= >= 
# == for equality 
# != if for not equal to 
a=5
print(a>6)










#bitwise operators 

#as the name suggests it works on bits 
#first you need to convert the number into binary number
"""
 & and
| or
^ not
<< left shift
>> righy shift
~ compliment
complient is nothing adding + 1 and keeping - before them
"""



#identity operator

# two identity operator is and is not
# if a=5 b=5 then the memory location will be same
#to check the id or memory adders 
a="5" 
b=5
print(id(a))
print(id(b))

print(a is b )

c =199
d =c

print(c is d )

e =[1,2,3]
f =[1,2,3]
print(e is f )

# == (Equality Operator):

# The == operator checks whether the values of two objects
#  are equal.
# It compares the contents of the objects, not their memory
#  locations.



# is (Identity Operator):

# The is operator checks whether two references point to the
#  same object in memory.
# It checks if the two variables refer to the same object,
#  not if they have the same value


#membership operators in python
#there are two are member ship operators in python |in and not in|
name = "kush"
print("k"  in name )
l= [1,8,8,89,7,5]
print(1 in l)


#logical operators
#as same as| and gate, or gate,not gate |
a=5
b=6
print(a<10 and b> 11)
a=True
print(not(a)) 