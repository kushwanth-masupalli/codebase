list = [ 1,2,3,4,8]
# mix_list =[1,"manodn",5.5.,55]
#these are mutable 
# lists  are ordered 
#we can excess by using index
#duplicants allowed 
print(list)
#print(len(list))
#negative index also possible
#slicing means 
#print(list)
print(list[0:5:2])  # 0 is the start and 5 is end 2 is step
print(list[3:1:-1])
# 5 is length
# 0 is the index you willing to start
#second 0 is step
# to reverse the order just do as follows
list.reverse()
print(list)
print(max(list))
#to join anything just follows 
list.append(11)
print(list)
#to join at a particular index numbers
list.insert(2, 454)
print(list)
#to join multiple items we use extend
list.extend([5,454,8,84,84,454])
print(list)
#to remove anything 
list.remove(5)  #it will remove the elemnt 5 not the number at index 5 
print(list)
#to remove random 
list.pop()   #removes the last element of the list
print(list)
#to remove a particular number give the index in the in pop
list.pop(1)  
print(list)