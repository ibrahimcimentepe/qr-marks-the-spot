<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : signup
    Created on : 18.Kas.2011, 15:42:02
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Sign Up">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" imageURL="resources/logobg.jpg" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="position: absolute; left: 168px; top: 72px" text="User Name"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 168px; top: 96px" text="Password"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 168px; top: 120px" text="Birth Day"/>
                        <webuijsf:textField id="username" required="true" style="left: 288px; top: 72px; position: absolute" text="#{signup.username}"/>
                        <webuijsf:passwordField id="password" password="#{signup.password}" required="true" style="left: 288px; top: 96px; position: absolute"/>
                        <webuijsf:button actionExpression="#{signup.signup_action}" id="signup" style="left: 167px; top: 264px; position: absolute" text="Sign Up"/>
                        <webuijsf:label id="warning1" style="left: 432px; top: 72px; position: absolute" styleClass="errorMessage" text="#{signup.warning}"/>
                        <webuijsf:label id="label4" style="left: 168px; top: 168px; position: absolute" text="Website"/>
                        <webuijsf:label id="label5" style="left: 168px; top: 192px; position: absolute" text="Twitter"/>
                        <webuijsf:label id="label6" style="left: 168px; top: 216px; position: absolute" text="Facebook"/>
                        <webuijsf:label id="label7" style="left: 168px; top: 240px; position: absolute" text="Picture"/>
                        <webuijsf:textField id="website" style="left: 288px; top: 168px; position: absolute" text="#{signup.website}"/>
                        <webuijsf:textField id="twitter" style="left: 288px; top: 192px; position: absolute" text="#{signup.twitter}"/>
                        <webuijsf:textField id="facebook" style="left: 288px; top: 216px; position: absolute" text="#{signup.facebook}"/>
                        <webuijsf:upload id="picture" immediate="true" preservePath="true" style="left: 288px; top: 240px; position: absolute" uploadedFile="#{signup.picture}"/>
                        <webuijsf:calendar id="calendar1" style="left: 288px; top: 120px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
