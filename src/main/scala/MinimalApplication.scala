package app
object MinimalApplication extends cask.MainRoutes{
  @cask.get("/")
  def hello() = {
    "Hello World!"
  }
  
  @cask.get("/hiSimon")
  def HiSimon() = {
    "Hello World It's simon"
  }
  
  @cask.get("/queryParams")
  def queryParams(params: Seq[String]) = {
    params.mkString(",")
  }
  
  @cask.get("/do-thing")
  def dothing() = {
    sayHi
  }

  def sayHi = "hello hiya"

  @cask.post("/do-thing")
  def doThing(request: cask.Request) = {
    request.text().reverse
  }

  initialize()
}

