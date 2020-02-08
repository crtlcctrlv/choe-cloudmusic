// package choe.learn.mybatis;
//
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.Reader;
// import org.apache.ibatis.io.Resources;
// import org.apache.ibatis.jdbc.ScriptRunner;
// import org.apache.ibatis.session.SqlSession;
// import org.apache.ibatis.session.SqlSessionFactory;
// import org.apache.ibatis.session.SqlSessionFactoryBuilder;
// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import cn.matsu.choe.learn.mybatis.entity.po.Employee;
// import cn.matsu.choe.learn.mybatis.mapper.EmployeeExtMapper;
// import cn.matsu.choe.learn.mybatis.mapper.EmployeeMapper;
//
// public class MybatisTest {
//
// private SqlSession session;
//
// private EmployeeMapper employeeMapper;
//
// private EmployeeExtMapper employeeExtMapper;
//
// @Before
// public void setUp() throws IOException {
// InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
// SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
// session = sqlSessionFactory.openSession(true);
//
// employeeMapper = session.getMapper(EmployeeMapper.class);
// employeeExtMapper = session.getMapper(EmployeeExtMapper.class);
//
// // init script
// Reader reader = Resources.getResourceAsReader("init.sql");
// ScriptRunner runner = new ScriptRunner(session.getConnection());
// runner.runScript(reader);
//
// // employeeExtMapper.init();
// }
//
// @After
// public void tearDown() {
// // employeeExtMapper.destroy();
// session.close();
// }
//
// @Test
// public void test1() {
// Employee employee1 = employeeMapper.selectByPrimaryKey(1);
// Employee employee2 = employeeMapper.selectByPrimaryKey(2);
//
// System.out.println(employee1);
// System.out.println(employee2);
// }
//
// }
