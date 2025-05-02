import re

def validar_email(email):
    regex = r'^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+(\.[a-zA-Z]{2,})+$'
    return "Email valido" if re.fullmatch(regex, email) else "Email invalido"

print(validar_email("meuemail123@mymail.com"))