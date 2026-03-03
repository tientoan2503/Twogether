package org.rikka.twoofus.onboard.presentation

import org.rikka.twoofus.onboard.component.Person

/**
 * Created by rikka on 1/3/26.
 **/
enum class OnboardSetupStatus {
  ABOUT_ME, ABOUT_LOVER, CONFIRM
}

data class OnboardUiState(
  val me: Person = Person.EMPTY,
  val partner: Person = Person.EMPTY,
  val setupStatus: OnboardSetupStatus = OnboardSetupStatus.ABOUT_ME
)
