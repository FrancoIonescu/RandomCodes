import pandas as pd
import json

# Ex 1
print('EX 1: ')
df = pd.read_csv('./clienti_leasing.csv')
df_filtrat = df[(df['VAL_CREDITS_RON'] == 0) &
                (df['DEPOSIT_AMOUNT'] > 150000)][['NAME_CLIENT', 'DEPOSIT_AMOUNT', 'PRESCORING']]
df_filtrat.loc[df_filtrat['DEPOSIT_AMOUNT'] > 500000, 'PRESCORING'] = 6
print(df_filtrat)

# Ex 2
print('\nEX 2: ')
with open('clienti_daune.json', encoding='utf-8') as f:
    data = json.load(f)

lista_cuvinte = []
for dauna in data:
    lista_cuvinte += str(dauna['Dauna']).lower().split()

dictionar = {}
for cuvant in lista_cuvinte:
    if cuvant not in dictionar:
        dictionar[cuvant] = 1
    else:
        dictionar[cuvant] += 1

cuvinte_excluse = {"the", "and", "to", "a"}

aparitie_filtrata = [(key, value) for key, value in dictionar.items() if key not in cuvinte_excluse and value > 1000]

aparitie_filtrata.sort(reverse=True, key=lambda x: x[1])

for cuvant, frecventa in aparitie_filtrata:
    print(f"{cuvant}: {frecventa}")
