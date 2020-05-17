def maxSubArraySum(a,size): 
    max_so_far =a[0] 
    curr_max = a[0]  
    for i in range(1,size): 
        curr_max = max(a[i], curr_max + a[i]) 
        max_so_far = max(max_so_far,curr_max)     
    return max_so_far 

def maxSubSequence(A):
    if(all(ele < 0 for ele in A)):
        s = max(A)
    else:
        l = [y for y in A if y >= 0]
        s = sum(l)
    return s

T = int(input())
for t in range(T):
    n = int(input())
    A = list(map(int,input().split()))
    m = maxSubArraySum(A,len(A))
    s = maxSubSequence(A)
    print(str(m)+" "+str(s)) 
