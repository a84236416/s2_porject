package task1;

import org.omg.Messaging.SyncScopeHelper;

import java.sql.SQLOutput;

public class poultry {
    public String name;
    public String love;
    public  String behavior;
    public String  variety;
    public poultry(String name,String love,String behavior,String variety){
        this.name=name;
        this.love=love;
        this.variety=variety;
        this.behavior=behavior;
        motion();
    }
    public void  motion(){
        System.out.println("我叫"+this.name+",是一只"+this.behavior+"!");
        System.out.println("我喜欢"+this.love+"!");
        System.out.println("我会"+this.variety+"!");
    }
}
