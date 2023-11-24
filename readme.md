# Spring Boot 최종 정리

> <h3>Spring Boot 기본 제공 | 3.1.6 기준</h3>
> - web
> - test
> - jdbc
> - security(activation)
> - RESTful api/JSON
> - data-jpa
> - cache - 캐싱을 통해 용량을 간소화

> dependencies {<br/>
&nbsp;  &nbsp;  &nbsp; implementation 'org.springframework.boot:spring-boot-starter-web'<br/>
&nbsp;  &nbsp;  &nbsp; providedRuntime 'org.springframework.boot:spring-boot-starter-tomcat'<br/>
&nbsp;  &nbsp;  &nbsp; testImplementation 'org.springframework.boot:spring-boot-starter-test'<br/>
}
> - 기본적으로 위 3개가 설정됨

> <h3>/resources.static/index.html</h3>
> - 기본 메인 페이지
> - 특별하게 경로 지정을 안했을 경우 static에 넣는다 
> - Tomcat이 내장되어 있기 때문에 가능하다. - 서버가 자동으로 동작하기 때문에 Spring "Boot"

> <h3>Server</h3> 
> - dispatcher-servlet
> - @SpringBootApplication 안에 dispatcher-servlet 내장
> - <p>2023-11-24T14:33:42.766+09:00  INFO 15400 --- [nio-8086-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'</p>

> <h3>Client = Web Browser</h3>
> - Server => Dispatcher
> - 서버에 자바 기본엔진을 전달하는 역할
> - Dispatcher => Controller

> <h3>Controller</h3>
> - HandlerMappin(@GetMapping(URL)) => URL Mapping =>
> - 호출된 URL Mapping의 하단부의 해당 메소드 => 서비스 로직 호출 =>
> - Reposiotory(Mapper) 호출 => DTO로 결과 반환 =>
> - 반환된 정보(DTO)를 Model에 넣기 => View로 포워딩
