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
                <webuijsf:body id="body1" imageURL="resources/logobg.jpg" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <table align="center" border="0" width="%90">
                            <tbody>
                                <tr>
                                    <th style="height: 42px"></th>
                                    <th>
                                        <webuijsf:label id="label1"
                                            style="font-family: Geneva,Arial,Helvetica,sans-serif; font-size: 36px; font-weight: bold; text-decoration: underline" text="QR MARKS THE SPOT"/>
                                    </th>
                                    <th align="right"></th>
                                </tr>
                                <tr>
                                    <td style="height: 1px"></td>
                                    <td></td>
                                    <td align="right">
                                        <webuijsf:hyperlink actionExpression="#{home.logoutLink_action}" id="logoutLink" text="Log Out" visible="#{SessionBean1.loggedIn}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 22px">
                                        <webuijsf:label id="label2" text="News Feed"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField id="gameSearchTextField" text="#{home.gameToBePlayed}"/>
                                    </td>
                                    <td align="right">
                                        <webuijsf:button actionExpression="#{home.signup_action}" id="signup" style="height: 24px; width: 80px" text="Sign Up" visible="#{!SessionBean1.loggedIn}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 21px"></td>
                                    <td>
                                        <webuijsf:button actionExpression="#{home.goToGameButton_action}" id="goToGameButton" text="to the game -&gt;"/>
                                    </td>
                                    <td align="right">
                                        <webuijsf:button actionExpression="#{home.login_action}" id="login" style="height: 24px; width: 80px" text="Log In" visible="#{!SessionBean1.loggedIn}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 25px"></td>
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
                        <ul>
                            <li>
                                <webuijsf:label text="#{home.labels[0]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[1]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[2]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[3]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[4]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[5]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[6]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[7]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[8]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[9]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[10]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[11]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[12]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[13]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[14]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[15]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[16]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[17]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[18]}"/>
                            </li>
                            <li>
                                <webuijsf:label text="#{home.labels[19]}"/>
                            </li>
                        </ul>
                        <webuijsf:hyperlink actionExpression="#{home.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 336px; top: 24px; position: absolute; width: 22px" text="#{SessionBean1.effectiveUserName}"/>
                        <br/>
                        <webuijsf:label id="usernameLabel1" style="left: 240px; top: 24px; position: absolute" text="#{SessionBean1.userName}"/>
                        <webuijsf:button actionExpression="#{home.searchButton_action}" id="searchButton1"
                            style="height: 48px; left: 503px; top: 240px; position: absolute; width: 80px" text="Search"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
