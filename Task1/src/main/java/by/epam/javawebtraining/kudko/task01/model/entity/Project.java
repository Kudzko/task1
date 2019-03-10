package by.epam.javawebtraining.kudko.task01.model.entity;

public class Project {
    private static int number=0;
    private String     name;
    private String     code;
    private String     autotests;
    private boolean    status; // if current - true, if no false

    {
        number++;
        name = "project " + number;
        status = true;
    }

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name!=null) && (name.length() != 0)){
            this.name = name;
        }

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if ((code!=null) && (code.length() != 0)){
            this.code = code;
        }

    }

    public String getAutotests() {
        return autotests;
    }

    public void setAutotests(String autotests) {
        if ((autotests!=null) && (autotests.length() != 0)){
            this.autotests = autotests;
        }
    }

    public boolean isStatus() {
        return status;
    }

    /**
     * set true if project is current
     * set false if project is finished
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
}
