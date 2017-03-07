// loop with irrelevant body
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.File;

class Test {
    BufferedReader br;
    public Test(File file) {
        br = new BufferedReader(new FileReader(file));
    }

    public void doTest() {
        String s;
        while ((s = br.readLine() != null))
            System.out.println(s);
        br.close();
    }
}
