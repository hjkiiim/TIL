"""for i in range(1,6):
    print("*"*i)"""
"""
# 리스트

x=[1,2,3,4]
print(x[2])
print(x[1:3])
print(x[-1])

x=["apple", "banana"]
print(x[1])

y = x*2
print(y)
"""
"""
x1 = [1,2,3,4,5]
x2 = [6,7,8]

print(x1+x2)

x1[2] = 10
print(x1)
"""
"""
a = [2,3,4,5]
for i in range(len(a)):
    print(a[i])
for i in a:
    print(i)
    """
"""
a=["apple", "mango", "peach"]
if "apple" in a:
    print("Yes, It is.")
"""
"""
a= "apple mango peach"
print(a)

a2 = a.split()
print(a2[0])
"""
"""
scores = [65,70,50,90]
for i in scores:
    if i <60:
        print("%d 과락"%i)        
"""
"""
scores = [90,70,80]
s = 0
for i in scores:
    s += i
print(s/len(scores))
"""
# 주소복사
n1 = [1,2,3]
n2 = n1
#n2는 n1의 주소를 가져옴. 즉, n2에서 변경이 있으면 n1도 같이 바뀜!!!
n2[0] = 0
print("주소 복사", n1, n2)

#값 복사
n1 = [1,2,3]
n2 = n1.copy()
n2[0] = 0
print("값 복사",n1, n2)