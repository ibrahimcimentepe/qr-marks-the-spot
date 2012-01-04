<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : adminPage
    Created on : Dec 28, 2011, 7:15:28 PM
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
                        <webuijsf:label id="label1" style="color: orange; left: 72px; top: 96px; position: absolute" text="Welcome to administration page"/>
                        <h:dataTable headerClass="list-header" id="dataTable1" rowClasses="list-row-even,list-row-odd"
                            style="left: 384px; top: 720px; position: absolute" value="#{adminPage.dataTable1Model}" var="currentRow"/>
                        <webuijsf:textArea binding="#{adminPage.textArea3}" columns="80" disabled="true" id="textArea3"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'textArea3');" rows="20"
                            style="left: 192px; top: 168px; position: absolute" text="#{adminPage.abusementMessage}" valueChangeListenerExpression="#{adminPage.textArea3_processValueChange}"/>
                        <webuijsf:button actionExpression="#{adminPage.buttonSeeNextMessage_action}" id="buttonSeeNextMessage" immediate="true"
                            style="color: red; height: 24px; left: 216px; top: 480px; position: absolute" text="See next message"/>
                        <webuijsf:button actionExpression="#{adminPage.backButton_action}" id="backButton" immediate="true"
                            style="color: red; height: 24px; left: 71px; top: 48px; position: absolute; width: 120px" text="&lt; Back to home"/>
                        <webuijsf:label id="label2" style="color: aqua; font-size: 14px; left: 72px; top: 528px; position: absolute; text-decoration: underline" text="EDITING A GAME"/>
                        <webuijsf:label id="label3" style="color: orange; left: 72px; top: 600px; position: absolute" text="Enter Game Name here -&gt;"/>
                        <webuijsf:textField id="textFieldGameName" style="left: 264px; top: 600px; position: absolute" text="#{adminPage.gameNameToEdit}"/>
                        <webuijsf:button actionExpression="#{adminPage.buttonEditGame_action}" id="buttonEditGame"
                            style="color: red; height: 24px; left: 432px; top: 600px; position: absolute; width: 119px" text="Edit the game-&gt;"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
