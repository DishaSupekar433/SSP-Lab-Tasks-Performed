package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?> 
	<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"   
	xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee   
	http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">  
	    
	  <servlet>  
	    <description></description>  
	    <display-name>LoginServlet</display-name>  
	    <servlet-name>LoginServlet</servlet-name>  
	    <servlet-class>LoginServlet</servlet-class>  
	  </servlet>  
	  <servlet-mapping>  
	    <servlet-name>LoginServlet</servlet-name>  
	    <url-pattern>/LoginServlet</url-pattern>  
	  </servlet-mapping>  
	  <servlet>  
	    <description></description>  
	    <display-name>ProfileServlet</display-name>  
	    <servlet-name>ProfileServlet</servlet-name>  
	    <servlet-class>ProfileServlet</servlet-class>  
	  </servlet>  
	  <servlet-mapping>  
	    <servlet-name>ProfileServlet</servlet-name>  
	    <url-pattern>/ProfileServlet</url-pattern>  
	  </servlet-mapping>  
	  <servlet>  
	    <description></description>  
	    <display-name>LogoutServlet</display-name>  
	    <servlet-name>LogoutServlet</servlet-name>  
	    <servlet-class>LogoutServlet</servlet-class>  
	  </servlet>  
	  <servlet-mapping>  
	    <servlet-name>LogoutServlet</servlet-name>  
	    <url-pattern>/LogoutServlet</url-pattern>  
	  </servlet-mapping>  
	</web-app>  
	
}

