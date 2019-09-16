class multiply_except:
    def __init__(self):
        product = 1
        arr_size = int(input())
        arr = []
        for i in range(0,arr_size):
            input_no = int(input())
            product = product * input_no
            arr.append(input_no)
        print("\n")
        for i in range(0,arr_size):
            print(int(product/arr[i]))

multiply_except()
