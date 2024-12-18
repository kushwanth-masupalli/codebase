t = "true"
l = "love"
name1 = input("enter the first name")
name2 = input("enter the second name")
name1 = name1.lower()
name2 = name2.lower()
sum1=0
sum2=0
for i in t : 
    sum1+=(name1.count(i))
    sum1+=(name2.count(i))
for i in l : 
    sum2+=(name1.count(i))
    sum2+=(name2.count(i))
sum1*=10
sum1+=sum2
print(sum1)