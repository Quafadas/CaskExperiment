package foo
import utest._
import app.MinimalApplication
object ExampleTests extends TestSuite{
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
  }
   
}
