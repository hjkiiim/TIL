"""
a = 'PYTHON'
print(a[2])
# : from ~ to
print(a[1:3])
print(a[:3])
# a : b : c | a부터 b까지 c만큼 건너뛰어서
print(a[0:5:2])
"""

a = input("생년월일을 입력하세요. ")
b = 2023 - int(a[0:4])
print("%d세 입니다."%b)