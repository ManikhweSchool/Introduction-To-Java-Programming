# Example 1 - 1234 -> 1230
# Example 2 - 5647 -> 5650

weightInKilograms = eval(input('Enter weight : '))
weightInPounds = weightInKilograms*2.2
remainder = weightInPounds%10
print('Before Rounding', weightInPounds)

if remainder >= 5 :
    weightInPounds = weightInPounds + (10-remainder)
else :
    weightInPounds = (weightInPounds//10)*10

print('Answer To The Nearest 10th is', weightInPounds)
