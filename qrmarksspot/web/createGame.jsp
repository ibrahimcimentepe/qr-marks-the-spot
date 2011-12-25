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
                <webuijsf:body id="body1" imageURL="resources/logobg.jpg" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="color: orange; height: 22px; left: 192px; top: 144px; position: absolute; width: 96px" text="Game name       :"/>
                        <webuijsf:textField columns="50" id="gameName" required="true" style="left: 384px; top: 144px; position: absolute" text="#{createGame.gameName}"/>
                        <webuijsf:textArea columns="47" id="gameDescription" required="true" rows="10"
                            style="border-width: 8px; left: 384px; top: 168px; position: absolute" text="#{createGame.description}"/>
                        <webuijsf:label id="label3" style="color: orange; height: 22px; left: 192px; top: 336px; position: absolute; width: 166px" text="Starting point of the game                          :"/>
                        <webuijsf:textField columns="50" id="startingPoint" required="true" style="position: absolute; left: 384px; top: 336px" text="#{createGame.startingPoint}"/>
                        <webuijsf:label id="label4" style="color: orange; height: 22px; left: 192px; top: 360px; position: absolute; width: 166px" text="Borders                                                         :"/>
                        <webuijsf:label id="label2" style="color: orange; height: 22px; left: 192px; top: 168px; position: absolute; width: 96px" text="Description :"/>
                        <webuijsf:textArea columns="47" id="borders" required="true" style="position: absolute; left: 384px; top: 360px" text="#{createGame.borders}"/>
                        <webuijsf:label id="label6" style="color: orange; height: 24px; left: 192px; top: 432px; position: absolute; width: 166px" text="Tags:"/>
                        <webuijsf:textField id="tag1" style="left: 384px; top: 432px; position: absolute" text="#{createGame.tag1}"/>
                        <br style="left: 480px; top: 72px; position: absolute"/>
                        <webuijsf:textField id="tag2" style="left: 384px; top: 456px; position: absolute" text="#{createGame.tag2}"/>
                        <webuijsf:textField id="tag3" style="left: 384px; top: 480px; position: absolute" text="#{createGame.tag3}"/>
                        <webuijsf:textField id="tag4" style="left: 384px; top: 504px; position: absolute" text="#{createGame.tag4}"/>
                        <webuijsf:textField id="tag5" style="left: 384px; top: 528px; position: absolute" text="#{createGame.tag5}"/>
                        <webuijsf:button actionExpression="#{createGame.nextButtonOfCreateGame_action}" id="nextButtonOfCreateGame"
                            style="color: red; height: 24px; left: 599px; top: 600px; position: absolute; width: 96px" text="Next &gt;"/>
                        <webuijsf:label id="label5" style="color: orange; height: 24px; left: 192px; top: 576px; position: absolute" text="Number of steps in this game:"/>
                        <webuijsf:textField id="numberOfSteps" required="true" style="left: 384px; top: 576px; position: absolute" text="#{createGame.numberOfSteps}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
