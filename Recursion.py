
def hello(n):
    if n == 0:
        print("Done!")
    else:
        print("Hello!")
        n -= 1
        hello(n)

hello(5)
