package APIsWithSpring.OM; // 자바 파일이 속한 패키지 정의
// 자바에서는 패키지를 사용하여 클래스들을 논리적으로 그룹화하는 것이 일반적임
// 패키지는 클래스들을 서로 구분짓고, 관련된 클래스를 모아서 유지보수 및 관리를 쉽게 만들어준다.
// 이름 충돌 방지, 가독성 및 구조화, 접근 제어, 재사용성

import org.springframework.boot.SpringApplication; // SpringApplication 라이브러리
// spring boot 어플리에키션을 시작하는 데 사용
// 어플리케이션 context를 설정하고 어플리케이션을 시작하는데 필요한 구성들을 처리
// 외부 구성 파일(application.properties, application.yml)을 읽고, Spring Bean을 로드하고, 어플리케이션 실행

import org.springframework.boot.autoconfigure.SpringBootApplication; // SpringBootApplication 라이브러리
// 여러 다른 어노테이션(@Configuratrion, @EnableAutoConfiguration, @ComponentScan을 포함)들을 결합하여 단일한 선언으로 사용
// @Configuratrion: 해당 클래스가 어플리케이션의 구성 클래스임을 선언
// @EnableAutoConfiguration: Spring Boot의 자동 구성을 활성화
// @ComponentScan: 지정된 패키지 및 하위 패키지에서 Spring 구성 요소들을 검색하여 스캔

@SpringBootApplication // 스프링 부트의 자동 구성을 활성화, 구성 클래스 스캔, Spring Bean 자동 검색 및 로깅 설정 등 수행
public class OmApplication {

	public static void main(String[] args) { // 자바 어플리케이션 시작점
	// static: 메서드나 변수를 클래스 수준으로 만들기 위해 사용
	// main 메서드는 인스턴스를 생성하지 않고도 호출할 수 있어야 하기 때문에 static으로 선언된다.
	// String 배열 args: 프로그램을 실행할 때 커맨드 라인에서 전달되는 인수들을 저장
		SpringApplication.run(OmApplication.class, args); 
		// spring boot 어플리케이션 시작
		// OmApplication 클래스를 사용하여 어플리케이션을 시작하고, 커맨드 라인에서 전달된 인수를 전달
		// OmApplication.class는 Spring Boot 어플리케이션의 구성 클래스를 나타낸다. Spring boot는 이 클래스를 기반으로 어플리케이션의 설정을 로드하고, 필요한 Bean들을 초기화하며, 컨텍스트를 구성한다.
		// args 변수는 프로그램 실행 시 전달되는 커맨드 라인 인수들을 저장하는 배열이다.
	}

}
