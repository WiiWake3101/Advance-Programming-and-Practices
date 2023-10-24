def RA2211003010002_find_palindromes(RA2211003010002_sentence):
    RA2211003010002_words = RA2211003010002_sentence.split()
    return [word for word in RA2211003010002_words if word == word[::-1]]

RA2211003010002_sentence = input("Enter a sentence: ")
RA2211003010002_palindromes = RA2211003010002_find_palindromes(RA2211003010002_sentence)
print("Palindromic words in the sentence: ", ', '.join(RA2211003010002_palindromes))