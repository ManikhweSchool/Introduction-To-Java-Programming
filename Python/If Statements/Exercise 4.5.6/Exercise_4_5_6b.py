numOfItems = eval(input('Enter number of items : '))

if numOfItems <=0:
    print('Invalid Input')
elif numOfItems <10:
    print('Total Cost =',numOfItems*12)
elif numOfItems <100:
    print('Total Cost =',numOfItems*10)
else:
    print('Total Cost =',numOfItems*7)
