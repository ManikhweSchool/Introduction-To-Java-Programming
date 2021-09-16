number = eval(input('Enter a number : '))

for divisor in range(1,number//2+1):
    if number%(divisor)==0:
        print(divisor)
        
        
