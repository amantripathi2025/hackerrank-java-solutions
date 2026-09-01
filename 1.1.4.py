# Input two numbers
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

# Relational Operators
print("a > b :", a > b)
print("a < b :", a < b)
print("a == b :", a == b)
print("a != b :", a != b)

# Logical Operators with Conditional Statements
if a > 0 and b > 0:
    print("Both numbers are positive")
elif a > 0 or b > 0:
    print("At least one number is positive")
else:
    print("Both numbers are non-positive")

if not (a == b):
    print("The numbers are different")
else:
    print("The numbers are equal")