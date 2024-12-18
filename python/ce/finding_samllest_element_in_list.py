a = [19,3,4,5,6,7]
smallest = a[0]
for i  in range(len(a)):
    for j in range( i+1,len(a)):
        if a[j]<smallest:
            smallest = a[j]
print(smallest)
