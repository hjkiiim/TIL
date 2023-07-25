"""num_list = [12, 4, 15, 46, 38, 1, 14, 56, 32, 10, 24,35,63,11,20,10, 63, 26, 35]
num_list.sort()
print(num_list)
answer = list(num_list[5:])
print(answer)
"""
"""
def solution(my_string, index_list):
    answer = ''
    for i in index_list:
        answer += my_string[i]
    return answer

if __name__ == "__main__":
    m = "cvsgiorszzzmrpaqpe"
    n = [16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]
    solution(m, n)
"""

word = input().split()
a = int(word[0])
b = int(word[1])
p = int(word[2])
q = int(word[3])
x = int(word[4])
print(a & b)
print(a | b)
print(a ^ b)
print(p >> q)
print(p << q)
print(~x)