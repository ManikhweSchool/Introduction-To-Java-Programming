from random import randint

userWins = 0
computerWins = 0
allValid = True

for roundNumber in range(1,6):
    computerChoice = randint(1,3)
    userChoice = eval(input('Enter 1(rock), 2(paper) or 3(sissor) : ')) 

    if userChoice==1 or userChoice==2 or userChoice==3:
        if userChoice==1 and computerChoice==1:
            print('There is a teir.')
        elif userChoice==1 and computerChoice==2:
            print('Computer is papper, You are rock : You Lost')
            computerWins = computerWins + 1
        elif userChoice==1 and computerChoice==3:
            print('Computer is sissor, You are rock : You Won')
            userWins = userWins + 1

        elif userChoice==2 and computerChoice==1:
            print('Computer is rock, You are papper : You Won')
            userWins = userWins + 1
        elif userChoice==2 and computerChoice==2:
            print('There is a teir.')
        elif userChoice==2 and computerChoice==3:
            print('Computer is sissor, You are papper : You Lost')
            computerWins = computerWins + 1

        elif userChoice==3 and computerChoice==1:
            print('Computer is rock, You are sissor : You Lost')
            computerWins = computerWins + 1
        elif userChoice==3 and computerChoice==2:
            print('Computer is papper, You are sissor : You Won')
            userWins = userWins + 1
        else:
            print('There is a teir.')
    else:
        print('Error : Invalid User Choice')
        allValid = False
        break

if computerWins < userWins and allValid:
    print('\nYou Won')
elif computerWins > userWins and allValid:
    print('\nYou Lost')
elif allValid:
    print('\nThere is a teir')
