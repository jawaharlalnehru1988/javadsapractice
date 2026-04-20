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

---

### 🔥 Pro Tip:
When asked about Lambdas, always mention the **invokedynamic** instruction and how it helps avoid the overhead of creating extra objects compared to inner classes. This shows deep JVM knowledge!
