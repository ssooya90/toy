SPRINGBOOT - START
===================
2020년 1월부터 공부를 시작한 SPRINGBOOT와 JPA, GRADLE을 가지고 간단한 토이 프로젝트를 만들어보려고한다.

기본적인 회원가입CURD와, 간단한 미니도박(돈넣고 돈먹기, 로또) 등을 만들고

향후 테스트 결제모듈까지 추가해보자.

1.GRADLE
------------------------------
Groovy라는 동적 객체지향 언어로 만들어진 빌드 자동화 시스템이다.  
xml이 아닌 언어를 기반으로 하기때문에 변수선언, 조건문등의 로직 구현이 가능한 장점이 있다.


2.SPRINGBOOT
------------------------------
+ ### properties
SPRINGBOOT는 /resources/application.properties에서 기본 설정을 읽는다.  
  
application.properties에서 다른 properties를 include할 수 있다.    
 
보안상 application.properties는 git에 올리지 않고 기본설정은 include된 properties를 업로드한다.  

@파일명 application-{includeName}  
@코드(application.properties안에 적는다)  
spring.profiles.include={includeName}

HIBERNATE
------------------------------
+ ### TABLE 연동
Entity 와 table 이름이 맵핑되어야 한다.

SPRING SECURITY
------------------------------
+ ### LOGIN / LOGOUT
SECURITY를 이용하여 로그인/로그아웃 처리를 진행한다
  
SecurityConfig Bean을 만들어서 기본 설정을 Overriding 한다.
그 외에 권한체크, 성공/실패 시 처리 등을 핸들링할 수 있다.
  
csrf를 사용하면 모든 헤더에서 csrf를 가지고 다녀야한다.

테스트용은 csrf.disabled() 

THYMELEAF
-----------------------------
view template으로 THYMELEAF 택함  
mustache로 시작했지만, 참고할 자료의 부족해서 자료가 풍부한 THYMELEAF 변경작업 완료

* thymeleaf에 파라미터 값이 전달되지 않으면 에러 발생(널 처리 X)

MessageSource
-----------------------------
메세지 소스를 작업할 예정...


TEST_CODE
-----------------------------
given --> 파라미터 설정  
when --> 상황  
then --> 결과

LOCAL_DATE
----------------------------
JAVA8부터 사용할 수 있는 기능으로  
Date와 calendar를 대체한다.

Optional
----------------------------
JAVA8부터 사용가능한 메서드
null처리에 유용하다


