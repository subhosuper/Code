import pandas as pd
exam_data = {'name': ['India', 'China', 'USA'],
'score': [12, 9, 16],
'attempts': [1, 3, 2],
'qualify': ['yes', 'no', 'yes']}
labels = ['a', 'b', 'c']
df = pd.DataFrame(exam_data , index=labels)
df.drop('attempts')
print(df)