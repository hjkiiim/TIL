# 2차원 배열
"""
nn = [[1,2,3],[4,5,6],[7,8,9]]

print(nn[0][1])
"""
# 한 학교의 학년별 반별 인원
g = [[27,28,23,30],
     [23,21,27,29],
     [27,26,23,30]]
"""
for i in range(len(g)):
     for j in range(len(g[i])):
          print(i+1,"학년",j+1,"반",g[i][j],"명")
"""
"""
for grade in g:
     # 리스트의 배열의 값이 하나씩 출력됨,
     for c in grade:
          print(c, end="")
     print()
"""
"""
# 2차원 배열리스트를 1차원 배열리스트에 삽입
for c1, c2, c3, c4 in g:
     print(c1, c2, c3, c4)

g = [[27,28,23,30,5],
     [23,21,27,29,5],
     [27,26,23,30,5]]

for c1, c2, c3, c4, c5 in g:
     print(c1, c2, c3, c4, c5)
"""
"""
# 행이 3개, 열이 2개, 모든 항목이 0
b = [[0,0] for _ in range(3)]
print(b)

r = [0 for _ in range(2)]
print(r)
c = [r for _ in range(3)]
print(c)
"""
"""
b = []
for i in range(3):
     print(i+1,end="")
     a = input("학년별 인원수 입력 : ")
     a = a.split()
     b.append(a)
print(b)
"""
nameList = []
while True:
     name = input("이름 : ")
     if name == "":
          print(nameList)
          break
     else:
          nameList.append(name)
         
while True:
     remove = input("삭제 : ")
     if remove == "":
          break
     elif remove.isdigit():
          #인덱스 삭제
          nameList.pop(int(remove))
          print(nameList)
     else:
          nameList.remove(remove)
          print(nameList)