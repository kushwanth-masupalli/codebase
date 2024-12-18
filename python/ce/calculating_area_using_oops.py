class circle:
    def __init__(self,r=6): #this is default values even if you didn't gave anything in the 
                            #constructor this value will comes into picture
        self.radius= r
    def area(self):
        print("the are of circle")
        print(3.14*self.radius*self.radius)
    def circumference(self):
        print("the circumference of circle is")
        print(3.14*2*self.radius)

c = circle(3)
cc = circle(33)
c.circumference()
c.area()
cc.circumference()
cc.area()