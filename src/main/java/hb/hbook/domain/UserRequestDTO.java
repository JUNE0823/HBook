package hb.hbook.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequestDTO {
  private Integer  id;
  private String   username;
  private Integer  age;
  private String   job;
  private String   teamname;
}
