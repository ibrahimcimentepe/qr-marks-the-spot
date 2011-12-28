<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : search
    Created on : 05.Ara.2011, 18:31:22
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
                        <webuijsf:button actionExpression="#{search.button1_action}" id="button1"
                            style="height: 24px; left: 623px; top: 96px; position: absolute; width: 71px" text="Search"/>
                        <h:commandButton action="#{search.button2_action}" id="button2"
                            style="height: 24px; left: 624px; top: 216px; position: absolute; width: 72px" value="GO!"/>
                        <h:selectOneMenu id="dropdown2" onchange="" onselect="#{search.selectedGame}"
                            style="left: 240px; top: 168px; position: absolute; width: 360px" valueChangeListener="#{search.dropdown2_processValueChange}">
                            <f:selectItems id="dropdown2SelectItems" value="#{search.dropdown2DefaultItems}"/>
                        </h:selectOneMenu>
                        <webuijsf:textField columns="35" id="textField1" style="left: 384px; top: 96px; position: absolute" text="#{search.textt}"/>
                        <webuijsf:textField columns="35" id="textField2" style="left: 384px; top: 216px; position: absolute" text="#{search.selectedGame}" valueChangeListenerExpression="#{search.textField2_processValueChange}"/>
                        <webuijsf:staticText id="staticText1" style="color: rgb(0, 204, 204); left: 240px; top: 144px; position: absolute" text="Search Results"/>
                        <webuijsf:staticText id="staticText2" style="color: rgb(0, 204, 204); left: 240px; top: 216px; position: absolute" text="Enter the Name of Game"/>
                        <webuijsf:textField id="textField3" style="left: 240px; top: 96px; position: absolute" text="#{search.searchCategory}" valueChangeListenerExpression="#{search.textField3_processValueChange}"/>
                        <webuijsf:staticText id="staticText3"
                            style="color: rgb(0, 204, 204); height: 24px; left: 240px; top: 72px; position: absolute; width: 120px" text="Search Category"/>
                        <webuijsf:staticText id="staticText4"
                            style="color: rgb(0, 204, 204); height: 22px; left: 24px; top: 48px; position: absolute; width: 166px" text="Available Categories:"/>
                        <webuijsf:staticText id="staticText5"
                            style="color: rgb(0, 204, 204); height: 22px; left: 24px; top: 72px; position: absolute; width: 166px" text="Game Tag"/>
                        <webuijsf:staticText id="staticText6"
                            style="color: rgb(0, 204, 204); height: 22px; left: 24px; top: 96px; position: absolute; width: 166px" text="Creator Name"/>
                        <webuijsf:staticText id="staticText7"
                            style="color: rgb(0, 204, 204); height: 22px; left: 24px; top: 120px; position: absolute; width: 166px" text="Maximum Number of Steps"/>
                        <webuijsf:staticText id="staticText8"
                            style="color: rgb(0, 204, 204); height: 22px; left: 24px; top: 144px; position: absolute; width: 166px" text="Maximum Rating"/>
                        <webuijsf:staticText id="staticText9"
                            style="color: rgb(0, 204, 204); height: 22px; left: 384px; top: 72px; position: absolute; width: 118px" text="Value:"/>
                        <webuijsf:button actionExpression="#{search.button2_action}" id="button2"
                            style="color: red; height: 24px; left: 120px; top: 24px; position: absolute; width: 95px" text="&lt; Go to home "/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
