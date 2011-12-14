<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : gamePage
    Created on : Dec 1, 2011, 3:28:09 AM
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
                <webuijsf:body id="body1" imageURL="resources/logobg.jpg" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="labelGameDetails" style="color: red; height: 24px; left: 72px; top: 96px; position: absolute" text="Game Details"/>
                        <webuijsf:label id="usernameLabel1" style="left: 624px; top: 96px; position: absolute" text="#{SessionBean1.userName}"/>
                        <webuijsf:label id="labelLocation" style="color: orange; height: 24px; left: 72px; top: 360px; position: absolute; width: 214px" text="Location(borders):"/>
                        <webuijsf:label id="labelNumberOfPlayers" style="color: orange; height: 24px; left: 72px; top: 504px; position: absolute; width: 214px" text="Number Of Players:"/>
                        <webuijsf:label id="labelNumberOfSteps" style="color: orange; height: 24px; left: 72px; top: 408px; position: absolute; width: 214px" text="How many steps to finish the game:"/>
                        <webuijsf:label id="labelCurrentStep" style="color: orange; height: 24px; left: 72px; top: 456px; position: absolute; width: 214px" text="Current Step:"/>
                        <webuijsf:label id="labelDescription" style="color: orange; height: 24px; left: 72px; top: 240px; position: absolute; width: 214px" text="Description:"/>
                        <webuijsf:label id="labelStartingPoint" style="color: orange; height: 24px; left: 72px; top: 312px; position: absolute; width: 214px" text="Starting point:"/>
                        <webuijsf:label id="labelCreator" style="color: orange; height: 24px; left: 72px; top: 600px; position: absolute; width: 214px" text="Creator:"/>
                        <webuijsf:label id="labelRating" style="color: orange; height: 24px; left: 72px; top: 552px; position: absolute; width: 214px" text="Rating:"/>
                        <webuijsf:label id="labelPictures" style="color: orange; left: 72px; top: 672px; position: absolute" text="Pictures"/>
                        <webuijsf:button actionExpression="#{gamePage.backButton_action}" id="backButton"
                            style="height: 24px; left: 71px; top: 48px; position: absolute" text="&lt; Back to home"/>
                        <webuijsf:button actionExpression="#{gamePage.bring_action}" id="bring" style="position: absolute; left: 384px; top: 72px"
                            text="bring the game" visible="false"/>
                        <webuijsf:textArea columns="96" id="textAreaDescription" readOnly="true" rows="4"
                            style="border: 2px solid red; left: 336px; top: 216px; position: absolute" text="#{gamePage.description}"/>
                        <webuijsf:textField columns="100" id="textFieldStartingPoint" readOnly="true"
                            style="border: 2px solid red; left: 336px; top: 312px; position: absolute" text="#{gamePage.startingPoint}"/>
                        <webuijsf:textField columns="100" id="textFieldLocation" readOnly="true"
                            style="border: 2px solid red; left: 336px; top: 360px; position: absolute" text="#{gamePage.borders}"/>
                        <webuijsf:textField columns="100" id="textFieldNumberOfSteps" readOnly="true"
                            style="border: 2px solid red; left: 336px; top: 408px; position: absolute" text="#{gamePage.numberOfSteps}"/>
                        <webuijsf:textField columns="100" id="textFieldCurrentStep" readOnly="true"
                            style="border: 2px solid red; left: 336px; top: 456px; position: absolute" text="#{gamePage.currentStep}"/>
                        <webuijsf:textField columns="100" id="textFieldNumberOfPlayers" readOnly="true"
                            style="border: 2px solid red; left: 336px; top: 504px; position: absolute" text="#{gamePage.numberOfPlayers}"/>
                        <webuijsf:textField columns="100" id="textFieldRating" readOnly="true"
                            style="border: 2px solid red; left: 336px; top: 552px; position: absolute" text="#{gamePage.rating}"/>
                        <webuijsf:textField columns="100" id="textFieldCreator" readOnly="true"
                            style="border: 2px solid red; left: 336px; top: 600px; position: absolute" text="#{gamePage.creatorName}"/>
                        <webuijsf:label id="labelGameName" style="color: orange; height: 24px; left: 72px; top: 144px; position: absolute; width: 214px" text="Game Name:"/>
                        <webuijsf:textField columns="100" id="textFieldGameName" readOnly="true"
                            style="border: 2px solid red; left: 336px; top: 144px; position: absolute" text="#{gamePage.gameName}"/>
                        <webuijsf:button actionExpression="#{gamePage.buttonPlayGame_action}" id="buttonPlayGame"
                            style="height: 24px; left: 264px; top: 48px; position: absolute; width: 287px" text="#{gamePage.playButton}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
