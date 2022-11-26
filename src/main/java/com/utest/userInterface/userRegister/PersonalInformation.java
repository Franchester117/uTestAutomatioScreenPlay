package com.utest.userInterface.userRegister;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformation {
    /*
     * Mapeo de los elementos de la página.
     * */
    public static final Target FIRST_NAME_INPUT = Target.the("First name input").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Last name input").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Email input").located(By.id("email"));
    public static final Target BIRTH_MONTH_SELECT = Target.the("Birth month select").located(By.id("birthMonth"));
    public static final Target BIRTH_DAY_SELECT = Target.the("Birth day select").located(By.id("birthDay"));
    public static final Target BIRTH_YEAR_SELECT = Target.the("Birth year select").located(By.id("birthYear"));
    public static final Target LANGUAGE_SELECT = Target.the("Language select").located(By.className("ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched"));
    public static final Target NEXT_BUTTON = Target.the("Next button").located(By.xpath("//a[@aria-label=\"Next step - define your location\"]"));


}
