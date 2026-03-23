# Student CRUD API

A simple REST API built with Spring Boot and Microsoft SQL Server.

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Microsoft SQL Server (Docker)
- Maven

---

## Getting Started

### 1. Start MSSQL with Docker

```bash
docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=YourPassword@123" \
  -p 1433:1433 --name sqlserver \
  -d mcr.microsoft.com/mssql/server:2022-latest
```

### 2. Configure Database

Copy the example file and update your credentials:

```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

### 3. Run the App

```bash
./mvnw spring-boot:run
```

App runs at `http://localhost:8080`

---

## API Endpoints

| Method | URL | Description |
|---|---|---|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Create new student |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |

### Example Request Body (POST / PUT)

```json
{
  "name": "Aman",
  "email": "aman@gmail.com",
  "course": "Computer Science",
  "age": 21
}
```

---

## Notes

- Do not include `id` in POST request body — it is auto generated
- Do not commit `application.properties` — it contains your credentials

---

## Author

**Aman** — [@your-username](https://github.com/your-username)
