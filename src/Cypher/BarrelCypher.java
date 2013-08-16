/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cypher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


/**
 *
 * @author Alberto Lorente
 */
public class BarrelCypher {

    public static void main(String[] args) throws Exception{
        //BufferedReader rd = new BufferedReader(new FileReader(args[0]));
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.valueOf(r.readLine());
        for(int i=0;i<m;i++){
            char[]k=r.readLine().toCharArray();
            char[]e=r.readLine().toCharArray();
            int x=0;
            Boolean a= true;
            for(int j=0;j<e.length;j++){
                if(e[j]!=' '){
                    //int t=e[j]-Integer.valueOf(k[x]+"");
                    e[j]=(char)((e[j]-Integer.valueOf(k[x]+"")<97)?e[j]-Integer.valueOf(k[x]+"")+26:e[j]-Integer.valueOf(k[x]+""));
                    x=a?++x:--x;
                    if(a&&(x==k.length)){
                            x=k.length-1;
                            a=false;
                    }
                    else if(x==-1){
                            x=0;
                            a=true;   
                    }
                }
            }
            System.out.println(new String(e));
        }
        
    }
}
