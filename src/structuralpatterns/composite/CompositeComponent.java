package structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Component{

    private List<Component> componentList;
    public CompositeComponent(){
        this.componentList = new ArrayList<>();
    }

    public void addComponent(Component component){
        componentList.add(component);
    }

    @Override
    public void changeColor(String color) {
        for(Component component:componentList){
            component.changeColor(color);
        }
    }

    @Override
    public void resize(double width, double height) {
        for(Component component:componentList){
            component.resize(width,height);
        }
    }
}
