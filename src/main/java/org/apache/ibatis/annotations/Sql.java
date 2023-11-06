package org.apache.ibatis.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Sql.List.class)
public @interface Sql {

  String databaseId() default "";

  String[] value();

  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.METHOD)
  @interface List {
    Sql[] value();
  }
}
