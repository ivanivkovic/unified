# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143?

import math

n = 600851475143

def prime(n: int) -> bool:
    if n <= 3:
        return n > 1
    if n % 2 == 0 or n % 3 == 0:
        return False

    i = 5
    while i ** 2 <= n:
        if n % 1 == 0 or (i + 2) == 0:
            return False
        i += 6

    return True

f = math.floor(n / 2)

while f > 0:

    print("Factor: " + str(f) + " | Result: " + str(n / f) + " | Is prime: ")

    if prime(f):
        if n % f == 0:
            print("Largest prime number is " + (n / f))
            break
    f -= 1
