
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CategoryDAO extends DBContext{
      public List<Category> getAll(){
          List<Category> list=new ArrayList<>();
          String sql="select * from categories";
          try{
              PreparedStatement st=con.prepareStatement(sql);
              ResultSet rs=st.executeQuery();
              while(rs.next()){
                  list.add(new Category(rs.getString(1),
                          rs.getString(2),
                          rs.getString(3)));
              }
          }catch(SQLException e){
              System.out.println(e);
          }
          return list;
      }  
      public boolean exsitedCat(String id){
          String sql="select * from categories where id=?";
          try{
              PreparedStatement st=con.prepareStatement(sql);
              st.setString(1, id);
              ResultSet rs=st.executeQuery();
              if(rs.next())
                  return true;
          }catch(SQLException e){
              System.out.println(e);
          }
          return false;        
      }
      //chen vao bang
      public void insert(Category c){
          String sql="insert into categories values(?,?,?)";
          try{
              PreparedStatement st=con.prepareStatement(sql);
              st.setString(1, c.getId());
              st.setString(2, c.getName());
              st.setString(3, c.getDescribe());
              st.executeUpdate();
          }catch(SQLException e){
              System.out.println(e);
          }
      }
      public void delete(String id){
          String sql="delete from categories where id=?";
          try{
              PreparedStatement st=con.prepareStatement(sql);
              st.setString(1, id);
              st.executeUpdate();
          }catch(SQLException e){
              System.out.println(e);
          }
      }
      public Category getCatByID(String id){
          String sql="select * from categories where id=?";
          try{
              PreparedStatement st=con.prepareStatement(sql);
              st.setString(1, id);
              ResultSet rs=st.executeQuery();
              if(rs.next())
                  return new Category(rs.getString(1),rs.getString(2),
                          rs.getString(3));
          }catch(SQLException e){
              System.out.println(e);
          }
          return null;        
      }
      public void update(Category c){
          String sql="update categories set [name]=?, describe=? where id=?";
          try{
              PreparedStatement st=con.prepareStatement(sql);
              st.setString(1, c.getName());
              st.setString(2, c.getDescribe());
              st.setString(3, c.getId());
              st.executeUpdate();
          }catch(SQLException e){
              System.out.println(e);
          }
      }
      public List<Category> getListByPage(List<Category> list,
            int start,int end){
        List<Category> arr=new ArrayList<>();
        for(int i=start;i<end;i++){
            arr.add(list.get(i));
        }
        return arr;
    }
}
