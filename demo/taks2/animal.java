package taks2;

public class animal {
    public  String name;
    public  String hunt;
    public  String speak;
    public animal(String name,String hunt,String speak){
        this.name=name;
        this.hunt=hunt;
        this.speak=speak;
        catch_and_hunt();
    }
    public void  catch_and_hunt(){
        System.out.println(this.name+"捕猎："+"锁定目标，用"+this.hunt+"抓获！");
        System.out.println(this.name+"会说："+this.speak);
    }
}
