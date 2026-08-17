print("WELCOME TO THE SIMPLE CALCULATOR WHICH USES IF-ELIF-ELSE STATEMENTS")
a  = float(input("Enter the first number: "))
b  = float(input("Enter the second number: "))

print("Select the operation you want to perform:")
print("1. Addition")
print("2. Subtraction")
print("3. Multiplication")
print("4. Division")

operation = input("Enter the operation (1/2/3/4): ")
if operation == '1':
    result = a + b
    print("The result of addition is: ",{result})
elif operation == '2':
    result = a - b
    print("The result of subtraction is: {result}")
elif operation == '3':
    result = a * b
    print("The result of multiplication is: {result}")
elif operation == '4':
    if b != 0:
        result = a / b
        print("The result of division is: ",{result})
    else:
        print("Error: Division by zero is not allowed.")
else:
    print("Invalid operation selected. Please choose a valid option (1/2/3/4).")
    
