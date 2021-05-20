rows = eval(input('Enter number of rows : '))

for i in range(rows):
    for j in range(i+1):
        print('*',sep='',end='')
    print()
