a= ['a','b','c','d']

def encryption(plaintext,shiftkey):
 cip = " "
 for i in plaintext:
  po = a.index(i)
  newpo= (po+shiftkey)%26
  cip+=a[newpo]
  print(cip)

def decryption(ciphertext,shiftkey):
 cip1 = ""
 for i in ciphertext:
  po = a.index(i)
  newpo= (po-shiftkey)%26
  cip1+=a[newpo]
print("cip1")
wannaend = False 
while not wannaend: 

 z=input("for encryption enter \'encrypt\' and for decryption enter \'decrypt\'")
 text= input("enter the text message:\n")
 shift= int(input("enter the shift key:\n"))
 if z == 'encrypt':
   encryption(plaintext=text,shiftkey=shift) 
 if z =='decrypt':
   decryption(ciphertext=text,shiftkey=shift)
 ss= input("type 'yes' to countiue type 'no' ")
 if ss == 'no':
  wannaend= 'True'
  print("have a nice day")