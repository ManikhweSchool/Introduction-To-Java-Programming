fromTemperature = eval(input('Enter temperature : '))
usedUnits = input('Enter \'F\' For Fahrenheit and \'C\' Celsius : ')
toTemperature = fromTemperature

if usedUnits=='F' or usedUnits=='f':
    toTemperature = (9/5)*(fromTemperature-32)
    print(fromTemperature,'Fahrenheit is',toTemperature,'Degrees Celsius.')
elif usedUnits=='C' or usedUnits=='c':
    toTemperature = (9/5)*fromTemperature + 32
    print(fromTemperature,'Degrees Celsius is',toTemperature,'Fahrenheit.')
else:
    print('Error : Invalid Input(Enter F,f,C, or c.)')
