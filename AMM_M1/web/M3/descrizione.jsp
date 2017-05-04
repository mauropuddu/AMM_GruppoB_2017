<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang="it">
    
    <%@ include file="header.jsp" %>
    
    <body>
        <!-- Predispongo la nav per il collegamento con la pagina Login -->
        <div id="header">
            <nav>
                <a href="login.jsp">Login</a>
            </nav>
        </div>
       
        
        <div class="divsx">
            <ol>
                <li>
                    <a href="#presentazione">Cosa è NerdBook</a>
                </li>
                <li>
                    <a href="#funzionalita">Funzionalità</a>
                    <!-- Inserisco un nuovo elenco puntato all'interno di "Funzionalità" -->
                    <ul>
                        <li>
                            <a href="#amicizie">Differenze tra tipologie</a>
                        </li>
                        <li>
                            <a href="#bacheca">Bacheca</a>
                        </li>
                        <li>
                            <a href="#messaggi">Messaggi</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#divertimento">Tanto divertimento ti aspetta</a>
                </li>
            </ol>     
        </div>
         
        
        <div id="id_descrizione">
            
            <h1>Benvenuto NerdBook, il tuo Social Network</h1>
            
            <h2 id="presentazione">Cosa è NerdBook</h2>
            <p>
                Nerdbook è il nuovo Social Network completamente gratuito per la condivisione dei tuoi contenuti con le persone a te care.

                Il funzionamento è semplice ed intuitivo ed una volta che inizierai ad usarlo, ti chiederai come hai potuto farne a meno!

            </p>

            <h2 id="funzionalita">Funzionalità</h2>
            <p>
                Tra le tante funzionalità che avrai a disposizione tutti i giorni, abbiamo deciso di presentarti le principali che saranno sicuramente di tuo interesse.
            </p>    

            <h3 id="amicizie">Amicizie</h3>
            <p>
                Se non hai mai utilizzato un Social Network, non saprai che la sua più importante funzione è qulla di poter collegare due persone lontane fisicamente.
                Se hai parenti che non vei da tempo, amici che sono partiti o vecchi compagni che hai perso di vista, con NerdBook avrai la possibilità di riallacciare i vecchi rapporti e riprendere contatto!
            </p>

            <h3 id="bacheca">Bacheca</h3>
            <p>    
                Un altra funzione indispensabile presente sul nostro Social Network è la bacheca. Nella tua bacheca personale potrai pubblicare le notizie e gli avvenimenti che ti capitano ogni giorni, le tue emozioni e tutto ciò che vorrai comunicare ai tuoi amici.
                Tieni presente che potrai condividere i tuoi contenuti solo con i tuoi amici e rimarranno in questo modo all'interno della cerchia dei tuoi conoscenti.
                Hai inotre la possibilità di scrivere messaggi nella bacheca dei tuoi amici, un divertimento unico!
            </p>

            <h3 id="messaggi">Messaggi</h3>
            <p>
                Una volta che avrai individuato i tuoi amici di lunga data, potrai inviargli dei messaggi privati visibili esclusivamente a loro!
                Se hai informazioni personali è infatti sconsigliato che queste vengano pubblicate in bacheca, invia un messaggio privato in totale comodità!
            </p>

            <h2 id="divertimento">Tanto divertimento ti aspetta</h2>
            <p> 
                Con NerdBook avrai la possibilità di passare del tempo in completa spensieratezza, senza annunci pubblicitari che ti distraggano e solo in compagnia dei tuoi amici più fidati.
                Una richiesta che facciamo a tutti i nostri iscritti è di usare NerdBook con correttezza, senza cadere in comportamenti volgari, aggressivi o vessatori.
                In questi casi interverrà un Amministratore a moderare i commenti, con rischio di cancellazione dell'account del trasgressore.
            </p>
        </div>
    </body>       
</html>
