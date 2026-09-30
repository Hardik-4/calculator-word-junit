# Calculator & Word (JUnit)

Small Java classes with unit tests — useful as a clean example of testable design.

## Classes

- `Calculator` — add, subtract, multiply, divide, modulo, power (with zero-division guards)
- `Word` — char-array word with contains, length, reverse, and defensive copies

## Run tests (JUnit 5)

If you have JUnit 5 on the classpath:

```bash
javac -cp "lib/*" -d out $(find src -name "*.java")
java -jar lib/junit-platform-console-standalone-1.10.2.jar --class-path out --scan-class-path
```

Or open the `src/griffith` tests in Eclipse / IntelliJ with JUnit 5 support.

## Author

Hardik Rathee (Hardik-4)
