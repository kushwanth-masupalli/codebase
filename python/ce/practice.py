# # # # #  n="1,23,45,6,67,88"
# # # # #  l=n.split(",")
# # # # # dict1={}
# # # # # for i in l:
# # # # #  if int(i)%2==0: 
# # # # #   dict1[i]="even"
# # # # #  else:
# # # # #   dict1[i]="odd"
# # # # # print(dict1)
# # # # n="1,23,45,6,67,88"
# # # # l=n.split(",")
# # # # count=0
# # # # for i in l:
# # # #  for j in range(2,int(i)):
# # # #   if int(i)%j:
# # # #    count+=1
# # # #   else:
# # # #    count+=0
# # # # if count%2!=0:
# # # #  print("it is a lucky list")
# # # # else:
# # # #  print("it is not a  lucky list")
# # # def generate_customer_id(accountno):
# # #  i=1
# # #  id=""
# # #  while i<=len(str(accountno)): 
  
# # #   id+=str(accountno)[-i]
# # #   i+=1
# # #  return id
# # # print(generate_customer_id("123456"))
# # l=[11,23,4,5,666,7,889,66]
# # min=l[0]
# # for i in l:
# #  if i< min:
# #   min=i

# def rek(k):
#  i=1
#  reverse=""
#  while i<=len(k):
#   reverse+=k[-i]
#  return reverse
# print(rek("kushwanth"))
n=input("enter the number")
count=0
while len(n)>1:
 sum=1
 for  i in n:
  sum*=int(i)
  n=str(sum)
 count+=1 
else:
 print(sum,count)
