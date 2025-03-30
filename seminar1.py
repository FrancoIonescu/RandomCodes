
# Ex 1
print('\nEX 1: ')
n = int(input("Introduceti un numar n (n < 10): "))
while n >= 10:
    print("n trebuie sa fie mai mic decat 10!")
    n = int(input("Introduceti un numar n (n < 10): "))

lista = []
for i in range(n):
    element = int(input(f"Introduceti elementul {i + 1}: "))
    lista.append(element)

lista.sort()

print("Lista ordonata:", lista)

# Ex 2
print('\nEX 2: ')
orase = ['Bucuresti', 'Oradea', 'Timisoara', 'Cluj', 'Constanta']

def lungimi_orase(oras):
    return len(oras)

orase.sort(key=lungimi_orase, reverse=True)
print(orase)

# Ex 3
print('\nEX 3: ')
lista = [['telefon', 1000, 2], ['laptop', 4500, 4], ['tableta', 2000, 5], ['tv', 2500, 3]]

for echipament in lista:
    valoare = echipament[1] * echipament[2]  # preț * cantitate
    echipament.append(valoare)  # Adăugăm valoarea în listă

lista.sort(key=lambda x: x[3], reverse=True)

print("Lista echipamentelor sortata descrescator dupa valoare:")
for echipament in lista:
    print(echipament)

# Ex 4
print('\nEX 4: ')
lista_angajati = ['Popescu Vasile', 'Ionescu Gigel', 'Pop Maria']
lista_clienti = ['Ionescu Gigel', 'Costache Ioana', 'Anton Eugenia']

angajat_client = set(lista_angajati) & set(lista_clienti)
print("Angajat care este si client:", *angajat_client)

# Ex 5
print('\nEX 5: ')
lista = [
    {"id": 1, "nume": "Popescu", "salariul": 5000},
    {"id": 2, "nume": "Ionescu", "salariul": 4000},
    {"id": 3, "nume": "Vasilescu", "salariul": 6000}
]

for angajat in lista:
    if angajat["salariul"] < 5000:
        angajat["salariul"] *= 1.1

print("Lista cu salarii actualizate:", lista)

# Ex 6
print('\nEX 6 (Functie folosita la EX 7)')
def este_prim(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

# Ex 7
print('\nEX 7: ')
def numere_prime(lista):
    return [num for num in lista if este_prim(num)]

m = int(input("Introduceți m: "))
li1 = list(range(1, m))
li2 = numere_prime(li1)

print("Lista numerelor prime:", li2)
