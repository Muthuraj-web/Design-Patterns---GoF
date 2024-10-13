package behaviouralpatterns.visitor.element;

import behaviouralpatterns.visitor.visitor.Visitor;

public class List implements DataType{

    private java.util.List<java.lang.String> list;

    public List(java.util.List<java.lang.String> list){
        this.list = list;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public java.util.List<java.lang.String> getList() {
        return list;
    }
    public void setList(java.util.List<java.lang.String> list) {
        this.list = list;
    }
}
