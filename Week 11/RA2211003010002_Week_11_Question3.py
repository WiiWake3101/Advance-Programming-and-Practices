def RA2211003010002_count_occurrences(RA2211003010002_array, RA2211003010002_element):
    return RA2211003010002_array.count(RA2211003010002_element)

RA2211003010002_array = list(map(int, input("Enter numbers separated by space: ").split()))
RA2211003010002_element = int(input("Enter the element to count: "))
RA2211003010002_count = RA2211003010002_count_occurrences(RA2211003010002_array, RA2211003010002_element)
print("Occurrences of", RA2211003010002_element, "in the array: ", RA2211003010002_count)