# 🍕 Pizza Inventory System

**Sistema de gestión de inventario para pizzas.**

Este proyecto es una aplicación backend desarrollada en Java con Spring Boot para gestionar productos relacionados con pizzas, como ingredientes, tipos de pizzas, y más. Incluye funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar) y estadísticas, como el conteo total de productos y el stock disponible. La API está documentada utilizando **Swagger** para facilitar su prueba e integración.

---

## 📋 Características principales

- Gestión de productos (CRUD).
- Contador de productos totales.
- Suma de stock total disponible.
- Base de datos MySQL para almacenamiento persistente.
- Documentación interactiva con Swagger UI.
- Arquitectura profesional con controladores, servicios y repositorios.

---

## 🚀 Tecnologías utilizadas

- **Backend**: 
  - Java 17
  - Spring Boot (Data JPA, Web)
  - HikariCP (Conexión con MySQL)
- **Base de datos**: 
  - MySQL
- **Documentación API**: 
  - Swagger OpenAPI
- **Herramientas**:
  - Gradle (gestión de dependencias)

---

## 💻 Requisitos previos

Asegúrate de tener instalados los siguientes programas en tu máquina:

- **Java**: Version 17 o superior.
- **MySQL**: Configurado y en ejecución.
- **Node.js**: Si deseas trabajar con el frontend.
- **Git**: Para clonar el repositorio.
## 🔍 Arquitectura del Sistema

El siguiente diagrama muestra cómo interactúan los componentes principales del sistema:

![Arquitectura del Sistema](docs/architecture-diagram.drawio.png) 

## ⚙️ Configuración del proyecto

Sigue estos pasos para configurar y ejecutar el proyecto en tu entorno local.

### **1. Clonar el repositorio**
Clona este repositorio en tu máquina local:
```bash
git clone https://github.com/matiassorrentino/pizza-inventory-system.git
cd pizza-inventory-system
