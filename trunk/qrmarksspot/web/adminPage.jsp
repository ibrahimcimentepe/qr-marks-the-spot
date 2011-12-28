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
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 144px; top: 168px; position: absolute; width: 450px" title="Table" width="450">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{adminPage.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="column1" id="tableColumn1" sort="column1">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="column2" id="tableColumn2" sort="column2">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="column3" id="tableColumn3" sort="column3">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:table augmentTitle="false" id="table2" style="left: 168px; top: 192px; position: absolute; width: 450px"
                            title="buna nasil bind ederiz??bilal yardim" width="450">
                            <webuijsf:tableRowGroup id="tableRowGroup2" rows="10" sourceData="#{adminPage.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="column1" id="tableColumn4" sort="column1">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="column2" id="tableColumn5" sort="column2">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="column3" id="tableColumn6" sort="column3">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
