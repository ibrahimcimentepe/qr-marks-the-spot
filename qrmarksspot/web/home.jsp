<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : home
    Created on : 18.Kas.2011, 15:40:54
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
                    <webuijsf:label id="label1"
                        style="color: orange; font-family: 'Geneva','Arial','Helvetica',sans-serif; font-size: 36px; font-weight: bold; left: 408px; top: 0px; position: absolute; text-decoration: underline" text="QR MARKS THE SPOT"/>
                    <webuijsf:form id="form1">
                        <webuijsf:hyperlink actionExpression="#{home.logoutLink_action}" id="logoutLink" text="Log Out" visible="#{SessionBean1.loggedIn}"/>
                        <webuijsf:label id="label2" style="color: orange; left: 24px; top: 120px; position: absolute" text="News Feed"/>
                        <webuijsf:textField id="gameSearchTextField" style="left: 384px; top: 72px; position: absolute" text="#{home.gameToBePlayed}"/>
                        <webuijsf:button actionExpression="#{home.signup_action}" id="signup"
                            style="color: red; height: 24px; left: 983px; top: 120px; position: absolute; width: 96px" text="Sign Up" visible="#{!SessionBean1.loggedIn}"/>
                        <webuijsf:button actionExpression="#{home.goToGameButton_action}" id="goToGameButton"
                            style="color: red; height: 24px; left: 383px; top: 96px; position: absolute; width: 120px" text="to the game -&gt;"/>
                        <webuijsf:button actionExpression="#{home.login_action}" id="login"
                            style="color: red; height: 24px; left: 983px; top: 168px; position: absolute; width: 96px" text="Log In" visible="#{!SessionBean1.loggedIn}"/>
                        <webuijsf:button actionExpression="#{home.tutorial_action}" id="tutorial"
                            style="color: red; height: 24px; left: 983px; top: 216px; position: absolute; width: 96px" text="Tutorial"/>
                        <webuijsf:button actionExpression="#{home.gameCreateButton_action}" id="gameCreateButton" style="height: 24px; width: 80px"
                            text="Create Game" visible="#{SessionBean1.loggedIn}"/>
                        <webuijsf:label text="#{home.labels[0]}"/>
                        <webuijsf:label text="#{home.labels[1]}"/>
                        <webuijsf:label text="#{home.labels[2]}"/>
                        <webuijsf:label text="#{home.labels[3]}"/>
                        <webuijsf:label text="#{home.labels[4]}"/>
                        <webuijsf:label text="#{home.labels[5]}"/>
                        <webuijsf:label text="#{home.labels[6]}"/>
                        <webuijsf:label text="#{home.labels[7]}"/>
                        <webuijsf:label text="#{home.labels[8]}"/>
                        <webuijsf:label text="#{home.labels[9]}"/>
                        <webuijsf:label text="#{home.labels[10]}"/>
                        <webuijsf:label text="#{home.labels[11]}"/>
                        <webuijsf:label text="#{home.labels[12]}"/>
                        <webuijsf:label text="#{home.labels[13]}"/>
                        <webuijsf:label text="#{home.labels[14]}"/>
                        <webuijsf:label text="#{home.labels[15]}"/>
                        <webuijsf:label text="#{home.labels[16]}"/>
                        <webuijsf:label text="#{home.labels[17]}"/>
                        <webuijsf:label text="#{home.labels[18]}"/>
                        <webuijsf:label text="#{home.labels[19]}"/>
                        <webuijsf:hyperlink actionExpression="#{home.hyperlink1_action}" id="hyperlink1"
                            style="color: aqua; height: 24px; left: 984px; top: 24px; position: absolute; width: 22px" text="#{SessionBean1.effectiveUserName}"/>
                        <webuijsf:label id="usernameLabel1" style="color: aqua; left: 24px; top: 72px; position: absolute" text="#{SessionBean1.userName}"/>
                        <webuijsf:button actionExpression="#{home.searchButton_action}" id="searchButton1"
                            style="color: red; height: 48px; left: 983px; top: 312px; position: absolute; width: 96px" text="Search"/>
                        <webuijsf:hyperlink actionExpression="#{home.hyperlink2_action}" id="hyperlink2"
                            style="color: aqua; height: 22px; left: 984px; top: 432px; position: absolute; width: 94px" text="Report Abuse"/>
                        <webuijsf:button actionExpression="#{home.seeQrCodesButton_action}" id="seeQrCodesButton"
                            style="color: red; height: 24px; left: 983px; top: 384px; position: absolute; width: 96px" text="See Qr Codes"/>
                        <webuijsf:button actionExpression="#{home.button1_action}" id="button1"
                            style="color: red; height: 24px; left: 983px; top: 408px; position: absolute; width: 96px" text="Forum"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
