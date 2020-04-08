package database;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO2 {	//오라클 userTBL 연동
	private int no;
	private String username;
	private int birthYear;
	private String addr;
	private String mobile; 
}
