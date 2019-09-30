import pandas as pd
file = pd.read_csv("file.csv", squeeze = True)

def fun(num):
    if num < 200:
        return "Low"
    elif num >= 200 and num <= 400:
        return "Normal"
    else:
        return "High"

new = file.apply(fun)
print(new[0], new[1])
print(new.head())
print(type(new))