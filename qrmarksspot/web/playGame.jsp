<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : playGame
    Created on : 04.Ara.2011, 18:55:23
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
                        <webuijsf:label id="label1" style="height: 24px; left: 72px; top: 48px; position: absolute; width: 384px" text="Name Of The Game!!"/>
                        <webuijsf:label id="label2" style="height: 24px; left: 72px; top: 96px; position: absolute; width: 384px" text="You are currently in Step #n"/>
                        <webuijsf:label id="label3" style="height: 24px; left: 72px; top: 144px; position: absolute; width: 384px" text="Information related to next target is given below!"/>
                        <webuijsf:textArea id="textArea1" style="height: 96px; left: 72px; top: 192px; position: absolute; width: 408px"/>
                        <webuijsf:textField id="textField1" style="position: absolute; left: 144px; top: 312px; width: 240px; height: 24px"/>
                        <webuijsf:label id="label4" style="height: 22px; left: 72px; top: 312px; position: absolute; width: 70px" text="Password:"/>
                        <webuijsf:button id="button1" style="height: 24px; left: 383px; top: 312px; position: absolute; width: 72px" text="GO"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
