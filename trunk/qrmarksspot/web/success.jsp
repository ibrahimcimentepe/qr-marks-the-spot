<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : success
    Created on : 04.Ara.2011, 20:18:41
    Author     : 23
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:link id="link2" url=""/>
                </webuijsf:head>
                <webuijsf:body id="body1" imageURL="resources/success_1.JPG" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1"
                            style="color: orange; font-size: 36px; height: 334px; left: 384px; top: 48px; position: absolute; width: 214px" text="YOU WON!!!"/>
                        <br/>
                        <webuijsf:button actionExpression="#{success.forumButton_action}" id="forumButton"
                            style="font-family: Verdana,Arial,Helvetica,sans-serif; font-size: 24px; height: 72px; left: 143px; top: 192px; position: absolute; width: 240px" text="GO TO FORUM?"/>
                        <webuijsf:label id="label2"
                            style="font-family: 'Georgia','Times New Roman','times',serif; font-size: 18px; left: 96px; top: 144px; position: absolute" text="You Should Share Your Experience!!"/>
                        <webuijsf:label id="label3"
                            style="font-family: 'Georgia','Times New Roman','times',serif; font-size: 18px; left: 624px; top: 144px; position: absolute" text="Live Another Experience!!"/>
                        <webuijsf:button actionExpression="#{success.button1_action}" id="button1"
                            style="font-family: Georgia,'Times New Roman',times,serif; font-size: 24px; height: 72px; left: 624px; top: 192px; position: absolute; width: 263px" text="GO TO HOMEPAGE"/>
                        <webuijsf:label id="label4"
                            style="font-family: 'Georgia','Times New Roman','times',serif; font-size: 18px; left: 432px; top: 288px; position: absolute" text="Wanna quit?"/>
                        <webuijsf:button actionExpression="#{success.button2_action}" id="button2"
                            style="font-family: Georgia,'Times New Roman',times,serif; font-size: 18px; height: 24px; left: 455px; top: 336px; position: absolute; width: 72px" text="Log Out"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
