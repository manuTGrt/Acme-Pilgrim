<%--
 * list-actors.jsp
 *
 * Copyright (C) 2018 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<p><spring:message code="administrator.list.actors" /></p>

<!-- Listing grid -->

<display:table pagesize="5" class="displaytag" keepStatus="true"
 	name="actors" requestURI="administrator/list-actors.do" id="row"> 
	
<!-- Attributes -->

	<spring:message code="actor.name" var="nameHeader" />
	<display:column property="name" title="${nameHeader}" sortable="true" />
	
	<spring:message code="actor.surname" var="surnameHeader" />
	<display:column property="surname" title="${surnameHeader}" sortable="true" />

	<spring:message code="actor.email" var="emailHeader" />
	<display:column property="email" title="${emailHeader}" sortable="true" />

	<spring:message code="actor.contactPhone" var="contactPhoneHeader" />
	<display:column property="contactPhone" title="${contactPhoneHeader}" sortable="true" />

	<spring:message code="actor.url" var="urlHeader" />
	<display:column property="url" title="${urlHeader}"	sortable="false" />
	
	<spring:message code="actor.nationality" var="nationalityHeader" />
	<display:column property="nationality" title="${nationalityHeader}"	sortable="false" />
	
	<spring:message code="actor.birthDates" var="birthDatesHeader" />
	<display:column property="birthDates" title="${birthDatesHeader}"	sortable="false" />

</display:table>
