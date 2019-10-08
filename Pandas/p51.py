import pandas as pd
import numpy as np
def addition(arg1, arg2):
	return arg1 + arg2
data = [[1,10], [2,12], [3,13]]
dataframe = pd.DataFrame(data, columns = ['columnl', 'column2'])
print(dataframe.pipe(addition, 1))
print(dataframe.apply(np.mean))