<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : adminPage
    Created on : Dec 28, 2011, 7:15:28 PM
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
                        <webuijsf:label id="label1" style="color: orange; left: 72px; top: 96px; position: absolute" text="Welcome to administration page"/>
                        <webuijsf:listbox id="listbox1" items="#{SessionBean1.userName}" style="left: 24px; top: 144px; position: absolute"/>
                        <webuijsf:table augmentTitle="false" id="table1" paginateButton="true" paginationControls="true"
                            style="left: 144px; top: 144px; position: absolute; width: 450px" title="Table" width="258">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{adminPage.mygames}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="gameName" id="tableColumn4" sort="gameName">
                                    <webuijsf:label id="label2" text="#{currentRow.value['gameName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="createrId" id="tableColumn5" sort="createrId">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['createrId']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="creatorName" id="tableColumn6" sort="creatorName">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['creatorName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="currentStep" id="tableColumn7" sort="currentStep">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['currentStep']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="description" id="tableColumn8" sort="description">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['description']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
