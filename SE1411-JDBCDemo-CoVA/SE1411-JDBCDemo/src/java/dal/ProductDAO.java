
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO extends DBContext{
    public List<Product> getAll(){
        List<Product> list=new ArrayList<>();
        String sql="select * from Products";
        try{
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p=new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getDate(9));
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    public List<Product> getListByPage(List<Product> list,
            int start,int end){
        List<Product> arr=new ArrayList<>();
        for(int i=start;i<end;i++){
            arr.add(list.get(i));
        }
        return arr;
    }

}
