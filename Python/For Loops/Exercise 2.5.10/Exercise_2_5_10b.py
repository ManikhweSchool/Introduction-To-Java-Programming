rows = eval(input('Enter number of rows : '))
columns = eval(input('Enter number of columns : '))

for row in range(rows):
    for column in range(columns):
        print('*',end='')
    print()
