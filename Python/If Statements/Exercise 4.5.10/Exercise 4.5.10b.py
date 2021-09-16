from random import randint

for questionNumber in range(1,11):
    firstRandomNumber = randint(1,10)
    secondRandomNumber = randint(1,10)

    print('Question ', questionNumber,' : ',
    firstRandomNumber,'*',secondRandomNumber,
    ' = ',sep='',end='') 
    userAnswer = eval(input(''))


    if userAnswer==firstRandomNumber*secondRandomNumber:
        if questionNumber!=10:
            print('Right!')
        else:
            print('Right.')
    else:
        print('Wrong. The answer is ',
        firstRandomNumber*secondRandomNumber,'.', sep='')
