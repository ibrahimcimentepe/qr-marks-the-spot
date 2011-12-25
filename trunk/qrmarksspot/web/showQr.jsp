<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : showQr
    Created on : Dec 14, 2011, 9:07:51 PM
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
                        <webuijsf:dropDown id="gameStepDropDown" style="left: 192px; top: 168px; position: absolute" valueChangeListenerExpression="#{showQr.gameStepDropDown_processValueChange}"/>
                        <webuijsf:dropDown id="gameNameDropDown" items="#{showQr.gameNames}" style="left: 192px; top: 96px; position: absolute" valueChangeListenerExpression="#{showQr.gameNameDropDown_processValueChange}"/>
                        <webuijsf:textArea columns="50" id="qrCodeTextArea" style="left: 192px; top: 240px; position: absolute"/>
                        <webuijsf:button actionExpression="#{showQr.generateButton_action}" id="generateButton"
                            style="left: 191px; top: 336px; position: absolute" text="Button"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
