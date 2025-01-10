브라우저로 실행되는 프로그램 ( /hotel )

프로그램 시작 시 메인화면 ( 인덱스로 이동 )

- 인덱스 메뉴
1. 객실 관리
	- 객실 관리 메뉴
	1. 모든 객실을 조회하기
		1. 객실의 리스트 ( 방 번호 오름차순, 상태별 개수가 옆에 나오게 )
		   방 번호, 상태에 따라 비어있으면 상태만
		   예약이면 고객정보(이름, 전화번호, 생년월일) + 예약날짜
		   투숙중이면 고객정보 + 체크아웃 예정 날짜
	1. 특정 객실을 조회하기 ( 방 번호로 검색 )
		1. 방 번호, 예약 상태, 고객정보(이름, 전화번호, 생년월일), 예약/체크일자
		2. 객실의 상태를 변경하기
			1. 상태에 따라서
			2. 비어있으면 예약 등록
			3. 예약된 방은 예약 변경, 취소, 체크인
			4. 사용중인 방은 체크아웃 메뉴가 나오게하기
2. 고객 관리
	- 고객 관리 메뉴
	1. 모든 고객을 조회하기
		1. 고객 리스트 ( 예약/사용중 인 방번호 오름차순 )
		   고객의 이름, 전화번호, 생년월일, 예약/투숙중인 방번호, 예약/체크일자
	2. 특정 고객을 조회하기 ( 이름으로 검색하기 )
	3. 특정 고객을 조회하기 ( 전화번호로 검색하기 )
		-  고객의 이름, 전화번호, 생년월일, 예약/투숙중인 방번호, 예약/체크일자

db에 객실과 고객 상태를 관리(등록 변경 삭제)할 수 있게
고객의 데이터는 예약을 하면 생성되고
예약날짜부터 예약취소 또는 체크아웃될 때까지 보관
