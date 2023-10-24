def RA2211003010002_remove_duplicates(RA2211003010002_list):
    return list(dict.fromkeys(RA2211003010002_list))

RA2211003010002_list = list(map(int, input("Enter numbers separated by space: ").split()))
RA2211003010002_list_no_duplicates = RA2211003010002_remove_duplicates(RA2211003010002_list)
print("List without duplicates: ", ' '.join(map(str, RA2211003010002_list_no_duplicates)))