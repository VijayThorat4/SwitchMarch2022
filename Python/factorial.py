num =(input("Enter a number :"))
def fact (x):
 if x==1:
  return 1
 else:
  return x * fact (x-1)

ans = fact(num)
print (ans)
