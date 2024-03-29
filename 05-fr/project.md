# System aukcyjny

## Wprowadzenie

Specyfikacja wymagań funkcjonalnych w ramach informatyzacji procesu sprzedaży produktów w oparciu o mechanizm aukcyjny. 

## Procesy biznesowe

---
<a id="bc1"></a>
### BC1: Sprzedaż aukcyjna 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Opis:** Proces biznesowy opisujący sprzedaż za pomocą mechanizmu aukcyjnego. |

**Scenariusz główny:**
1. [Sprzedający](#ac1) wystawia produkt na aukcję. ([UC1](#uc1))
2. [Kupujący](#ac2) oferuje kwotę za produkt wyższą od aktualnie najwyższej oferty. ([BR1](#br1)) ([UC2](#uc2))
3. [Kupujący](#ac2) wygrywa aukcję ([BR2](#br2)) ([UC3](#uc3))
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu. ([UC5](#uc5))
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu.([UC4](#uc4))

**Scenariusze alternatywne:** 

2.A. Oferta Kupującego została przebita, a [Kupujący](#ac2) pragnie przebić aktualnie najwyższą ofertę.
* 2.A.1. Przejdź do kroku 2.

3.A. Czas aukcji upłynął i [Kupujący](#ac2) przegrał aukcję. ([BR2](#br2))
* 3.A.1. Koniec przypadku użycia.

---

## Aktorzy

<a id="ac1"></a>
### AC1: Sprzedający

Osoba oferująca towar na aukcji.

<a id="ac2"></a>
### AC2: Kupujący

Osoba chcąca zakupić produkt na aukcji.


## Przypadki użycia poziomu użytkownika

### Aktorzy i ich cele

[Sprzedający](#ac1):
* [UC1](#uc1): Wystawienie produktu na aukcję.
* [UC4](#uc4): Przekazanie produktu kupującemu.
* [UC5](#uc5): Przekazanie należności sprzedającemu. 

[Kupujący](#ac2)
* [UC2](#uc2): Zaoferowanie kwoty za produkt wyższej od aktualnie najwyższej oferty.
* [UC3](#uc3): Wygranie aukcji.
* [UC4](#uc4): Przekazanie produktu kupującemu.
* [UC5](#uc5): Przekazanie należności sprzedającemu. 


---
<a id="uc1"></a>
### UC1: Wystawienie produktu na aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) zgłasza do systemu chęć wystawienia produktu na aukcję.
2. System prosi o podanie danych produktu i ceny wywoławczej.
3. [Sprzedający](#ac1) podaje dane produktu oraz cenę wywoławczą.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym wystawieniu produktu na aukcję.

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc2"></a>
### UC2: Zaoferowanie kwoty za produkt wyższej od aktualnie najwyższej oferty.

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) zgłasza do systemu chęć zakupu produktu na akcji.
2. System prosi o podanie kwoty oraz danych [Kupującego](#ac2).
3. [Kupujący](#ac2) podaje swoje dane i kwotę.
4. System weryfikuje poprawność podanych przez [Kupującego](#ac2) danych.
5. System informuje o pomyślnym przyjęciu oferty.

**Scenariusze alternatywne:** 

3.A. Podano niepoprawne dane.
* 3.A.1. Sprawdź czy dane zgadzają się z [BR1](#br1).
* 3.A.2 Przejdź do kroku 2.

---

<a id="uc3"></a>
### UC3: Wygranie aukcji

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. System przekazuje informację do [Kupującego](#ac2) o wygraniu aukcji. [BR2](#br2)
2. [Kupujący](#ac2) potwierdza otrzymanie wiadomości.
3. System przekazuje dane potrzebne do transakcji.

---

<a id="uc4"></a>
### UC4: Przekazanie produktu kupującemu.

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. System dostarcza informację [Sprzedającemu](#ac1) o dokonaniu wpłaty przez [Kupującego](#ac2).
2. System przekazuje dane [Kupującego](#ac2) [Sprzedającemu](#ac1).
3. [Sprzedający](#ac1) wysyła produkt [Kupującemu](#ac2).
4. System informuje [Kupującego](#ac2) o wysłaniu produktu.
5. [Kupujący](#ac2) potwierdza otrzymanie produktu. 

**Scenariusze alternatywne:**

4.A. Produkt nie został wysłany.
* 4.A.1. System informuje [Kupującego](#ac2) o nie wysłaniu produktu.
* 4.A.2. System prosi [Sprzedającego](#ac1) o wysłaniu produktu.
* 4.A.3. Przejdź do kroku 3.

5.A Produkt nie dotarł do [Kupującego](#ac2).
* 5.A.1 System kontaktuje się z firmą przewozową.
* 5.A.2 Przejdź do kroku 4.

---

<a id="uc5"></a>
### UC5: Przekazanie należności sprzedającemu.

**Aktorzy:** [Kupujący](#ac2),[Sprzedający](#ac1)

**Scenariusz główny:**
1. [Kupujący](#ac2) zgłasza do systemu chęć dokonania wpłaty.
2. System prosi o dokonanie wpłaty na podany przez [Sprzedający](#ac1) numer konta bankowego.
3. [Kupujący](#ac2) dokonuje wpłaty.
4  System weryfikuje kwotę wpłaty.
5. System podaje [Kupującemu](#ac2) dane [Sprzedającego](#ac1).
6. System zatwierdza transakcję.

**Scenariusze alternatywne:** 

4.A. [Kupujący](#ac2) wpłaca niepoprawną kwotę.
* 4.A.1. System informuje o niepowodzeniu transakcji.
* 4.A.2. Przejdź do kroku 2.

---
## Obiewkty biznesowe (inaczje obiekty dziedzinowe lub informatycjne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. 

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.


<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujący](#ac2)ch, który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

## Macierz CRUDL


| Przypadek użycia                                                          | Aukcja | Produkt | 
| ------------------------------------------------------------------------- | ------ | ------- |
| UC1: Wystawienia produktu na aukcję                                       |    C   |    C    |
| UC2: Zaoferowanie kwoty za produkt wyższej od aktualnie najwyższej oferty.|    R,U |         |
| UC3: Wygranie aukcji.                                                     |  R, D  |  R,U    |
| UC4: Przekazanie produktu kupującemu.                                     |        |  D      |
| UC5: Przekazanie należności sprzedającemu.                                |  U     |   R     |    


