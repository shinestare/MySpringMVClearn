package com.test;

/**
 * 
 * @author wangjian31
 *
 */
public class IntroductionMain {
	/**
	 * Spring web MVC����ṩ��MVC(ģ�� - ��ͼ - ������)�ܹ������ڿ���������ɢ��ϵ�WebӦ�ó���������
	 *  MVCģʽ����Ӧ�ó���Ĳ�ͬ����(�����߼���ҵ���߼���UI�߼�)���룬ͬʱ�ṩ��ЩԪ��֮�����ɢ��ϡ�
	 *  	ģ��(Model)��װ��Ӧ�ó������ݣ�ͨ�����ǽ���POJO����ɡ�
	 *  	��ͼ(View)������Ⱦģ�����ݣ�һ����˵�����ɿͻ�����������Խ���HTML�����
	 *  	������(Controller)�������û����󲢹����ʵ���ģ�ͣ������䴫�ݸ���ͼ������Ⱦ��
	 */
	/**
	 * DispatcherServlet�����
	 * Spring Webģ�� - ��ͼ - ������(MVC)�����Χ��DispatcherServlet��Ƶģ����������е�HTTP�������Ӧ�� 
	 * �����Ƕ�Ӧ�ڵ�DispatcherServlet�Ĵ���HTTP������¼�˳��
	 * 	1���ڽ��յ�HTTP�����DispatcherServlet���ѯHandlerMapping�Ե�����Ӧ��Controller��
	 * 	2��Controller�������󲢸���ʹ�õ�GET��POST����������Ӧ�ķ��񷽷��� ���񷽷������ڶ����ҵ���߼�����ģ�����ݣ�������ͼ���Ʒ��ظ�DispatcherServlet��
	 * 	3��DispatcherServlet����ViewResolver��ȡ����Ķ�����ͼ��
	 * 	4������ͼ��ɣ�DispatcherServlet��ģ�����ݴ��ݵ����յ���ͼ������������ϳ��֡�
	 * ���������������: HandlerMapping��Controller��ViewResolver��WebApplicationContext��һ���֣�������ͨApplicationContext����չ������WebӦ�ó��������һЩ���⹦�ܡ�
	 */
	/**
	 * ���������
	 * ��Ҫͨ��ʹ��web.xml�ļ��е�URLӳ����ӳ��ϣ��DispatcherServlet��������� 
	 * ������һ��ʾ������ʾHelloWeb DispatcherServletʾ����������ӳ�䣺
	 * <web-app id="WebApp_ID" version="2.4"
		    xmlns="http://java.sun.com/xml/ns/j2ee" 
		    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		    xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
		    http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
		
		    <display-name>Spring MVC Application</display-name>
		
		   <servlet>
		      <servlet-name>HelloWeb</servlet-name>
		      <servlet-class>
		         org.springframework.web.servlet.DispatcherServlet
		      </servlet-class>
		      <load-on-startup>1</load-on-startup>
		   </servlet>
		
		   <servlet-mapping>
		      <servlet-name>HelloWeb</servlet-name>
		      <url-pattern>*.jsp</url-pattern>
		   </servlet-mapping>
		
		</web-app>
		
		˵����web.xml�ļ�������WebӦ�ó����WebContent/WEB-INFĿ¼��
		��HelloWeb DispatcherServlet��ʼ��ʱ����ܽ����Դ�λ��Ӧ�ó����WebContent/WEB-INFĿ¼�е���Ϊ[servlet-name]-servlet.xml���ļ�����Ӧ�ó��������ġ�
		�����ʾ���У�ʹ�õ��ļ�����HelloWeb-servlet.xml��
		��������<servlet-mapping>���ָʾ��ЩURL����DispatcherServlet���� ����������.jsp��β��HTTP���󶼽���HelloWeb DispatcherServlet����
		�������ʹ��Ĭ���ļ���Ϊ[servlet-name]-servlet.xml��Ĭ��λ��ΪWebContent/WEB-INF������ͨ����web.xml�ļ������servlet������ContextLoaderListener���Զ�����ļ�����λ�� ���£�
		<web-app...>
			<!-------- DispatcherServlet definition goes here----->
			....
			<context-param>
			   <param-name>contextConfigLocation</param-name>
			   <param-value>/WEB-INF/HelloWeb-servlet.xml</param-value>
			</context-param>
			
			<listener>
			   <listener-class>
			      org.springframework.web.context.ContextLoaderListener
			   </listener-class>
			</listener>
		</web-app>
		
		����������HelloWeb-servlet.xml�ļ��ı������ã�����WebӦ�ó����WebContent/WEB-INFĿ¼�У�
		
		<beans xmlns="http://www.springframework.org/schema/beans"
		   xmlns:context="http://www.springframework.org/schema/context"
		   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		   xsi:schemaLocation="
		   http://www.springframework.org/schema/beans     
		   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
		   http://www.springframework.org/schema/context 
		   http://www.springframework.org/schema/context/spring-context-3.0.xsd">
		
		   <context:component-scan base-package="com.yiibai" />
		
		   <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		      <property name="prefix" value="/WEB-INF/jsp/" />
		      <property name="suffix" value=".jsp" />
		   </bean>
		</beans>
		
		�������й�HelloWeb-servlet.xml�ļ����ص�˵����
			1��[servlet-name]-servlet.xml�ļ������ڴ��������bean�����Ḳ����ȫ�ַ�Χ��ʹ����ͬ���ƶ�����κ�bean�Ķ��塣
			2��<context��component-scan ...>��ǩ�����ڼ���Spring MVCע��ɨ�蹦�ܣ�����ʹ��@Controller��@RequestMapping��ע�͡�
			3��InternalResourceViewResolver���������ڽ�����ͼ���ƵĹ���
		�������涨��Ĺ���hello���߼���ͼ��ί�и�λ��/WEB-INF/jsp/hello.jsp�����ͼ��ʵ�֡���һ�ڽ���ʾ��δ���ʵ�������������������ģ�ͺ���ͼ��
	 */
	
	/**
	 * ���������
	 * DispatcherServlet������ί�ɸ���������ִ���ض�����Ĺ��ܡ� @Controllerע��ָʾ�ض���䵱�������Ľ�ɫ��@RequestMappingע�����ڽ�URLӳ�䵽��������ض�������򷽷���
	 * 	@Controller
		@RequestMapping("/hello")
		public class HelloController{
		   @RequestMapping(method = RequestMethod.GET)
		   public String printHello(ModelMap model) {
		      model.addAttribute("message", "Hello Spring MVC Framework!");
		      return "hello";
		   }
		}
		
		˵����@Controllerע�ͽ��ඨ��ΪSpring MVC��������
			����@RequestMapping�ĵ�һ���÷���ʾ�˿������ϵ����д���������/hello·����ء� 
			��һ��ע��@RequestMapping(method = RequestMethod.GET)��������printHello()������Ϊ��������Ĭ�Ϸ��񷽷�������HTTP GET����
			���Զ�����һ������������ͬһURL���κ�POST����
		��������һ����ʽ������Ŀ������б�д����@RequestMapping������������ԣ�������ʾ��
		
			@Controller
			public class HelloController{
			
			   @RequestMapping(value = "/hello", method = RequestMethod.GET)
			   public String printHello(ModelMap model) {
			      model.addAttribute("message", "Hello Spring MVC Framework!");
			      return "hello";
			   }
			}
		
		value����ָʾ������򷽷�ӳ�䵽��URL��method���Զ��崦��HTTP GET����ķ��񷽷���
		�������϶���Ŀ���������Ҫע�����¼��㣺
			1���ڷ��񷽷��ж��������ҵ���߼������Ը�����Ҫ�ڴ˷����ڵ�������������
			2�����ڶ����ҵ���߼������ڴ˷����д���һ��ģ�͡��������ò�ͬ��ģ�����ԣ���Щ���Խ�����ͼ�����Գ������ս������ʾ�������������ԡ�message����ģ�͡�
			3������ķ��񷽷����Է���һ��String��������Ҫ������Ⱦģ�͵���ͼ�����ơ���ʾ������hello������Ϊ�߼���ͼ���ơ�
	 */
	
	/**
	 * ����JSP��ͼSpring
	 *  MVC֧��������͵���ͼ���ڲ�ͬ�ı�ʾ���������� - JSP��HTML��PDF��Excel������XML��Velocityģ�壬XSLT��JSON��Atom �� RSS Դ��JasperReports�ȡ�
	 *  ���������ʹ��JSPL��д��JSPģ�壬����ʹ�õ���JSPģ�壬����/WEB-INF/hello/hello.jsp��дһ���򵥵�hello��ͼ��
	 *  <html>
		   <head>
		   		<title>Hello Spring MVC</title>
		   </head>
		   <body>
		   		<h2>${message}</h2>
		   </body>
		</html>
		
		˵��������${message}����Controller�����õ����ԡ���������ͼ����ʾ������ԡ�
	 */
	public static void main(String[] args) {
		// 0��Ĭ������springMVC��ܣ�����jar��������web.xml������spring-mvc.xml
		/**
		 * servlet-api-x.y.z.jar
		 * commons-logging-x.y.z.jar
		 * spring-aop-x.y.z.jar
		 * spring-beans-x.y.z.jar
		 * spring-context-x.y.z.jar
		 * spring-core-x.y.z.jar
		 * spring-expression-x.y.z.jar
		 * spring-webmvc-x.y.z.jar
		 * spring-web-x.y.z.jar		
		 */
		
		// 1��Spring MVC Hello Worldʾ�����ο��ļ�HelloController.java��hello.jsp
		
		// 2��Spring MVC �ύ�����ο��ļ� Student.java �� StudentController.java �� student.jsp �� studentResult.jsp

		// 3��Spring MVC ��̬ҳ�档�ο��ļ�  StaticPagesController.java �� staticPages.html���Լ�spring-mvc.xml�ļ�������<mvc:resources mapping="/jsp/**" location="/WEB-INF/jsp/"/>

		// 4��Spring MVC ҳ���ض��򡣲ο��ļ�  PageRedirectController.java �� pageRedirectResult.jsp ҳ�档
		
		// 5��Spring MVC ����ǩ�⡣�ο��ļ�  Student.java �� StudentController.java �� student.jsp �� studentResult.jsp
//								�ο��ļ��� User.java �� UserController.java �� user.jsp �� userResult.jsp
		
	}
}
