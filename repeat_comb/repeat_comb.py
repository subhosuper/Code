from itertools import permutations, product
import random

sum_list = []
class repeat_comb:
    def solve(self, A):
        self.A = A
        self.result = list(product([1,-1], repeat=self.A))
        print(self.result)
        print("\n")
        repeat_comb.product_sum(self)
        print("\n")
        maximum = max(sum_list)
        occurance_max = sum_list.count(maximum)
        # print(occurance_max)
        if occurance_max > 1:
            index = sum_list.index(maximum)
            if sum(self.result[index]) > sum(self.result[(len(self.result)-1)-index]):
                print(self.result[index])
            else:
                print(self.result[(len(result)-1)-index])


    def product_sum(self):
        global sum_list
        for comb in self.result:
            sums = 0
            for i in range(0, self.A-1):
                sums = sums + (comb[i] * comb[i+1])
            sums = sums + (comb[0] * comb[self.A-1])
            sum_list.append(sums)
        print(sum_list)

obj = repeat_comb()
obj.solve(3)