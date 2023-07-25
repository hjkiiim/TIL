"""
a = [10,20,30,40,50,60]
for i in range(len(a)):
    print(a[i])
for d in a:
    print(d)
"""
"""
# name 이라는 빈 리스트 선언
# 사용자에게 이름을 입력 받으세요. input()
# 이름을 name 리스트에 계속 추가
# 종료되면 모든 사람 출력
name = []
while True:
    a = input("이름 : ")
    if a == "x" or a == "X":
        break
    else:
        name.append(a)
print(name)
print("--------------------------")
while True:
    #a = input("삭제할 이름 : ")
    n2 = input("삭제할 번호 : ")
    if n2.lower() == "x":
        break
    elif len(name) < int(n2):
        print("이름 리스트에 없는 사람입니다.")
    else:
        #name.remove(a)
        name.pop(int(n2))
        print(name)
print(name)
"""
# 성적을 입력
# 종료되면 성적 전체와 평균출력
scores = 0
sum = 0
while True:
    sub = input("점수 : ")
    if sub.isalpha():
        break
    else:
        scores += 1
        sum += int(sub)
avg = sum / scores
print("성적 합계 : %d 평균 : %.2f"%(sum,avg))