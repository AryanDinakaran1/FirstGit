def foo(n):
    if n == 0:
        print("Done!")
    else:
        print("Hello!")
        n -= 1
        foo(n)

foo(10)
