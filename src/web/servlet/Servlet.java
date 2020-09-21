package web.servlet;

public class Servlet {
    /*
    * Servlet 이란?
    * 웹프로그래밍에서 클라이언트의 요청을 처리하고 그 결과를 다시 클라이언트에게
    * 전송하는 Servlet 클래스의 구현 규칙을 지킨 자바 프로그래밍 기술
    * */

    /*
    * Servlet 특징
    클라이언트의 요청에 대해 동적으로 작동하는 웹 어플리케이션 컴포넌트
    html을 사용하여 요청에 응답한다.
    Java Thread를 이용하여 동작한다.
    MVC 패턴에서 Controller로 이용된다.
    HTTP 프로토콜 서비스를 지원하는 javax.servlet.http.HttpServlet 클래스를 상속받는다. UDP보다 속도가 느리다.
    HTML 변경 시 Servlet을 재컴파일해야 하는 단점이 있다.
    * */

    /*
    * Servlet 동작방식
    1. 사용자(클라이언트)가 URL을 클릭하면 HTTP Request를 Servlet Container로 전송합니다.
    2. HTTP Request를 전송받은 Servlet Container는 HttpServletRequest, HttpServletResponse 두 객체를 생성합니다.
    3. web.xml은 사용자가 요청한 URL을 분석하여 어느 서블릿에 대해 요청을 한 것인지 찾습니다.
    4. 해당 서블릿에서 service메소드를 호출한 후 클리아언트의 POST, GET여부에 따라 doGet() 또는 doPost()를 호출합니다.
    5. doGet() or doPost() 메소드는 동적 페이지를 생성한 후 HttpServletResponse객체에 응답을 보냅니다.
    6. 응답이 끝나면 HttpServletRequest, HttpServletResponse 두 객체를 소멸시킵니다.
    * */
}

/*
Q) CGI(Common Gateway Interface)란?
CGI는 특별한 라이브러리나 도구를 의미하는 것이 아니고, 별도로 제작된 웹서버와 프로그램간의 교환방식입니다. CGI방식은 어떠한 프로그래밍언어로도 구현이가능하며,
별도로 만들어 놓은 프로그램에 HTML의 Get or Post 방법으로 클라이언트의 데이터를 환경변수로 전달하고, 프로그램의 표준 출력 결과를 클라이언트에게 전송하는 것입니다.
즉, 자바 어플리케이션 코딩을 하듯 웹 브라우저용 출력 화면을 만드는 방법입니다.
*/
/*
Q) HTTP 프로토콜을 이용한 서버와 클라이언트의 통신 과정은?
클라이언트는 정보를 얻기 위해 서버로 HTTP 요청 메세지+매개변수를 전송하고, 서버는 이를 해석하여 정적 자원에 대한 요청일 경우 자원을 반환해주고,
그렇지 않은 경우 CGI 프로그램을 실행시켜 해당 결과를 리턴해줍니다. 이때 서버는 CGI 프로그램에게 클라이언트의 요청과 매개변수를 전달해주고,
결과를 전달받기 위한 파이프라인을 연결합니다. 그래서 CGI 프로그램은 입력에 대한 서비스를 수행하고,
결과를 클라이언트에게 전달하기 위해 결과 페이지에 해당하는 MIME 타입의 컨텐츠데이터를 웹 서버와 연결된 파이프라인에 출력하여 서버에 전달합니다.
서버는 파이프라인을 통해 CGI 프로그램에서 출력한 결과 페이지의 데이터를 읽어, HTTP 응답헤더를 생성하여 데이터를 함께 반환해준다.
* */