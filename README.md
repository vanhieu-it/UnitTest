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