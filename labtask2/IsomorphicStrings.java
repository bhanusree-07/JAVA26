import java.util.Scanner;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map1[c1] != map2[c2])
                return false;

            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("24eu02037\n");
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        if (isIsomorphic(s1, s2))
            System.out.println("The strings are Isomorphic.");
        else
            System.out.println("The strings are Not Isomorphic.");

        sc.close();
    }
}