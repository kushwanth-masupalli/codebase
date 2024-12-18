class Ironman:
    idd =0                   #class object variable
    def __init__(self, name, age):  # self is a reference to the current instance
        self.name = name           # Assigning instance attribute 'name'
        self.age = age             # Assigning instance attribute 'age'
        self.follower = 1221       # Default value for an attribute, not passed in the constructor

    def display(self, ai_name):    # Method to display details
        print(f"I am Ironman, and my AI is {ai_name}. My followers are {self.follower} {self.idd}.")
        # 'self.follower' is an instance attribute, hence accessed with 'self'
        # 'ai_name' is a parameter passed directly to this method, no need for 'self'
    def giveid(self,a):
        self.idd+=1
    
# Creating an instance of the Ironman class
o = Ironman("Kushwanth", 19)

# Accessing and printing instance attributes
print(o.age)         # Outputs: 19
print(o.name)        # Outputs: Kushwanth
print(o.follower)    # Outputs: 1221

# Calling the display method with "Jarvis" as the argument
o.display("Jarvis")
o.giveid(122.22)
o.giveid(122.22)
o.giveid(122.22)
o.giveid(122.22)
print(o.idd)

