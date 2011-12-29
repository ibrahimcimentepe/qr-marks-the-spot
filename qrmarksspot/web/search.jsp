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
                        <h:selectOneMenu id="dropdown1" style="left: 96px; top: 168px; position: absolute; width: 144px" valueChangeListener="#{search.dropdown1_processValueChange}">
                            <f:selectItems id="dropdown1SelectItems" value="#{search.dropdown1DefaultItems}"/>
                        </h:selectOneMenu>
                        <webuijsf:textField id="textField1" style="position: absolute; left: 96px; top: 72px" text="#{search.searchCategory}"/>
                        <webuijsf:textField id="textField2" style="position: absolute; left: 288px; top: 72px" text="#{search.textt}"/>
                        <webuijsf:textField id="textField3" style="position: absolute; left: 312px; top: 168px" text="#{search.selectedGame}"/>
                        <webuijsf:button actionExpression="#{search.button1_action}" id="button1" style="position: absolute; left: 528px; top: 72px" text="Button"/>
                        <webuijsf:button actionExpression="#{search.button2_action}" id="button2" style="position: absolute; left: 504px; top: 168px" text="Button"/>
                        <webuijsf:button actionExpression="#{search.button3_action}" id="button3" style="position: absolute; left: 24px; top: 24px" text="Button"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
