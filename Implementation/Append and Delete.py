def countUC(s,t):
	count = 0
	if(len(s) < len(t)):
		for i in range(len(s)):
			if(s[i]!=t[i]):
				count = (len(s)-i) + (len(t)-i)
				break
		if(count == 0):
			count = len(t)-len(s)

	if(len(s) > len(t)):
		for i in range(len(t)):
			if(s[i]!=t[i]):
				count = (len(s)-i) + (len(t)-i)
				break
		if(count == 0):
			count = len(s)-len(t)

	if(len(s) == len(t)):
		for i in range(len(t)):
			if(s[i]!=t[i]):
				count = (len(s)-i) + (len(t)-i)
				break

	return count

def check(count,s,t,k):
	TL = len(s) + len(t)
	if(k < count):
		return False
	if(k >= TL):
		return True
	if(count == 0):
		if(k%2==0):
			return True
		else:
			return False
	else:
		if(count%2 != 0):
			if(k%2 != 0):
				return True
			else:
				return False
		if(count%2 == 0):
			if(k%2 == 0):
				return True
			else:
				return False

s = input()
t = input()
k = int(input())
count = countUC(s,t)
if(check(count,s,t,k)):
	print("Yes")
else:
	print("No")
