package unit

import org.scalatest.mock.MockitoSugar
import org.scalatestplus.play.PlaySpec
import play.api.libs.json.Json
import play.api.mvc.Results

/**
  * Created by in04468 on 26-07-2016.
  */
abstract class UnitTestsSpec extends PlaySpec with MockitoSugar with Results {
  def sampleContacts = Json.parse("[{\"attributes\":{\"type\":\"Contact\",\"url\":\"/services/data/v31.0/sobjects/Contact/00358000007nP9kAAE\"},\"Id\":\"00358000007nP9kAAE\",\"FirstName\":\"Rose\",\"LastName\":\"Gonzalez\",\"Email\":\"rose@edge.com\"},{\"attributes\":{\"type\":\"Contact\",\"url\":\"/services/data/v31.0/sobjects/Contact/00358000007nP9lAAE\"},\"Id\":\"00358000007nP9lAAE\",\"FirstName\":\"Sean\",\"LastName\":\"Forbes\",\"Email\":\"sean@edge.com\"}]")
}
