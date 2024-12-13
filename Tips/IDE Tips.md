**Ctrl + /** : 한줄 또는 선택영역 주석처리 / 제거  
**Ctrl + .** : 다음오류부분으로 가기  
**Ctrl + ,** : 이전오류부분으로 가기  
  
**Ctrl + D** : 한줄삭제  
**Ctrl + H** : Find 및 Replace  
**Ctrl + I** : 소스 깔끔 정리(인덴트 중심의 자동구문정리)  
**Ctrl + J** : 검색할 단어를 입력하면서 실시간으로 검색  
**Ctrl + K** : 다음찾기(또는, 찾고자 하는 문자열을 블럭으로 설정한 후 키를 누른다.)  
**Ctrl + L** : 특정줄번호로 가기  
**Ctrl + N** : 새로운 파일 및 프로젝트 생성  
**Ctrl + O** : Outline 창 열기  
**Ctrl + Q** : 마지막 편집위치로 가기
**Ctrl + S** : 저장 및 컴파일  
**Ctrl + space** : 어휘의 자동완성(Content Assistance)
**Ctrl + 1** : Quick Fix

---
### STS4 간편기능
- **Alt+Shift+T** : Refactor
	- - __Alt+Shift+R__ : Rename
		- 같은 이름을 사용하는 멤버들이 함께 변경된다
	- **Alt+Shift+M** : Extract Methods
		- 기존의 코드에서 일정 부분을 새로운 메서드로 추출하여, 그 메서드를 원래 코드에서 호출하도록 만드는 리팩토링 기법
	- **Alt+Shift+L** : Extract Local Variable
		- 메소드 내에서 동일한 값이나 표현식을 여러 번 사용하는 경우, 그 값을 한 번 계산하고 이를 **지역 변수**로 저장하여 반복되는 코드 대신 변수명을 사용하도록 만드는 리팩토링 기법
- 
- **Ctrl+Shift+O** : Organize import
	- import가 필요한 클래스를 한번에 import 하는 것을 도와준다
- 
- __Alt+Shift+S__ : Source
	- Generate Constructor using Fields : 생성자 생성
	- Generate Getter and Setter : **getter** 와 **setter** 생성
	- Generate Deligate Methods : 
	- Override implement Methods : 부모클래스에서 오버라이드할 메소드를 생성
	- Generate toString() : 원하는 멤버를 문자열로 만드는 **toString()** 메소드를 생성
	- Generate hashcode() and equals() : 동등함을 비교하는 **equals()** 메소드와 해쉬코드를 반환하는 **hashcode()** 메소드를 생성
- 
- **Window - Editor**
	- **Clone** : 현재 열려있는 프로그램을 한번 더 연다
	- **Ctrl+{** : Toggle Split Editor (Vertical)
		- 현재 열려있는 프로그램을 수직으로 분리해서 볼수 있게 해준다

---
### javadoc 주석
```java
/**
* 이 클래스는 계산기 기능을 제공합니다.
* 주어진 두 숫자에 대해 덧셈과 뺄셈을 수행합니다.
* (클래스 주석)
*/
class Calculator {

/**
* 두 숫자의 합을 반환합니다.
* (메소드 주석)
* @param a 첫 번째 숫자
* @param b 두 번째 숫자
* @return 두 숫자의 합
*/
	public int add(int a, int b) {
		return a + b;
		}
}

// TODO
// 주석라인에 나중에 다시 확인할 수 있는 체크포인트 생성
```

---
#### STS4 플러그인 설치
- **Amateras U.M.L**
	-  Help - Install New Software 에 아래 주소 입력
		https://takezoe.github.io/amateras-update-site/
		모두 체크하고 넘기기
	-  STS4 폴더의 ini 파일 맨 아래에
		--add-opens=java.desktop/java.beans=ALL-UNNAMED
		추가하기
- **window builder**
	- Help - Eclipse Marketplace 에서 window builder 검색
	- 제일 위에거 다운받기
##### Amateras U.M.L
- 클래스 다이어그램 생성 
	- new - other - AmaterasUML - Class Diagram

##### window builder
- 윈도우 빌더 생성
	- new - other - window builder - JFrame


###### 사용자의 접근성을 위해 실행파일과 패키지를 합치는 방법
0. 이클립스에서 export로 jar파일 생성
	1. 생성할 때 main 메소드 위치를 잡아줘야 한다
1. name.bat 생성
2. 편집기로 java -jar name.jar 입력
3. pause 추가  
    여기까지를 **packaging** 이라고 함
4. readme.txt (사용설명서)  
    이렇게 완성된 프로그램을 사용자에게 배포하는것을 **release** 라고 한다

#### VS code 확장 프로그램
- live server