from math import sin,cos,radians

for theta in range(0,360,15):
    print(theta, round(sin(radians(theta)),4),sep=' --- ',end='')
    print(' ',round(cos(radians(theta)),4),sep='')
