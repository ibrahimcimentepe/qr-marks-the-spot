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
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 336px; top: 240px"
                            title="buna nasil bind ederiz? bilal yardım" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{adminPage.mygames}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="borders" id="tableColumn1" sort="borders">
                                    <webuijsf:message id="message1"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="createrId" id="tableColumn2" sort="createrId">
                                    <webuijsf:label id="label2" text="#{currentRow.value['createrId']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="creatorName" id="tableColumn3" sort="creatorName">
                                    <webuijsf:textArea id="textArea1" text="#{currentRow.value['creatorName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="currentStep" id="tableColumn4" sort="currentStep">
                                    <webuijsf:button id="button1" text="#{currentRow.value['currentStep']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="description" id="tableColumn5" sort="description">
                                    <webuijsf:imageHyperlink id="imageHyperlink1" text="#{currentRow.value['description']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="gameId" id="tableColumn6" sort="gameId">
                                    <webuijsf:textArea id="textArea2" text="#{currentRow.value['gameId']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="gameName" id="tableColumn7" sort="gameName">
                                    <webuijsf:radioButton id="radioButton1" label="#{currentRow.value['gameName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="isFinished" id="tableColumn8" sort="isFinished">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['isFinished']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="numberOfPlayers" id="tableColumn9" sort="numberOfPlayers">
                                    <webuijsf:staticText id="staticText9" text="#{currentRow.value['numberOfPlayers']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="numberOfSteps" id="tableColumn10" sort="numberOfSteps">
                                    <webuijsf:staticText id="staticText10" text="#{currentRow.value['numberOfSteps']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="rating" id="tableColumn11" sort="rating">
                                    <webuijsf:staticText id="staticText11" text="#{currentRow.value['rating']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="startLocation" id="tableColumn12" sort="startLocation">
                                    <webuijsf:staticText id="staticText12" text="#{currentRow.value['startLocation']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <h:dataTable headerClass="list-header" id="dataTable1" rowClasses="list-row-even,list-row-odd"
                            style="position: absolute; left: 456px; top: 408px" value="#{adminPage.mygames}" var="currentRow">
                            <h:column id="column1">
                                <h:outputText id="outputText1" value="#{currentRow['COLUMN1']}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText2" value="column1"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column2">
                                <h:outputText id="outputText3" value="#{currentRow['COLUMN2']}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText4" value="column2"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column3">
                                <h:outputText id="outputText5" value="#{currentRow['COLUMN3']}"/>
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
