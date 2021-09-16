hour = eval(input('Enter hour : '))

if hour<=12 and hour>=1:
    amOrpm = eval(input('am (1) or pm (2)? '))
    if amOrpm==1 or amOrpm==2:
        hoursAhead = eval(input('How many hours ahead? '))

        if hoursAhead>=0:
            if hour+hoursAhead<12:
                print('New hour : ', (hour+hoursAhead),end='',sep='')

                if amOrpm==1:
                    print('am')
                else:
                    print('pm')
            if hour+hoursAhead==12:
                print('New hour : ', (hour+hoursAhead),end='',sep='')
                if amOrpm==2:
                    print('am')
                else:
                    print('pm')
            elif ((hour+hoursAhead)//12)%2==0:
                print('New hour : ', (hour+hoursAhead)%12,end='',sep='')
                if amOrpm==1:
                    print('am')
                else:
                    print('pm')
            else:
                print('New hour : ', (hour+hoursAhead)%12,end='',sep='')
                if amOrpm==2:
                    print('am')
                else:
                    print('pm')
        else:
            print('Error : Enter Positive Hours.')
    else:
        print('Only Enter am (1) or pm (2)')
            
            
