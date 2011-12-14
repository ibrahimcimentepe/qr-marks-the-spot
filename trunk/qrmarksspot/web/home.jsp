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
                        style="color: rgb(255, 255, 255); font-family: 'Geneva','Arial','Helvetica',sans-serif; font-size: 36px; font-weight: bold; left: 456px; top: 0px; position: absolute; text-decoration: underline" text="QR MARKS THE SPOT"/>
                    <legend>QR MARKS THE SPOT</legend>
                    <webuijsf:form id="form1">
                        <div>
                            <webuijsf:label id="label2" style="left: 48px; color: rgb(255, 255, 255); top: 96px; position: absolute" text="News Feed"/>
                            <ul style="left: 0px; top: 133px; position: absolute">
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[0]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[1]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[2]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[3]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[4]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[5]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[6]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[7]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[8]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[9]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[10]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[11]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[12]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[13]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[14]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[15]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[16]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[17]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[18]}"/>
                                </li>
                                <li>
                                    <webuijsf:label style="color: rgb(255, 255, 255);" text="#{home.labels[19]}"/>
                                </li>
                            </ul>
                        </div>
                        <webuijsf:hyperlink actionExpression="#{home.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 1008px; top: 288px; position: absolute; width: 22px" text="#{SessionBean1.effectiveUserName}"/>
                        <br/>
                        <webuijsf:label id="usernameLabel1" style="left: 1008px; top: 240px; position: absolute; width: 72px" text="#{SessionBean1.userName}"/>
                        <webuijsf:button actionExpression="#{home.searchButton_action}" id="searchButton1"
                            style="height: 24px; left: 671px; top: 216px; position: absolute; width: 96px" text="Search"/>
                        <webuijsf:hyperlink actionExpression="#{home.hyperlink2_action}" id="hyperlink2"
                            style="height: 22px; left: 1008px; top: 336px; position: absolute; width: 94px" text="Report Abuse"/>
                        <webuijsf:textField id="gameSearchTextField1" style="left: 504px; top: 168px; position: absolute" text="#{home.gameToBePlayed}"/>
                        <webuijsf:button actionExpression="#{home.tutorial_action}" id="tutorial1"
                            style="height: 24px; left: 1007px; top: 192px; position: absolute; width: 80px" text="Tutorial"/>
                        <webuijsf:button actionExpression="#{home.login_action}" id="login1"
                            style="height: 24px; left: 1007px; top: 144px; position: absolute; width: 80px" text="Log In" visible="#{!SessionBean1.loggedIn}"/>
                        <webuijsf:button actionExpression="#{home.signup_action}" id="signup1"
                            style="height: 24px; left: 1007px; top: 96px; position: absolute; width: 80px" text="Sign Up" visible="#{!SessionBean1.loggedIn}"/>
                        <webuijsf:button actionExpression="#{home.goToGameButton_action}" id="goToGameButton1"
                            style="height: 24px; left: 671px; top: 168px; position: absolute; width: 96px" text="to the game -&gt;"/>
                        <webuijsf:button id="button1" style="height: 24px; left: 671px; top: 120px; position: absolute; width: 95px" text="Forum"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
