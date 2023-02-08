package features

import io.cucumber.scala.{EN, ScalaDsl}
import org.scalatest.matchers.should.Matchers

class ScoringSteps extends ScalaDsl with EN with Matchers {
  When("the test is invoked") { () =>
    println("cucumber test when")
  }

  Then("the test should fail") { () =>
    println("cucumber test then")
    true shouldBe true
  }
}