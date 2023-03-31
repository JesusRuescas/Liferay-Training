<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>



<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib prefix="aui" uri="http://liferay.com/tld/qui" %> 
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay" %> 
<%@ taglib prefix= "Liferay-item-selector" uri="http://Liferay.com/item-selector"%> 
<%@ taglib prefix="Liferay-frontend" uri="http://Liferay.com/tld/frontend" %> 
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %> 
<%@ taglib prefix= "Liferay-theme" uri="http://liferay.com/tld/theme" %> 
<%@ taglib prefix= "Liferay-ui" uri="http://Liferay.com/tld/ui" %>

<%@ page import="java.util.Date" %>
<%@ page import="javax.portlet.WindowState"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil "%> 
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%> 
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil "%>
<%@ page import="com.liferay.training.gradebook.model.Assignment "%>
<%@ page import="com.liferay.training.gradebook.web.constants.MVCCommandNames "%>

<liferay-frontend: defineObjects />
<liferay-theme: defineObjects />
<portlet:defineObjects />
<liferay-theme:defineObjects />
<portlet:defineObjects />