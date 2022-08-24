 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author phanl
 */
public class CategoryDAO{
        //dua tat ca bang category ra
    //select * from Categories
    public List<Category> getAll() throws SQLException, Exception{
            List<Category> list = new ArrayList<>();
            String sql= "select * from Category";
            //lenh sql
            try{
        Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
         while(rs.next()){
             Category c = Category.builder().cid(rs.getInt(1)).cname(rs.getString(2)).build();
             
             list.add (c);
         }
    } catch(SQLException e){
                System.out.println(e);
            }  
        return list;
    }
    public void delete(int id) throws Exception{
            String sql="delete from Categories where id=?";
            try{
                Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                ps.setInt(1, id);
                ps.executeUpdate();
                
            }catch(SQLException e){
                System.out.println(e);
            }
    }
   
}
