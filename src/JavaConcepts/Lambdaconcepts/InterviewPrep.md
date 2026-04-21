# 🚀 Java Lambda Interview Cheat Sheet

Master these concepts to ace Java 8+ interviews.

## 1. What is a Functional Interface?
An interface that has **exactly one abstract method**.
- It can have multiple `default` or `static` methods.
- It is often annotated with `@FunctionalInterface` to prevent others from adding more abstract methods.
- **Example**: `Runnable`, `Comparator`, `Predicate`.

## 2. Lambda vs. Anonymous Inner Class
This is a very common comparison question.

| Feature | Lambda Expression | Anonymous Inner Class |
| :--- | :--- | :--- |
| **Syntax** | Very concise (`->`) | Verbose (`new Runnable() { ... }`) |
| **Scope** | Does not create a new scope (`this` refers to the outer class) | Creates a new scope (`this` refers to the inner class) |
| **Memory** | Compiled to invokedynamic (more efficient) | Creates a separate `.class` file |
| **Variables** | Can only access effectively final local variables | Can access final variables |

## 3. What is a "Method Reference"?
A shorthand for a lambda that simply calls an existing method.
- **Syntax**: `ClassName::methodName`
- **Example**: `str -> System.out.println(str)` becomes `System.out::println`.

## 4. The "Effectively Final" Rule
A local variable is "effectively final" if its value is never changed after initialization.
- **Why?** Lambdas capture the *value* of the variable at the time of creation, not the variable itself. Allowing modifications would lead to race conditions and unpredictable behavior.

## 5. Built-in Functional Interfaces (Learn these by heart!)
- `Predicate<T>`: Returns `boolean` (e.g., for filtering).
- `Consumer<T>`: Returns `void` (e.g., for printing).
- `Supplier<T>`: Takes nothing, returns `T` (e.g., for lazy loading).
- `Function<T, R>`: Transforms `T` into `R` (e.g., for mapping).

## 6. Collections Creation & Mutability
This is a common "gotcha" question.

| Feature | `Arrays.asList()` | `List.of()` (Java 9+) | `new ArrayList<>(...)` |
| :--- | :--- | :--- | :--- |
| **Mutability** | **Partial** (can `set()` items, but can't change size) | **Immutable** (completely read-only) | **Fully Mutable** (add/remove/update) |
| **Null Elements** | Allowed | **Prohibited** (throws NPE) | Allowed |
| **Version** | Since JDK 1.2 | Since JDK 9 | Since JDK 1.2 |

## 7. Exception Hierarchy
Everything that can be "thrown" in Java descends from `java.lang.Throwable`.

- **Throwable**
  - **Error**: Severe system failures (e.g., `OutOfMemoryError`). Do not catch!
  - **Exception**: Problems your code can solve.
    - **RuntimeException** (Unchecked): Coding errors (e.g., `NullPointerException`).
    - **Other Exceptions** (Checked): External factors (e.g., `IOException`).

## 8. Checked vs. Unchecked
| Property | Checked Exception | Unchecked (Runtime) Exception |
| :--- | :--- | :--- |
| **Compiler** | Forced to catch or declare | Optional to catch |
| **Example** | `FileNotFoundException`, `SQLException` | `ArithmeticException`, `NPE` |
| **Meaning** | Recoverable external issue | Program logic error |

## 9. Try-Catch-Finally Flow
- **try**: Risky code that might throw an exception.
- **catch**: Code to handle a *specific* exception.
- **finally**: Code that **always** runs, usually for cleanup (closing files/DB connections).

## 10. Top 10 Must-Know Java Exceptions
| Exception | Category | Trigger |
| :--- | :--- | :--- |
| **`NullPointerException`** | Unchecked | Accessing methods on a `null` object. |
| **`ArithmeticException`** | Unchecked | Division by zero or math errors. |
| **`ArrayIndexOutOfBoundsException`** | Unchecked | Accessing non-existent array index. |
| **`NumberFormatException`** | Unchecked | Parsing non-numeric strings as numbers. |
| **`ClassCastException`** | Unchecked | Invalid casting between types. |
| **`IllegalArgumentException`** | Unchecked | Passing incorrect arguments to a method. |
| **`IllegalStateException`** | Unchecked | Method called at an inappropriate time. |
| **`FileNotFoundException`** | Checked | Accessing a file that does not exist. |
| **`IOException`** | Checked | General input/output failures. |
| **`InterruptedException`** | Checked | A thread is interrupted while waiting/sleeping. |
| **`ConcurrentModificationException`** | Unchecked | Modifying a list while iterating over it. |
| **`IllegalStateException`** | Unchecked | Method called when object is in invalid state. |
| **`StackOverflowError`** | **Error** | Infinite recursion (Method calls itself forever). |
| **`OutOfMemoryError`** | **Error** | JVM exhausted all heap memory. |

---



### 🔥 Pro Tip:
When asked about Lambdas, always mention the **invokedynamic** instruction and how it helps avoid the overhead of creating extra objects compared to inner classes. This shows deep JVM knowledge!
