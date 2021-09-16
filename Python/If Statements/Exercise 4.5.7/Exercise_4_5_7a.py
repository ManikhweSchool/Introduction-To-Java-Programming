number1 = eval(input('Enter first number : '))
number2 = eval(input('Enter second number : '))

if abs(number1-number2)<= 0.001:
    print('Close')
else:
    print('Not Close')
