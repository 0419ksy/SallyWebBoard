package com.board.Dao;

import java.sql.*;

public class BoardDao {
    public static void main(String[] args) {
        Connection con = null;

        String server = "localhost:3306"; // MySQL 서버 주소
        String database = "board"; // MySQL DATABASE 이름
        String user_name = "root"; //  MySQL 서버 아이디
        String password = "1234"; // MySQL 서버 비밀번호

        final String COUNT_BOARD = "SELECT * FROM board";

        // 1.드라이버 로딩
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }

        // 2.연결
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
            System.out.println("정상적으로 연결되었습니다.");

            PreparedStatement pstmt = con.prepareStatement(COUNT_BOARD);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next())
                System.out.println(rs.getString("contents"));

        } catch (SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }

        // 3.해제
        try {
            if (con != null)
                con.close();
        } catch (SQLException e) {
        }
    }
}
