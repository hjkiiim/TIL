"""
def hello(name):
    print("Say Hello~~~ %s"%name)

if __name__ == '__main__':
    while True:
        name = input("Name : ")
        if name == "":
            continue
        else:
            hello(name)
            break
"""
"""
def add(x,y):
    r = x+y
    q = r / 2
    return r, q

a, b = add(25,30)
print("합 : %d 평균 : %.2f"%(a, b))
"""
"""
def intro(name, age):
    return print("안녕, 나는 %s이고, %d살이야."%(name, age))

# 위치 인수
intro("HJ",18)
# 키워드 인수
intro(age=15, name="KHJ")
"""
def add(s, num):
    s += num
    return s

total = 0
while True:
    num = input("Number : ")
    if num.isdigit():
        total = add(total, int(num))
    else:
        break
print(total)