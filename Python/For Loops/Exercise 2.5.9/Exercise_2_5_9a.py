fib1 = 1
fib2 = 1
fib = fib1 + fib2

numberOfFib = eval(input('Enter number of elements in the sequence : '))
print(fib1,fib2,fib,sep=',',end='')

for i in range(numberOfFib-3):
    fib1 = fib2
    fib2 = fib
    fib = fib1 + fib2
    print(',',fib,sep='',end='')
