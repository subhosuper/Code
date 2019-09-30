from itertools import permutations

class second_highest_permutations:
    def __init__(self, num):
        self.num = num
        self.digit_list = [x for x in map(int, list(str(num)))]
        second_highest_permutations.perm(self)
    
    def perm(self):
        permute = permutations(self.digit_list)
        result = []
        for x in permute:
            number = int("".join(map(str, x)))
            if number not in result:
                result.append(number)
        result.sort()
        print(result[-2])

obj = second_highest_permutations(212)