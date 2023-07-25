"""def sol (score):
    answer = []
    for i in range(len(score)):
        rank = 1
        for s in score :
            if score[i] < s:
                rank += 1
        answer.append(rank)
    return answer

print(sol([190,183,147,183,138,133,110,145]))
"""
"""
def func_a(scores, score):
    rank = 1
    for s in scores:
        if s == score:
            return rank
        rank += 1
    return 0

def func_b(arr):
    arr.sort(reverse=True)

def func_c(arr, n):
    return arr[n]

def solution(scores, n):
    print(scores[n], " | " , scores)
    score = func_c(scores,n)
    func_b(scores)
    print(scores)
    answer = func_a(scores, score)
    return answer

#아래는 테스트케이스 출력을 해보기 위한 코드입니다.
s1 = [190, 183, 147, 183, 138, 133, 110, 145]
n = 2
ret = solution(s1, n)

#[실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
print("solution 함수의 반환 값은", ret, "입니다.")
"""
def fun_a(cards):
    scores = []
    for i in cards:
        if i == "A":
            scores.append(1)
        elif i == "B":
            scores.append(2)
        elif i == "C":
            scores.append(3)
        else:
            scores.append(4)
    return scores
def fun_b(scores):
    return sum(scores)
def sol(cards, n):
    a = [i for i in cards[0:n*2:2]]
    b = [j for j in cards[1:n*2+1:2]]
    a = fun_b(fun_a(a))
    b = fun_b(fun_a(b))
    print(a,b)
    # 파이썬의 물음표(?) 삼항연산자 역할!
    print(0 if a == b else (1 if a > b else 2), a if a > b else b)

cards = "BCDAAACBADBBDACADDB"
n = 7
sol(cards, n)