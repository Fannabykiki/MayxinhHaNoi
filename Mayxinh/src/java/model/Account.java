/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Account {
   
     public static final int ADMIN = 1;
    public static final int MANAGER = 2;
    public static final int STAFF = 3;
    public static final int CUSTOMER = 4;
    private int id;
    private String username;
    private String password;
    private String fullname;
    private String address;
    private String email;
    private String phone;
    private int roleId;
   
   
}