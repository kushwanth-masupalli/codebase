a= input("press 0 for rock and 1 for paper 2 for scissors")
import random
list= [0,1,2]
k= str(random.choice(list))
print(k)
if a == k :
 print("draw")
if a == '0' and k=='1':
 print('you lose')
if a=='0' and k=='2':
 print("you lose")
if a == '1 'and k=='0':
 print("you win")
if a== '1' and k=='2':
 print("you win")
if a=='2' and k=='0':
 print("you lose")
if a=='2' and k=='1':
 print('you win')