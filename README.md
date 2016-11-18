## Belajar Spring Framework

[Github](https://github.com/paralun "Github")

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