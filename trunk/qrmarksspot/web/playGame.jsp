<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : playGame
    Created on : 04.Ara.2011, 18:55:23
    Author     : 23
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
                        <webuijsf:label id="label1"
                            style="color: orange; font-size: 24px; height: 24px; left: 72px; top: 96px; position: absolute; width: 384px" text="#{playGame.currentGameString}"/>
                        <webuijsf:label id="label2"
                            style="color: orange; font-size: 24px; height: 24px; left: 72px; top: 144px; position: absolute; width: 384px" text="#{playGame.currentStepString}"/>
                        <webuijsf:label id="label3" style="color: orange; height: 24px; left: 72px; top: 216px; position: absolute; width: 384px" text="Information related to next target is given below!"/>
                        <webuijsf:textField columns="37" id="textField1" onChange=""
                            style="height: 24px; left: 144px; top: 360px; position: absolute; width: 240px" text="#{playGame.givenPass}" valueChangeListenerExpression="#{playGame.textField1_processValueChange}"/>
                        <webuijsf:label id="label4" style="color: orange; height: 22px; left: 72px; top: 360px; position: absolute; width: 70px" text="Password:"/>
                        <webuijsf:button actionExpression="#{playGame.nextButton_action}" id="nextButton"
                            style="color: red; height: 24px; left: 383px; top: 360px; position: absolute; width: 72px" text="GO"/>
                        <webuijsf:label id="label5"
                            style="color: orange; font-size: 36px; height: 46px; left: 72px; top: 24px; position: absolute; width: 262px" text="#{SessionBean1.effectiveUserName}"/>
                        <webuijsf:textArea columns="60" id="textArea1" onChange="" readOnly="true" rows="5" style="left: 72px; top: 264px; position: absolute"
                            text="#{playGame.location}" valueChangeListenerExpression="#{playGame.textArea1_processValueChange}"/>
                        <webuijsf:button actionExpression="#{playGame.homepage_action}" id="homepage"
                            style="height: 24px; left: 71px; top: 408px; position: absolute; width: 95px" text="Go to Homepage"/>
                        <webuijsf:button actionExpression="#{playGame.logout_action}" id="logout"
                            style="height: 24px; left: 359px; top: 408px; position: absolute; width: 95px" text="Log Out"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
