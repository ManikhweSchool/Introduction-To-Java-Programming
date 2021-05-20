year = eval(input('Enter a year : '))
count = 0

for currentYear in range(1600, year+1):
    if (currentYear%4==0 and currentYear%100 != 0) or (currentYear%100==0 and currentYear%400==0):
        count = count + 1

        if count%10 != 0:
            print(currentYear,' ',end='')
        else:
            print(currentYear)
print('\nThere are ',count,' leap year(s) between 1600 and ',year,'.', sep='')
