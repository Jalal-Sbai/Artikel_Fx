# Artikelverwaltung (JavaFX)

## 📌 Projektbeschreibung

Desktop-Anwendung zur Verwaltung von Artikeln, entwickelt mit JavaFX und FXML.
Die Anwendung ermöglicht das Anzeigen und dynamische Hinzufügen von Artikeln über eine grafische Benutzeroberfläche.

Dieses Projekt demonstriert grundlegende Konzepte der GUI-Entwicklung mit Java, MVC-Architektur sowie den Umgang mit ObservableLists und Event-Handling.

---

## 🛠 Technologien

* Java 21
* JavaFX
* Maven
* FXML
* Git & GitHub

---

## ✨ Funktionen

* Anzeige von Artikeln in einer TableView
* Dynamisches Hinzufügen neuer Artikel
* Eingabevalidierung (leere Felder, Zahlenprüfung)
* Automatische Aktualisierung der Tabelle
* Saubere Trennung von UI und Logik (FXML + Controller)

---

## 🏗 Architektur

Das Projekt folgt einer vereinfachten MVC-Struktur:

* **Model** → Klasse `Artikel`
* **View** → `artikel-view.fxml`
* **Controller** → `ArtikelController.java`
* **Application Entry Point** → `ArtikelApplication.java`

---

## ▶ Anwendung starten

JAVA_HOME setzen:

Windows:
export JAVA_HOME="C:/Program Files/Java/jdk-21"

Anwendung starten:

./mvnw clean javafx:run

---

## 🧪 Manuelle Tests

1. Anwendung starten
2. Artikelbezeichnung, Preis und Menge eingeben
3. Button „Hinzufügen“ klicken
4. Neuer Artikel erscheint sofort in der Tabelle

---
## 📷 Screenshots

## ✨ Entwicklungsschritte der Anwendung

### 1️⃣ Ausgangspunkt – Standard „Hello Application“

Die automatisch generierte JavaFX-Startanwendung nach Projekterstellung.  
Dieses Template diente als Ausgangsbasis für die Weiterentwicklung.

![Hello Application] <img width="476" height="452" alt="Artikel_Fx3" src="https://github.com/user-attachments/assets/b23e0533-b54b-433b-84b2-2bdb3b0f12f2" />
---

### 2️⃣ Erste Erweiterung – TableView zur Anzeige von Artikeln
<img width="821" height="570" alt="Artikel_Fx" src="https://github.com/user-attachments/assets/7646ba1e-4099-43fa-87c0-0c9f643d848e" />

Integration einer TableView zur strukturierten Darstellung von Artikeldaten.

![TableView integriert]

---

### 3️⃣ Implementierung des Eingabeformulars
<img width="718" height="550" alt="Artikel_Fx1" src="https://github.com/user-attachments/assets/1614e545-1cbe-489b-bb83-3f55565292a0" />

Erweiterung der Benutzeroberfläche um ein Formular mit Textfeldern für:
- Bezeichnung
- Preis
- Menge
---
### 4️⃣ Fertige Funktion – Artikel erfolgreich hinzugefügt
<img width="732" height="545" alt="Artikel_Fx2" src="https://github.com/user-attachments/assets/8d78b10b-7e4e-4939-a910-9757c78ca7bc" />
Nach Klick auf „Hinzufügen“ wird der neue Artikel dynamisch zur TableView hinzugefügt.  
Die Aktualisierung erfolgt automatisch über eine ObservableList.

![Artikel hinzugefügt] 
---
## 🚀 Weiterentwicklung (geplant)

* Persistenz (z. B. Speicherung in Datenbank oder Datei)
* Editieren und Löschen von Artikeln
* Unit-Tests
* Verbesserte Validierung
* Styling mit CSS

---

## 👨‍💻 Autor

Jalal Sbai

GitHub: https://github.com/Jalal-Sbai
