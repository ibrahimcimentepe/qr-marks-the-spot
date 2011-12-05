<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : home
    Created on : 18.Kas.2011, 15:40:54
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" imageURL="resources/logo.jpg" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <table align="center" border="0" width="%90">
                            <tbody>
                                <tr>
                                    <th></th>
                                    <th>
                                        <webuijsf:label id="label1"
                                            style="font-family: Geneva,Arial,Helvetica,sans-serif; font-size: 36px; font-weight: bold; text-decoration: underline" text="QR MARKS THE SPOT"/>
                                    </th>
                                    <th align="right">
                                        <webuijsf:label id="usernameLabel" text="#{SessionBean1.userName}"/>
                                    </th>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td align="right">
                                        <webuijsf:hyperlink actionExpression="#{home.logoutLink_action}" id="logoutLink" text="Log Out" visible="#{SessionBean1.loggedIn}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 19px">
                                        <webuijsf:label id="label2" text="News Feed"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField id="gameSearchTextField"/>
                                        <webuijsf:button actionExpression="#{home.searchButton_action}" id="searchButton" style="height: 20px; width: 80px" text="Search"/>
                                    </td>
                                    <td align="right">
                                        <webuijsf:button actionExpression="#{home.signup_action}" id="signup" style="height: 24px; width: 80px" text="Sign Up" visible="#{!SessionBean1.loggedIn}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 14px"></td>
                                    <td></td>
                                    <td align="right">
                                        <webuijsf:button actionExpression="#{home.login_action}" id="login" style="height: 24px; width: 80px" text="Log In" visible="#{!SessionBean1.loggedIn}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 24px"></td>
                                    <td></td>
                                    <td align="right">
                                        <webuijsf:button actionExpression="#{home.tutorial_action}" id="tutorial" style="height: 24px; width: 80px" text="Tutorial"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td align="right">
                                        <webuijsf:button actionExpression="#{home.gameCreateButton_action}" id="gameCreateButton"
                                            style="height: 24px; width: 80px" text="Create Game" visible="#{SessionBean1.loggedIn}"/>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <webuijsf:label id="label3" style="left: 96px; top: 192px; position: absolute" text="#{home.labels[0]}"/>
                        <webuijsf:label id="label4" style="left: 96px; top: 333px; position: absolute" text="#{home.labels[1]}"/>
                        <webuijsf:label id="label5" style="left: 96px; top: 237px; position: absolute" text="#{home.labels[2]}"/>
                        <webuijsf:label id="label6" style="left: 96px; top: 285px; position: absolute" text="#{home.labels[3]}"/>
                        <webuijsf:hyperlink actionExpression="#{home.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 480px; top: 216px; position: absolute; width: 22px" text="#{SessionBean1.effectiveUserName}"/>
                        <br/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
