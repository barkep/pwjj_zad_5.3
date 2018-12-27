import java.util.LinkedList;
import java.util.StringTokenizer;

class Graf {
    private int n; // liczba wierzchołków, V = {0,1,...,n-1}
    private LinkedList[] tab; // tablica wierzchołków połączonych z danym wierzcholkiem

    public Graf(String lan) {
        StringTokenizer st = new StringTokenizer(lan, "() ,");
        n = Integer.parseInt(st.nextToken());
        tab = new LinkedList[n];
        for (int i = 0; i < n; ++i)
            tab[i] = new LinkedList();
        while (st.hasMoreTokens()) {
            tab[Integer.parseInt(st.nextToken())].add(st.nextToken());
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tab.length; i++) {
            sb.append(i);
            sb.append(':');
            for (Object o : tab[i]) {
                sb.append(" ");
                sb.append(o);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}