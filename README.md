# Softwaretechnik-Refactoring
Einsendeaufgabe Refactoring für das Modul Softwaretechnik WINFO

## Aufgabe 3
Am meisten interessieren und beeindrucken mich Techniken, wenn diese direkt angewendet werden können ohne auf den Content zu achten, um die Code Komplexität und Lesbarkeit mit einfachen Mitteln zu vereinfachen.

Wie zum Beispiel mit [Decompose Conditional](https://www.refactoring.com/catalog/decomposeConditional.html).
Durch einfaches Extrahieren der Bedingung in eine klar beschriebene Methode erhöht die Wartung des Codes enorm.

Jede Refactoring Technik hat irgendwo seine Berechtigung, am Überflüssigsten für mich ist aber [Replace Magic Literal](https://www.refactoring.com/catalog/replaceMagicLiteral.html). Es erscheint mir nicht sinnvoll, für jede Zahl eine globale Variable zu erstellen, es sei denn sie wird mehrmals im Code verwendet. Zusätzlich wird dann beim Codelesen notwendig, erst bei der Variable zu schauen, was für eine Zahl sich dahinter versteckt.

Am wenigstens verstanden habe ich die Techniken, bei denen es eine inverse Regel gibt
wie zum Beispiel [Hide Delegate](https://www.refactoring.com/catalog/hideDelegate.html) -  [Remove Middle Man](https://www.refactoring.com/catalog/removeMiddleMan.html) oder [Replace Function with Command](https://www.refactoring.com/catalog/replaceFunctionWithCommand.html) - [Replace Command with Function](https://www.refactoring.com/catalog/replaceCommandWithFunction.html) verstanden. Es ist nicht ganz klar, wann man welche Regel anwenden sollte.


## Aufgabe 4
Die Klasse MainVorher enthält in der Methode buildUiExample() den Code vor dem Refactoring.
```
MainVorher#buildUiExample()
```

Die Klasse MainNachher enthält zwei Möglichkeiten wie der Code nach Refactoring aussehen kann.
```
MainNachher#buildUiExampleAfterRefactoring1 
MainNachher#buildUiExampleAfterRefactoring2
```
Ziel des Refactorings ist es dem Code eine bessere Lesbarkeit mit sinnvollen Variablen Namen und das Entfernen von Codeduplikationen zu geben und die Wartung des Codes zu erhöhen. 

Für die zweite Version des Refactorings wurde eine extra Helperklasse UIFactory erstellt.
Dadurch können auch in Zukunft weitere Klassen auf bereits existierende Implementierung der Komponenten zugreifen. Falls Bugs in diesen Komponenten auftreten sollten, gibt es EINE zentrale Stelle, wo die Fixes eingespielt werden müssen.
