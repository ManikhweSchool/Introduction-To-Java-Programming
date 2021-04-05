# We can avoid negetive numbers by using the abs method.
number = abs(eval(input('Enter a number : ')))

factorial = 1

for n in range(number,0,-1):
    factorial = factorial*n
print(number,'!= ',factorial,sep='')
