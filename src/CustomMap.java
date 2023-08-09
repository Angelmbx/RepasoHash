import java.util.HashMap;

public class CustomMap<K,V> extends HashMap<K,V> {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n"+"Lista de usuarios:"+"\n");
        boolean first = true;

        for (Entry<K, V> entry : entrySet()) {
            if (!first) {
                sb.append("\n");
            }
            sb.append(entry.getKey()).append("-").append(entry.getValue());
            first = false;
        }

        return sb.toString();    }
}
