Sử dụng Maven: 
Thêm đoạn sau vào file pom.xml:
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.8.1</version>
    <scope>test</scope>
</dependency>
```
Sử dụng Gradle:
Thêm đoạn sau vào file build.gradle:
```groovy
testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
```

### Các Annotation Thông Dụng

- @Test: Đánh dấu phương thức là một test case.
- @BeforeEach: Chạy trước mỗi test, dùng để khởi tạo dữ liệu.
- @AfterEach: Chạy sau mỗi test, dùng để dọn dẹp dữ liệu.
- @BeforeAll: Chạy trước tất cả các test, thường dùng để khởi tạo tài nguyên dùng chung.
- @AfterAll: Chạy sau tất cả các test, thường dùng để giải phóng tài nguyên dùng chung.

### Sử dụng Mock Object với Mockito
Maven
```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>3.12.4</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-params</artifactId>
    <version>5.8.1</version>
    <scope>test</scope>
</dependency>
```
Gradle
```groovy
testImplementation 'org.mockito:mockito-core:3.12.4'
testImplementation 'org.junit.jupiter:junit-jupiter-params:5.8.1'
```