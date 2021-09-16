numberOfCredits = eval(input('Enter number of credits : '))

if numberOfCredits <= 23:
    print('The Student Is A Freshman.')
elif numberOfCredits <=53 and numberOfCredits >=24:
    print('The Student Is A Sophomore.')
elif numberOfCredits <=83 and numberOfCredits >=54:
    print('The Student Is A Junior.')
elif numberOfCredits > 83:
    print('The Student Is A Senior.')
