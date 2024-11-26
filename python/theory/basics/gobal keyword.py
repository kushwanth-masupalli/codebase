#it is not possible to modify the gobal keyword in a function
#by using the key word global we can change
name = "kush"
def display():
 global name
 name = name +"royal"
print(name)
display()
print(name)