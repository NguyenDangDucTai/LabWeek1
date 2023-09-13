package vn.edu.iuh.fit.enities;

public class GrantAccess {
    String role_id;
    int is_grant;
    String note;

    public GrantAccess() {
    }

    public GrantAccess(String role_id, int is_grant, String note) {
        this.role_id = role_id;
        this.is_grant = is_grant;
        this.note = note;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public int getIs_grant() {
        return is_grant;
    }

    public void setIs_grant(int is_grant) {
        this.is_grant = is_grant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "role_id='" + role_id + '\'' +
                ", is_grant=" + is_grant +
                ", note='" + note + '\'' +
                '}';
    }
}
