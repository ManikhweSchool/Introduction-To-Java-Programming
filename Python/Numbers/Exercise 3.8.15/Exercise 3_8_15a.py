import math

for x in range(15,375,15):
    answer1 = round(math.sin(math.radians(x-15)),4)
    answer2 = round(math.cos(math.radians(x-15)),4)
    print(x-15,answer1,sep=' --- ',end='')
    print(' ',answer2,sep='')
