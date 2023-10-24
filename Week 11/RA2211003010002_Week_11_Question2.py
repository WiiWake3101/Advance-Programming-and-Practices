def RA2211003010002_sum_even_odd(RA2211003010002_array):
    RA2211003010002_sum_even = sum(i for i in RA2211003010002_array if i % 2 == 0)
    RA2211003010002_sum_odd = sum(i for i in RA2211003010002_array if i % 2 != 0)
    return RA2211003010002_sum_even, RA2211003010002_sum_odd

RA2211003010002_array = list(map(int,input("Enter numbers separated by space: ").split()))
RA2211003010002_sum_even, RA2211003010002_sum_odd = RA2211003010002_sum_even_odd(RA2211003010002_array)
print("Sum of even numbers: ", RA2211003010002_sum_even)
print("Sum of odd numbers: ", RA2211003010002_sum_odd)