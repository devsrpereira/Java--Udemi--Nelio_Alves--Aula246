package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Line {
    private String name;
    private LocalDateTime moment;

    public Line(String name, LocalDateTime moment) {
        this.name = name;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return "name: " + name + ", time:" + moment;
    }
}
