rows = eval(input('Enter number of rows : '))
numberOfStars = 1;
numberOfSpaces = rows-1

# Deal with the top part.
for i in range(rows):
    print(' '*numberOfSpaces,'*'*numberOfStars,sep='')
    numberOfSpaces = numberOfSpaces-1
    numberOfStars = numberOfStars+2

# Deal With The Bottom Part.
numberOfSpaces = 1
numberOfStars = numberOfStars-2

for i in range(rows):
    print(' '*numberOfSpaces,'*'*(numberOfStars-2),sep='')
    numberOfSpaces = numberOfSpaces + 1
    numberOfStars = numberOfStars - 2
