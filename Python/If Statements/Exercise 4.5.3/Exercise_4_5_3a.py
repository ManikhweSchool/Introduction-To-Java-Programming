temperature = eval(input('Enter A Temperature : '))

if temperature < -273.15:
    print('Temperature is invalid.')
elif temperature==-273.15:
    print('Temperature is absolute zero.')
elif temperature <0:
    print('Temperature is below freezing point.')
elif temperature ==0:
    print('Temperature is at freezing point.')
elif temperature < 100:
    print('Temperature is in normal range.')
elif temperature == 100:
    print('Temperature is at boiling point.')
else:
    print('Temperature is above the boiling point.')
