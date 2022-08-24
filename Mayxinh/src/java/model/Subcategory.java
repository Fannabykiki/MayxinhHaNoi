/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Getter;
import lombok.Builder;
import lombok.Setter;
import lombok.ToString;
 @Getter
 @Builder
 @Setter
 @ToString
 
public class Subcategory  {
    private int sid;
    private int cid;
    private String sname;
   
}
