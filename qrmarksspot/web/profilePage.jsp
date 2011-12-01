<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : profilePage
    Created on : 27.Kas.2011, 17:21:10
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
                        <webuijsf:label id="label1" style="font-size: 24px; height: 22px; left: 24px; top: 24px; position: absolute; width: 118px" text="Welcome"/>
                        <webuijsf:label id="label2" style="height: 24px; left: 24px; top: 144px; position: absolute; width: 168px" text="User Name :"/>
                        <webuijsf:label for="textField2" id="label3" style="left: 24px; top: 168px; position: absolute; width: 168px" text="Location :"/>
                        <webuijsf:label id="label4" style="left: 24px; top: 192px; position: absolute; width: 168px" text="Date of Birth :"/>
                        <webuijsf:button actionExpression="#{profilePage.editButton_action}" id="editButton" style="left: 23px; top: 312px; position: absolute" text="Edit Profile"/>
                        <webuijsf:button actionExpression="#{profilePage.homePageButton_action}" id="homePageButton"
                            style="left: 119px; top: 312px; position: absolute" text="Go to Homepage"/>
                        <webuijsf:button actionExpression="#{profilePage.signOutButton_action}" id="signOutButton"
                            style="left: 239px; top: 312px; position: absolute" text="Sign Out"/>
                        <webuijsf:label id="nameLabel" style="font-size: 24px; height: 24px; left: 144px; top: 24px; position: absolute; width: 120px" text="#{profilePage.nameSurname}"/>
                        <webuijsf:image id="image1" style="left: 432px; top: 96px; position: absolute"/>
                        <webuijsf:label id="label5" style="position: absolute; left: 24px; top: 216px" text="Facebook account : "/>
                        <webuijsf:label id="label6" style="position: absolute; left: 24px; top: 240px" text="Twitter acount : "/>
                        <webuijsf:textField id="textField1" style="left: 192px; top: 144px; position: absolute" text="#{profilePage.userName1}"/>
                        <webuijsf:textField id="textField2" style="position: absolute; left: 192px; top: 168px" text="#{profilePage.location}"/>
                        <webuijsf:textField id="textField3" style="position: absolute; left: 192px; top: 192px" text="#{profilePage.dateOfBirth}"/>
                        <webuijsf:textField id="textField4" style="position: absolute; left: 192px; top: 216px" text="#{profilePage.faceAccount}"/>
                        <webuijsf:textField id="textField5" style="position: absolute; left: 192px; top: 240px" text="#{profilePage.twitterAccount}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
