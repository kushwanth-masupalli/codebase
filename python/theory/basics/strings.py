#strings are represented by ' ' or " " or """ """ or ''' ''' 

print('hello')

print("hello")

print("helllo 's s ")

print("i am \"iron man\"")  #'\' used be a character to lose its functionality

print('''"i am iron man's  ai "  ''')

""" double triple quotes is used for methods documentation"""

def add():
    """this method will add """
    pass
print(add.__doc__)


#some frequently used inbuilt functinos

str = "Hello world!"

print(len(str))  #to find its length

print(str.lower())  #converts string into lowercase

print(str.upper()) #convert string into uppercase

s = "  hello world  "

print(s.strip()) #removes leading and trailing whitespaces

print(s.split())  #converts into a list with desired parameter ' ' as default

print(str.replace("world","python")) #replace the first string with second

print(str.find("world"))
print(str.find("python"))

print(str.startswith("Hello"))
print(str.endswith("world"))

a = '123d'

print(a.isalpha())
print(a.isnumeric())
print(a.isdigit())
print(a.isalnum())

print(s.capitalize()) #capitalize the first letter

print(str.title()) #convert the first letter of each word to uppercase

ss ="banana"
print(ss.count("a"))  #count the no of occurances

s = "Python"
print(s[0:2])  # Output: "Py" (characters from index 0 to 1)
print(s[-1])   # Output: "n" (last character)
print(s[::-1]) # Output: "nohtyP" (reverse the string)
