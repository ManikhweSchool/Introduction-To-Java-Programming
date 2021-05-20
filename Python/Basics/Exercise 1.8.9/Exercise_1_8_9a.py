mealPrice = eval(input('Enter Meal Price : '))
tipPercent = eval(input('Enter Tip Percent : '))

if mealPrice<=0:
    print('Error : Invalid Meal Price.')
else:
    if tipPercent >= 0 and tipPercent<=100:
        tipAmount = (tipPercent/100)*mealPrice
        totalPrice = mealPrice + tipAmount
        print('Final Price =',totalPrice,'TipAmount =',tipAmount)
    else:
        print('Error Invalid Tip Percent.')
