package reda.campusjavamanager;

public class Validator {
    public boolean ready(ProjectRecord record) { return record != null && record.status != null; }
}
