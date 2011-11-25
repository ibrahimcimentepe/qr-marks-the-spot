<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : createGame
    Created on : Nov 25, 2011, 4:46:34 AM
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
                        <webuijsf:label id="label1" style="height: 22px; left: 192px; top: 144px; position: absolute; width: 96px" text="Game name       :"/>
                        <webuijsf:textField columns="50" id="textField1" style="left: 384px; top: 144px; position: absolute"/>
                        <webuijsf:textArea columns="47" id="textArea1" rows="10" style="border-width: 8px; left: 384px; top: 168px; position: absolute"/>
                        <webuijsf:label id="label3" style="height: 22px; left: 192px; top: 336px; position: absolute; width: 166px" text="Starting point of the game                          :"/>
                        <webuijsf:textField columns="50" id="textField2" style="position: absolute; left: 384px; top: 336px"/>
                        <webuijsf:label id="label4" style="height: 22px; left: 192px; top: 360px; position: absolute; width: 166px" text="Borders                                                         :"/>
                        <webuijsf:label id="label2" style="height: 22px; left: 192px; top: 168px; position: absolute; width: 96px" text="Description :"/>
                        <webuijsf:textArea columns="47" id="textArea2" style="position: absolute; left: 384px; top: 360px"/>
                        <webuijsf:label id="label6" style="height: 24px; left: 192px; top: 432px; position: absolute; width: 166px" text="Tags:"/>
                        <webuijsf:textField id="textField3" style="left: 384px; top: 432px; position: absolute"/>
                        <br style="left: 480px; top: 72px; position: absolute"/>
                        <webuijsf:textField id="textField5" style="left: 384px; top: 456px; position: absolute"/>
                        <webuijsf:textField id="textField6" style="left: 384px; top: 480px; position: absolute"/>
                        <webuijsf:textField id="textField7" style="left: 384px; top: 504px; position: absolute"/>
                        <webuijsf:textField id="textField8" style="left: 384px; top: 528px; position: absolute"/>
                        <webuijsf:button actionExpression="#{createGame.button1_action}" id="button1"
                            style="height: 24px; left: 599px; top: 552px; position: absolute; width: 96px" text="Next &gt;"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
