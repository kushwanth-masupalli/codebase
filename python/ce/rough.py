a = [195,44,3,4,5,6,7]
for i in range(len(a)):
     smallest = a[i]
     for j in range(i+1,len(a)-1):
         if a[j]<smallest:
            smallest = a[j]
     smallest,a[i]=a[i],smallest
            
print(a)