"""
# 리스트 표현식
a = [0]*10
print(a)

b = [0 for _ in range(5)]
print(b)

b = [i*2 for i in range(5)]
print(b)
"""
"""
# 리스트 합계 평균
# 4일차 미션
# 각 학생들의 이름과 점수가 위와 같습니다.
# 학생별 과목 점수와 평균을 적으세요.
name=['김이수','김승강','홍길동','이수아']
kor=[90,20,30,50]
eng=[80,99,60,87]
for i in range(len(name)):
    avg = (kor[i]+eng[i])/2
    print("%s의 국어 : %d 영어 : %d 평균 : %.2f"%(name[i],kor[i],eng[i],avg))
"""
"""
score = [['김이수', '김승강', '홍길동', '이수아'], [90, 20, 30, 50], [80, 99, 60, 87]]

for i in range(3):
    for j in range(4):
        print(i, j, score[i][j])

for j in range(4):
    for i in range(3):
        print(score[i][j], end=' ')
    print()
"""
def solution(score):
    answer=0
    cnt = 0
    #여기에 코드하세요
    for i in score:
        if i >= 85:
            answer += i
            cnt += 1
    # answer = int(answer / cnt)
    answer = answer // cnt
    return print(answer)

sol = [98,83,57,70,88,78, 87, 89, 100]
solution(sol)