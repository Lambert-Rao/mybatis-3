package org.apache.ibatis.scripting.xmltags;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.SqlSource;

/**
 * @author lambert rao
 */
public class IncludeSqlSource implements SqlSource {
  private final boolean isDynamic;

  private SqlNode rootSqlNode;

  private String sqlString;

  private final SqlSource sqlSource;

  public IncludeSqlSource(boolean isDynamic, SqlNode rootSqlNode, SqlSource sqlSource) {
    this.isDynamic = isDynamic;
    this.rootSqlNode = rootSqlNode;
    this.sqlSource = sqlSource;
  }

  public IncludeSqlSource(boolean isDynamic, String sqlString, SqlSource sqlSource) {
    this.isDynamic = isDynamic;
    this.sqlString = sqlString;
    this.sqlSource = sqlSource;
  }


  public boolean isDynamic() {
    return isDynamic;
  }

  public SqlNode getRootSqlNode() {
    return rootSqlNode;
  }

  public String getSqlString() {
    return sqlString;
  }

  public SqlSource getSqlSource() {
    return sqlSource;
  }

  @Override
  public BoundSql getBoundSql(Object parameterObject) {
    return sqlSource.getBoundSql(parameterObject);
  }
}
