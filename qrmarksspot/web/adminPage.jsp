<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : adminPage
    Created on : Dec 25, 2011, 9:16:11 PM
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
                        <webuijsf:label id="label1" style="color: orange; height: 24px; left: 120px; top: 72px; position: absolute" text="Welcome to Administration page"/>
                        <h:dataTable headerClass="list-header" id="dataTable1" rowClasses="list-row-even,list-row-odd"
                            style="position: absolute; left: 360px; top: 192px" value="#{adminPage.mygames}" var="currentRow">
                            <h:column id="column2">
                                <h:outputText id="outputText3" value="#{currentRow.GameName}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText4" value="column2"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column3">
                                <h:outputText id="outputText5" value="#{currentRow.Description}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText6" value="column3"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
