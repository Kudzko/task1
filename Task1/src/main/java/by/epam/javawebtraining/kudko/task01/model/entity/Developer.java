package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException.NotFoundCurrentProjectException;
import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException.SetWrongLevelEnergy;
import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException.TooLowEnergyException;

import java.util.List;
import java.util.Objects;

/**
 * third level of abstraction
 */
public class Developer extends Inferior {
    private String position = "Junior";

    /**
     * default constructor
     */
    public Developer() {
    }

    /**
     * custom constructor
     *
     * @param id
     */
    public Developer(int id) {
        super(id);
    }

    /**
     * Custom constructor
     *
     * @param id
     * @param energy
     * @param name
     * @param surname
     * @param salary
     * @param bonus
     * @param payRange
     * @param experience
     * @param chief
     * @param skills
     * @param position
     */
    public Developer(int id, double energy, String name, String surname, double salary, double bonus, int payRange, double experience, Manager chief, List<String> skills, String position) {
        super(id, energy, name, surname, salary, bonus, payRange, experience, chief, skills);
        this.position = position;
    }

    /**
     * Clone constructor
     */
    public Developer(Developer other) {
        super(other);
        this.position = other.position;
    }


    @Override
    public void work() throws SetWrongLevelEnergy, TooLowEnergyException, NotFoundCurrentProjectException {
        super.work();
        if ((this.getChief() != null)
                && (this.getChief().getLeader() != null)
                && (((ProjectManager) (this.getChief().getLeader()))
                .getProjects() != null)
                && !((ProjectManager) (this.getChief().getLeader()))
                .getProjects().isEmpty()) {

            List<Project> projects = ((ProjectManager) this.getChief().getLeader()
            ).getProjects();

            for (Project p : projects) {
                if (p.isStatus()) {
                    p.setCode("[" + this.getId() + ", " + this.getName() + ", "
                            + this.getSurname() + " some code ...");
                }
            }


        } else {
            throw new NotFoundCurrentProjectException("Developer has no " +
                    "TeamLeader, or TeamLead has no ProjectManager, or ProjectManager" +
                    "has no current projects");
        }


    }

    public void setPosition(TypePosition typePosition) {
        position = typePosition.toString();
    }

    public String getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        if (this == o) return true;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(position, developer.position);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), position);
    }

    @Override
    public String toString() {
        return super.toString() + "position = " + position;
    }


   public enum TypePosition {
       JUNIOR, MIDDLE, SENIOR;

       @Override
       public String toString() {
           return "TypePosition{" + name().toLowerCase() + "}";
       }
   }
}


