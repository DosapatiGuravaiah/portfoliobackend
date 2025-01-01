# Portfolio Tracker Backend

This is the backend of the **Portfolio Tracker** application, built using **Java** and **Spring Boot**. It exposes a set of RESTful APIs to manage and track stock holdings, as well as calculate the total portfolio value based on real-time stock prices.

## Features
- **Add, Edit, Delete** stock holdings.
- **Fetch all stocks** and calculate portfolio value dynamically.
- **RESTful API** to handle CRUD operations for stock holdings.
- **Integrates with a real-time stock price API** (e.g., Alpha Vantage, Yahoo Finance, or Finnhub) to calculate portfolio value.

## Prerequisites
Ensure you have the following installed:
- **Java 11** or later.
- **Maven** - For dependency management and project builds.
- **Railway Database** (or any relational database) for the database setup.

## Setup Instructions

### 1. Clone the repository:
```bash
git clone https://github.com/DosapatiGuravaiah/portfoliobackend.git
cd portfoliobackend


2.  Install dependencies:
This backend uses Maven for dependency management. Run the following command to install the required dependencies:
mvn clean install




3. Set up Railway Database:
Go to your Railway project dashboard.

Create a new PostgreSQL (or MySQL) database if you haven't already.

Once the database is created, you'll find the database connection details (URL, username, password).

Update the application.properties file in src/main/resources/ to use the Railway database connection details:

Example for PostgreSQL:

spring.datasource.url=jdbc:postgresql://your-database-url:5432/your-database-name
spring.datasource.username=your-database-username
spring.datasource.password=your-database-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.datasource.driver-class-name=org.postgresql.Driver
If you're using MySQL, replace the PostgreSQL connection details with the MySQL connection details accordingly.

4. Run the backend server:
mvn spring-boot:run
The backend API will be accessible at http://localhost:8080.



5. API Endpoints:
POST /stocks: Add a new stock.
GET /stocks: Fetch all stocks in the portfolio.
PUT /stocks/{id}: Update stock details.
DELETE /stocks/{id}: Remove a stock from the portfolio.
GET /portfolio/value: Get the total portfolio value based on real-time stock prices.


6. Real-Time Stock Price Integration:
The backend fetches real-time stock prices from a third-party API (such as Alpha Vantage, Yahoo Finance, or Finnhub). Ensure you have the appropriate API keys configured for this service in the application.properties file.


7. Testing the Backend API:
You can use tools like Postman I to test the API endpoints.



8.Deployment:
Deployed Backend API Link:https://portfoliobackend-production-a583.up.railway.app/
To fetch the data which is present in the  database==>https://portfoliobackend-production-a583.up.railway.app/api/stocks

9.Assumptions & Limitations
The portfolio initially includes 5 random stocks, each with a quantity of 1.
Real-time stock price fetching depends on the third-party API you use.
The database is configured for PostgreSQL (or MySQL) on Railway, but can be modified to work with other relational databases.





