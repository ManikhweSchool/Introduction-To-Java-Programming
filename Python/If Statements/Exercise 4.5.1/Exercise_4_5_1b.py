# 1 inch = 2.54 cm
length = eval(input('Enter length in cm : '))

if length < 0:
    print('Error : Invalid Input')
else:
    toInches = length/2.54
    print(length,'cm is',toInches,'inche(s)')
