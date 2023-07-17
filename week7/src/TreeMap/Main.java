package TreeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T, Q;
        T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            Q = scan.nextInt();
            scan.nextLine();
            TreeMap<Integer, Integer> tree = new TreeMap<>();
            for (int j = 0; j <= Q; j++) {
                String Query = scan.nextLine();
                String[] Querypart = Query.split(" ");
                String operation = Querypart[0];
                if (operation.equals("a")) {
                    int K = Integer.parseInt(Querypart[1]);
                    int V = Integer.parseInt(Querypart[2]);
                    tree.put(K, V);
                } else if (operation.equals("b")) {
                    int k = Integer.parseInt(Querypart[1]);
                    int v = tree.getOrDefault(k,-1);
                    if (tree.containsKey(k))
                        System.out.println(v);
                    else
                        System.out.println(-1);
                } else if (operation.equals("c")) {
                    System.out.println(tree.size());

                } else if (operation.equals("d")) {
                    int key = Integer.parseInt(Querypart[1]);
                    tree.remove(key);
                } else if (operation.equals("e")) {
                    for (Map.Entry<Integer, Integer> map : tree.entrySet())
                        System.out.println(map.getKey());

                }
            }
        }
    }
}
