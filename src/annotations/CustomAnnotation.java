package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)

public @interface CustomAnnotation {
    String value();
}
