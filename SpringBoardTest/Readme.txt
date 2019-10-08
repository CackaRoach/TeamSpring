Java 1.6 버전
tomcat 7버전 

Root-Context.xml
PostgreSQL 설정
	<bean id="dataSourcePostgre" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
		<property name="driverClassName" value="org.postgresql.Driver"/>
		<property name="url" value="jdbc:postgresql://localhost:5432/DB명"/>
		<property name="username" value="아이디"></property>
		<property name="password" value="패스워드"></property>
	</bean>
