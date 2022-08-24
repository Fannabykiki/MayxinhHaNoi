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

    @Builder
    @Getter
    @Setter
    @ToString
public class Product {
    private int id ;
    private String Code;
    private String Name;
    private int Quantity;
    private float Price;
    private String Description;
    private String Image;
    private String Date;
    private int Staid;
    private int Subid;
    private int Catid;
}
    