"""
a = list()
a.append(10)
a.append("aa")

#인덱스 번호에 값을 추가
a.insert(0,30)

# 리스트 뒤에 리스트를 붙임
a.extend([50,70])
print(a)

#인덱스
a.pop(1)
print(a)
# 해당 값을 삭제
a.remove(50)
print(a)
# 다 삭제
a.clear()
print(a)
"""
"""
a = ["apple","banana", "apple"]
# 특정 항목의 값이 위치한 인덱스
# 항목값이 없으면 에러
# 여러 개 있으면 작은 인덱스 출력
print(a.index("banana"))
# 해당 개수를 리턴
print(a.count("apple"))
"""
"""
n = [2,5,3,9,4,3,6,4]
c = ["T","i","a","S","s"]

print(n)
print(c)

#오름차순
n.sort(reverse=True)
print(n)
c.sort(reverse=True)
print(c)

c.sort(key=str.lower)
print(c)

# 순서 역순
n.reverse()
print(n)

"""
"""
n = [10,40,20,30]
print(min(n))
print(max(n))
print(sum(n))
print(len(n))
"""
"""
# map(함수, 리스트) : 리스트 항목값에 일괄적으로 함수를 적용하여 결과를 돌려줌.
# 다시 list()로 변환해주어야 함!
a=["1","2","3","4"]
a2 = map(int,a)
print(a)
print(list(a2))
"""
"""
scores = input("성적 : ")
scorelist = scores.split()
scorelist2 = list(map(int, scorelist))
print("최고점 :", max(scorelist2))
print("최저점 :",min(scorelist2))
print("총점 :",sum(scorelist2))
print("평균 :",sum(scorelist2)/len(scorelist2))
"""
"""
s = [2,65,1,89]
# 원본 배열은 그대로 둠!
s2 = sorted(s)
print(s)
print(s2)
s2 = sorted(s, reverse=True)
print(s2)
# 원본의 순서를 바꿈
s2 = s.sort()
print(s)
print(s2) # None 이 출력
"""
"""
s = input("성적 : ")
s1 = list(map(int, s.split()))
s2 = sorted(s1,reverse=True)
for i in range(0, len(s2)):
    print(i+1, '등 점수 : ',s2[i], sep="")
    if i == 2:
        break
"""

scores = [32,46,36,78,45]
print(sum(scores), max(scores), min(scores))