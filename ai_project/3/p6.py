# 4와 6의 최소공배수
"""def sol(p,s):
    answer = 0
    for i in range(1, p*s+1):
        if i % p == 0 and i % s == 0:
            answer = i
            break
    return answer
"""
def sol(p,s):
    for i in range(1, p*s+1):
        # 예 : 6 * 1,2,3,... % 10 == 0이라면?
        # p와 i를 곱한 값이 최소공배수
        if (p*i) % s == 0:
            answer = p*i
            break
    return answer
print(sol(6,10))