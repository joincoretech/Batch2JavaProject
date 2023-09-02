package class17;

public class IsMirrorDemo {


    // aba  revers aba
    // sbd   ---> dbs

    boolean isMirror(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }

        if(newStr.equals(str)){
            return true;
        } else {
            return false;
        }
    }
}

