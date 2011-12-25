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
                        <webuijsf:textField columns="36" id="textField1" style="height: 24px; left: 288px; top: 96px; position: absolute; width: 288px" text="#{search.searchString}"/>
                        <webuijsf:button actionExpression="#{search.button1_action}" id="button1"
                            style="height: 24px; left: 527px; top: 96px; position: absolute; width: 71px" text="Search"/>
                        <webuijsf:hyperlink actionExpression="#{search.hyperlink1_action}" id="hyperlink1" style="left: 672px; top: 96px; position: absolute" text="#{search.gamename1}"/>
                        <webuijsf:hyperlink actionExpression="#{search.hyperlink2_action}" id="hyperlink2" style="left: 672px; top: 120px; position: absolute" text="#{search.gamename2}"/>
                        <webuijsf:hyperlink actionExpression="#{search.hyperlink3_action}" id="hyperlink3" style="left: 672px; top: 144px; position: absolute" text="#{search.gamename3}"/>
                        <h:selectOneMenu id="dropdown2" style="height: 24px; left: 120px; top: 96px; position: absolute; width: 144px"
                            value="#{search.criteria}" valueChangeListener="#{search.dropdown2_processValueChange}">
                            <f:selectItems id="dropdown1SelectItems" value="#{search.dropdownDefaultItems}"/>
                        </h:selectOneMenu>
                        <h:commandButton action="#{search.button2_action}" id="button2"
                            style="height: 24px; left: 528px; top: 216px; position: absolute; width: 72px" value="GO!"/>
                        <h:selectOneMenu id="dropdown1" style="height: 24px; left: 120px; top: 216px; position: absolute; width: 384px" valueChangeListener="#{search.dropdown1_processValueChange}">
                            <f:selectItems id="dropdown1SelectItems1" value="#{search.dropdown1DefaultItems}"/>
                        </h:selectOneMenu>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
