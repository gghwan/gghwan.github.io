#리액트&스프링부트 면접

1. 리액트는 왜 쓰나요? 아는대로 설명하세요.

   A. 컴포넌트 단위로 쪼개쓰기 위해서 쓰임. 웹 자체의 기능들을 쪼개서 관리하면 더 효율적이기 때문이다.

   ​    22년 이후의 발표를 살펴보면, 웹기반에서 가장 많이 사용되는게 리액트라고 알고 있다. 많은 기업들이 쓰기 때문에, 유지보수나 

   ​    서비스 배포시에 유리하다고 할 수 있다.

2. **Virtual DOM**은 무엇이며, **React**는 어떻게 **실제 DOM**과 비교하여 더 효율적으로 UI를 업데이트하나요? **그 동작 과정을 설명**하세요.

   A. Virtual Dom같은 경우, 랜더링할때, 실제 DOM에 모든 변경사항을 반영하는 것이 아닌 

   ​     필요한 변경사항들만 반영한 UI형태를 업데이트 하도록 만든다. 

3. React에서 상태가 업데이트될 때, 컴포넌트가 다시 렌더링되는 과정은 어떻게 이루어지나요? 리렌더링이 발생하는 원리와 조건을 설명하세요.

4. React 컴포넌트가 처음 마운트될 때와 업데이트될 때 useEffect는 각각 어떻게 동작하나요? useEffect의 cleanup 함수가 호출되는 시점을 설명하세요.

5. React에서 useMemo 훅은 어떤 상황에서 사용되며, 내부적으로 어떻게 최적화를 진행하나요? 사용하지 않았을 때와의 성능 차이를 설명하세요.

6. React에서 useReducer와 useState의 차이점은 무엇인가요? useReducer가 필요한 상황과 그 동작 원리를 설명하세요.

7. React에서 props drilling가 무엇이며, 이를 해결하기 위한 방법을 아는대로 설명하세요.

8. Spring Boot 애플리케이션은 기존 Spring 애플리케이션에 비해 어떤 장점을 가지나요?

   A. 스프링 부트를 사용하면, 스프링의 장점을 모두 사용할 수 있다. 자동화된 부면들이 있기 때문에 프로토 타입을 만들거나 서비스를 배포하기 전에 미리 시현하는 경우, 프로젝트 규모가 별로 크지않은 경우에 쓰면 매우 효율적이다. 하지만 복잡한 동작을 요구한다면, 스프링을 쓰는 것이 낫다. 스프링 부트의 경우 독립된 상태의 모듈을 만질 수 있다는 장점이 있지만, 대규모 프로젝트시에 유지보수하는 경우 불리하다.

9. 브라우저에서 Spring Boot 애플리케이션 서버로 요청이 들어왔을 때 서버가 응답하는 동작 원리를 아는대로 설명하세요.

   A. 톰캣을 통해 서버의 요청을 받고, 톰캣이 서블릿 컨테이너로써 request, response 객체를 생성후 요청에 매핑된 서블릿이나 프론트로 보낸다.

10. Spring의 IoC (Inversion of Control)와 DI (Dependency Injection)개념에 대해 아는대로 설명하세요.

    A. 의존성의 정도에 따라 나뉜다. 이는 곳 스프링의 결합도의 차이에 영향을 미친다. 

11. Spring Boot에서 AOP (Aspect-Oriented Programming)의 동작원리를 아는대로 설명하세요. 

12. Spring Boot에서 @Transactional 어노테이션이 작동하는 방식과 트랜잭션이 실제로 어떻게 커밋되고 롤백되는지 설명하세요.

13. 서버사이드 렌더링과 클라이언트 사이드 렌더링의 차이에 대해 아는대로 설명하세요.

14. Spring Boot에서 @Repository, @Service, @Controller 어노테이션이 각각 어떤 의미를 가지며, 이들 간의 역할 분담은 어떻게 이루어지나요?

    A. @Repository : 데이터 베이스 담당, 직접 DB에 관여한다.  @Service: 응용계층 담당, @Controller:  Http 요청과 요청된 정보를 체크하고, 인증을 담당한다.

15. JPA란 무엇이며, 왜 사용하는가? JDBC와 JPA의 차이점을 설명하세요.

    A. DB에 대한 연결성에 따라 차이가 있다. 

16. MyBatis는 무엇이며, JPA와 무엇이 다른지 설명하세요.

    A. 직접 작성한 SQL에 의존하기 때문에, 성능 최적화가 쉽다.-> MyBatis, 동적인 쿼리 생성과 ORM의 복잡성이 있을 때, 쿼리 관리 하려면 JPA를 쓴다.

    ​    즉, DB와의 상호작용 방식에 따라 차이점이 있다.

17. Spring Boot에서 전역 예외처리를 위한 방법이 무엇인지 설명하세요. 

    A. @RestControllerAdvice, @ControllerAdvice가 주로 전역적으로 예외를 잡아주는 어노테이션이다.

18. 세션과 JWT 인증 방식에 대해 각각 설명하세요.

    A. 세션은 보안이 필요한 부분들을 암호화하여 저장한다고 할 수 있다. 세션을 설명하기 전에 쿠키와 세션의 개념에 대해 알아야 하는데, 쿠키는 휘발성이 있지만, 세션의 경우 키-값에 대하여 일치 여부를 판단하며, 보안에 직접적으로 중요한 부분을 담당한다.

     JWT방식의 경우, 토큰으로 인증을 한다. 

19.Spring Boot에서 프로파일(Profile)이란 무엇인가요?

​      A. 스프링 부트에서 서로다른 환경에서 사용하기 위해 쓰이는 yaml, properties 파일같은 것들을 의미한다.

20. 스프링 시큐리티 동작 원리에 대해 아는대로 설명하세요.

    A. 인증, 인가, 보안을 담당하는 하위 프레임 워크이다. 