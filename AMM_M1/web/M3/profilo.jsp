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
        <!-- Predispongo la nav per il collegamento con la pagina Login e Descrizione -->
        
        <div id="header">
            <nav>
                <a href="login.jsp">Login</a>
                <a href="descrizione.jsp">Descrizione</a>
            </nav>
        </div>
        
        <div class="divsx">
            
            <h2>Persone</h2>
            <p><img title="foto profilo Mauro Puddu" alt="foto profilo Mauro Puddu" class="foto_profilo_menu" src="img/profilo3.jpg">
            Mauro Puddu</p>
            <p><img title="foto profilo Alessia Pistis" alt="foto profilo Alessia Pistis" class="foto_profilo_menu" src="img/profilo1.jpg">
            Alessia Pistis</p>
            <p><img title="foto profilo Valeria Cabiddu" alt="foto profilo Valeria Cabiddu" class="foto_profilo_menu" src="img/profilo2.jpg">
            Valeria Cabiddu</p>
            <h2>Gruppi</h2>
            
            <c:forEach var="gruppo" items="${gruppoList}">
                <p>${gruppo.nome_gruppo}</p>   
            </c:forEach>   
                        
        </div>
  
        <form method="get" id="form_profilo">
            
            <div id="id_profilo">

                <!-- Campo per inserire Nome Utente -->
                <label for="nome">Nome</label>
                <input type="text" class="campoprofilo" name="nome" id="nome" placeholder="Inserisci i tuo nome" required/>

                <label for="nome">Cognome</label>
                <input type="text" class="campoprofilo" name="cognome" id="cognome" placeholder="Inserisci il tuo Cognome" required/>

                <!-- Campo per inserire una frase di presentazione -->
                <label for="presentazione">Presentazione</label>
                <textarea rows="2" cols="40" name="presentazione" class="campoprofilo" placeholder="Inserisci una tua presentazione" id="presentazione" required></textarea>

                <!-- Campo per inserire data di nascita, ho utilizzato un type "text" perchè il type "date" non è supportato da tutti i browser ed ottenevo un warning in convalida-->
                <label for="data">Data di Nascita</label>
                <input type="text" class="campoprofilo" name="data" id="data" placeholder="Data di nascita" required/>

                <label for="password">Password</label>
                <input type="password" name="password" class="campoprofilo" id="password" value="nascosta" required/> 

                <label for="conferma">Conferma Password</label>
                <input type="password" name="conferma" class="campoprofilo" id="conferma" value="nascosta" required/> 

                <!-- Pulsanti per inviare o cancellare i dati -->
                <button type="reset">Cancella</button>
                <button type="submit">Invia</button>
            </div>
        </form>
    </body>
</html>
