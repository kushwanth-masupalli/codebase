weight= float(input("please enter the weight in kg"))
height= float(input("please  enter the height in meters"))
bmi=weight/height**2
print(f"your bmi if {bmi}")
if bmi < 18.5:
 print("your are under weight")
elif bmi <25:
 print("you have a normal weight")
elif bmi <30:
 print("you are over weight")
elif bmi <35 :
 print(" you are clinically obese")
