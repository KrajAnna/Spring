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
