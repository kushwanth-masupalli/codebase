import statistics
def mmm(list):
 return statistics.mean(list), statistics.mode(list),statistics.median(list)
 
print(mmm([1,2,3]))
#by default the outcome would be in tuple 
#if you give a square bracket to the statement of return we will get the return in a list
#a,b,c=mmm([1,22,3])
# the return statments is the end of the fuction if you write any thing after the return statements the statements will be neglected
"""
def add(A,b):
 if A ==0 and b ==0 :
  return 
 else:
  return a+b
