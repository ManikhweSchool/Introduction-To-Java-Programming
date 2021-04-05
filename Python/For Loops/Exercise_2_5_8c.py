name = input('Enter Name : ')
frequency = eval(input('Enter Number Of Times : '))

if frequency < 0:
    print('Invalid Number Of Times.')
else:
    for index in range(frequency):
        print(name)
