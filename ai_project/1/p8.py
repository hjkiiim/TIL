"""for i in range(0, 3):
    print(i, "Gold!!!!!")
print("Have a fun!")

for i in range(10, 5, -2):
    print(i, "Silver~~~")
print("Yay!!")"""

"""for x in ['FriDay', 'SaturDay', 'SunDay']:
    print(x)"""

s = 0
for i in range(1,10,1):
    s += i
    """ 
    어느 위치에 있느냐에 따라 s의 값은 달라질 수 있다.
    아래의 소스코드를 삽입하면, for문의 s = 9가 출력되고,
    for문 밖의 s는 0을 출력한다. 
    그렇지만, 해당 라인이 없으면, s는 i값이 연쇄적으로 더해져 45가 된다.
    
    print(s)
    s = 0
    """
print(s)

n = int(input("Start : "))
m = int(input("End : "))
s = 0
"""if m >= n:
    for i in range(n, m+1):
        s += i
else:
    for i in range(m, n+1):
        s += i"""
for i in range(n, m+1):
    if i % 2 == 0:
        s += i
print(s)

k = 0
for i in range(1, 101, 2):
    k += i
print(k)