package app
import utest._

object ExampleTests extends TestSuite{

  def withServer[T](example: cask.main.Main)(f: String => T): T = {
    val server = io.undertow.Undertow.builder
      .addHttpListener(8081, "localhost")
      .setHandler(example.defaultHandler)
      .build
    server.start()
    val res =
      try f("http://localhost:8081")
      finally server.stop()
    res
  }

  def tests = Tests{
    test("hello"){
      val result = MinimalApplication.hello()
      assert(result == "Hello World!")
      result
    }
    test("simon"){
      val result = MinimalApplication.HiSimon()
      assert(result.contains("simon"))
      result
    }
    test("queryParams"){
      val result = MinimalApplication.queryParams(Vector[String]("hi", "simon"))
      assert(result ==  "hi,simon")
      result
    }
    test("queryParams") - withServer(MinimalApplication){ host =>
      val page = requests.get(s"$host/queryParams?params=hi&params=simon").text()
      assert(page.contains("hi,simon"))
    }

  }
   
}
