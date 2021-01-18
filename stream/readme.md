# Stream 학습
---

Stream API
Java8에서 추가된 기능으로, stream 형태로 요소에 함수형 연사자를 지원해주는 클래스

https://velog.io/@kskim/Java-Stream-API




### 목차
### 1. 스트림필터 
1. map
2. filter
3. sorted



순차스트림 / 병렬스트림

기본 타입형 / string / 파일 스트림

Stream.builder() / Stream.generate() / Stream.iterate() / Stream.of
스트림 클래스로 객체 생성

2. 가공 — Stream 메소드로 연결된 또는 Stream 클래스로 생성된 객체들은 가공되는 과정이 있다. ( 예를 들면, 배열에서 함수 적용 전 필요에 따라 정렬이라던지 각 원소에 대해 값을 조절하는 과정이라고 생각하자. )
Filtering : 조건에 맞는 원소 추출
Mapping : 객체의 각 원소들에 대해 결과와 매칭시킴
Sorting : 순서에 맞게 원소를 정렬
Iterating : 원소를 읽어들임



3. 처리 — 그리고 결과로 추출하기 위한 함수 값에 대한 처리 과정
Calculating
Reducing
Collecting
Matching
Iterating


컬렉션은 자료구조들의 구현체고 스트림은 자료구조들을 다루는 역할

람다의 기본식 : (매개변수) -> {실행문}


스트림 메서드

collect()