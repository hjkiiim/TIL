sub = ["엑셀","파워포인트","파이썬"]

while True:
    a = input("개설 여부가 궁금한 과목명은?")
    if a == "":
        break
    if a in sub:
        print("개설되어 있습니다.")
    else:
        print("개설되지 않았습니다.")
        break