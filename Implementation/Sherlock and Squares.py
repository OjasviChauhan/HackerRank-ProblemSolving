from math import ceil, sqrt
q = int(input())
for _ in range(q):
    count = 0
    a,b = map(int,input().split())
    number = ceil(sqrt(a))
    n1 = number * number
    number = (number * 2) + 1
    while ((n1 >= a and n1 <= b)) :
        count += 1
        n1 += number
        number += 2
    print(count)
