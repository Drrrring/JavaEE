package entity;

import org.springframework.beans.factory.FactoryBean;

public class DellDisplayerFactoryBean implements FactoryBean<Displayer> {
    @Override
    public Displayer getObject() {
        DellDisplayer dellDisplayer = new DellDisplayer();
        return dellDisplayer;
    }

    @Override
    public Class<?> getObjectType() {
        return Displayer.class;
    }
}
