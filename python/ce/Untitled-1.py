a= {'ata1':{
                                             'name':'shyam',
                                             'age':25,
                                             'dept':'CSE',
                                             'phone_num':56655
},
'ata2':{
                                             
                                            'name':'shyami',
                                             'age':255,
                                             'dept':'CsSE',
                                             'phone_num':5566655
}
}
def addnew(name,age,dept,phone_num):
  newstudet={}
  newstudet["NAME"]=name
  newstudet["age"]=age
  newstudet["dept"]=dept
  newstudet["phone_num"]=phone_num
  a.update(newstudet)
addnew("kush",18,"cse with ai and robotics",9573326339)
print(a)