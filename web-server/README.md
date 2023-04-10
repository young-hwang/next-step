# HTTP Header

```javascript
GET /index.html HTTP/1.1
Host: localhost:8080
Connection: keep-alive
Accept: */*
```

# 1단계

- ~~InputStream을 한줄 단위로 읽기 위해 BufferedReader 생성한다.~~
- ~~BufferedReader.readLine() 메소드를 활용해 라인별로 HTTP 요청 정보를 읽는다.~~
- ~~HTTP 요청 정보를 출력한다.~~
  - ~~헤더 마지막은 while(!"".equals(line)) {}로 확인 가능하다.~~
  - ~~line이 null 값인 경우에 대한 예외 처리가 필요하다. 그렇지 않은 경우 무한 루프에 빠진다.(if (line == null) { return; })~~

# 2단계

- ~~HTTP 요청 정보의 첫 번째 라인에서 요청 URL(위 예의 경우 /index.html)을 추출한다.~~
- ~~String[] tokens = line.split(" "); 를 활용해 문자열을 분리할 수 있다.~~
- ~~구현은 별도의 유틸 클래스를 만들고 단위 테스트를 만들어 진행하면 편하다.~~

# 3단계

- 요청 URL에 해당하는 파일을 webapp 디렉토리에서 읽어 전달한다.
- 구글에서 "java files readallbytes"로 검색해 파일 데이터를 byte[]로 읽는다.

```java
byte[] body = Files.readAllBytes(new File("./webapp" + url).toPath());
```