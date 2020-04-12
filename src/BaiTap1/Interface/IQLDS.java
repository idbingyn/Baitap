/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.Interface;


import BaiTap1.Else.CaNhan;
import java.util.ArrayList;
/**
 *
 * @author Pistol
 */
public abstract class IQLDS {
    public abstract int them(CaNhan caNhan);
    public abstract int xoa(String ten);
    public abstract void inDS(ArrayList<CaNhan> ds);    
}
