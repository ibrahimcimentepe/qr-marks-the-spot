<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : editGame
    Created on : Jan 4, 2012, 1:09:40 AM
    Author     : alke
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="labelTitle" style="color: orange; font-size: 24px; left: 480px; top: 72px; position: absolute" text="Welcome To Game Edition Page"/>
                        <webuijsf:button actionExpression="#{editGame.buttonBackToAdmin_action}" id="buttonBackToAdmin"
                            style="color: red; height: 24px; left: 72px; top: 48px; position: absolute; width: 167px" text="&lt;  Back To Administration Page"/>
                        <webuijsf:button actionExpression="#{editGame.buttonBackToHome_action}" id="buttonBackToHome"
                            style="color: red; height: 24px; left: 71px; top: 96px; position: absolute; width: 168px" text="&lt;  Back To Home Page"/>
                        <webuijsf:label id="labelGameId" style="color: orange; left: 96px; top: 216px; position: absolute" text="Game Id:"/>
                        <webuijsf:label id="labelGameName" style="color: orange; left: 96px; top: 264px; position: absolute" text="Game Name:"/>
                        <webuijsf:label id="labelDescription" style="color: orange; left: 96px; top: 312px; position: absolute" text="Description:"/>
                        <webuijsf:label id="labelStartingPoint" style="color: orange; left: 96px; top: 384px; position: absolute" text="Starting Point:"/>
                        <webuijsf:label id="labelLocation" style="color: orange; left: 96px; top: 432px; position: absolute" text="Location(Borders)"/>
                        <webuijsf:label id="labelNumberOfSteps" style="color: orange; left: 96px; top: 480px; position: absolute" text="How many steps to finish the game:"/>
                        <webuijsf:label id="labelCurrentStep" style="color: orange; left: 96px; top: 528px; position: absolute" text="Current Step:"/>
                        <webuijsf:label id="labelNumberOfPlayers" style="color: orange; left: 96px; top: 576px; position: absolute" text="NumberOf Players:"/>
                        <webuijsf:label id="labelRating" style="color: orange; left: 96px; top: 624px; position: absolute" text="Rating:"/>
                        <webuijsf:label id="labelCreator" style="color: orange; left: 96px; top: 672px; position: absolute" text="Creator:"/>
                        <webuijsf:textField id="textFieldGameId" readOnly="true"
                            style="border-style: solid; border-color: red; left: 384px; top: 216px; position: absolute" text="#{editGame.gameId}" toolTip="You can not change a game's Id&#xa;"/>
                        <webuijsf:textField id="textFieldGameName" onChange=""
                            style="border-style: solid; border-color: lime; left: 384px; top: 264px; position: absolute" text="#{editGame.gameName}"/>
                        <webuijsf:textArea columns="50" id="textAreaDescription" onChange=""
                            style="border-style: solid; border-color: lime; left: 384px; top: 312px; position: absolute" text="#{editGame.description}"/>
                        <webuijsf:textField id="textFieldStartingPoint"
                            style="border-style: solid; border-color: lime; left: 384px; top: 384px; position: absolute" text="#{editGame.startingPoint}"/>
                        <webuijsf:textField id="textFieldLocation" style="border-style: solid; border-color: lime; left: 384px; top: 432px; position: absolute" text="#{editGame.borders}"/>
                        <webuijsf:textField id="textFieldNumberOfSteps"
                            style="border-style: solid; border-color: lime; left: 384px; top: 480px; position: absolute" text="#{editGame.numberOfSteps}"/>
                        <webuijsf:textField id="textFieldCurrentStep"
                            style="border-style: solid; border-color: lime; left: 384px; top: 528px; position: absolute" text="#{editGame.currentStep}"/>
                        <webuijsf:textField id="textFieldNumberOfPlayers"
                            style="border-style: solid; border-color: lime; left: 384px; top: 576px; position: absolute" text="#{editGame.numberOfPlayers}"/>
                        <webuijsf:textField id="textFieldRating" style="border-style: solid; border-color: lime; left: 384px; top: 624px; position: absolute" text="#{editGame.rating}"/>
                        <webuijsf:textField id="textFieldCreator" readOnly="true"
                            style="border-style: solid; border-color: red; left: 384px; top: 672px; position: absolute" text="#{editGame.creatorName}" toolTip="You can not change a game's creator"/>
                        <webuijsf:button actionExpression="#{editGame.buttonUpdate_action}" id="buttonUpdate"
                            style="color: red; height: 24px; left: 384px; top: 168px; position: absolute; width: 167px" text="UPDATE GAME CHANGES"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
