a= input("enter the height of each person seperating with commas")
c= a.split(",")
l = len(c)
print(c)
summ = 0 


for i in range(l):
 c[i]= int(c[i])
for n in c:
 summ+=n
print(summ)
so =round( summ/l)
print(f"the average height is {so}")
