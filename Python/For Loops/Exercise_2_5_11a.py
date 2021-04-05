rows = eval(input('Enter number of rows : '))
columns = eval(input('Enter number of columns : '))

print('*'*columns)

for i in range(rows-2):
    print('*',' '*(columns-2),'*',sep='')
print('*'*columns)
