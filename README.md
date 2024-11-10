                                                    Bus Reservation System


This is a basic Bus Reservation System that allows users to create, update, delete, and read bus reservations. The project uses Java Spring Boot for the backend, Angular for the frontend, and MySQL as the database.

Table of Contents

•	Features

•	Technologies Used

•	Getting Started

o	Prerequisites

o	Installation

•	Usage

•	Screenshots

•	Contributing

•	License

Features

 • Create Reservation: Allows users to add new bus reservations, specifying details such as date, time, seat number, and passenger information.

•  	Update Reservation: Modify existing reservations with updated information.

•	Delete Reservation: Remove reservations from the system.

•	Read/View Reservations: View a list of all reservations, with search and filter capabilities.

Technologies Used

•	Backend: Java, Spring Boot

•	Frontend: Angular

•	Database: MySQL

Getting Started




Prerequisites

•	Java (JDK 11 or higher)

•	Node.js and Angular CLI

•	MySQL Server

•	Maven (for managing Spring Boot dependencies)



Installation
1.	Clone the repository:
bash
Copy code

              git clone https://github.com/your-username/bus-reservation-system.git
  	          cd bus-reservation-system


3.	Set up the backend:
o	Navigate to the backend folder:
bash
Copy code

                cd backend


o	Update application.properties with your MySQL database credentials:
properties
Copy code

                            spring.datasource.url=jdbc:mysql://localhost:3306/bus_reservation
                            spring.datasource.username=yourUsername
                            spring.datasource.password=yourPassword

o	Run the Spring Boot application:
bash
Copy code

                             mvn spring-boot:run


3.	Set up the frontend:
o	Navigate to the frontend folder:
bash
Copy code
 
                             cd ../frontend
o	Install the Angular dependencies:
bash
Copy code
                        npm install
o	Run the Angular development server:
bash
Copy code
                        ng serve


o	Open your browser and navigate to access the frontend.

                            http://localhost:4200 
                 
Usage
1.	Create Reservation: Click on the "Add Reservation" button, fill in the necessary details, and submit.
2.	View Reservations: View all reservations in a table format with options to search and filter results.
3.	Update Reservation: Select a reservation and choose "Edit" to modify the details.
4.	Delete Reservation: Select a reservation and choose "Delete" to remove it from the system.


Screenshots



![image](https://github.com/user-attachments/assets/b950f29c-1adf-469f-b8cf-ae0b7ebde576)
![image](https://github.com/user-attachments/assets/011a753c-aea0-43b7-ba61-f6bb785c8dc7)
![image](https://github.com/user-attachments/assets/e7ba2021-bfdf-4f27-880a-9e2ea48a073d)



Contributing
If you’d like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.


