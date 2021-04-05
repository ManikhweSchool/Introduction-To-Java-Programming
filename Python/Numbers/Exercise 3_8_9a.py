hour = eval(input('Enter hour : '))
hoursAhead = eval(input('How many hours ahead? : '))
newHour = (hour+hoursAhead)%12

print('New hour : ',newHour,'o\'clock')
