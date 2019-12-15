import threading
import time

def threading_function():
    print("Anjali is learning")

def threading_function2():
    print("Subham is teaching",)

thread1 = threading.Thread(target=threading_function)
thread2 = threading.Thread(target=threading_function2)

thread1.start()
thread2.start()