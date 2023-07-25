"""def solution(h):
    answer = 0
    if h > 180 or h < 120:
        answer = "NO"
    else:
        answer = "YES"
    return answer
"""
"""
def sol(p):
    if p >= 5000:
        #answer = int(p/100)*100
        answer = p//100*100
    return answer
h = sol(8925)
print(h)"""
"""
def sol(f,n):
    if f <= 10:
        a = n*3000
    elif f <= 20:
        a = n*int(3000+3000*0.1)
    else:
        a = n*int(3000+3000*0.2)
    return a

a = sol(21,3)
print(a)
"""
def sol(p):
    #if p >= 101 and p <= 139:
    if 101 <= p <= 139:
        print("Normal")
    else:
        print("Unnormal")

sol(100)