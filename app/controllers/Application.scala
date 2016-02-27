package controllers

import javax.inject.{Inject, Named}

import neo4j.models.ExampleObject
import neo4j.repositories.ExampleRepository
import play.api.mvc._
import scala.collection.JavaConversions._

@Named
class Application @Inject()(repo: ExampleRepository) extends Controller {

  def index = Action {
    // store
    val newEntity = new ExampleObject
    newEntity.name = "node" + System.currentTimeMillis()
    repo.save(newEntity)

    // print
    repo.findAll().toList.foreach(node => println(s"${node.id}"))

    Ok(views.html.index("Your new application is ready."))
  }

}
