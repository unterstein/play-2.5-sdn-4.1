package controllers

import javax.inject.{Inject, Named}

import neo4j.models.ExampleObject
import neo4j.repositories.ExampleRepository
import play.api.mvc._

@Named
class Application @Inject()(repo: ExampleRepository) extends Controller {

  def index = Action {
    repo.save(new ExampleObject)
    println(repo.count())
    Ok(views.html.index("Your new application is ready."))
  }

}
