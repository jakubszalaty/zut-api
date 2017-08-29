public class Random{
	public int nextInt(int a){
		return a;
	}
}
public class Calendar{
	public static Calendar getInstance(){
        return new Calendar();
    }
    public void setTime(int date){

    }
    public int get(int a){
        return a;
    }
}

public class LoginActivity{
    private String m3253a(String str, String str2) {
        String str3 = "d4Hb7BsxUDqaiBATQe7KuhvBQuh2T82j";
        try {
            Random random = new Random();
            StringBuffer stringBuffer = new StringBuffer(32);
            char[] cArr = new char[]{'2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            char[] cArr2 = new char[]{'v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'W', 'X', 'Y', 'Z', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V'};
            int length = cArr.length;
            for (int i = 0; i < 32; i++) {
                stringBuffer.append(cArr[random.nextInt(length)]);
            }
            String stringBuffer2 = stringBuffer.toString();
            if (str2 == null || str2.length() <= 0) {
                return stringBuffer2;
            }
            Calendar instance = Calendar.getInstance();
            instance.setTime(1);
            String str4 = str + str2;
            int[] iArr = new int[]{str4.length() - 1, str4.length() - 5, str4.length() - 8, instance.get(5), instance.get(7), instance.get(8)};
            if ((((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4]) + iArr[5]) % 2 == 0) {
                iArr[0] = instance.get(5);
                iArr[1] = str4.length() + 3;
                iArr[2] = str4.length() + 9;
                iArr[3] = instance.get(7);
                iArr[4] = str4.length();
                iArr[5] = instance.get(8);
                cArr = cArr2;
            }
            String str5 = "";
            for (int i2 = 0; i2 < stringBuffer2.length(); i2++) {
                String substring = stringBuffer2.substring(i2, i2 + 1);
                StringBuffer stringBuffer3 = new StringBuffer(32);
                if (iArr[0] == i2 && iArr[0] < 32) {
                    stringBuffer3.append(cArr[iArr[0]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[1] == i2 && iArr[1] < 32) {
                    stringBuffer3.append(cArr[iArr[1]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[2] == i2 && iArr[2] < 32) {
                    stringBuffer3.append(cArr[iArr[2]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[3] == i2 && iArr[3] < 32) {
                    stringBuffer3.append(cArr[iArr[3]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[4] == i2 && iArr[4] < 32) {
                    stringBuffer3.append(cArr[iArr[4]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if (iArr[5] != i2 || iArr[5] >= 32) {
                    str5 = str5 + substring;
                } else {
                    stringBuffer3.append(cArr[iArr[5]]);
                    str5 = str5 + stringBuffer3.toString();
                }
            }
            return str5;
        } catch (Exception e) {
            return "p4Hb7BwxUDqaiBATQe7KRhvBQuh2TY2j";
        }
    }
}