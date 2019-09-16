string = input()
string = string.lower()
arr = []
arr = string.split()
string, number = arr[0], int(arr[1])

for i in range(0,number):
    arr.append(int(input()))

if string == "radio" and arr.count(1) == 1:
    print("VALID")
elif string == "checkbox" and arr.count(1) >= 1:
    print("VALID")
else:
    print("INVALID")


