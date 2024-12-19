class node :
      def __init__(self,a) :
           self.x = a 
           self.node =None


class linkedlist :
          def __init__(self):
                 self.node =None
          def insertatend(self,a) :
             n = node(a)
             if(self.node==None):
                  self.node = n
             else :
                  temp = self.node
                  while temp.node!=None:
                       temp = temp.node
                  temp.node = n
          def deleteatend(self) :
                temp = self.node
                prev = temp
  
                while temp.node!=None:
                      prev = temp
                      temp = temp.node
                prev.node  = None
          def insertatfirst(self,x):
                newnode = node(x)
                newnode.node = self.node
                self.node = newnode
          def deleteatfirst(self) :
                self.node= self.node.node
          def display(self):
                temp = self.node
                while temp!=None :
                      print(temp.x)
                      temp = temp.node
          def insertatpos(self,pos,x) :
                try :
                      temp = self.node
                      prev = temp
                      while pos>1 :
                            prev = temp
                            temp = temp.node
                            pos-=1
                      newnode = node(x)
                      prev.node = newnode
                      newnode.node = temp
                except Exception as e :
                      print("input positions is invalid")
          def deleteatpos(self,pos) :
                try :
                      temp = self.node
                      prev = temp
                      while pos>1 :
                            prev = temp
                            temp = temp.node
                            pos-=1
                      
                      prev.node = temp.node
                except Exception as e :
                      print("input positions is invalid")          
def main():
     ll = linkedlist()
     ll.insertatend(122)
     ll.insertatend(2333)
     ll.insertatend(222)
     ll.insertatfirst(222645)
     # ll.deleteatend()
     ll.deleteatfirst()
     ll.insertatpos(2,2)
     ll.deleteatpos(2)
     ll.display()
main()