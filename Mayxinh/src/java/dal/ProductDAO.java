/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Product;

/**
 *
 * @author phanl
 */
public class ProductDAO {

    public List<Product> getAll() throws SQLException, Exception {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "select p.Product_ID,p.Product_Code,p.Product_Name,p.Quantity,p.Price,p.Description,\n"
                    + "                      p.Image,p.Date,p.Status_ID,p.Subcategory_ID,p.Category_ID,c.Category_Name \n"
                    + "                     from Product p inner join Category c\n"
                    + "                      on p.Category_ID = c.Category_ID";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = Product.builder().id(rs.getInt(1)).Code(rs.getString(2))
                        .Name(rs.getString(3)).Quantity(rs.getInt(4)).Price(rs.getFloat(5)).Description(rs.getString(6)).
                        Image(rs.getString(7)).Date(rs.getString(8)).Staid(rs.getInt(9)).Subid(rs.getInt(10)).Catid(rs.getInt(11))
                        .build();
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void deleteProduct(int pid) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "DELETE FROM [dbo].[Product]\n"
                    + "      WHERE Product_ID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pid);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public List<Product> getListByPage(List<Product> list,
            int start, int end) {
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }

    public List<Product> getProductsWithPagging(int page, int PAGE_SIZE) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select *  from Product order by Product_ID\n"
                    + "offset (?-1)*? row fetch next ? rows only";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, page);
            ps.setInt(2, PAGE_SIZE);
            ps.setInt(3, PAGE_SIZE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = Product.builder().id(rs.getInt(1)).Code(rs.getString(2))
                        .Name(rs.getString(3)).Quantity(rs.getInt(4)).Price(rs.getFloat(5)).Description(rs.getString(6)).
                        Image(rs.getString(7)).Date(rs.getString(8)).Staid(rs.getInt(9)).Subid(rs.getInt(10)).Catid(rs.getInt(11))
                        .build();

                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int getTotalProducts() {
        try {
            String sql = "select count(Product_ID)  from Product ";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> getTop3Products() {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "select top(3) *  from Product";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = Product.builder().id(rs.getInt(1)).Code(rs.getString(2))
                        .Name(rs.getString(3)).Quantity(rs.getInt(4)).Price(rs.getFloat(5)).Description(rs.getString(6)).
                        Image(rs.getString(7)).Date(rs.getString(8)).Staid(rs.getInt(9)).Subid(rs.getInt(10)).Catid(rs.getInt(11))
                        .build();
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        List<Product> list = new ArrayList<>();
        //lenh sql
        try {
            Connection conn = new DBContext().getConnection();
            String sql = "select * from Product where Product.Category_ID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product p = Product.builder()
                        .id(rs.getInt(1))
                        .Code(rs.getString(2))
                        .Name(rs.getString(3))
                        .Quantity(rs.getInt(4))
                        .Price(rs.getFloat(5))
                        .Description(rs.getString(6)).
                        Image(rs.getString(7))
                        .Date(rs.getString(8))
                        .Staid(rs.getInt(9))
                        .Subid(rs.getInt(10))
                        .Catid(rs.getInt(11))
                        .build();
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Product getProductByID(int Product_ID) {
        try {
            String sql = "select * from Product where Product_ID = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Product_ID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1)).Code(rs.getString(2))
                        .Name(rs.getString(3)).Quantity(rs.getInt(4)).Price(rs.getFloat(5)).Description(rs.getString(6)).
                        Image(rs.getString(7)).Date(rs.getString(8)).Staid(rs.getInt(9)).Subid(rs.getInt(10)).Catid(rs.getInt(11))
                        .build();
//                Category category = Category.builder().cid(rs.getInt(12)).cname(rs.getString(13)).build();
//                product.setCate(category);
                return product;

            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Product> search(String keyword) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select *  from Product where Product_Name like ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1)).Code(rs.getString(2))
                        .Name(rs.getString(3)).Quantity(rs.getInt(4)).Price(rs.getFloat(5)).Description(rs.getString(6)).
                        Image(rs.getString(7)).Date(rs.getString(8)).Staid(rs.getInt(9)).Subid(rs.getInt(10)).Catid(rs.getInt(11)).build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void editProduct(int id, String name, int quantity, Float price,
            String description, String image, int subcategory, int category) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "UPDATE [dbo].[Product]\n"
                    + "   SET [Product_ID] = ?\n"
                    + "      ,[Product_Name] = ?\n"
                    + "      ,[Quantity] = ?\n"
                    + "      ,[Price] = ?\n"
                    + "      ,[Description] = ?\n"
                    + "      ,[Image] = ?\n"
                    + "      ,[Subcategory_ID] = ?\n"
                    + "      ,[Category_ID] = ?\n"
                    + " WHERE <Product_ID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, quantity);
            ps.setFloat(4, price);
            ps.setString(5, description);
            ps.setString(6, image);
            ps.setInt(7, subcategory);
            ps.setInt(8, category);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public Product getOne(String id) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "select * from Product where Product_ID=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return Product.builder()
                        .id(rs.getInt(1))
                        .Code(rs.getString(2))
                        .Name(rs.getString(3))
                        .Quantity(rs.getInt(4))
                        .Price(rs.getFloat(5))
                        .Description(rs.getString(6)).
                        Image(rs.getString(7))
                        .Date(rs.getString(8))
                        .Staid(rs.getInt(9))
                        .Subid(rs.getInt(10))
                        .Catid(rs.getInt(11))
                        .build();
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public void insertProduct(String pname, int pquantity, Float pprice,
            String pdescription, int pcategory, int pscategory) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "INSERT INTO [dbo].[Product]\n"
                    + "           (\n"
                    + "    [Product_Name]\n"
                    + "           ,[Quantity]\n"
                    + "           ,[Price]\n"
                    + "           ,[Description]          \n"
                    + "           ,[Subcategory_ID]\n"
                    + "           ,[Category_ID])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pname);
            ps.setInt(2, pquantity);
            ps.setString(4, pdescription);
            ps.setFloat(3, pprice);
            ps.setInt(5, pcategory);
            ps.setInt(6, pscategory);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void editProduct(String pname, int pquantity, Float pprice,
             String pdescription, String pimage,
            int sid, int cid) {
        String sql = "UPDATE [dbo].[Product]\n"
                + "   SET \n"
                + "      [Product_Name] = ?\n"
                + "      ,[Quantity] = ?\n"
                + "      ,[Price] = ?\n"
                + "      ,[Description] = ?\n"
                + "      ,[Image] = ?\n"
                + "      ,[Subcategory_ID] = ?\n"
                + "      ,[Category_ID] = ?\n"
                + " WHERE Product_ID = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pname);
            ps.setInt(2, pquantity);
            ps.setFloat(3, pprice);
            ps.setString(4, pdescription);
            ps.setString(5, pimage);
            ps.setInt(6, sid);
            ps.setInt(7, cid);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
    }

    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product\n"
                + "where Category_ID = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1)).Code(rs.getString(2))
                        .Name(rs.getString(3)).Quantity(rs.getInt(4)).Price(rs.getFloat(5)).Description(rs.getString(6)).
                        Image(rs.getString(7)).Date(rs.getString(8)).Staid(rs.getInt(9)).Subid(rs.getInt(10)).Catid(rs.getInt(11)).build();
                list.add(product);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductByid(String id) {
        String sql = "select * from Product\n"
                + "where Product_ID = ?";
        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1)).Code(rs.getString(2))
                        .Name(rs.getString(3)).Quantity(rs.getInt(4)).Price(rs.getFloat(5)).Description(rs.getString(6)).
                        Image(rs.getString(7)).Date(rs.getString(8)).Staid(rs.getInt(9)).Subid(rs.getInt(10)).Catid(rs.getInt(11))
                        .build();

                return product;

            }
        } catch (Exception e) {
        }
        return null;
    }
}
