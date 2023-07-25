def solution(p, s):
    answer = 0
    for i in range(1, (p*s)+1):
        if i % p == 0 and i % s == 0:
            answer = i
            break
        else:
            continue
    return answer

print(solution(6,10))