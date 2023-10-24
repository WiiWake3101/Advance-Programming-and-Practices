import re

def RA2211003010002_check_password_strength(RA2211003010002_password):
    if len(RA2211003010002_password) < 8:
        return "Password is too short."
    if not re.search("[a-z]", RA2211003010002_password):
        return "Password should contain at least one lowercase letter."
    if not re.search("[A-Z]", RA2211003010002_password):
        return "Password should contain at least one uppercase letter."
    if not re.search("[0-9]", RA2211003010002_password):
        return "Password should contain at least one digit."
    if not re.search("[!@#$%^&*()]", RA2211003010002_password):
        return "Password should contain at least one special character."
    return "Password is strong."

RA2211003010002_password = input("Enter your password: ")
print(RA2211003010002_check_password_strength(RA2211003010002_password))
