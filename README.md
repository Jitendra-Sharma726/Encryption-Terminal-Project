# Encryption-Terminal-Project

# Encryption Terminal Project

## Overview

The Encryption Terminal is a Spring Boot REST API application that provides secure message transformation using the Caesar Cipher algorithm. The system allows users to encrypt plain text into coded messages and decrypt coded messages back into their original form.

The application follows a layered architecture consisting of Controller, Service, and Model layers, ensuring clear separation of responsibilities and maintainable code structure.

## Features

### 1. Message Encryption

* Accepts plain text as input.
* Encrypts alphabetic characters using a Caesar Cipher with a fixed shift value of 5.
* Preserves uppercase and lowercase letters.
* Leaves numbers, spaces, and special characters unchanged.

### 2. Message Decryption

* Accepts encrypted text as input.
* Reverses the Caesar Cipher transformation.
* Restores the original message accurately.
* Preserves non-alphabetic characters.

## Architecture

### Model Layer

**EncryptionResponse.java**

* Represents the API response structure.
* Stores:

  * Original Text
  * Transformed Text
  * Operation Type (encryption/decryption)

### Service Layer

**EncryptionService.java**

* Contains the business logic for encryption and decryption.
* Implements Caesar Cipher character shifting.
* Handles uppercase letters, lowercase letters, and non-alphabetic characters.

### Controller Layer

**EncryptionController.java**

* Exposes REST API endpoints.
* Receives user requests.
* Invokes service methods.
* Returns structured JSON responses.

## API Endpoints

### Encrypt Message

**GET** `/api/encrypt?message=Hello`

**Response**

```json
{
  "originalText": "Hello",
  "transformedText": "Mjqqt",
  "operation": "encryption"
}
```

### Decrypt Message

**GET** `/api/decrypt?message=Mjqqt`

**Response**

```json
{
  "originalText": "Mjqqt",
  "transformedText": "Hello",
  "operation": "decryption"
}
```

## Caesar Cipher Logic

### Encryption

Each alphabetic character is shifted forward by 5 positions.

Example:

* A → F
* B → G
* X → C
* Y → D
* Z → E

### Decryption

Each alphabetic character is shifted backward by 5 positions to recover the original message.

### Wrap-Around Support

The implementation uses modulo arithmetic to ensure characters wrap correctly from Z back to A and from z back to a.

## Technologies Used

* Java
* Spring Boot
* REST API
* Maven
* JSON

## Expected Outcome

The Encryption Terminal provides a simple and reliable way to encode and decode messages using the Caesar Cipher algorithm while demonstrating key Spring Boot concepts such as REST controllers, dependency injection, service layers, and data transfer objects.
