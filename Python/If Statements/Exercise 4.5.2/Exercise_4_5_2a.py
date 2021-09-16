temperature = eval(input('Enter Temperature : '))
units = eval(input('Enter \'0\' For Fahrenheit or \'1\1 For Celsius : '))

computedTemprerature = temperature

if not(units==0 or units==1):
    print('Error : Invalid Input(Enter 0 or 1)')
else:
    if units==0:
        computedTemperature = (9/5)*(temperature-32)
    else:
        computedTemperature = (9/5)*temperature +32
print('User Temperature Is',temperature)
print('Computed Temperature Is',computedTemperature)
