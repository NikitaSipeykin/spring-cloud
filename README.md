# Spring Cloud Microservices Demo (Java 17)

Этот проект представляет собой демонстрацию микросервисной архитектуры, реализованную на **Java 17** с использованием **Spring Cloud**. Система состоит из нескольких модулей, взаимодействующих друг с другом через Eureka и API Gateway.

## 📦 Модули проекта

- **Discovery-service** — сервис регистрации и обнаружения (Eureka Server).
- **Gateway-service** — шлюз для маршрутизации запросов к микросервисам (Spring Cloud Gateway).
- **Product-service** — микросервис, предоставляющий API для работы с продуктами.
- **Model-api** — модуль с общими DTO и моделями, используемыми между сервисами.

## 🔗 Взаимодействие микросервисов

1. Все микросервисы регистрируются в `Discovery-service` (Eureka).
2. `Gateway-service` получает запросы от клиентов и проксирует их к нужным сервисам на основе маршрутов.
3. `Product-service` предоставляет REST API для получения информации о продуктах.

## 🚀 Запуск

### Требования
- Java 17
- Maven 3+
- Docker (опционально, для запуска с базой данных)

### Порядок запуска

1. Запустить `Discovery-service`:
   ```bash
   cd discovery-service
   mvn spring-boot:run
   
2. Запустить `Product-service`:
   ```bash
   cd product-service
   mvn spring-boot:run
   
3. Запустить `Gateway-service`:
   ```bash
   cd gateway-service
   mvn spring-boot:run
   
### 🛠 Примеры запросов
После запуска сервисов доступны следующие эндпоинты через шлюз:
* Получение продукта по ID:
   ```bash
  GET http://localhost:8080/product/1
  
* Получение списка всех продуктов:
   ```bash
   GET http://localhost:8080/product/all

### 🧩 Используемые технологии
* Spring Boot
* Spring Cloud (Eureka, Gateway)
* Java 17
* Maven
* Lombok
* Spring Web
* Spring DevTools

### 📚 Возможности для расширения
* Добавление Order-service и User-service
* Интеграция с базой данных (например, PostgreSQL)
* Добавление логирования, мониторинга (Prometheus + Grafana)
* Docker-контейнеризация и docker-compose для запуска всего стека

### 👨‍💻 Автор
NikitaSipeikin@gmail.com