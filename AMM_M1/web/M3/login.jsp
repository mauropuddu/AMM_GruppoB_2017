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
        <c:set var="title" value="Login" scope="request"/>
        
        <!-- Predispongo la navbar per il collegamento con le altre pagine -->
        
        <c:if test="${loggedIn == false}">
            <div id="header">
                <nav>
                    <a href="descrizione.jsp">Descrizione</a>
                    <a href="profilo.jsp">Profilo</a>
                    <a href="bacheca.jsp">Bacheca</a>
                </nav>
            </div>
        </c:if>     
        
        <form method="post" id="form_login" action="Login">
            
            <c:if test="${invalidData == true}">
                <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
            </c:if>
                
            <div>
                <h2>NerdBook</h2>
                <img src="img/nerdbook.png" width="100" height="70" alt="Nerdbook">
            </div>
            
            <div class="riquadro">
                <!-- Richiesta Username e Password -->
                <label for="Username">Username</label>    
                <input type="text" placeholder="Inserire Username" name ="Username" id="Username" class="campologin" required/>

                <label for="password">Password Utente</label>
                <input type="password" placeholder="Inserire Password" name="password" id="password" class="campologin" required/>

                <button type="reset">Cancella</button>
                <button type="submit">Login</button>
                
            </div>
            
    
        </form>
        
    </body>
</html>