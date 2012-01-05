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
                        <h:selectOneMenu id="dropdown1" style="left: 192px; top: 144px; position: absolute; width: 288px" valueChangeListener="#{search.dropdown1_processValueChange}">
                            <f:selectItems id="dropdown1SelectItems" value="#{search.dropdown1DefaultItems}"/>
                        </h:selectOneMenu>
                        <webuijsf:textField id="textField1" style="left: 192px; top: 72px; position: absolute" text="#{search.searchCategory}"/>
                        <webuijsf:textField id="textField2" style="left: 360px; top: 72px; position: absolute" text="#{search.textt}"/>
                        <webuijsf:textField id="textField3" style="left: 192px; top: 216px; position: absolute" text="#{search.selectedGame}" valueChangeListenerExpression="#{search.textField3_processValueChange}"/>
                        <webuijsf:button actionExpression="#{search.button1_action}" id="button1" style="left: 575px; top: 72px; position: absolute" text="Search"/>
                        <webuijsf:button actionExpression="#{search.button2_action}" id="button2" style="left: 359px; top: 216px; position: absolute" text="Go"/>
                        <webuijsf:button actionExpression="#{search.button3_action}" id="button3" style="position: absolute; left: 24px; top: 24px" text="Go to Home"/>
                        <webuijsf:staticText id="staticText1" style="color: #00cccc; left: 192px; top: 48px; position: absolute" text="Search Category"/>
                        <webuijsf:staticText id="staticText2" style="color: #00cccc; left: 360px; top: 48px; position: absolute" text="Search Text"/>
                        <webuijsf:staticText id="staticText3" style="color: #00cccc; left: 24px; top: 72px; position: absolute" text="Available Categories"/>
                        <webuijsf:staticText id="staticText4" style="color: #00cccc; left: 24px; top: 96px; position: absolute" text="Creator Name"/>
                        <webuijsf:staticText id="staticText5" style="color: #00cccc; left: 24px; top: 120px; position: absolute" text="Game Tag"/>
                        <webuijsf:staticText id="staticText6" style="color: #00cccc; left: 24px; top: 144px; position: absolute" text="Maximum Number of Steps"/>
                        <webuijsf:staticText id="staticText7" style="color: #00cccc; left: 24px; top: 168px; position: absolute" text="Maximum Rating"/>
                        <webuijsf:staticText id="staticText8" style="color: #00cccc; left: 192px; top: 120px; position: absolute" text="Search Results"/>
                        <webuijsf:staticText id="staticText9" style="color: #00cccc; left: 192px; top: 192px; position: absolute" text="Enter Game Name"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
