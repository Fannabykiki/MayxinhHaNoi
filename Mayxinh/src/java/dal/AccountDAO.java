/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Egamorft
 */
public class AccountDAO implements IMethodDAO<Account> {

    public Account login(String username, String password) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "select * from Account where Username = ? and Password =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return Account.builder()
                        .id(rs.getInt(1))
                        .username(rs.getString(2))
                        .password(rs.getString(3))
                        .fullname(rs.getString(4))
                        .address(rs.getString(5))
                        .email(rs.getString(6))
                        .phone(rs.getString(7))
                        .roleId(rs.getInt(8))
                        .build();
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();
        Account a = dao.login("Admin", "admin");
        System.out.println("a = " + a);

    }

    public Account checkAccountExisted(String username) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "select * from Account where Username = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return Account.builder()
                        .id(rs.getInt(1))
                        .username(rs.getString(2))
                        .password(rs.getString(3))
                        .fullname(rs.getString(4))
                        .address(rs.getString(5))
                        .email(rs.getString(6))
                        .phone(rs.getString(7))
                        .roleId(rs.getInt(8))
                        .build();
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public void signup(String user, String pass, String email, String address, String phone) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([Username]\n"
                    + "           ,[Password]\n"
                    + "           ,[Full Name]\n"
                    + "           ,[Email]\n"
                    + "           ,[Address]\n"
                    + "           ,[Phone]\n"
                    + "           ,[Role_ID])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,1)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, user);
            ps.setString(5, address);
            ps.setString(4, email);
            ps.setString(6, phone);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void EditProfile(String username, String fullname, String email, String address, String phone) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET [Full Name] = ?\n"
                    + "      ,[Address] = ?\n"
                    + "      ,[Email] = ?\n"
                    + "      ,[Phone] = ?\n"
                    + " WHERE Username = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, fullname);
            ps.setString(2, address);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, username);
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public List<Account> getAll() {
        try {
            List<Account> list = new ArrayList<>();
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "select * from Account";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account = Account.builder()
                        .id(rs.getInt(1))
                        .username(rs.getString(2))
                        .password(rs.getString(3))
                        .fullname(rs.getString(4))
                        .address(rs.getString(5))
                        .email(rs.getString(6))
                        .phone(rs.getString(7))
                        .roleId(rs.getInt(8))
                        .build();
                list.add(account);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public void editAccount(String username, String fname, String address, String email, String phone, String password, String role) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET [Password] = ?\n"
                    + "      ,[Full Name] = ?\n"
                    + "      ,[Address] = ?\n"
                    + "      ,[Email] = ?\n"
                    + "      ,[Phone] = ?\n"
                    + "      ,[Role_ID] = ?\n"
                    + " WHERE Username = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, password);
            ps.setString(2, fname);
            ps.setString(3, address);
            ps.setString(4, email);
            ps.setString(5, phone);
            ps.setString(6, role);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void changePass(String username, String newpass) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET [Password] = ?\n"
                    + " WHERE Username = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newpass);
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public Account getOne(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean insert(Account t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Account t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
