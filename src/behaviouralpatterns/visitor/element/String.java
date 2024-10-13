package behaviouralpatterns.visitor.element;

import behaviouralpatterns.visitor.visitor.Visitor;

public class String implements DataType{

    private java.lang.String str;
    public String(java.lang.String str){
        this.str = str;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public java.lang.String getStr() {
        return str;
    }
    public void setStr(java.lang.String str) {
        this.str = str;
    }
}
