 
## Project Title: Honors Enrolment Pre-assessment System (HEPaS)

### Description:
HEPaS is a distributed client-server application designed for the Open University of Science and Technology (OUST). It allows users, including OUST students and non-students, to self-assess their eligibility for Honors studies. The system consists of a client-side application, one or more server-side applications, and a database server storing OUST students' course learning records.

### Features:
- Authentication: Only authenticated users are allowed to use the application.
- Data Entry: Users can enter their unit scores manually or access their student records for assessment.
- Server-Side Processing: The server calculates averages, evaluates eligibility based on criteria, and returns assessment results to the client.
- Three-Tier Architecture: The application follows a three-tier architecture with separate layers for client, server-1, and server-2 (database server).
- Data Validation: Client-side application performs necessary data validation to ensure data integrity.
- Extensive Testing: Comprehensive testing is conducted using various datasets to ensure functionality and reliability.

### Implementation Details:
- Phase 1: Two-Tier Version Implementation
  - Remote Method Invocation (RMI) is used for communication between client and server-1.
  - Data validation is implemented on the client-side application.
  - Server-side application processes data, calculates averages, and evaluates eligibility.
  
- Phase 2: Three-Tier Version Implementation
  - Third-tier server (server-2) acts as the database server storing OUST students' course learning records.
  - Database setup includes populating the OSCLR database with sample data.
  - Client-side extension allows users to choose between manual data entry and accessing student records.
  - Server-side extension handles requests for accessing student records from the database server.

### Technologies Used:
- Language: Java
- Libraries/Frameworks: RMI
- Database: MySQL

### Installation:
1. Clone the repository from GitHub: [Repository URL]
2. Install java  and required dependencies.
3. Set up the database server MySQL and populate the OSCLR database with sample data.
4. Run the client application and follow the on-screen instructions for assessment.

### Contributors:
- Isuru sankhajith 

### License:
This project is licensed under the MIT License.

### Additional Notes:..
- Please refer to the project documentation for detailed setup instructions and usage guidelines.
- Contributions, bug reports, and feature requests are welcome. Feel free to submit a pull request or open an issue on GitHub.

---


