a = input("please enter the numbers by separating commas")
c= a.split(",")
l = len(c)
for i in range(l):
 c[i]=int(c[i])
summ =0
print(c)
print(max(c))
