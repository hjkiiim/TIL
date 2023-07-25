"""
def solution(late_table):
    answer = 0
    for x in late_table:
        if x >= 1 and x < 10:
            answer += 1000
        elif x >= 10 and x < 20:
            answer += 2000
        elif x >= 20 and x < 30:
            answer += 4000
        elif x >= 30:
            answer += 10000
    return answer

#아래는 테스트케이스 출력을 해보기 위한 코드입니다.
late_table = [5,0,26,14,30,-7,17,-3,-2,5]
print(solution(late_table))
"""
"""
def sol(score):
    answer = 0
    cnt = 0
    for s in score:
        answer += s
        if s == 10:
            cnt += 1
    if cnt >= 7:
        answer += 100
        print("연속 점수 100점 획득!")
    return answer

score = [10,9,10,6,10,10,10,7,10,10]
print(sol(score))
"""
