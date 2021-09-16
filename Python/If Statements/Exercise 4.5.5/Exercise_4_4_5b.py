from random import randint

computerNumber = randint(1,10)

if computerNumber==eval(input('Enter Your Guess : ')):
    print('Your Guess Is Correct.')
else:
    print('Your Guess Is Incorrect.\nGenerated Number =',computerNumber)
