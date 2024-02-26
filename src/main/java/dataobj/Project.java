package dataobj;

import java.sql.Date;

public class Project {
    private int client_id;
    private Date start_date;
    private Date finish_date;

    public Project(int client_id, Date start_date, Date finish_date) {
        this.client_id = client_id;
        this.start_date = start_date;
        this.finish_date = finish_date;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }
}
