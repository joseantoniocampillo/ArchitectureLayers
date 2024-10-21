The project follows a layered architecture, which typically includes the following layers:

1. **Presentation Layer**: This layer contains the UI components and handles user interactions. In this project, it includes the `MainActivity` and UI themes defined in `Theme.kt`.

2. **Domain Layer**: This layer contains the business logic and domain models. It is responsible for executing the core functionality of the application.

3. **Data Layer**: This layer handles data management, including network requests, database operations, and data caching.

### Dependency Rules

- The **Presentation Layer** depends on the **Domain Layer** but not on the **Data Layer**.
- The **Domain Layer** is independent and does not depend on any other layers.
- The **Data Layer** depends on the **Domain Layer** but not on the **Presentation Layer**.

This separation ensures a clean architecture where each layer has a specific responsibility and can be developed, tested, and maintained independently.
