"""a = ["aa" for _ in range(10)]
b = [0] * 5
print(a)
print(b)"""
"""
c = []
for i in range(5):
    c.append(i)
print(c)


d = []
for i in range(5):
    # 그냥 i는 안 됨.
    d += [i]
print(d)
"""
"""
a = [str(i+10) for i in range(0,20,3)]
print(a)"""
"""
a = list(x for x in range(5))
print(a)
"""
"""
# 리스트 조건문
a = list(i for i in range(10) if i % 3 == 0)
# 윗 라인과 동일. a = [i for i in range(10) if i % 3 == 0]
print(a)
"""
"""
a = [i for i in range(1,101) if i % 5 == 0]
b = [i for i in range(1,101,5)]
c = list(i for i in range(1,101,) if i % 5 == 0)
print(a)
print(sum(a))
"""

s = "국어/영어/수학/음악/체육/미술"
s1 = s.split("/")
print(s1[0], s1[1])

for k in s1:
    print(k)