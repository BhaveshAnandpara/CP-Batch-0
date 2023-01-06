import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesignerPDFViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        
        int highest = 0;
        
        for (int i = 0; i < word.length(); i++) {

            if( h.get( (int)word.charAt(i) - 97 ) > highest ){
                highest = h.get( word.charAt(i) );
            }
        
        }

        return highest*word.length();


        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            arr.add(sc.nextInt());
        }

        String text = sc.nextLine();

        System.out.println( designerPdfViewer(arr, text) );


        sc.close();

    }

}
