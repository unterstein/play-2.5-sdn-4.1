package controllers

import javax.inject.{Inject, Named}

import neo4j.models.ExampleObject
import neo4j.repositories.ExampleRepository
import play.api.mvc._
import scala.collection.JavaConversions._

@Named
class Application @Inject()(repo: ExampleRepository) extends Controller {

  def index = Action {
    val newEntity = new ExampleObject
    newEntity.name = "asd" + System.currentTimeMillis()
    repo.save(newEntity)
    repo.findAll().toList.foreach(i => println(i.id + ":" + i.name+":"+i.getClass+":"+i.test+":"+i.lala))
    Ok(views.html.index("Your new application is ready."))
  }

}
