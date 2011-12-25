<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : profilePage
    Created on : 08.Ara.2011, 02:35:15
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
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: orange; font-size: 24px; height: 46px; left: 24px; top: 24px; position: absolute; width: 262px" text="#{profilePage.title}"/>
                        <webuijsf:textField id="textField1" readOnly="true" style="left: 144px; top: 120px; position: absolute" text="#{profilePage.userName}"/>
                        <webuijsf:label id="label2" style="color: orange; left: 24px; top: 120px; position: absolute" text="USERNAME :"/>
                        <webuijsf:label id="label3" style="color: orange; left: 24px; top: 144px; position: absolute" text="PASSWORD"/>
                        <webuijsf:label id="label4" style="color: orange; left: 24px; top: 168px; position: absolute" text="DATE OF BIRTH :"/>
                        <webuijsf:label id="label5" style="color: orange; left: 24px; top: 192px; position: absolute" text="WEB ADDRESS :"/>
                        <webuijsf:label id="label6" style="color: orange; left: 24px; top: 216px; position: absolute" text="FACEBOOK"/>
                        <webuijsf:textField id="textField2" readOnly="true" style="left: 144px; top: 144px; position: absolute" text="#{profilePage.passWord}" visible="false"/>
                        <webuijsf:textField id="textField3" readOnly="true" style="left: 144px; top: 168px; position: absolute" text="#{profilePage.dateOfBirth}"/>
                        <webuijsf:textField id="textField4" readOnly="true" style="left: 144px; top: 192px; position: absolute" text="#{profilePage.webAddress}"/>
                        <webuijsf:textField id="textField5" readOnly="true" style="left: 144px; top: 216px; position: absolute" text="#{profilePage.facebook}"/>
                        <webuijsf:label id="label7" style="color: orange; left: 24px; top: 240px; position: absolute" text="TWITTER"/>
                        <webuijsf:textField id="textField6" readOnly="true" style="left: 144px; top: 240px; position: absolute" text="#{profilePage.twitter}"/>
                        <webuijsf:button actionExpression="#{profilePage.button1_action}" id="button1"
                            style="color: red; left: 24px; top: 288px; position: absolute" text="Go to Homepage"/>
                        <webuijsf:button actionExpression="#{profilePage.button2_action}" id="button2"
                            style="color: red; left: 143px; top: 288px; position: absolute" text="Sign Out"/>
                        <webuijsf:button actionExpression="#{profilePage.button3_action}" id="button3"
                            style="color: red; left: 215px; top: 288px; position: absolute" text="Edit"/>
                        <webuijsf:hyperlink id="hyperlink1" style="left: 336px; top: 120px; position: absolute" text="Hyperlink"/>
                        <webuijsf:hyperlink id="hyperlink2" style="left: 336px; top: 144px; position: absolute" text="Hyperlink"/>
                        <webuijsf:hyperlink id="hyperlink3" style="position: absolute; left: 336px; top: 168px" text="Hyperlink"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
    <h:panelGrid id="gridPanel1"/>
</jsp:root>
