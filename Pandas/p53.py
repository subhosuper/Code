import numpy as np
a = np.array([[2, 4], [3, 5], [7, 8]])
b = a[[0,1,2], [0,1,0]]
print(b)
print(a)