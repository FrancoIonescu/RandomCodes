import streamlit as st
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, r2_score
import numpy as np

# Set up page configuration
st.set_page_config(page_title="Titlu Sugestiv")
st.title("Titlu Aplicatie Spart Serverele NASA")
st.header("Bine ai venit!")

# File uploader
file = st.file_uploader("Incarca aici fisier CSV")

if file is not None:
    # Read CSV file into DataFrame
    df = pd.read_csv(file)
    
    # Display the dataframe
    st.dataframe(df)
    
    # Descriptive statistics
    st.subheader("Descriptive Statistics")
    st.write(df.describe())
    
    # Country filter (sidebar)
    unique_countries = df['Country'].unique()
    selected_countries = st.multiselect("Select Countries", options=unique_countries, default=unique_countries[:5])
    
    # Button to select all countries
    if st.button("Select All Countries"):
        selected_countries = unique_countries.tolist()
    
    # Filter the DataFrame based on selected countries
    filtered_df = df[df['Country'].isin(selected_countries)]
    
    # Bar Plot - Happiness Score by Country (after filtering by selected countries)
    if len(filtered_df) > 0:
        plt.figure(figsize=(15,10))
        df_sorted = filtered_df.sort_values('HappinessScore', ascending=False)
        plt.bar(df_sorted['Country'], df_sorted['HappinessScore'], color='skyblue')
        plt.title("Happiness Score by Country")
        plt.xlabel("Country")
        plt.ylabel("Happiness Score")
        plt.xticks(rotation=90)
        st.pyplot(plt)
    else:
        st.write("Please select at least one country.")
    
    # Boxplot - Happiness Score Distribution by Region
    plt.figure(figsize=(12, 8))
    sns.boxplot(data=df, x='Region', y='HappinessScore', palette='Set2')
    plt.title("Happiness Score Distribution by Region")
    st.pyplot(plt)
    
    # Histogram - Happiness Score Frequency Distribution
    plt.figure(figsize=(12, 8))
    sns.histplot(df['HappinessScore'], kde=True, bins=10, color='lightgreen')
    plt.title("Happiness Score Frequency Distribution")
    plt.xlabel("Happiness Score")
    plt.ylabel("Frequency")
    st.pyplot(plt)
    
    # Barplot - Average Happiness Score by Region
    plt.figure(figsize=(12, 8))
    avg_happiness_by_region = df.groupby('Region')['HappinessScore'].mean().sort_values(ascending=False)
    sns.barplot(x=avg_happiness_by_region.index, y=avg_happiness_by_region.values, palette='viridis')
    plt.title("Average Happiness Score by Region")
    plt.xlabel("Region")
    plt.ylabel("Average Happiness Score")
    st.pyplot(plt)

    # Linear Regression Model for HappinessScore
    st.subheader("Linear Regression Model: HappinessScore Prediction")

    # Prepare the data
    df = df.dropna(subset=['HappinessScore', 'HDI', 'GDP_PerCapita', 'Beer_PerCapita', 'Spirit_PerCapita', 'Wine_PerCapita'])

    # Select independent variables (features)
    X = df[['HDI', 'GDP_PerCapita', 'Beer_PerCapita', 'Spirit_PerCapita', 'Wine_PerCapita']]
    y = df['HappinessScore']

    # Split the data into train and test sets
    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

    # Create and train the model
    model = LinearRegression()
    model.fit(X_train, y_train)

    # Make predictions
    y_pred = model.predict(X_test)

    # Calculate R-squared and Mean Squared Error
    r2 = r2_score(y_test, y_pred)
    mse = mean_squared_error(y_test, y_pred)
    
    # Display the R-squared and MSE
    st.write(f"R-squared: {r2:.4f}")
    st.write(f"Mean Squared Error: {mse:.4f}")

    # Display coefficients
    coefficients = pd.DataFrame(model.coef_, X.columns, columns=['Coefficient'])
    st.write("Model Coefficients:")
    st.write(coefficients)

    # Plot residuals
    residuals = y_test - y_pred
    plt.figure(figsize=(12, 8))
    sns.histplot(residuals, kde=True, color='red', bins=10)
    plt.title("Residuals Distribution")
    plt.xlabel("Residuals")
    plt.ylabel("Frequency")
    st.pyplot(plt)

    # Plot the predicted vs actual values
    plt.figure(figsize=(12, 8))
    plt.scatter(y_test, y_pred, color='blue')
    plt.plot([min(y_test), max(y_test)], [min(y_test), max(y_test)], color='red', linestyle='--')
    plt.title("Actual vs Predicted Happiness Scores")
    plt.xlabel("Actual Happiness Scores")
    plt.ylabel("Predicted Happiness Scores")
    st.pyplot(plt)

# Add a separator and footer
st.markdown("---")
st.markdown("Created by Franco Ionescu | [GitHub](https://github.com/FrancoIonescu)")
