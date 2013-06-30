package views.html.markerhelper

import views.html.helper.{FieldElements, FieldConstructor}
import views.html.bootstrapFormTemplate

package object twitterBootstrap2 {
  implicit val twitterBootstrapField = new FieldConstructor {
    def apply(elts: FieldElements) = bootstrapFormTemplate(elts)
  }
}