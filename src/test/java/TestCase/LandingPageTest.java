package TestCase;


import BaseClass.BaseClass;
import static org.junit.jupiter.api.Assertions.*;

import Utilities.TodoDTO;
import Utilities.WebTechnology;
import com.beust.jcommander.Strings;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.Keys;


public class LandingPageTest extends BaseClass {

    private static TodoDTO todoDTO;
    private static Faker faker;
    @BeforeAll
    public static void GenerateFakeTodo (){
        todoDTO=new TodoDTO();
        faker=new Faker();
        todoDTO.setTodoText(faker.address().fullAddress());

    }


    @ParameterizedTest
    @DisplayName("Verify element on the landing page")
    @EnumSource(value = WebTechnology.class,names = {"BZCKBONEJS","DOJO","REACT","POLYMER"},mode = EnumSource.Mode.EXCLUDE)
//    @ValueSource(strings = {
//            "Backbone.js",
//            "Dojo",
//            "React",
//            "Vue.js",
//            "CanJS",
//            "KnockoutJS",
//            "Marionette.js",
//
//    })
    public void TC_001(WebTechnology technology){
        landingPage.clickOnBackBone(technology.getTecnologyName());
       // assertEquals(landingPage.getPageTitle(),"Backbone.js • TodoMVC","Page title not found");
        landingPage.setTxtTodo(todoDTO.getTodoText()+ Keys.ENTER);
        landingPage.clickTodoRadioBtn();


    }
}
