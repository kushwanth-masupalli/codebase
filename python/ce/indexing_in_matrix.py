a=[11,12,13]
b=[21,22,23]
c=[31,32,33]
l=[a,b,c]
n = input("enter the index you need to store")
r = int(n[0])
c = int(n[1])
l[r-1][c-1]="x"

print(a)
print("")
print(b)
print("")
print(c)
