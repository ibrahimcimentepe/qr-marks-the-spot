<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : home
    Created on : 18.Kas.2011, 15:40:54
    Author     : acar
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
                        <webuijsf:label id="label1" style="left: 336px; top: 48px; position: absolute" text="QR MARKS THE SPOT"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 168px; top: 96px" text="News Feed"/>
                        <webuijsf:button actionExpression="#{home.signup_action}" id="signup" style="left: 504px; top: 96px; position: absolute; width: 71px" text="Sign Up"/>
                        <webuijsf:button actionExpression="#{home.login_action}" id="login" style="left: 504px; top: 120px; position: absolute; width: 71px" text="Log In"/>
                        <webuijsf:button actionExpression="#{home.tutorial_action}" id="tutorial"
                            style="left: 504px; top: 144px; position: absolute; width: 71px" text="Tutorial"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
