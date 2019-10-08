# Python program explaining 
# byteswap() function 
import numpy as np 

# a is an array of integers. 
a = np.array([6, 676, 8755], dtype = np.int16) 

print(a.byteswap(True)) 
