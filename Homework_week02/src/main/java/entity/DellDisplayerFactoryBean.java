package entity;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class DellDisplayerFactoryBean implements FactoryBean<Displayer> {
    @Override
    public Displayer getObject() {
        return new DellDisplayer();
    }

    @Override
    public Class<?> getObjectType() {
        return Displayer.class;
    }
}
