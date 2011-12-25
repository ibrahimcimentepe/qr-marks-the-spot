<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : gameSteps
    Created on : Nov 25, 2011, 5:25:35 AM
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
                        <webuijsf:label id="label1" style="color: red; left: 192px; top: 144px; position: absolute" text="#{gameSteps.gameStepString}"/>
                        <webuijsf:label id="label2" style="color: orange; left: 192px; top: 168px; position: absolute" text="QR Code of The Step:"/>
                        <webuijsf:label id="label3" style="color: orange; left: 192px; top: 240px; position: absolute" text="Location:"/>
                        <webuijsf:label id="label4" style="color: orange; left: 192px; top: 264px; position: absolute" text="Password:"/>
                        <webuijsf:textArea columns="32" id="textArea1" rows="4" style="left: 360px; top: 168px; position: absolute"
                            text="#{gameSteps.qrCodeString}" valueChangeListenerExpression="#{gameSteps.textArea1_processValueChange}"/>
                        <webuijsf:textField columns="35" id="textField1" style="left: 360px; top: 240px; position: absolute" text="#{gameSteps.location}"/>
                        <webuijsf:textField columns="35" id="textField2" style="left: 360px; top: 264px; position: absolute" text="#{gameSteps.password}"/>
                        <webuijsf:button actionExpression="#{gameSteps.button1_action}" id="button1"
                            style="color: red; height: 24px; left: 455px; top: 312px; position: absolute; width: 120px" text="#{gameSteps.buttonText}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
