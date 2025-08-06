## 📦 Sistema de Gestión de Órdenes de Compra

Este proyecto es una aplicación desarrollada en **Java con Spring Boot** que permite la gestión de órdenes de compra dentro de una organización. Utiliza **MySQL** como sistema de base de datos y está diseñado para registrar, consultar y administrar pedidos entre almacenes, proveedores y diferentes métodos de pago.

### 🧩 Funcionalidades Principales

- Registrar órdenes de compra con:
  - Fecha de orden
  - Fecha solicitada
  - Estado
  - Tipo de orden
- Gestión de almacenes, proveedores y formas de pago
- Relaciones entre órdenes y entidades externas (almacén, proveedor, tipo de orden, forma de pago)
- Arquitectura basada en Spring Boot con Spring Data JPA

### 🛠️ Tecnologías Utilizadas

- Java 17
- Spring Boot 3.5.x
- Spring Data JPA
- Hibernate
- MySQL 8
- HikariCP (gestión de conexiones)
- Maven
- IDE: Visual Studio Code (con Pleiades para soporte en japonés)

### 📊 Modelo de Base de Datos

El modelo de datos incluye las siguientes entidades:

- **almacenes**: almacenes disponibles para realizar pedidos
- **formapago**: formas de pago aceptadas
- **proveedores**: información de los proveedores
- **tipoorden**: clasificación del tipo de orden
- **ordenes**: entidad principal que registra cada pedido

### 🚀 Desarrollo

Este proyecto fue desarrollado usando buenas prácticas de programación orientada a objetos, arquitectura en capas (Controller, Service, Repository) y utilizando herramientas modernas del ecosistema Spring.

---

> 📍 Este repositorio forma parte de una práctica académica / proyecto empresarial enfocado en la digitalización del flujo de compras.
