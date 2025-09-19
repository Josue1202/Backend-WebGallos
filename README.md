# 🐓 Backend-WebGallos

[![Build](https://github.com/Josue1202/Backend-WebGallos/actions/workflows/ci.yml/badge.svg)](https://github.com/Josue1202/Backend-WebGallos/actions)
[![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)]()
[![Spring Boot](https://img.shields.io/badge/SpringBoot-3-brightgreen?style=for-the-badge&logo=springboot)]()
[![MySQL](https://img.shields.io/badge/MySQL-8-blue?style=for-the-badge&logo=mysql)]()
[![Docker](https://img.shields.io/badge/Docker-ready-informational?style=for-the-badge&logo=docker)]()
[![JUnit](https://img.shields.io/badge/JUnit-5-important?style=for-the-badge&logo=java)]()

API REST para la **gestión de gallos de pelea**: registro de animales, propietarios, torneos, combates e historial.  
Construido con **Java 17 + Spring Boot 3**, **MySQL**, y preparado para despliegue con **Docker Compose**.  

---

## 📌 Características principales
- ✅ CRUD completo para entidades (`Animal`, `Propietario`, `Torneo`, `Combate`, etc.)  
- ✅ **Paginación y filtros** en endpoints de consulta.  
- ✅ Documentación con **Swagger/OpenAPI** en `/swagger-ui`.  
- ✅ **Pruebas unitarias** con JUnit + Mockito.  
- ✅ Configuración lista para **CI/CD con GitHub Actions**.  
- ✅ Ejecución en local con **Docker Compose (MySQL + Backend)**.  

---

## 🛠️ Tecnologías usadas
- **Backend**: Java 17, Spring Boot 3.x, JPA/Hibernate, Lombok  
- **Base de datos**: MySQL 8  
- **Testing**: JUnit 5, Mockito, Testcontainers  
- **DevOps**: Maven, Docker, GitHub Actions  

---

## ⚡ Arquitectura

```mermaid
flowchart LR
UI[Angular Frontend] --> API[Spring Boot API]
API --> DB[(MySQL Database)]
