package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomAnnotationProcessor {

    public static void processAnnotations(Class<?> clazz) {
        // Kiểm tra Annotation trên class
        if (clazz.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation classAnnotation = clazz.getAnnotation(CustomAnnotation.class);
            System.out.println("Class: " + clazz.getSimpleName() + " - Annotation value: " + classAnnotation.value());
        }

        // Kiểm tra Annotation trên field
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation fieldAnnotation = field.getAnnotation(CustomAnnotation.class);
                System.out.println("Field: " + field.getName() + " - Annotation value: " + fieldAnnotation.value());
            }
        }

        // Kiểm tra Annotation trên method
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation methodAnnotation = method.getAnnotation(CustomAnnotation.class);
                System.out.println("Method: " + method.getName() + " - Annotation value: " + methodAnnotation.value());
            }
        }
    }
}
