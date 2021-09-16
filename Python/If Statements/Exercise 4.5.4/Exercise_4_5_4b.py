numberOfCredits = eval(input('Enter number of credits : '))

if numberOfCredits <= 23:
    print('Freshman')
elif numberOfCredits <=53:
    print('Sophomore')
elif numberOfCredits <=83:
    print('Junior')
else:
    print('Senior')
