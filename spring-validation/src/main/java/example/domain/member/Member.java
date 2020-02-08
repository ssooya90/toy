package example.domain.member;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Member {

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String phone1;

	@Column(nullable = false)
	private String phone2;

	@Column(nullable = false)
	private String phone3;

	@Column(nullable = false)
	private String email;



}
