class stack :
    
    def __init__(self,n) :
        self.list = [0]*n
        self.i = 0
        self.size = n
    def push(self,a) :
        if(self.i!=self.size):
            self.list[self.i]=a
            self.i+=1
        else :
            print("the stack is full")

    def pop(self) :
        if self.i==0 :
            print("the stack is empty nothing to print")
        else :
            self.list.pop()
            self.i-=1
    def display(self):
        if self.i==0 :
            print("the stack is empty")
        else :
            for j in range(0,self.i):
               print(self.list[j])
    
def main() :
   st = stack(5)
   st.push(22)
   st.push(433)
   st.push(33)
   st.display()
   print("after popping")
   st.pop()
   st.display()
main()