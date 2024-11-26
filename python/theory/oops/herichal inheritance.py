class Human:
    def __init__(self,name,age):
        self.name= name
        self.age= age
    def showdetail(self):
        print("my name is ",name,age)   
    def eat(self):
       print(' i can eat')
class Male(Human):
    def sleep(self):
        print("i can sleep")
class Female(Human):
    def work(self):
        print("i can work")
female1=Female()
female1.eat()
male1=Male()
male1.eat()
male1.sleep()