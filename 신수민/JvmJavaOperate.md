<h1>JVM & 자바 동작원리</h1>
<h2>1. JVM </h2>
Java Virtual Machine의 줄임말.

직역하면 '자바를 실행하기 위한 가상 기계(컴퓨터)'라고 할 수 있다.

Java 는 OS에 종속적이지 않다는 특징을 가지고 있다. OS에 종속받지 않고 실행되기 위해선 OS 위에서 Java 를 실행시킬 무언가가 필요하다. 그게 바로 JVM이다.

즉, OS에 종속받지 않고 CPU 가 Java를 인식, 실행할 수 있게 하는 가상 컴퓨터이다.

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F0kg24%2Fbtq4YOOQH4J%2FEF2ISOpkYA36a1flwtLEmK%2Fimg.png">

<h2>2. 자바 실행 과정</h2>
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbw7Yjt%2FbtrnR366X4F%2FI6zYCUkQ6rJtklwQfGdZa0%2Fimg.png">

1) 작성한 자바소스가(JAVA Source) .java인 파일을 자바 컴파일러(JAVA Compiler)를 통해 자바 바이코드(JAVA Byte Code)로 컴파일 한다.
2) 컴파일된 바이코드를 JVM의 클래스로드(Class Loader)에게 전달한다.
3) 클래스로더는 동적로딩(Dynamic Loading)을 통해 필요한 클래스들을 로딩 및 링크하여 런타임 데이터 영역(Runtime Data area), 즉 JVM의 메모리에 올린다
4) 실행엔진(Execution Engine)은 JVM메모리에 올라온 바이트 코드들을 명령어 단위로 하나씩 가져와서 실행한다..