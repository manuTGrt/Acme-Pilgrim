<%--
 * list.routes.jsp
 *
 * Copyright (C) 2018 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl"	uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<p><spring:message code="administrator.list.stages" /></p>

<!-- Listing grid -->

<display:table pagesize="5" class="displaytag" keepStatus="true"
  	name="stages" requestURI="${requestURI}" id="row">  
	
 <!-- Attributes --> 

	<spring:message code="stages.name" var="nameHeader" />
	<display:column property="name" title="${nameHeader}" sortable="true" />
	
	<spring:message code="stages.description" var="descriptionHeader" />
	<display:column property="description" title="${descriptionHeader}" sortable="true" />
	
	<spring:message code="stages.length" var="lengthHeader" />
	<display:column property="length" title="${lengthHeader}" sortable="true" />
	
	<spring:message code="stages.difficultyLevel" var="difficultyLevelHeader" />
	<display:column property="difficultyLevel" title="${difficultyLevelHeader}" sortable="true" />
	
	
</display:table>
