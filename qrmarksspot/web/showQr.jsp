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
                        <webuijsf:button actionExpression="#{showQr.generateButton_action}" id="generateButton"
                            style="left: 95px; top: 240px; position: absolute" text="See QR"/>
                        <h:selectOneMenu id="dropdown1" onchange="webui.suntheme.common.timeoutSubmitForm(this.form, 'dropdown1');"
                            onclick="dropdown1_processValueChange()" style="left: 96px; top: 96px; position: absolute" value="#{showQr.selectedGameName}" valueChangeListener="#{showQr.dropdown1_processValueChange}">
                            <f:selectItems id="dropdown1SelectItems" value="#{showQr.dropdown1DefaultItems1}"/>
                        </h:selectOneMenu>
                        <h:selectOneMenu id="dropdown2" onchange="webui.suntheme.common.timeoutSubmitForm(this.form, 'dropdown2');"
                            style="left: 96px; top: 144px; position: absolute" value="#{showQr.selectedGameStepName}" valueChangeListener="#{showQr.dropdown2_processValueChange}">
                            <f:selectItems id="dropdown2SelectItems" value="#{showQr.dropdown2DefaultItems}"/>
                        </h:selectOneMenu>
                        <webuijsf:label id="label1" style="color: white; left: 96px; top: 192px; position: absolute" text="#{showQr.selectedGameStepQR}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
