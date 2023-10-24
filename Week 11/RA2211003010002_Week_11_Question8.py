import random
def RA2211003010002_guessing_game():
    RA2211003010002_number = random.randint(1, 100)
    while True:
        RA2211003010002_guess = int(input("Guess the number: "))
        if RA2211003010002_guess < RA2211003010002_number:
            print("Too low!")
        elif RA2211003010002_guess > RA2211003010002_number:
            print("Too high!")
        else:
            print("Congratulations! You guessed it correctly.")
            break

RA2211003010002_guessing_game()