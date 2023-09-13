package vn.edu.iuh.fit.enities;

import java.sql.Date;

public class Log {
    String log_id;
    Date login_time;
    Date logout_time;
    String note;

    public Log() {
    }

    public Log(String log_id, Date login_time, Date logout_time, String note) {
        this.log_id = log_id;
        this.login_time = login_time;
        this.logout_time = logout_time;
        this.note = note;
    }

    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public Date getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(Date logout_time) {
        this.logout_time = logout_time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Log{" +
                "log_id='" + log_id + '\'' +
                ", login_time=" + login_time +
                ", logout_time=" + logout_time +
                ", note='" + note + '\'' +
                '}';
    }
}
