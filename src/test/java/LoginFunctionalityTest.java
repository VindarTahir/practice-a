import java.util.ArrayList;

public class LoginFunctionalityTest {

    // testing code

    // automation code ----

    public static void main(String[] args) {
        String vrl = "VuRal";
        ArrayList<String> kck = new ArrayList<>();
        ArrayList<String> byk = new ArrayList<>();
        int kccck = 0;
        int byyk = 0;
        for (int i = 0; i < vrl.length(); i++) {
            if(Character.isUpperCase(vrl.charAt(i))) {
                byk.add(vrl.charAt(i)+"");
                byyk++;
            } else {
                kck.add(vrl.charAt(i)+"");
                kccck++;
            }
        }
        System.out.println(kck.size());
        System.out.println(byk.size());

        System.out.println(kccck);
        System.out.println(byyk);

    }

}
