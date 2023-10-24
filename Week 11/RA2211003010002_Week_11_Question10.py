def RA2211003010002_fibonacci_sequence(RA2211003010002_n):
    RA2211003010002_sequence = [0, 1]
    while len(RA2211003010002_sequence) < RA2211003010002_n:
        RA2211003010002_sequence.append(RA2211003010002_sequence[-1] + RA2211003010002_sequence[-2])
    return RA2211003010002_sequence

RA22211003001002_n = int(input("Enter the number of terms: "))
print(RA2211003010002_fibonacci_sequence(RA22211003001002_n))
