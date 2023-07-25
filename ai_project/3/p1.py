"""n,m = input().split()
n = int(n)
m = int(m)
s = 0
for i in range(n,m+1,1):
    if i % 2 == 0:
        s += i
print(s)"""
"""
def add(n,m):
    return n + m

if __name__== "__main__":
    print(add(2,3))
    a = add(10,20) * 2
    print(a)
"""

def add(x,y):
    r = x+y
    r2 = x-y
    return r, r2

a,b = add(5,10)
print(a, b)