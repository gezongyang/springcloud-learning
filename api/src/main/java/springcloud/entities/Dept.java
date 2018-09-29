package springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@NoArgsConstructor
//@AllArgsConstructor
@Data //注解在类上, 为类提供读写属性, 此外还提供了 equals()、hashCode()、toString() 方法
@Accessors(chain=true)//产生的setter返回的this而不是void
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}
}
