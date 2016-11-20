## Belajar Spring Framework

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