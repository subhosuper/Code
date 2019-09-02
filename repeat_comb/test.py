class test:
    def solve(self, string):
        self.string = string
        test.display(self)

    def display(self):
        print(self.string)

obj = test()
obj.solve(2)
# obj.display()
