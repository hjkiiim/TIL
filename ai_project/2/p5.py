"""
for : 반복 횟수가 정해져 있을 때
while : 반복 횟수가 정해져 있지 않을때 (언제 끝날 지 모를 때)
"""

# 김현지 - 챗봇
import webbrowser

print("===========================")
print("\t\t안녕하세요. ESG 챗봇입니다.")
print("\t\t저는 영화 예매를 도와드립니다!")
print("\t\t무엇이든 질문하세요 *^^*")
print("\t\t추천 키워드 : 추천, 예매, 나가기(X)")
print("===========================\n")
quick = ["나가기", "x", "X"]
while True:
    question = input("질문을 입력하세요 : ")
    if  question in quick :
        print("챗봇 서비스를 종료합니다.")
        print("감사합니다.")
        break
    elif "추천" in question :
        print("현재 인기있는 영화 TOP3! (박스오피스 순위 2023.07.04 기준)")
        print("1. 엘리멘탈")
        print("2. 범죄도시3")
        print("3. 인디아나 존스:운명의 다이얼\n")
    elif "예매" in question :
        print("영화 예매 도와드리겠습니다.")
        question1 = input("원하시는 영화를 입력해주세요 : ")
        print("%s가 예매되었습니다.\n"%question1)
    else:
        print("제가 잘 이해한지 모르겠네요.\n")
        url = "https://www.google.com/search?q=" + question + "&sourceid=chrome&ie=UTF-8"
        webbrowser.open(url)