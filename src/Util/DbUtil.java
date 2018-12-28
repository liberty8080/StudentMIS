package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	private String dbUrl = "jdbc:sqlserver://localhost:1433;" + "DatabaseName=StudentMIS"; // ���ݿ����ӵ�ַ
	private String dbUserName = "jacob"; // �û���
	private String dbPassword = "123456"; // ����
	private String jdbcName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // ��������

	/**
	 * ��ȡ���ݿ�����
	 * 
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() {
		try {
			Class.forName(jdbcName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * �ر����ݿ�����
	 * 
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con) throws Exception {
		if (con != null) {
			con.close();
		}
	}

//	public static void main(String[] args) {
//		DbUtil dbUtil = new DbUtil();
//		try {
//			dbUtil.getCon();
//			System.out.println("���ݿ����ӳɹ���");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("���ݿ�����ʧ��");
//		}
//	}
}