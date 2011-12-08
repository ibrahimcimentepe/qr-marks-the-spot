<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : messageSent
    Created on : Dec 8, 2011, 7:35:30 AM
    Author     : alke
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
                            style="background-color: rgb(51, 255, 51); color: rgb(255, 0, 0); height: 22px; left: 288px; top: 216px; position: absolute; width: 262px" text="YOUR MESSAGE IS SENT TO ADMINISTRATOR"/>
                        <webuijsf:button actionExpression="#{messageSent.button1_action}" id="button1"
                            style="height: 48px; left: 335px; top: 264px; position: absolute; width: 168px" text="&lt; Back To Home"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
