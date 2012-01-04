<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : profile
    Created on : 04.Oca.2012, 03:07:51
    Author     : 23
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: orange; font-size: 24px; height: 46px; left: 48px; top: 48px; position: absolute; width: 262px" text="#{profile.title}"/>
                        <webuijsf:textField columns="30" id="textField1" readOnly="true" style="left: 168px; top: 120px; position: absolute" text="#{profile.username}"/>
                        <webuijsf:label id="label2" style="color: orange; left: 48px; top: 120px; position: absolute" text="USERNAME :"/>
                        <webuijsf:label id="label3" style="color: orange; left: 48px; top: 144px; position: absolute" text="PASSWORD :"/>
                        <webuijsf:label id="label4" style="color: orange; left: 48px; top: 168px; position: absolute" text="DATE OF BIRTH :"/>
                        <webuijsf:label id="label5" style="color: orange; left: 48px; top: 192px; position: absolute" text="WEB ADDRESS :"/>
                        <webuijsf:label id="label6" style="color: orange; left: 48px; top: 216px; position: absolute" text="FACEBOOK :"/>
                        <webuijsf:textField columns="30" id="textField2" readOnly="true" style="left: 168px; top: 144px; position: absolute" text="#{profile.password}"/>
                        <webuijsf:textField columns="30" id="textField3" readOnly="true" style="left: 168px; top: 168px; position: absolute" text="#{profile.date}"/>
                        <webuijsf:textField columns="30" id="textField4" readOnly="true" style="left: 168px; top: 192px; position: absolute" text="#{profile.web}"/>
                        <webuijsf:textField columns="30" id="textField5" readOnly="true" style="left: 168px; top: 216px; position: absolute" text="#{profile.facebook}"/>
                        <webuijsf:label id="label7" style="color: orange; left: 48px; top: 240px; position: absolute" text="TWITTER :"/>
                        <webuijsf:textField columns="30" id="textField6" readOnly="true" style="left: 168px; top: 240px; position: absolute" text="#{profile.twitter}"/>
                        <webuijsf:button actionExpression="#{profile.button1_action}" id="button1"
                            style="color: red; left: 47px; top: 288px; position: absolute" text="Go to Homepage"/>
                        <webuijsf:button actionExpression="#{profile.button2_action}" id="button2"
                            style="color: red; left: 167px; top: 288px; position: absolute" text="Sign Out"/>
                        <webuijsf:button actionExpression="#{profile.button3_action}" id="button3"
                            style="color: red; left: 239px; top: 288px; position: absolute" text="Edit"/>
                        <webuijsf:label id="label8" style="color: orange; height: 24px; left: 624px; top: 120px; position: absolute; width: 238px" text="Currently Being Played Games"/>
                        <h:selectOneMenu id="dropdown1" style="height: 24px; left: 624px; top: 144px; position: absolute; width: 240px">
                            <f:selectItems id="dropdown1SelectItems" value="#{profile.dropdown1DefaultItems}"/>
                        </h:selectOneMenu>
                        <webuijsf:button actionExpression="#{profile.button4_action}" id="button4"
                            style="height: 24px; left: 551px; top: 240px; position: absolute; width: 96px" text="Apply Changes" visible="#{profile.apply_visible}"/>
                        <webuijsf:textField columns="30" id="textField7" style="left: 360px; top: 120px; position: absolute" text="#{profile.newUsername}" visible="#{profile.apply_visible}"/>
                        <webuijsf:textField columns="30" id="textField8" style="left: 360px; top: 144px; position: absolute" text="#{profile.newPassword}" visible="#{profile.apply_visible}"/>
                        <webuijsf:textField columns="30" id="textField9" style="left: 360px; top: 168px; position: absolute" text="#{profile.newDate}" visible="#{profile.apply_visible}"/>
                        <webuijsf:textField columns="30" id="textField10" style="left: 360px; top: 192px; position: absolute" text="#{profile.newWeb}" visible="#{profile.apply_visible}"/>
                        <webuijsf:textField columns="30" id="textField11" style="left: 360px; top: 216px; position: absolute" text="#{profile.newFacebook}" visible="#{profile.apply_visible}"/>
                        <webuijsf:textField columns="30" id="textField12" style="left: 360px; top: 240px; position: absolute" text="#{profile.newTwitter}" visible="#{profile.apply_visible}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
