<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : signup
    Created on : 18.Kas.2011, 15:42:02
    Author     : acar
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Sign Up">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="position: absolute; left: 168px; top: 72px" text="User Name"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 168px; top: 96px" text="Password"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 168px; top: 120px" text="Birth Day"/>
                        <webuijsf:textField id="username" style="left: 288px; top: 72px; position: absolute" text="#{signup.username}"/>
                        <webuijsf:passwordField id="password" password="#{signup.password}" style="left: 288px; top: 96px; position: absolute"/>
                        <webuijsf:calendar id="birthday" selectedDate="#{signup.birthday}" style="left: 288px; top: 120px; position: absolute"/>
                        <webuijsf:button actionExpression="#{signup.signup_action}" id="signup" style="position: absolute; left: 168px; top: 144px" text="Sign Up"/>
                        <webuijsf:label id="warning" style="position: absolute; left: 432px; top: 72px" text="#{signup.warning}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
