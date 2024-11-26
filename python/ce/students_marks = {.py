students_marks = {
                                             'jenny': 99,
                                             'ram':88,
                                             'sitha':77

                                               
}
students_grades={}
for i in students_marks:
 c=students_marks[i]
 if c>70:
  students_grades[i]="c+"
 if c >80:
   students_grades[i]="b+"
 if c >90 : 
    students_grades[i]="a+"
print(students_grades)