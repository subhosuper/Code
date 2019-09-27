import pandas as pd
list = [["mango","orange","guava","pineapple","cucumber"],["column1","column2","column3","column4","column4"]]
dict = {"Name":["mango","orange","guava","pineapple","cucumber"],"Age":[20,21,22,32,30]}
df = pd.DataFrame(list)
df_2 = pd.DataFrame(dict)
print(df)
print()
print(df_2)