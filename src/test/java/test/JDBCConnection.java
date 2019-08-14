package test;

import org.junit.Ignore;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCConnection {

    String oracleDBUrl = "jdbc:oracle:thin:@ec2-3-82-250-229.compute-1.amazonaws.com:1521:xe";
    String oracleDBUsername = "hr";
    String oracleDBPassword = "hr";
@Ignore
@Test
    public void JDBCConnection() throws SQLException {
    Connection connection = DriverManager.getConnection(oracleDBUrl,oracleDBUsername,oracleDBPassword);
    //Statement statement = connection.createStatement();
    Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

    ResultSet resultSet = statement.executeQuery("select * from countries");
    resultSet.next();
    System.out.println(resultSet.getString("country_name"));
    System.out.println(resultSet.getString(1));

    resultSet.beforeFirst();
    while(resultSet.next()){
        System.out.println(resultSet.getString(1)+"-"+resultSet.getString("country_name")+"-"+resultSet.getInt(3));
    }

    resultSet.close();
    statement.close();
    connection.close();
}

@Test
    public void JDBCMetaData() throws SQLException {
    Connection connection = DriverManager.getConnection(oracleDBUrl, oracleDBUsername, oracleDBPassword);
    Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    String sql = "select employee_id, last_name, job_id, salary from employees";

    ResultSet resultSet = statement.executeQuery(sql);
   // Database metadata
    DatabaseMetaData dbMetadata = connection.getMetaData();
    System.out.println("User:" + dbMetadata.getUserName());
    System.out.println("Database type: "+ dbMetadata.getDatabaseProductName());
    //result set metadata
    ResultSetMetaData rsMedata = resultSet.getMetaData();
    System.out.println("Columns count: " + rsMedata.getColumnCount());
    System.out.println("Column name: " + rsMedata.getColumnName(1));
    System.out.println(resultSet.absolute(1));

    for (int i = 1; i <= rsMedata.getColumnCount(); i++) {
        System.out.println(rsMedata.getColumnName(i));
        
    }

    //Throw resultSet into a List of Maps
    //Create a List of Maps
    List<Map<String, Object>> list = new ArrayList<>();
    ResultSetMetaData rsMdata = resultSet.getMetaData();
    int colCount = rsMdata.getColumnCount();
    while(resultSet.next()){
        Map<String, Object> rowMap = new HashMap <>();
        for (int col = 1; col <= colCount; col++) {
            rowMap.put(rsMdata.getColumnName(col),resultSet.getObject(col));

        }

        list.add(rowMap);
    }

//Print all the employee_id from the list of maps;
resultSet.beforeFirst();
    while (resultSet.next()) {
        for (int i = 1; i <= rsMdata.getColumnCount(); i++) {
            System.out.println(list.get(i).get("EMPLOYEE_ID"));
        }
    }

    connection.close();
    statement.close();
    resultSet.close();
}


}
