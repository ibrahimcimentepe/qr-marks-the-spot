<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : login
    Created on : 18.Kas.2011, 15:41:52
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Log In">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" imageURL="resources/logobg.jpg" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="color: orange; left: 216px; top: 96px; position: absolute" text="User Name"/>
                        <webuijsf:label id="label2" style="color: orange; left: 216px; top: 120px; position: absolute" text="Password"/>
                        <webuijsf:textField id="username" style="position: absolute; left: 312px; top: 96px" text="#{login.username}"/>
                        <webuijsf:passwordField id="password" password="#{login.password}" style="position: absolute; left: 312px; top: 120px"/>
                        <webuijsf:button actionExpression="#{login.login_action}" id="login" style="color: red; left: 216px; top: 144px; position: absolute" text="Login"/>
                        <webuijsf:label id="warning1" style="position: absolute; left: 216px; top: 168px" styleClass="errorMessage" text="#{login.warning}"/>
                        <webuijsf:button actionExpression="#{login.homepage_action}" id="homepage"
                            style="height: 24px; left: 311px; top: 144px; position: absolute; width: 120px" text="Return to Homepage"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
