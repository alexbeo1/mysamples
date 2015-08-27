package ru.oserbii.webapp.model;

/**
 * Александр Козлов
 * 27.08.2015.
 */
public class WorkExperience {
    private String dataOfStart;
    private String dataOfEnd;
    private String company;
    private String directionOfActiviti;
    private String appointment;
    private String funktion;
    private String results;

    public String getDataOfStart() {
        return dataOfStart;
    }

    public void setDataOfStart(String dataOfStart) {
        this.dataOfStart = dataOfStart;
    }

    public String getDataOfEnd() {
        return dataOfEnd;
    }

    public void setDataOfEnd(String dataOfEnd) {
        this.dataOfEnd = dataOfEnd;
    }

    public String getDirectionOfActiviti() {
        return directionOfActiviti;
    }

    public void setDirectionOfActiviti(String directionOfActiviti) {
        this.directionOfActiviti = directionOfActiviti;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getFunktion() {
        return funktion;
    }

    public void setFunktion(String funktion) {
        this.funktion = funktion;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }


}
