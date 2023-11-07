package org.apache.ibatis.scripting.xmltags;

import java.util.Objects;

/**
 * @author hssy
 */
public class IncludeSqlNode implements SqlNode{

  private SqlNode sqlNode;

  private String sqlString;


  @Override
  public boolean apply(DynamicContext context) {
      if(Objects.nonNull(sqlNode)){
          sqlNode.apply(context);
      }else{
        context.appendSql(sqlString);
      }


    return true;
  }

  public void setSqlNode(SqlNode sqlNode) {
    this.sqlNode = sqlNode;
  }

  public void setSqlString(String sqlString) {
    this.sqlString = sqlString;
  }

  public SqlNode getSqlNode() {
    return sqlNode;
  }

  public String getSqlString() {
    return sqlString;
  }
}
