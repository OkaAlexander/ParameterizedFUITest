package Utilities;

public enum WebTechnology {
          BZCKBONEJS("Backbone.js"),
           DOJO("Dojo") ,
            REACT("React"),
            VUEJS("Vue.js"),
            CANJS("CanJS"),
            KNOCKOUTJS("KnockoutJS"),
            MARIONETTE("Marionette.js"),
           TYPESCRIPT("TypeScript + AngularJS"),
           MERIONETTE("Marionette.js"),
           DART("Dart"),
           AURELIA("Aurelia"),
          RIOT("Riot"),
          POLYMER("Polymer");

    private String tecnologyName;
     WebTechnology(String technologyName){
        this.tecnologyName=technologyName;
    }
    public String getTecnologyName(){
         return tecnologyName;
    }
}
