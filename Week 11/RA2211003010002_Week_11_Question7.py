def RA2211003010002_diamond_pattern(RA2211003010002_n):
    for i in range(RA2211003010002_n):
        print(' ' * (RA2211003010002_n - i - 1) + ' '.join(str(j) for j in range(1, 2*i+2)))
    for i in range(RA2211003010002_n-2, -1, -1):
        print(' ' * (RA2211003010002_n - i - 1) + ' '.join(str(j) for j in range(1, 2*i+2)))

RA2211003010002_n = int(input("Enter the number of rows: "))
RA2211003010002_diamond_pattern(RA2211003010002_n)
