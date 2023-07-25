# 최소공배수 시험 문제!
# 4일장과 6일장이 동시에 열리는 날은?
day1 = 4
day2 = 6
for i in range(1, (day1*day2)+1):
    if i % day1 == 0 and i % day2 == 0:
    # if (day1*i) % day2 == 0:
        print(i)
        break
    else:
        continue