from random import randint

generatedNumber = randint(1,10)
guess = eval(input('Enter Your Guess : '))

if generatedNumber==guess:
    print('Your Guess Is Correct.')
else:
    print('Your Guess Is Incorrect.')
