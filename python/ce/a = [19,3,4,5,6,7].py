a = [19,3,4,5,6,7]
for i in range(len(a)):
     smallest = a[i]
     for j in range(len(a)):
        if a[j]<smallest:
            smallest = a[j]
            
print(a)