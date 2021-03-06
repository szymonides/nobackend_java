package Query.Validate;

import Connection.User;
import Query.Query.Queries.AbstractQuery;
import Project.Project;

public class TableAccess implements ValidateInterface
{
    public static final int CAN_READ_PRIVILEGE = 0;
    public static final int CAN_CREATE_PRIVILEGE = 1;
    public static final int CAN_UPDATE_PRIVILEGE = 2;
    public static final int CAN_DELETE_PRIVILEGE = 3;

    private static TableAccess _instance;

    private TableAccess()
    {
    }

    public static TableAccess getInstance()
    {
        if (_instance == null) {
            _instance = new TableAccess();
        }

        return _instance;
    }

    public boolean checkAccess(AbstractQuery readQuery, Project project)
    {
        return true;
    }

    public boolean checkPrivileges(User user, String tableName, int privilege)
    {
        return true;
    }
}
