#sets are not ordered 
#indexing will not be applicable to sets 
#sets are using {} curly braces
#mixed also valid
#duplicate items are not allowed
#we can add items and remove items
#In code 1 and true are same

set={1,2,3,"ksisfj",4,5,8}
set.add("ing")
# set.remove(8888)           #return  error if the element is not present
# set.discard(3333)           #return no error even if the element is not found   
# set.clear()             #clear the set
# print(set.pop())        #removes a randome element
set.add((7,99,66))        #adding tuple  to a set
print(set)
#we cant add list because it is mutable
set1={1,2,3}
set2 = {1,3,2}
print(set1==set2)

# two sets are said to be disjiont if there is nothing common in between them
# to check the sets are disjoint then 
#set1.isdisjoint(set2)
#there is no operator 
#set1.subset(Set2)
#if set1 is a subset of set2 if every element of set1 is present in set2
# operator if <=
#reverse of subset is super set
#super set is superset of set2 if set1 contains ever element of set2
#operator if >=
#set1.clear() to clear all element
# to delete set   del set


set1 ={1,2,3,4,5}
set2 = {4,5,6,7,8}
set3 ={11,22,33,44}
#print(Set1.difference(set))
#print(set1-set2)
#print(set2.difference_update(set1))
print(set1.symmetric_difference(set2))
# the operator for symmetric difference is ^
print(set1^set2)
#set1.symmetric_difference_update(set2)
print(set1)



set1={1,2,3,4,5}
set2={4,5,6,7,8,}
#print(set1.union(set2))
#print(set2.union(set1))
#print(set1 | set2)
# | is union 
# it can be also done in  multiple items
set3={9,10}
#print(set1.union(set2,set3))
#for operator only sets are allowed 
# but for union method tuples are allowed 
#set1.update(set2)
#set1 |= set2  operator for update
#print(set1.intersection(set2,set3))
#rint(set1 &  set2)
#set1.intersection_update(set2)
#print(set1)

