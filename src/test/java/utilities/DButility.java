package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DButility {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void establishConnection(DBType dbtype) throws SQLException {
        switch (dbtype) {
            case ORACLE:
                connection = DriverManager.getConnection(Config.getProperties("oracledburl"), Config.getProperties("oracledb.user"), Config.getProperties("oracledb.password"));
                break;
            default:
                connection = null;
        }

    }
public static int getRowsCount(String sql) throws SQLException{
    statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    resultSet = statement.executeQuery(sql);
    resultSet.last();
    return resultSet.getRow();
}

    public static List<Map<String, Object>> runSQLQuery(String sql) throws SQLException {

         statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         resultSet = statement.executeQuery(sql);
        ResultSetMetaData rsMetaData = resultSet.getMetaData();
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String,Object> rowNum = new HashMap<>();
        while(resultSet.next()){
            for (int i = 1; i <= rsMetaData.getColumnCount() ; i++) {
              rowNum.put(rsMetaData.getColumnName(i),resultSet.getObject(i));
            }
            list.add(rowNum);
        }
        return list;
    }
  public static void closeConnecions() {

      try {
          if (connection != null) {
              connection.close();
          }
          if (statement != null) {
              statement.close();
          }
          if (resultSet != null) {
              resultSet.close();
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

}