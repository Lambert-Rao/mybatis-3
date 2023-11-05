package org.apache.ibatis.scripting.xmltags;

import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.scripting.defaults.RawSqlSource;

import java.util.Objects;

/**
 * 功能简述
 *
 * @author hssy
 * @version 1.0
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
}
