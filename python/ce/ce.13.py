number = input("enter the position where you are willing to hide your money")
n1 = int(number[0])
n2 = int(number[1])
l1=[11,12,13]
l2=[21,22,23]
l3=[31,32,33]
finallist=(l1,l2,l3)
rownumber = finallist[n1-1]
columnumber = rownumber[n2-1]
finallist[n1-1][n2-1]='x'
print(f"{l1}\n{l2}\n{l3}")