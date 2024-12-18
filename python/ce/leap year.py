def leap(year) :
  if year % 4 ==0 or year % 100 ==0 :
   print("this is a leap year")
  else:
   print("this is not a leap year")
leap(2000)