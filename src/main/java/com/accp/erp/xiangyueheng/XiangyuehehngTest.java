package com.accp.erp.xiangyueheng;

/**
 * @author xiangyueheng
 * @create 2019-08-26 21:18
 */
public class XiangyuehehngTest {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.print("\n");
        }
    }
}
