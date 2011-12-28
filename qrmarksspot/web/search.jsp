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
                            style="color: red; height: 24px; left: 455px; top: 96px; position: absolute; width: 71px" text="Search"/>
                        <webuijsf:button actionExpression="#{search.homeButton_action}" id="homeButton"
                            style="color: red; height: 24px; left: 23px; top: 24px; position: absolute; width: 95px" text="&lt; Go to home "/>
                        <h:inputText id="textField1" style="position: absolute; left: 96px; top: 96px" value="#{search.searchCategory}"/>
                        <h:inputText id="textField2" style="left: 264px; top: 96px; position: absolute" value="#{search.searchString}"/>
                        <h:inputText id="textField3" style="left: 96px; top: 192px; position: absolute" value="#{search.selectedGame}"/>
                        <webuijsf:button actionExpression="#{search.button2_action}" id="button2" style="left: 287px; top: 192px; position: absolute" text="Button"/>
                        <h:selectOneMenu id="dropdown2" style="left: 96px; top: 144px; position: absolute" value="#{search.dropdown2DefaultItems}">
                            <f:selectItems id="dropdown2SelectItems" value="#{search.dropdown2DefaultItems}"/>
                        </h:selectOneMenu>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
