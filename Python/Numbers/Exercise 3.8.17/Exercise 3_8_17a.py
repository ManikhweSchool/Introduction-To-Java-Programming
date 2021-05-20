year = eval(input('Enter a year : '))
count = 0 # Count number of leap years.

for currentYear in range(1600, year+1):
    condition1 = (currentYear%4==0 and currentYear%100 !=0)
    condition2 = (currentYear%100==0 and currentYear%400==0)

    if condition1 or condition2:
        count = count+1
print('There are',count,'leap yea(s) between 1600 and',year)
