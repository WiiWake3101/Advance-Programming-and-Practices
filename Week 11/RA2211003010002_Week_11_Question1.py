def RA2211003010002_find_two_largest_numbers(RA2211003010002_array):
    RA2211003010002_first_largest = max(RA2211003010002_array[0], RA2211003010002_array[1])
    RA2211003010002_second_largest = min(RA2211003010002_array[0], RA2211003010002_array[1])

    for i in range(2, len(RA2211003010002_array)):
        if RA2211003010002_array[i] > RA2211003010002_first_largest:
            RA2211003010002_second_largest = RA2211003010002_first_largest
            RA2211003010002_first_largest = RA2211003010002_array[i]
        elif RA2211003010002_array[i] > RA2211003010002_second_largest:
            RA2211003010002_second_largest = RA2211003010002_array[i]

    return RA2211003010002_first_largest, RA2211003010002_second_largest


RA2211003010002_array = list(map(int, input("Enter numbers separated by space: ").split()))
print("Array: ", RA2211003010002_array)
RA2211003010002_first_largest, RA2211003010002_second_largest = RA2211003010002_find_two_largest_numbers(RA2211003010002_array)
print("First largest number is: ", RA2211003010002_first_largest)
print("Second largest number is: ", RA2211003010002_second_largest)