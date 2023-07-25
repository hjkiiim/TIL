"""
def fun1(n1, n2):
    return n1+n2
def fun2(n1,n2):
    return n1*n2
def sol(n1,n2):
    p = fun1(n1,n2)
    m = fun2(n1,n2)
    return p+m

print(sol(2,7))
"""
"""
def sol(s1, s2):
    all_len = len(s1+s2)
    return all_len
a = sol('pine','apple')
print(a)
"""
"""
# 지불한 금액이 물건 가격보다 적으면 -1
# 물건 가격이 더 비싸면 계산하고 남은 금액
def sol(price, payment):
    change = max(-1, payment-price)
    return change

a = sol(1500, 20000)
print(a)
"""
"""
import math
def sol(s1, s2):
    # return (s1+s2) // 2
    # 소수점이 더 가까운 곳으로 ; 반올림
    return math.trunc((s1+s2)/2)
    # 올림 함수
    # return math.ceil((s1 + s2) / 2)
print(sol(2,3))
"""