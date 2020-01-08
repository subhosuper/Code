import re

file_name = open('file.txt','r')
file_data = file_name.read()
# print(file_data)

string = "email match@gmail.com 23 emai-l@google.com 89fs matc.h@gmail.com"
pro_data1 = re.findall('\S+@\S+', string)
pro_data2 = re.findall('\S+@google.com', string)

print(pro_data1)
print(pro_data2)
