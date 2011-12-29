<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : tutorial
    Created on : Dec 29, 2011, 8:55:58 AM
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
                        <h:graphicImage id="image1" style="left: 216px; top: 96px; position: absolute" value="/resources/tutoryal.jpg"/>
                        <webuijsf:button actionExpression="#{tutorial.backButton_action}" id="backButton"
                            style="color: red; height: 24px; left: 359px; top: 48px; position: absolute; width: 527px" text="&lt;&lt;  BACK  TO   HOME    "/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
