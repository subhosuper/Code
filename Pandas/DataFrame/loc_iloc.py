import pandas as pd

df = pd.read_csv("nba.csv")

first = df.loc[[1,2,3]]
second = df.iloc[1:4]

df.loc['Jae Crowder', 'Age'] = 28
print(second)

print(df)