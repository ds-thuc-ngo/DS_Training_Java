package exception_handling;

/*
Error:
- Là những sự cố nghiêm trọng liên quan đến môi trường runtime của chương trình mà lập trình viên không thể kiểm soát hoặc xử lý được.
- Các Error thường là do hệ thống như lỗi bộ nhớ (OutOfMemoryError), lỗi liên quan đến bộ xử lý (StackOverflowError), hoặc lỗi trong JVM (Java Virtual Machine).
- Error kế thừa từ lớp java.lang.Error và không cần thiết phải xử lý bằng cách sử dụng try-catch.
 */

/*
Exception:
- Là các sự cố có thể xảy ra trong quá trình thực thi, nhưng thường là có thể dự đoán và xử lý được.
- Exception kế thừa từ lớp java.lang.Exception, và lập trình viên có thể xử lý chúng bằng khối try-catch.
 */

/*
readFile {
    try {
        open the file;
        determine its size;
        allocate that much memory;
        read the file into memory;
        close the file;
    } catch (fileOpenFailed) {
       doSomething;
    } catch (sizeDeterminationFailed) {
        doSomething;
    } catch (memoryAllocationFailed) {
        doSomething;
    } catch (readFailed) {
        doSomething;
    } catch (fileCloseFailed) {
        doSomething;
    }
}
 */

/*
method1 {
    try {
        call method2;
    } catch (exception e) {
        doErrorProcessing;
    }
}

method2 throws exception {
    call method3;
}

method3 throws exception {
    call readFile;
}

 */

public class Theory {

//    try {
//        // Code có thể gây ra ngoại lệ
//    } catch (ExceptionType e) {
//        // Code để xử lý ngoại lệ
//    } finally {
//        // Code sẽ luôn được thực thi
//    }


}
