numberOfFib = eval(input('Enter Number Of Elements : '))

if numberOfFib<=0:
    print('Start Over : Invalid Input.')
elif numberOfFib==1:
    print(1)
elif numberOfFib==2:
    print('1,1')
else:
    fib1 = 1
    fib2 = 1
    fib = fib1 + fib2

    print(fib1,fib2,fib,sep=',',end='')
    
    for index in range(numberOfFib-3):
        fib1 = fib2
        fib2 = fib
        fib = fib1 + fib2
        print(',',fib,sep='',end='')
    
