import math

Y = eval(input('Enter a year : '))
C = Y//100
m = (15 + C + math.floor(C/4) - math.floor((8*C+13)/25))%30
n = (4 + C - math.floor(C/4))%7
a = Y%4
b = Y%7
c = Y%19
d = (19*C + m)%30
e = (2*a + 4*b + 6*d + n)%7

if d==29 and e==6:
    print('Easter Date : April 12')
elif d==28 and e==6 and (m==2 or m==5 or m==10 or
m==13 or m==16 or m==21 or m==24 or m==39):
    print('Easter Date : April 11')
elif e+d+22<=31:
    print('Easter Date : March', (e+d+22))
else:
    print('Easter Date : April', (e+d-9))
