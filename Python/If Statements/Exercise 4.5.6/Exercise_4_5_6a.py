numberOfItems = eval(input('Enter number of items : '))

if numberOfItems <=0:
    print('Error : Invalid Number Of Items.')
else:
    price = -1

    if numberOfItems < 10:
        price = numberOfItems*12
    if numberOfItems >=10 and numberOfItems<100:
        price = numberOfItems*10
    if numberOfItems >= 100:
        price = numberOfItems*7
    print('Total Price', price)
