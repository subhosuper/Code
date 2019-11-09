import time
import math
timing = lambda: int(round(time.time()*1000))
start_time = timing()
given = [1,2,1,2,3,2]

def sum_index(element):
    sum = 0
    for i in range(0,len(given)):
        if given[i] == element:
            sum = sum + i
    return sum

distinct_set = set(given)
index_list = list(map(sum_index, distinct_set))

print(max(index_list))
end_time = timing()
print(end_time - start_time)