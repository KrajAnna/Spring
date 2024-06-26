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


# Widoki

## Zadanie 1 - rozwiązywane z wykładowcą

1. Zdefiniuj w klasie konfiguracji `ViewResolver` - skorzystaj z przykładu z prezentacji.
2. Utwórz widok o nazwie `home.jsp` ze statyczną zawartością html znajdujący się w lokalizacji określonej w konfiguracji `ViewResolver`:
    ```html
    <h1>Witaj w widoku</h1>
    ```
3. W kontrolerze `HelloController` utwórz akcję `helloView`, dostępną pod adresem `/helloView`,
   która wyświetli ten widok.



## Zadanie 2 - rozwiązywane z wykładowcą

1. W widoku  `home.jsp` dodaj tag `style`. Tag powinien zawierać selector `body`, który ustawia dwie właściwości `color` i `background-color`.
2. Wartościami tych parametrów powinny być wartości `fontColor` i `backgroundColor`, przekazane z kontrolera.
4. W akcji sprawdzaj aktualną godzinę i jeśli jest między 8:00 a 20:00 podmieniał tekst `color` i `background-color` odpowiednio na `black` i `white`.
5. Gdy godzina wypada między 20:00 a 8:00, podmień wartości właściwości odwrotnie.
6. Uruchom stronę i zobacz efekt. Tekst powinien być czarny, a strona biała.
7. Zmodyfikuj program tak, aby nie brał pod uwagę aktualnej godziny, tylko na sztywno wpisz godzinę 1:00 w nocy.
8. Wyświetl stronę i zobacz efekt. Tekst powinien być biały, a strona czarna.


## Zadanie 3

1. Utwórz kontroler o nazwie `MultiplyController`.
2. Utwórz nową akcję multiply, dostępną pod adresem `/multiply`.
3. Akcja ma pobierać jeden parametr w URL o nazwie `size`.
4. Ustaw domyślną wartość tego parametru na wartość 10.
5. Przekaż zmienną do widoku a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:


| x | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 1 | 2 | 3 |   |   |   |   |   |   |   |
| 2 |       ...                             |
| 3 |                                       |
| 4 |                                       |
| ...                                       |
| 9 | 9 |18 |27 |36 |45 |54 |63 |72 |81 |90 |
| 10|...|



## Zadanie 4

1. W kontrolerze `MultiplyController` utwórz akcję `/paramMultiply/{rows}/{cols}`,
2. Akcja ma przyjmować 2 parametry `rows` oraz `cols`.
3. Przekaż zmienne do widoku, a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:


Parametr rows = 10, cols =2.

| x | 1 | 2 |
|---|---|---|
| 1 | 1 | 2 |
| 2 | 2 | 4 |
| 3 | 3 | 6 |
| 4 | 4 | 8 |
| ...
| 9 | 9 | 18|
| 10| 10| 20



## Ciasteczka i sesje

![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


## Zadanie 1 - rozwiązywane z wykładowcą

1. Utwórz kontroler `SessionController`.
2. Sprawdź, czy w sesji jest zapisana wartość pod kluczem  `loginStart`.
3. Jeżeli jest zapisana wyświetl ją — skorzystaj z adnotacji `@ResponseBody`.
4. Jeżeli nie ma wartości - wstaw do sesji pod kluczem `loginStart` bieżącą datę i godzinę.



## Zadanie 2 - rozwiązywane z wykładowcą

1. Utwórz klasę o nazwie `Product` - klasa ma zawierać właściwości:
    - typu String o nazwie `name`.
    - typu double o nazwie `price`.
2. Utwórz klasę o nazwie `CartItem` - klasa ma zawierać właściwości:
    - typu Integer o nazwie `quantity`.
    - typu Product o nazwie `product`.
3. Utwórz klasę o nazwie `Cart` - klasa ma zawierać właściwość:
   `private List<CartItem> cartItems;`
4. Ustal dla klasy `Cart` zasięg typu sesyjnego:
```java
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)       
``` 
5. Utwórz kontroler `CartController`, wstrzyknij komponent typu `Cart`.
6. Utwórz akcję dostępną pod adresem `/addtocart` :
````java
@RequestMapping("/addtocart")
@ResponseBody
public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
}
````
Utwórz w klasach odpowiednie konstruktory - tak by kod działał poprawnie.

7. Utwórz akcję dostępną pod adresem `/cart` w której wyświetlisz wszystkie produkty z koszyka.



## Zadanie 3

1. Zmodyfikuj zadanie 2 dodając do klasy produkt pole typu `Long` o nazwie `id`.
2. Utwórz komponent `ProduktDao`, a w nim metodę `getList()` , która będzie zwracała listę produktów, które można dodać do koszyka.
3. Utwórz produkty wpisując własne dane, wstrzyknij komponent do kontrolera.
3. Zmodyfikuj metodę `/addtocart` tak by przyjmowała z `GET` parametry `id` oraz `quantity`, metoda ma pobrać z listy odpowiedni produkt i dodać określoną jego ilość do koszyka.
4. Jeżeli produkt już występuje w koszyku jego ilość ma się zwiększyć.
5. Dopisz w akcji dostępnej pod adresem `/cart` podsumowanie koszyka w postaci:
````
W koszyku jest <ilość pozycji> pozycji.
W koszyku jest <ilość produktów> produktów.
Wartość koszyka to: <wartość produktów>.
````


## Zadanie 4

1. Utwórz kontroler `CookieController`.
2. Utwórz akcję dostępną pod adresem `/setcookie/<value1>/<value2>`.
3. Akcja ma pobrać wartości parametrów `value1` oraz `value2`, a następnie ustawić
   dwa ciasteczka o nazwach `cookie1` i wartości `value1` oraz `cookie2` i wartości `value2`.
4. Dla ciasteczek ustaw wartość ścieżki jak w przykładzie: `cookie1.setPath("/");`
5. Utwórz akcję dostępną pod adresem `/getcookies`, która pobierze wartości ciasteczek.
6. Wykorzystaj 2 sposoby opisane w prezentacji - klasę `WebUtils` oraz adnotację `@CookieValue`.
7. Wyświetl pobrane dane.