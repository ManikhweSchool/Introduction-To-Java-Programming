size = eval(input('Enter letter size : '))
leftSpaces = size-1

if size%2==0:
    leftSpaces = size+1
middleSpaces = 1

#Display Top Triangle.
print(' '*leftSpaces,'*',sep='')
leftSpaces = leftSpaces - 1

for i in range(size//2-1):
    print(' '*leftSpaces,'*',' '*middleSpaces,'*',sep='')
    middleSpaces = middleSpaces+2
    leftSpaces = leftSpaces-1

#Display Horizontal Starts.
print(' '*leftSpaces,'*'*middleSpaces,'**',sep='')

# Display The Bottom Part.
middleSpaces = middleSpaces +2
leftSpaces = leftSpaces-1
for i in range(size//2-1):
    print(' '*leftSpaces,'*',' '*middleSpaces,'*',sep='')
    middleSpaces = middleSpaces+2
    leftSpaces = leftSpaces-1
    
