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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Order;

public class OrderDAO {

    public int createReturnId(Order order) {
        try {
            String sql = "INSERT INTO [dbo].[Order]\n"
                    + "           ([Account_ID]\n"
                    + "           ,[Total_Price]\n"
                    + "           ,[Note]\n"
                    + "           ,[Ship_ID])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getAccountid());
            ps.setDouble(2, order.getTotalPrice());
            ps.setString(3, order.getNote());
            ps.setInt(4, order.getShippingId());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
