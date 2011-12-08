<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : abusementMessage
    Created on : Dec 8, 2011, 7:01:39 AM
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
                        <webuijsf:label id="label1" style="color: orange; height: 24px; left: 96px; top: 168px; position: absolute" text="Your message to administrator: "/>
                        <webuijsf:textArea columns="100" id="textArea1" rows="30" style="position: absolute; left: 336px; top: 168px" text="#{abusementMessage.abuseMessage}"/>
                        <webuijsf:button actionExpression="#{abusementMessage.buttonSendMessage_action}" id="buttonSendMessage"
                            style="height: 24px; left: 815px; top: 624px; position: absolute; width: 139px" text="Send"/>
                        <webuijsf:button actionExpression="#{abusementMessage.button1_action}" id="button1"
                            style="height: 24px; left: 96px; top: 96px; position: absolute; width: 95px" text="&lt; Back to home"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
