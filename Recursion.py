def foo(n):
  if n == 0:
    print("Done!")
  else:
    print("Hello!")
    n -=
    foo(n)
foo(10)
