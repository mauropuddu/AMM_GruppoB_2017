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

            
            <c:if test="${Error == false}">
                <div id="invalidDataWarning">Errore. Non sei autorizzat ad accedere.</div>
            </c:if>
          
            
            
            
            
            <h2>Persone</h2>
            <p><img title="foto profilo Mauro Puddu" alt="foto profilo Mauro Puddu" class="foto_profilo_menu" src="img/profilo3.jpg">
            Mauro Puddu</p>
            <p><img title="foto profilo Alessia Pistis" alt="foto profilo Alessia Pistis" class="foto_profilo_menu" src="img/profilo1.jpg">
            Alessia Pistis</p>
            <p><img title="foto profilo Valeria Cabiddu." alt="foto profilo Valeria Cabiddu" class="foto_profilo_menu" src="img/profilo2.jpg">
            Valeria Cabiddu</p>
            <h2>Gruppi</h2>
            
       
        </div>
        
        <!-- Creo degli article che conterranno i post in bacheca -->

            
        
        <h1>Post in Bacheca</h1>
            
            
        <div id="contenitore_post">
            <c:forEach var="post" items="${postList}">
                <article class="post">
                    <h4>${post.utenteFName} ${post.utenteLName}</h4>
                    <p>
                        <img src="${post.post_foto_profilo}">
                    </p>
                    <p>${post.testoPost}</p>
                    <c:choose>
                        <c:when test="${post.id == 1}">
                            <img src="${post.allegato}" width="276" height="100">
                        </c:when>
                        <c:when test="${post.id == 2}">
                            <a href="http://www.google.it">Visita il mio Blog</a>
                        </c:when>
                    </c:choose>
                </article>
            </c:forEach>
        </div>        

            
    </body>
</html>
