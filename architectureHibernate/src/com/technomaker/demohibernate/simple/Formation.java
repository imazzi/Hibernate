package com.technomaker.demohibernate.simple;

public class Formation {
    //done
    private Long idFormation;
    private String theme;

    public Formation(String theme) {
        this.theme = theme;
    }

    public Long getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(Long idFormation) {
        this.idFormation = idFormation;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }




}
