class box{

}private int l,b,h;
/**
 * @param l
 * @param b
 * @param h
 */
public void setData(int l,int b,int h ){
    this.l=l;
    this.b=b;
    this.h=h;
    show();
    
}
public void show(){
    System.out.println((l+" ,"+b+","+h));
}
class Use Box{
    public static void main(Sting[]args){
        Box B=new box()
        B.setData(10,20,30);
    }
}