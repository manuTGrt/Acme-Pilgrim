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

<p><spring:message code="administrator.list.routes" /></p>

<!-- Listing grid -->

<display:table pagesize="5" class="displaytag" keepStatus="true"
  	name="routes" requestURI="administrator/list-routes.do" id="row">  
	
 <!-- Attributes --> 

	<spring:message code="routes.name" var="nameHeader" />
	<display:column property="name" title="${nameHeader}" sortable="true" />
	
	<spring:message code="routes.description" var="descriptionHeader" />
	<display:column property="description" title="${descriptionHeader}" sortable="true" />

	<spring:message code="routes.mediaEvalDificultad" var="mediaEvalDificultadHeader" />
	<display:column property="mediaEvalDificultad" title="${mediaEvalDificultadHeader}" sortable="true" />

	<spring:message code="routes.mediaEvalDuracion" var="mediaEvalDuracionHeader" />
	<display:column property="mediaEvalDuracion" title="${mediaEvalDuracionHeader}" sortable="true" />

	<spring:message code="routes.visible" var="visibleHeader" />
	<display:column property="visible" title="${visibleHeader}"	sortable="false" />
	
</display:table>
