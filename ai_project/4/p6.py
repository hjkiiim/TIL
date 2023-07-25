"""
value = ['1','2','3']
print(value)
# 리스트 변환 해주어야 함!
enum = list(enumerate(value))
print(enum)
"""
"""
value = ['a','b','c']
for i,v in enumerate(value):
    print(i,v)
for i in range(len(value)):
    print(i, value[i])
"""
"""
x1 = [1,2,3]
x2 = [4,5,6]

z = list(zip(x1, x2))
print(z)

for a,b in zip(x1, x2):
    print(a,b,a+b)
"""
"""
def solution(cleaning):
    answer = []
    for room, ox in enumerate(cleaning):
        if ox == "X":
            answer.append(room+1)
    return answer

# 아래는 테스트케이스 출력을 해보기 위한 코드입니다.
cleaning = ["O", "X", "X", "O", "O", "X", "O", "O", "X", "X"]
ret = solution(cleaning)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret, "입니다.")
"""
"""
def func_a(sales1, sales2):
    answer = 0
    for s1, s2 in zip(sales1, sales2):
        answer = max(answer, s2 - s1)
    return answer
def func_b(sales1, sales2):
    answer = 0
    for s1, s2 in zip(sales1, sales2):
        answer = min(answer, s2-s1)
    return answer

def solution(pre_month, cur_month):
    up = func_a(pre_month, cur_month)
    down = func_b(pre_month, cur_month)
    answer = [up, down]
    return answer

pre_month1 = [20, 50, 35]
cur_month1 = [15, 55, 75]
ret1 = solution(pre_month1, cur_month1)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은",ret1,"입니다.")

pre_month2 = [20, 65, 77]
cur_month2 = [15, 55, 75]
ret2 = solution(pre_month2, cur_month2)

# [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret2, "입니다.")
"""
"""
#단어가 거꾸로 되어도 똑같으면 return
def solution(words):
    answer = 0
    for i in words:
        print(i)
        for x,y in zip(i, reversed(i)):
            if x != y:
                print(x, y)
                # answer = len(words) 라면 answer -= 1이 됨!
                answer += 1
                # 비교하여 두 개가 다르면, 더 비교할 필요가 없으므로 바로 빠져나옴!
                break
    return answer

#아래는 테스트케이스 출력을 해보기 위한 코드입니다.
words = ['banana','SOS','rotator','hello']
ret = solution(words)

#[실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret, "입니다.")
"""
def sol(fruits, n):
    answer = 0
    for i in fruits:
        #print(i//n, answer)
        answer += i//n
        if i%n != 0:
            answer += 1
    return answer

fruits = [70,49,23,19]
n = 20
print(sol(fruits,n))