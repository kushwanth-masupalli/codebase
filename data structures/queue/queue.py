class queue :

    def __init__(self,n):
        self.list = [0]*n
        self.size = n
        self.front = -1
        self.rear = -1
    
    def insert(self,a):
        if(self.front==-1):
            self.front+=1
            self.rear+=1
            self.list[self.front]=a
        elif self.rear==self.size-1 :
            print("the queue is full")
        else :
             self.rear+=1
             self.list[self.rear]=a
             
    def delete(self):
        if self.front==-1:
            print("the queue is empty nothing to delete")
        elif self.front==self.rear :
            self.front = -1
            self.rear = -1
        else :
            self.front+=1
    
    def display(self):
        if self.front!=-1 :
         for i in range(self.front,self.rear+1):
            print(self.list[i])
        else :
            print("the queue is empty")
    
def main() :
    q = queue(5)
    q.insert(12)
    q.insert(2)
    q.insert(312)
    q.insert(162)
    q.insert(22)
    q.delete()
    q.delete()
    q.delete()
    q.delete()
    q.delete()
    q.display()
main()