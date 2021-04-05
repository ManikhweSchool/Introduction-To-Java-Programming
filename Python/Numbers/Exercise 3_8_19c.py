numberOfRows = eval(input('Enter number of rows : '))
numberOfColumns = eval(input('Enter number of columns : '))

if numberOfRows > 0 and numberOfColumns > 0:
    for index in range(numberOfRows*numberOfColumns):
        currentNumber = index%10
        if index%numberOfColumns != 0 or index == 0:
            print(currentNumber,' ',sep='',end='')
        else:
            print('\n',currentNumber,' ',sep='',end='')
