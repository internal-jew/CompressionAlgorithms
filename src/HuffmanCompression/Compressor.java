package HuffmanCompression;

import java.util.*;

public class Compressor {

    public static void main(String[] args) {

        String s = "abracadabra";

        HuffmanTree tree = HuffmanTree.growTree(s);

        Map<Character, String> tableOfCodes = tree.createTable(tree.getParentNode());


        for (Map.Entry entry : tableOfCodes.entrySet()) {
            System.out.println("key = " + entry.getKey() + "  Val = " + entry.getValue());
        }

        Byte[] bytes = new Byte[s.length()];

    }


}
