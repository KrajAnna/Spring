![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


## Zadanie 1 - rozwiązywane z wykładowcą

1. Otwórz IDE i utwórz projekt Maven:
    - groupId - **pl.coderslab**
    - artifactId - **jee-spring-mvc**.
2. Uzupełnij podstawowy zestaw zależności dla korzystania z MVC Springa.
3. Skorzystaj z zależności opisanych w prezentacji.  


## Zadanie 2 - rozwiązywane z wykładowcą

1. Dodaj klasę konfiguracji.
2. Utwórz inicjalizator aplikacji.
3. Utwórz kontroler o nazwie `HelloController`.
4. Utwórz akcję o nazwie `helloWorld`, oraz przypisz jej adres `hello`.
5. Dodaj adnotację @ResponseBody i zwróć napis **Hello World**.
6. Skonfiguruj kontener servletów Tomcat w IntelliJ.
7. Uruchom aplikację i sprawdź w przeglądarce utworzoną akcję. 

### Pamiętaj, że

Spring MVC 5 nie działa na Tomcat 10 z powodu zmiany nazwy pakietu z javax.* na jakarta.*.


## Zadanie 3

1. Utwórz kontroler o nazwie `RandomController`.
2. Utwórz akcję kontrolera o nazwie `showRandom` dostępną pod adresem `/show-random`,
 która wylosuje liczbę z zakresu od 1 do 100. 
3. Wyświetli w przeglądarce napis: **Wylosowano liczbę: wylosowana_liczba**.


## Zadanie 4

1. Utwórz kontroler o nazwie `FreeTimeController`.
2. Pobierz aktualną datę.
3. Sprawdź aktualny dzień tygodnia oraz aktualną godzinę.
4. Jeśli dzień przypada na sobotę lub niedzielę, zwróć tekst `Wolne`.
5. Jeśli dzień przypada na dzień roboczy, a godzina od 9 do 17, zwróć tekst `Pracuje, nie dzwoń.`.
6. Jeśli dzień przypada na dzień roboczy, a godzina poza zakresem 9-17 zwróć tekst `Po Pracy`.
7. Aby przetestować działanie aplikacji, możesz zamiast aktualnej daty, pobrać wybraną przez siebie datę i godzinę.


# Przekazywanie parametrów

## Zadanie 1 - rozwiązywane z wykładowcą

1. Utwórz akcję dostępną pod pod adresem `/random/{max}` gdzie `max` będzie górną granicą zbioru z którego zostanie wylosowana liczba.
2. Wylosuj wartość od 1 do `max`.
3. Wyświetl w przeglądarce dane w następujący sposób: **Użytkownik podał wartość `max`. Wylosowano liczbę: wylosowana liczba**.



## Zadanie 2 - rozwiązywane z wykładowcą

1. Zmodyfikuj poprzednią akcję tak, aby przyjmowała dodatkowo wartość minimalną `min`.
2. Wylosuj wartość od `min` do `max`.
3. Wyświetl w przeglądarce dane w następujący sposób: **Użytkownik podał wartości** `min` i `max`.
   **Wylosowano liczbę:** `wylosowana liczba`.


## Zadanie 3

1. Utwórz akcję dostępną pod adresem `/hello/{firstName}/{lastName}` gdzie `firstName` oraz `lastName` będą pobranymi parametrami.
3. Wyświetl w przeglądarce dane w następujący sposób: **Witaj** `firstName lastName`.



## Zadanie 4

Stwórz dwie akcje:
1. Pierwsza akcja ma być przypisana do adresu `/form` i metody `GET`.
2. Utwórz w katalogu **webapp** plik `form.jsp` a w nim formularz z polami tekstowymi o nazwach:
- `paramName`
- `paramDate`  
  Pierwsza akcja ma wyświetlać ten formularz, w tym celu skorzystaj z poniższego kodu:

```java
@GetMapping("/form")
public String hello() {
    return "/form.jsp";
}
```

2. Druga akcja ma być przypisana do adresu `/form` i metody `POST`.
3. Określając adresy wykorzystaj adnotacje `@GetMapping` oraz `@PostMapping`.
4. W metodzie obsługiwanej metodą POST odbierz, a następnie wyświetl parametr `paramName`.
5. W metodzie obsługiwanej metodą POST odbierz, przekształć do typu **LocalDate**,
   a następnie wyświetl parametr `paramDate`.
6. Data ma być podawana i wyświetlana w formacie `yyyy-MM-dd`


## Zadanie 5

1. Dodaj do całego kontrolera przedrostek `/first`.
2. Sprawdź, jak zmieniły się adresy akcji z poprzedniego zadania, wywołaj adresy w przeglądarce.