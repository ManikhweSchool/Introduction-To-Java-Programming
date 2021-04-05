p = eval(input('Enter power : '))
n = 2**p
numberOfLastDigits = eval(input('Enter number of last digits : '))

lastDigits = n%(pow(10,numberOfLastDigits))

print('Power =',p)
print('Number =',n)
print('Last',numberOfLastDigits,'digit(s)',lastDigits)
