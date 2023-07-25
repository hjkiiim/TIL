import random

greet = ["Hi", "Hello", "hi", "hello"]
age = ["나이","몇 살", "년생"]
song = ["노래","음악","가수"]

while True:
    w = input(">>")

    if w == "q":
        break
    for a in greet + age + song:
        if a in greet and a in w:
            print(random.choice(["안녕하세요.","하이룽"]))
            break
        elif a in age and a in w:
            print(random.choice(["21세야~","2000년생이야","비밀이야~"]))
            break
        elif a in song and a in w:
            print(random.choice(["조용필","아리랑","송가인"]))