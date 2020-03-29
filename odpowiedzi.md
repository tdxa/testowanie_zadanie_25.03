#### 1. W opisanym systemie Producenci i Konsumenci są instancjami różnych klas. Czy sitnieje możliwość stworzenia klasy, która mogłaby występować w obu tych rolach? Jeżeli tak, to jakich zmian wymagałoby to rozwiązanie?

Taka możliwość zaistniałaby poprzez zawarcie obu tych ról w jednym interfejsie, bądź klasie.

#### 2. Jakie zmiany należałoby wprowadzić, aby umożliwić obsługę wielu Magazynów?

Utworzenie kolekcji z obiektami klasy Magazyn/

#### 3. Jakie powiazania istnieją pomiędzy wszystkimi obiektami w systemie? Jaki jest wpływ Prodecentów i Konsumentów na siebie nawzajem?
Pomiędzy obiektami klasy Producent i klasy Konsument nie występuje połączenie, więc nie mają na siebie wpływu. Obiekty tych klas funkcjonują niezależnie od siebie, ale w obu przypadkach obiekt jest obesrwatorem obiektu klasy Magazyn
