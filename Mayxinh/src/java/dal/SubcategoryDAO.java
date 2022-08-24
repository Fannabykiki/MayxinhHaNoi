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
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.Subcategory;
import model.Subcategory;

/**
 *
 * @author phanl
 */
public class SubcategoryDAO implements IMethodDAO<Subcategory> {
     public List<Subcategory> getAll() {
        try {
            List<Subcategory> list = new ArrayList<>();
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "select * from Subcategory";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Subcategory subCategory = Subcategory.builder()
                        .sid(rs.getInt(1))
                        .cid(rs.getInt(2))
                        .sname(rs.getString(3))
                        .build();
                list.add(subCategory);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public Subcategory getOne(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Subcategory t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Subcategory t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
