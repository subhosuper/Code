final = []
sum = 0
def index_sum(indexi, length_input, input, x):
    global sum
    sum = sum + input.index(x, indexi, length_input-1)
    if x in range(input[input.index(x)+1], input[length_input-1]):
        index_sum(input.index(x)+1, length_input, input, x)
    else:
        final.append(sum)

input = [1,2,1,2,3,2]
distinct_set = list(set(input))
count_distinct_set = len(distinct_set)

while count_distinct_set != 0:
    sum = 0
    index_sum(0, len(input), input, distinct_set[count_distinct_set-1])
    count_distinct_set -= 1
print(final)
print(max(final))