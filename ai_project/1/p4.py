import webbrowser

print("안녕하세요~")
q1 = input("궁금하신 내용을 적어보세요 : ")
url = "https://www.google.com/search?q="+q1+"&sourceid=chrome&ie=UTF-8"
webbrowser.open(url)