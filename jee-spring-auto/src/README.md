![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


## Zadanie 5

1. Utwórz projekt Maven:
 - groupId - **pl.coderslab**
 - artifactId - **jee-spring-auto**.
2. Dodaj klasę konfiguracji java.
3. W klasie konfiguracji określ automatyczne skanowanie dla pakietu `pl.coderslab.beans`.
4. Utwórz dwie klasy `PersonService` oraz `PersonRepository` oznacz je adnotacją `@Component`.
5. W klasie `PersonService` wstrzyknij obiekt klasy `PersonRepository` o nazwie `personRepo`.
6. W metodzie main klasy `SpringDiApplication` utwórz obiekt kontekstu na podstawie konfiguracji.
7. Wywołaj poniższy kod:
````java
PersonService person = context.getBean(PersonService.class);
System.out.println(person.getPersonRepo().getClass().getName());
````
