package behaviouralpatterns.visitor.element;

import behaviouralpatterns.visitor.visitor.Visitor;

public class Integer implements DataType{
    private int integer;
    public Integer(int integer){
        this.integer = integer;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
}
