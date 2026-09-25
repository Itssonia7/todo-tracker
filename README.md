
```markdown
# 🚀 Spring Boot In-Memory Todo Tracker API

A lightweight, robust RESTful Todo Tracker built from absolute scratch using **Spring Boot** and **Java**. This project was created as a hands-on learning exercise to understand core backend concepts, REST architectural patterns, and Spring Boot's dependency injection and request routing.

---

## 🛠️ Tech Stack & Tools

* **Language:** Java 17
* **Framework:** Spring Boot (Spring Web)
* **Build Tool:** Gradle
* **Version Control:** Git & GitHub

---

## 📂 Project Architecture

```text
todo-tracker/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/todo_tracker/
│   │   │   ├── TodoTrackerApplication.java  # Main entry point
│   │   │   ├── controller/
│   │   │   │   └── TodoController.java      # REST endpoints handler
│   │   │   └── model/
│   │   │       └── Todo.java                # Data structure / POJO
│   │   └── resources/
│   │       └── application.properties       # Configuration files
│   └── test/
├── build.gradle
└── settings.gradle

```

---

## 🔌 API Endpoints

| Method | Endpoint | Description |
| --- | --- | --- |
| **GET** | `/` | Welcome home check |
| **GET** | `/todos` | Retrieve all todo tasks in JSON format |
| **POST** | `/todos` | Add a new todo task |
| **DELETE** | `/todos/{id}` | Delete a specific todo task by its ID |

---

## 🏃‍♂️ How to Run Locally

1. **Clone the repository:**
```bash
git clone [https://github.com/YOUR_USERNAME/todo-tracker.git](https://github.com/YOUR_USERNAME/todo-tracker.git)
cd todo-tracker

```


2. **Run the application using Gradle:**
* On Linux/macOS:
```bash
./gradlew bootRun

```


* On Windows:
```cmd
gradlew.bat bootRun

```




3. **Test the endpoints:**
Open your browser or API client (like Postman / Thunder Client) at:
`http://localhost:8080/todos`

---

## 💡 What I Learned

* Setting up a production-ready Spring Boot skeleton via Spring Initializr.
* Structuring packages cleanly into `controllers` and `models`.
* Handling HTTP methods (`GET`, `POST`, `DELETE`) with annotations like `@RestController`, `@GetMapping`, `@PostMapping`, and `@PathVariable`.
* Automating JSON serialization using Spring's built-in Jackson engine.

```




