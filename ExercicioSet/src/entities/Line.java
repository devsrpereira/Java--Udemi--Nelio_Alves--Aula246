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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;

        return getName().equals(line.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return "name: " + name + ", time:" + moment;
    }
}
