## Belajar Spring Framework

[1. Hello Spring](https://github.com/paralun/belajar-spring-framework/tree/master/hello-spring)

[2. Spring Dependency Injection](https://github.com/paralun/belajar-spring-framework/tree/master/dependency-injection)

[3. Spring Inner Bean](https://github.com/paralun/belajar-spring-framework/tree/master/inner-bean)

[4. Spring Bean Scope](https://github.com/paralun/belajar-spring-framework/tree/master/spring-scope)

[5. Spring Collections](https://github.com/paralun/belajar-spring-framework/tree/master/spring-collections)

[6. Spring Inject Date](https://github.com/paralun/belajar-spring-framework/tree/master/inject-date)

[7. Spring PropertyPlaceholderConfigurer](https://github.com/paralun/belajar-spring-framework/tree/master/property-placeholder-configurer)

**Sample Code**
```java
@Component
@ComponentScan
public class Application {
    
    @Bean
    MessageService messageService() {    
        return () -> "Hello, World";
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter mp = context.getBean(MessagePrinter.class);
        mp.printMessage();
    }
    
}
```

**5 types of bean scopes supported :**

* singleton – Return a single bean instance per Spring IoC container
* prototype – Return a new bean instance each time when requested
* request – Return a single bean instance per HTTP request.
* session – Return a single bean instance per HTTP session.
* globalSession – Return a single bean instance per global HTTP session.

[Sample Scope](https://github.com/paralun/belajar-spring-framework/tree/master/spring-scope "Github")