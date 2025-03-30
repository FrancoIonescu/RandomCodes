import pandas as pd
import matplotlib.pyplot as plt

phone_data = pd.read_csv('./phone_data.csv')
print(phone_data)

# Ex 1
print('EX 1: ')
sms_data = phone_data[phone_data['item'] == 'sms'].copy()

sms_duration_per_month = sms_data.groupby('month')['duration'].sum()

plt.figure(figsize=(8, 8))
plt.pie(sms_duration_per_month, labels=sms_duration_per_month.index, autopct='%1.1f%%')
plt.title('Durata insumata a SMS-urilor pe luna')
plt.axis('equal')
plt.show()

# Ex 2
print('\nEX 2: ')
user_usage = pd.read_csv('user_usage.csv')
supported_devices = pd.read_csv('supported_devices.csv')

user_usage.rename(columns={'use_id': 'user_id'}, inplace=True)

user_usage['dummy_id'] = range(len(user_usage))
supported_devices['dummy_id'] = range(len(supported_devices))

merged_data = pd.merge(user_usage, supported_devices, on='dummy_id', how='inner')

traffic_per_brand = merged_data.groupby('Retail Branding')['monthly_mb'].sum().sort_values(ascending=False)

plt.figure(figsize=(12, 6))
traffic_per_brand.plot(kind='bar')
plt.xlabel('Brand')
plt.ylabel('Trafic insumat (MB)')
plt.title('Traficul insumat pe brand')
plt.xticks(rotation=45, ha='right')
plt.tight_layout()
plt.show()

# Ex 3
print('\nEX 3: ')
phone_data['month'] = pd.to_datetime(phone_data['month'])

# 1. Durata insumata pentru fiecare luna
total_duration_per_month = phone_data.groupby(phone_data['month'].dt.strftime('%Y-%m'))['duration'].sum()
print("Durata insumata pentru fiecare luna:")
print(total_duration_per_month)
print("\n")

# 2. Durata insumata pentru tipul de retea 'mobile' pentru fiecare luna
mobile_data = phone_data[phone_data['network_type'] == 'mobile']
mobile_duration_per_month = mobile_data.groupby(mobile_data['month'].dt.strftime('%Y-%m'))['duration'].sum()
print("Durata insumata pentru reteaua 'mobile' pentru fiecare luna:")
print(mobile_duration_per_month)
