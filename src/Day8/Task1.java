package Day8;

public class Task1 {
    public static void main(String[] args) {
        for(int i = 0; i < 20000; i++){
            String str = i + " ";
            System.out.print(str);
        }


        for(int i = 0; i < 20000; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(i);
            System.out.print(sb);
        }
    }
}
