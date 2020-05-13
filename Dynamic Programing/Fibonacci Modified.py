def Solution():
    L = input().split()
    t1 = int(L[0])
    t2 = int(L[1])
    n = int(L[2])
    
    List = [t1,t2]
    for i in range(2,n):
        k = List[i-1]*List[i-1] + List[i-2]
        List.append(k)
    
    print(List[n-1])

Solution()
