count = 0

for number in range(1,101):
    lastDigit = (number*number)%10

    if lastDigit==1:
        count = count + 1
print('There are',count,'sqaures ending with 1.')
