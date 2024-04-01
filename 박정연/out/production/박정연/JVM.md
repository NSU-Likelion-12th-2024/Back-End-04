<h1>JVM </h1>


<h3>자바 어플리케이션을 실행하는 가상 머신
</h3>
- OS에 종속 받지 않고, CPU가 자바를 인식, 실행할 수 있게 하는 가상 컴퓨터 <br>
- 자바는 플랫폼에 종속적이지 않지만, JVM은 플랫폼에 종속적 <br>
<img src=https://blog.kakaocdn.net/dn/56cSc/btruTEtjRXJ/r1JNTkEuEeY8cSKtqcXCRK/img.png width="500" height="300" alt="플랫폼 독립성">

<h3>구성
</h3>
- 클래스 로더 : 클래스를 처음으로 참조할 때, 해당 클래스를 불러와 연결하는 역할
- 실행 엔진 : 클래스를 실행시키는 역할
  - 인터프리터, JLT 컴파일러 : 바이트 코드를 각 운영체제에 맞는 기계어로 해석, 실행
  - 가비지 콜렉터 : 어플리케이션의 동적 메모리 관리
- Runtime Data Area : 프로그램 수행을 위해 OS에서 할당받은 메모리 공간 <br>
<img height="300" src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20160902_165%2Fkksssii_1472791480904OzwlL_PNG%2Fjvm1.png&amp;amp;type=sc960_832" title="JVM 구조" width="500"/>



<h1> 자바 동작 원리 </h1>

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F0kg24%2Fbtq4YOOQH4J%2FEF2ISOpkYA36a1flwtLEmK%2Fimg.png" width="500" height="100" alt="" title="자바 작동 과정">
<br>
<h4>컴파일 타임 환경
</h4>
1.자바 코드 작성 <br>
2.컴파일러가 자바 코드(.java)를 바이트 코드(.class)로 변환 <br>

<h4>런타임 환경_JVM
</h4>
3.클래스 로더가 클래스 파일을 메모리에 로드 <br>
4.바이트 코드 검증 수행 <br>
5.실행 엔진(인터프리터, JLT)이 바이트 코드를 해석하고 수행 <br>
6.메모리 관리 및 가비지 컬랙션(JVM이 불필요한 메모리 정리) 수행 <br>
7.예외 처리와 디버깅 수행 <br>
<img src="https://blog.kakaocdn.net/dn/bXdEIg/btru3sF159q/aS1KNKZS4xGeQTnRnZuoy1/img.png" width="500" height="300" alt="" title="자바 동작 원리">
