package org.amarpushp.android.model;

public class Expression_Photos {

    private int image;
    private String competition_name, competition_year, competition_description;

    public Expression_Photos(int image, String competition_name, String competition_year, String competition_description) {
        this.image = image;
        this.competition_name = competition_name;
        this.competition_year = competition_year;
        this.competition_description = competition_description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCompetition_name() {
        return competition_name;
    }

    public void setCompetition_year(String competition_year) {
        this.competition_year = competition_year;
    }

    public String getCompetition_year() {
        return competition_year;
    }

    public void setCompetition_name(String competition_name) {
        this.competition_name = competition_name;
    }

    public String getCompetition_description() {
        return competition_description;
    }

    public void setCompetition_description(String competition_description) {
        this.competition_description = competition_description;
    }
}


