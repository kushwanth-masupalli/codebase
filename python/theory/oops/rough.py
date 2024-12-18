def prime(n):
 l=[]
 for i in range(2,n):
   a=n%i
   l.append(a)
   c=l.count(0)
   if c==0:
     return True
   else:
     return False
l=[]
for i in range(50):
 if prime(i):
  l.append(i)
 for  i in l:
  print(f"({i},{i+1})",end=" ")
