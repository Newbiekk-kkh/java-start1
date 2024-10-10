package sparta;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strList = new LinkedList<String>();
        Set<String> strSet = new HashSet<>();
        Map<Integer, String> strMap = new HashMap<>();

        System.out.println("저장할 자료구조명을 입력해주세요.");
        String collection = sc.nextLine();
        System.out.println("좋아하는 요리 제목을 입력해주세요.");
        String title = sc.nextLine();

        if (Objects.equals(collection, "List")) {
            while (true) {
                String text = sc.nextLine();
                if (Objects.equals(text, "끝")) {
                    break;
                }
                strList.add(text);
            }

            title = "[ List로 저장된 " + title + " ]";
            System.out.println(title);
            for (int i = 0; i < strList.size(); i++) {
                int number = i + 1;
                System.out.println(number + ". " + strList.get(i));
            }
        } else if (Objects.equals(collection, "Set")) {
            while (true) {
                String text = sc.nextLine();
                if (Objects.equals(text, "끝")) {
                    break;
                }
                strSet.add(text);
            }
            title = "[ Set으로 저장된 " + title + " ]";
            System.out.println(title);
            Iterator iterator = strSet.iterator();
            for (int i = 0; i < strSet.size(); i++) {
                int number = i + 1;
                System.out.println(number + ". " + iterator.next());
            }
        }
    }
}
