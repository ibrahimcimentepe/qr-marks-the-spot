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
                        <webuijsf:textField columns="36" id="textField1" style="height: 24px; left: 288px; top: 96px; position: absolute; width: 288px"
                            text="#{search.searchString}" valueChangeListenerExpression="#{search.textField1_processValueChange}"/>
                        <webuijsf:button actionExpression="#{search.button1_action}" id="button1"
                            style="height: 24px; left: 527px; top: 96px; position: absolute; width: 71px" text="Search"/>
                        <h:commandButton action="#{search.button2_action}" id="button2"
                            style="height: 24px; left: 528px; top: 216px; position: absolute; width: 72px" value="GO!"/>
                        <h:selectOneMenu id="dropdown1" style="left: 168px; top: 96px; position: absolute; width: 120px">
                            <f:selectItems id="dropdown1SelectItems" value="#{search.dropdown1DefaultItems}"/>
                        </h:selectOneMenu>
                        <h:selectOneMenu id="dropdown2" style="left: 168px; top: 216px; position: absolute; width: 336px">
                            <f:selectItems id="dropdown2SelectItems" value="#{search.dropdown2DefaultItems}"/>
                        </h:selectOneMenu>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
