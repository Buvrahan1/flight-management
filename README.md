# ✈️ SkySync: Automated Flight Management Ecosystem

SkySync is a production-ready flight management system designed with a microservices architecture. The project demonstrates a complete end-to-end software lifecycle, featuring a automated **CI/CD pipeline**, **Cloud Deployment (AWS)**, and real-time **Infrastructure Monitoring**.

## 🌐 Live Demo
The application is currently live on AWS:
👉 [http://18.197.41.106:8080/api/flights](http://18.197.41.106:8080/api/flights)

## 🚀 Key Features

* [cite_start]**Production Environment**: Hosted on an **AWS EC2 (t3.micro)** instance utilizing an Ubuntu-based server[cite: 33].
* [cite_start]**Zero-Touch Deployment**: Implemented a continuous deployment (CD) pipeline using **Watchtower**, enabling automated updates directly from GitHub to the AWS environment[cite: 34].
* [cite_start]**Microservices Optimization**: Successfully containerized and managed 5 microservices using **Docker**, optimized to run efficiently on a memory-constrained (1GB RAM) cloud instance.
* [cite_start]**Full-Stack Monitoring**: Deployed a comprehensive observability stack using **Prometheus** and **Grafana** for 24/7 monitoring of CPU, memory, and application-specific metrics[cite: 35, 36].
* **Robust Backend**: Built with **Spring Boot** to handle flight data operations via a RESTful API.

## 🛠️ Technical Stack

* **Backend**: Java, Spring Boot
* [cite_start]**Cloud & Infrastructure**: AWS (EC2), Linux (Ubuntu) [cite: 33, 44]
* [cite_start]**DevOps**: Docker, Docker Compose, Watchtower [cite: 34, 44]
* [cite_start]**Monitoring**: Prometheus, Grafana [cite: 35, 45]
* **Version Control**: Git & GitHub Actions

## 🏗️ System Architecture

1.  **Code**: Developed and pushed to GitHub.
2.  [cite_start]**Deploy**: Watchtower detects image updates and automatically recreates Docker containers on AWS[cite: 34].
3.  [cite_start]**Monitor**: Prometheus scrapes metrics from the containers, visualized through a Grafana dashboard.

## 🔧 API Usage

To view the flight data, you can send a GET request to:
`GET /api/flights`

---

### 👨‍💻 Author
[cite_start]**Buğrahan Aydın** *Computer Engineering Student at Yeditepe University* [cite: 1, 10]
[LinkedIn](https://www.linkedin.com/in/bugrahan-aydin0/) | [GitHub](https://github.com/Buvrahan1)
