//Interface
interface Logger {
    public void Log(String str);
    public void Error(String str);
}
    
class AsteriskLogger implements Logger{
    public void Log(String str) {
        System.out.println("***" + str + "***");
    }

    public void Error(String str) {
        int len = str.length() + 6;
        String astBox = "";
        for(int i = 0; i < len; i++){
            astBox = astBox.concat("*");
        }
        System.out.println(astBox);
        System.out.println("***" + str + "***");
        System.out.println(astBox);
    }
}

class SpacedLogger implements Logger{
    public void Log(String str) {
        int strLen = str.length();
        int arrLen = strLen + (strLen - 1);
        int ctr = 0;
        char[] charArr = new char[arrLen];
        for(int i = 0; i < arrLen ; i ++) {
            if(i%2==0){ 
                charArr[i] = str.charAt(ctr);
                ctr++;
            }
            else {
                charArr[i] = ' ';
            }
        }
        charArr[arrLen-1] = str.charAt(strLen-1);
        String spaceStr = new String(charArr);
        System.out.println(spaceStr);
    }

    public void Error(String str) {
        int strLen = str.length();
        int arrLen = strLen + (strLen - 1);
        int ctr = 0;
        char[] charArr = new char[arrLen];
        for(int i = 0; i < arrLen ; i ++) {
            if(i%2==0){ 
                charArr[i] = str.charAt(ctr);
                ctr++;
            }
            else {
                charArr[i] = ' ';
            }
        }
        charArr[arrLen-1] = str.charAt(strLen-1);
        String spaceStr = new String(charArr);
        System.out.println("ERROR: " + spaceStr);
    }
}


public class App {
    public static void main(String[] args) {
        System.out.println("\n");
        String myName = "Caractacus";

        AsteriskLogger myAstLog = new AsteriskLogger();
        myAstLog.Log(myName);
        System.out.println("\n");
        myAstLog.Error(myName);
        System.out.println("\n");

        SpacedLogger mySpaceLog = new SpacedLogger();
        mySpaceLog.Log(myName);
        System.out.println("\n");
        mySpaceLog.Error(myName);
        System.out.println("\n");

    }
}
