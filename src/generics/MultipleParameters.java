package generics;

public class MultipleParameters<K, V> {

    private K key;
    private V value;

    public MultipleParameters(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        MultipleParameters<String, String> chiDuong = new MultipleParameters<>("Chị Dương", "Xinh vl");
        MultipleParameters<String, Double> chiDung = new MultipleParameters<>("Chị Dung hay úp bô", 140.0);

        System.out.println(chiDuong.getKey() + " " + chiDuong.getValue());
        System.out.print(chiDung.getKey() + " " + chiDung.getValue() + " ");
        chiDung.setKey("điểm");
        System.out.println(chiDung.getKey());

    }
}
