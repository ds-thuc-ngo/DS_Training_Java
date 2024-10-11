package annotations;

/*

Annotation được hiểu là một dạng chú thích hoặc  một dạng siêu dữ liệu (metadata)
được dùng để cung cấp thông tin dữ liệu cho mã nguồn Java.

Chức năng của annotation:
- Chỉ dẫn cho trình biên dịch
- Chỉ dẫn trong thời điểm biên dịch
- Chỉ dẫn trong tời gian chạy

 */

//Các annotation có sẵn trong java
class ParentClass {
    public void sayHello() {
        System.out.println("Hello Parent");
    }
}

class ChildrenClass extends ParentClass {
    //Override chỉ ra phương thức ghi đè phương thức cha
    @Override
    public void sayHello() {
        System.out.println("Hello Children");
    }

    //Deprecated đánh dầu một class, method chỉ dẫn rằng nó tốt nhất không nên được sử dụng nữa
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method has deprecated annotation");
    }



}

@CustomAnnotation(value = "Ngo Van Thuc")
public class Annotation {

    @CustomAnnotation(value = "20215145")
    private String studentId;

    @CustomAnnotation(value = "Method Annotation")
    public void customMethodUseCustomAnnotation() {
        System.out.println("Using custom annotation on method");
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ChildrenClass childrenClass = new ChildrenClass();
        childrenClass.deprecatedMethod();
        CustomAnnotationProcessor.processAnnotations(Annotation.class);
    }

}
