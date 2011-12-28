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
                        <webuijsf:textField columns="47" id="textField1" style="height: 24px; left: 120px; top: 96px; position: absolute; width: 288px" text="#{search.searchString}"/>
                        <webuijsf:button actionExpression="#{search.button1_action}" id="button1"
                            style="color: red; height: 24px; left: 455px; top: 96px; position: absolute; width: 71px" text="Search"/>
                        <webuijsf:hyperlink actionExpression="#{search.hyperlink1_action}" id="hyperlink1" style="position: absolute; left: 120px; top: 216px" text="#{search.gamename1}"/>
                        <webuijsf:hyperlink actionExpression="#{search.hyperlink2_action}" id="hyperlink2" style="position: absolute; left: 120px; top: 264px" text="#{search.gamename2}"/>
                        <webuijsf:hyperlink actionExpression="#{search.hyperlink3_action}" id="hyperlink3" style="position: absolute; left: 120px; top: 312px" text="#{search.gamename3}"/>
                        <webuijsf:listbox id="listbox1" items="#{search.myList}" style="left: 456px; top: 192px; position: absolute" valueChangeListenerExpression="#{search.listbox1_processValueChange}"/>
                        <webuijsf:button actionExpression="#{search.homeButton_action}" id="homeButton"
                            style="color: red; height: 24px; left: 23px; top: 24px; position: absolute; width: 95px" text="&lt; Go to home "/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
