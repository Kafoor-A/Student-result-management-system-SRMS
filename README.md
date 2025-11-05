# 🎓 Student Result Management System (SRMS)

![SRMS Banner](https://raw.githubusercontent.com/Kafoor-A/Student-result-management-system-SRMS/main/banner.png)

The **Student Result Management System (SRMS)** is a full-stack web application that streamlines how educational institutions manage academic records.  
It enables admins and teachers to create student profiles, manage courses, enter marks or grades, and automatically generate transcripts.  
Students can securely log in to view their results and performance reports.

---


## 🚀 Features

✅ Add, update, delete, and view student records  
✅ Manage courses, subjects, and exams  
✅ Record marks/grades and calculate GPA/CGPA  
✅ Role-based access for Admin, Teacher, and Student  
✅ Search and filter student data easily  
✅ Export data as CSV or PDF (planned)  
✅ Simple REST API integration  
✅ Built-in analytics: toppers, pass percentage, etc.

---

## 🛠️ Tech Stack

| Layer | Technology |
|:------|:------------|
| **Frontend** | React.js, Tailwind CSS |
| **Backend** | Java Spring Boot (REST API) |
| **Database** | H2 (Development), MySQL/PostgreSQL (Production) |
| **Build Tools** | Maven, npm |
| **IDE** | Visual Studio Code |
| **Version Control** | Git & GitHub |

---

## 🧩 Project Structure

```
Student-Result-Management-System/
│
├── backend/                  # Spring Boot project
│   ├── src/main/java/com/example/srms/
│   │   ├── controller/       # REST controllers
│   │   ├── model/            # JPA entities
│   │   ├── repo/             # Spring Data repositories
│   │   └── SrmsApplication.java
│   └── src/main/resources/
│       └── application.properties
│
├── frontend/                 # React app
│   ├── src/
│   │   ├── components/
│   │   └── App.js
│   └── package.json
│
└── README.md
```

---

## ⚙️ Installation & Setup

### 🔹 Backend (Spring Boot)
1. Open the backend folder in VS Code  
2. Update `application.properties` if you use MySQL  
3. Run the backend server:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Access API at: [http://localhost:8080](http://localhost:8080)

### 🔹 Frontend (React)
1. Open a new terminal in the `frontend` folder  
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the frontend:
   ```bash
   npm start
   ```
4. App runs at: [http://localhost:3000](http://localhost:3000)

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|:--------|:----------|:-------------|
| `GET` | `/api/students` | Fetch all students |
| `POST` | `/api/students` | Add a new student |
| `GET` | `/api/students/{id}` | Get student by ID |
| `PUT` | `/api/students/{id}` | Update student details |
| `DELETE` | `/api/students/{id}` | Delete a student |
| `GET` | `/api/courses` | Fetch all courses |
| `POST` | `/api/courses` | Add new course |
| `GET` | `/api/results` | View all results |
| `POST` | `/api/results` | Record student result |
| `GET` | `/api/students/{id}/transcript` | Generate transcript for a student |

---

## 🧮 Example Data Model

### Student
```json
{
  "studentId": "S001",
  "firstName": "Abdul",
  "lastName": "Kafoor",
  "email": "a.kafoor@example.com",
  "enrollmentYear": 2024
}
```

### Course
```json
{
  "courseId": "CS101",
  "title": "Data Structures",
  "credits": 4
}
```

### Result
```json
{
  "studentId": "S001",
  "courseId": "CS101",
  "examId": 1,
  "marks": 88,
  "grade": "A",
  "gradePoints": 9.0
}
```

---

## 🧾 Database Schema (Core Tables)

```sql
CREATE TABLE students (
  student_id VARCHAR(20) PRIMARY KEY,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100),
  email VARCHAR(150),
  enrollment_year INT
);

CREATE TABLE courses (
  course_id VARCHAR(20) PRIMARY KEY,
  title VARCHAR(200) NOT NULL,
  credits INT NOT NULL
);

CREATE TABLE exams (
  exam_id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  max_marks INT NOT NULL,
  exam_date DATE
);

CREATE TABLE results (
  id INT AUTO_INCREMENT PRIMARY KEY,
  student_id VARCHAR(20) NOT NULL,
  course_id VARCHAR(20) NOT NULL,
  exam_id INT NOT NULL,
  marks DECIMAL(6,2),
  grade VARCHAR(5),
  grade_points DECIMAL(4,2),
  FOREIGN KEY (student_id) REFERENCES students(student_id),
  FOREIGN KEY (course_id) REFERENCES courses(course_id),
  FOREIGN KEY (exam_id) REFERENCES exams(exam_id)
);
```

---

## 📊 Future Enhancements

- 🔐 JWT Authentication & Role-based Access  
- 📤 CSV Import/Export for bulk data  
- 🧾 Transcript PDF generation  
- ☁️ Cloud deployment (Render / Railway / AWS)  
- 📈 Analytics dashboard using Chart.js or Recharts

---

## 🧑‍💻 Developed With

- **Java Spring Boot** for backend REST APIs  
- **React.js** for interactive frontend  
- **H2/MySQL** for database  
- **VS Code** for development and debugging  

---

## 🏁 Quick Start

1. Run backend (`mvn spring-boot:run`)  
2. Run frontend (`npm start`)  
3. Visit [http://localhost:3000](http://localhost:3000)  
4. Add new students, courses, and results  
5. View records instantly from the dashboard  

---

## 📜 License

This project is open-source under the **MIT License**.

---

### ⭐ Show your support
If you like this project, don’t forget to **star** 🌟 the repository!

---

**Author:** Abdul Kafoor  
**Department of Electronics and Communication Engineering**  
**Rajalakshmi Engineering College**



