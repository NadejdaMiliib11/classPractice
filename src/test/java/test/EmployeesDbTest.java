package test;

import org.junit.Assert;
import org.junit.Test;
import utilities.DBType;
import utilities.DButility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class EmployeesDbTest {

    @Test
    public void countTest() throws SQLException {
        //Connect to Oracle DataBase
        ///run following sql query
        //select * from employees where job_id = 'IT_PROG'
        //more than 0 records should be returned

        DButility.establishConnection(DBType.ORACLE);
       int rowCount =  DButility.getRowsCount("select * from employees where job_id = 'IT_PROG'");
        Assert.assertTrue("Passed",rowCount >0);
        DButility.closeConnecions();
    }
//Employee fullname with employee id 105 should
    // be David Austin
    @Test
    public void nameTestById() throws SQLException{
        DButility.establishConnection(DBType.ORACLE);
       List<Map<String,Object>> empData = DButility.runSQLQuery("SELECT first_name, last_name from employees where employee_id = 105");
       Assert.assertEquals( empData.get(0).get("FIRST_NAME"),"David");
       Assert.assertEquals( empData.get(0).get("LAST_NAME"),"Austin");
       DButility.closeConnecions();
    }
}
