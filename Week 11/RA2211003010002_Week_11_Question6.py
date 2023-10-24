def RA2211003010002_multiply_matrices(RA2211003010002_A, RA221100301002_B):
    if len(RA22211003001002_A[0]) != len(RA22211003001002_B):
        return "Error: The matrices are not compatible for multiplication."
    else:
        return [[sum(a*b for a,b in zip(X_row,Y_col)) for Y_col in zip(*RA22211003001002_B)] for X_row in RA22211003001002_A]

RA22211003001002_A = [list(map(int, input().split())) for _ in range(int(input("Enter number of rows in first matrix: ")))]
RA22211003001002_B = [list(map(int, input().split())) for _ in range(int(input("Enter number of rows in second matrix: ")))]
RA22211003001002_result = RA2211003010002_multiply_matrices(RA22211003001002_A, RA22211003001002_B)

if isinstance(RA22211003001002_result, str):
    print(RA22211003001002_result)
else:
    print("Resultant matrix after multiplication:")
    for row in RA22211003001002_result:
        print(' '.join(map(str, row)))
