# Unlocking Potential with SpringBOOT-Powered Electronic Store API: A Comprehensive Overview

In the bustling world of e-commerce, having a reliable backend infrastructure is paramount to delivering seamless user experiences and efficient resource management. Enter the Electronic Store API, a meticulously crafted solution empowered by Spring Boot 3.2.2. This article aims to provide an in-depth exploration of the Electronic Store API, highlighting its core functionalities, supported technologies, and the value it brings to developers and users alike.

## Understanding the Electronic Store API

At its heart, the Electronic Store API serves as the cornerstone of e-commerce applications, offering a suite of REST APIs meticulously engineered to handle diverse aspects of product management, user authentication, cart operations, order management, and more. Developed with a keen focus on scalability, performance, and security, the Electronic Store API empowers developers to build robust, feature-rich e-commerce platforms that meet the demands of modern online retail.

## Exploring the Technology Stack

The Electronic Store API harnesses a potent technology stack to deliver exceptional performance and scalability:

- **Spring Boot 3.2.2:** Embraces a lightweight and opinionated framework for building powerful Java applications, streamlining development and deployment processes.
- **Spring Data JPA:** Simplifies the implementation of the data access layer by providing repositories and query methods for seamless interaction with databases.
- **Spring Security:** Ensures robust authentication and authorization mechanisms, safeguarding sensitive user data and API endpoints from unauthorized access.
- **Spring MVC:** Facilitates the development of RESTful APIs by providing essential components for handling HTTP requests and responses in a clear, concise manner.
- **Lombok:** Streamlines Java code development by automating repetitive tasks such as generating getters, setters, and constructors, reducing boilerplate code and enhancing code readability.
- **Dependency Injection:** Embraces the principle of Inversion of Control (IoC), allowing dependencies to be injected into components rather than explicitly instantiated, promoting modularity and testability.
- **Autowired Annotation:** Facilitates the automatic wiring of dependencies within Spring-managed components, reducing manual configuration and enhancing code maintainability.
- **Docker:** Enables containerization of the Electronic Store API, providing a lightweight and portable solution for packaging applications and their dependencies, ensuring consistency across different environments.
- **AWS Services:** Seamlessly integrates with Amazon Web Services to leverage cloud-based infrastructure, enhancing scalability, reliability, and performance while minimizing operational overhead.
- **Postman:** Empowers developers to test and debug API endpoints effectively by providing a user-friendly interface for sending HTTP requests, inspecting responses, and automating workflows, ensuring the robustness and reliability of the Electronic Store API.
- **JWT AUTHNETICATION:**JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA. 

## Key Features and Functionalities

The Electronic Store API boasts an array of features designed to support various e-commerce operations:

- **Product Management:** Offers comprehensive CRUD operations for managing products, including retrieval, creation, update, and deletion, facilitating seamless product lifecycle management.
- **User Authentication:** Implements secure authentication mechanisms, including user login and Google OAuth login, fortified with JWT tokens to ensure secure access to API resources.
- **Cart Operations:** Facilitates the management of user carts, allowing for retrieval, creation, and deletion of carts, along with operations for managing cart items, enhancing the shopping experience for users.
- **Order Management:** Provides robust functionalities for managing orders, including creation, update, retrieval, and removal of orders, as well as retrieval of ordered items, streamlining the order fulfillment process.
- **Category Management:** Supports efficient organization of products into categories, offering CRUD operations for categories and operations for managing category-product relationships, enhancing product discoverability and navigation.


## REST APIs

### Product Controller

- `GET /products/{productId}`: Get Product by ID
- `PUT /products/{productId}`: Update Product Details
- `DELETE /products/{productId}`: Delete Product
- `GET /products`: Get All Products
- `POST /products`: Create Product
- `GET /products/image/{productId}`: Get Product Image
- `POST /products/image/{productId}`: Upload or Update Product Image
- `GET /products/search/{Query}`: Search Products
- `GET /products/live`: Get Live Products

### Cart Controller

- `GET /carts/{userId}`: Retrieve User's Cart
- `POST /carts/{userId}`: Create User's Cart
- `DELETE /carts/{userId}`: Delete User's Cart
- `DELETE /carts/{userId}/item/{itemId}`: Remove Item from User's Cart

### Category Controller

- `GET /categories/{categoryId}`: Get Category by Category ID
- `PUT /categories/{categoryId}`: Update Category
- `DELETE /categories/{categoryId}`: Delete Category
- `PUT /categories/{categoryId}/products/{productId}`: Update Category of Product
- `GET /categories/{categoryId}/products`: Get Products by Category ID
- `POST /categories/{categoryId}/products`: Create Product with Category
- `GET /categories/image/{categoryId}`: Get Category Image
- `POST /categories/image/{categoryId}`: Upload Category Image
- `GET /categories`: Get All Categories
- `GET /categories/search/{Keyword}`: Get Category by Search

### Authentication Controller

- `POST /auth/login`: User Login
- `POST /auth/google`: Google OAuth Login
- `GET /auth/current`: Fetch Current User

### Order Controller

- `PUT /orders/{orderId}`: Update Order Status
- `DELETE /orders/{orderId}`: Remove Order Status
- `GET /orders`: Get All Orders
- `POST /orders`: Create Order
- `GET /orders/users/{userId}`: Get Ordered items

### User Controller

- `GET /users/{userId}`: Get User by User ID
- `PUT /users/{userId}`: Update User Details
- `DELETE /users/{userId}`: Delete User
- `GET /users`: Get All Users
- `POST /users`: Create User
- `GET /users/image/{userId}`: Get User's Profile Image
- `POST /users/image/{userId}`: Upload or Update User's Profile Image
- `GET /users/search/{keyword}`: Search Users
- `GET /users/email/{email}`: Get User by Email

## Schemas

- RoleDto
- UserDto
- CategoryDto
- ProductDto
- OrderUpdateRequest
- OrderDto
- OrderItemDto
- ImageResponse
- CreateOrderRequest
- AddItemToCartRequest
- Cart
- CartDto
- CartItem
- Category
- GrantedAuthority
- Order
- OrderItem
- Product
- Role
- User
- JwtRequest
- JwtResponse
- PageableResponseUserDto
- PageableResponseProductDto
- PageableResponseOrderDto
- PageableResponseCategoryDto
- ApiResponseMessage

## Advanced Java Concepts Utilized

- Lambda Expressions
- Optional
- Collectors
- List
- Map

## Docker Configuration

- Docker Image Pushed
- Containers Utilized
- Docker Network for MySQL Database and Spring Boot Application Communication

## AWS Deployment


## Conclusion

In conclusion, the Electronic Store API represents a powerful and versatile solution for driving e-commerce innovation. By harnessing the capabilities of Spring Boot, Spring Data JPA, Spring Security, and other cutting-edge technologies, the API offers unmatched performance, scalability, and security, empowering developers to build next-generation e-commerce platforms with confidence. Whether you're launching a startup or scaling a thriving online business, the Electronic Store API stands ready to unlock new potentials and drive success in the ever-evolving digital commerce landscape.

-For any Queries Regarding the Project Contact: aasimahsan77@gmail.com
