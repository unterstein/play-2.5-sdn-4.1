package controllers

import javax.inject.{Inject, Named}

import neo4j.models.Person
import neo4j.repositories.PersonRepository
import play.api.mvc._
import scala.collection.JavaConversions._

/**
 * The application controller
 *
 * @author Johannes Unterstein (unterstein@me.com)
 */
@Named
class ApplicationController @Inject()(repo: PersonRepository) extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

}
