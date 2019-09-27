import pandas as pd
file = pd.read_csv("file.csv", squeeze = True)

new = file.apply(lambda num : num + 5)

print(file, '\n', new)