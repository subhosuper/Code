import pandas as pd

df = pd.read_csv("nba.csv")

first = df.loc["Avery Bradley"]
second = df.loc[3]
print("\n", second)