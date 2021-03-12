<img src="https://aprogrammerlife.com/images/pictuers/when_you_become_a_living_golden_ratio.jpg" style="float:right" alt="sientate bien" width="200" >

# Xibonacci

De vegades els programadors seuen en una mala posició després d'una intensa sessió de treball. En aquesta ocasió us presentem una activitat per calcular la posició perfecta per trencar-se l'esquena, una bona forma seria amb fibonacci pero tambe volem ser capassos de tumbar-nos malament en un sofa o inclus al llit, per aixo calcularem fibonacci, tribonacci, tetranacii, etc. Podrem calcular cualsevol secuencia nacci o tambe "Xibonacci", el farem a partir de la següent forma:
- Primer indicarem la serie inicial, la serie son **n** nombres de fibonacci.
- A continuació s'indica el nombre de valors que espera el resultat.

Després d'haber enregistrat la serie incial i el nombre de valors per el resultat, calcularem el resultat i el donarem com a sortida en un format array o arraylist (entre claudators, i separats per comes).

## Entrada

L’entrada comença amb un número indicant la quantitat de casos de prova que vindran a continuació.
Cada cas de prova comença amb una serie inicial (**x** nombres de fibonacci, sempre començant per "0"), per exemple "*0, 1*" indica Fibonacci, "*0, 1, 1*" inidica Tribonacci, etc. La segona entrada sera **v**, nombre de valors que tindra el resultat començant per "0", exemple (*"serie = 0, 1"  "v = 5"*) equival a "[0, 1, 1, 2, 3]".

## Sortida

Com a sortida, per a cada cas de prova, s’escriurà, en una sola línia i entre claudators "[]":
- Els **v** nombres resultants separats per ", " com un array o llista
 
##  Exemple

Entrada | Sortida
--------------|--------------
4<br>0, 1<br>5<br>0, 1<br>8<br>0, 1, 1<br>6<br>0, 1, 1<br>6 | [0, 1, 1, 2, 3]<br>[0, 1, 1, 2, 3, 5, 8, 13]<br>[0, 1, 1, 2, 4, 7]<br>[0, 1, 1, 2, 4, 7, 13, 24, 44]<br><br>
