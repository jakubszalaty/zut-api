/* Generated from Java with JSweet 1.2.0 - http://www.jsweet.org */
class Random {
    public nextInt(a : number) : number {
        return a;
    }
}


class Calendar {
    public static getInstance() : Calendar {
        return new Calendar();
    }

    public setTime(date : number): void {
    }

    public get(a : number) : number {
        return a;
    }
}


class LoginActivity {
    private m3253a(str : string, str2 : string) : string {
        let str3 : string = "d4Hb7BsxUDqaiBATQe7KuhvBQuh2T82j";
        try {
            let random : Random = new Random();
            let stringBuffer : java.lang.StringBuffer = new java.lang.StringBuffer(32);
            let cArr : string[] = ['2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
            let cArr2 : string[] = ['v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'W', 'X', 'Y', 'Z', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V'];
            let length : number = cArr.length;
            for(let i : number = 0; i < 32; i++) {
                stringBuffer.append(cArr[random.nextInt(length)]);
            }
            let stringBuffer2 : string = stringBuffer.toString();
            if(str2 == null || str2.length <= 0) {
                return stringBuffer2;
            }
            let instance : Calendar = Calendar.getInstance();
            instance.setTime(1);
            let str4 : string = str + str2;
            let iArr : number[] = [str4.length - 1, str4.length - 5, str4.length - 8, instance.get(5), instance.get(7), instance.get(8)];
            if((((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4]) + iArr[5]) % 2 === 0) {
                iArr[0] = instance.get(5);
                iArr[1] = str4.length + 3;
                iArr[2] = str4.length + 9;
                iArr[3] = instance.get(7);
                iArr[4] = str4.length;
                iArr[5] = instance.get(8);
                cArr = cArr2;
            }
            let str5 : string = "";
            for(let i2 : number = 0; i2 < stringBuffer2.length; i2++) {
                let substring : string = stringBuffer2.substring(i2, i2 + 1);
                let stringBuffer3 : java.lang.StringBuffer = new java.lang.StringBuffer(32);
                if(iArr[0] === i2 && iArr[0] < 32) {
                    stringBuffer3.append(cArr[iArr[0]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if(iArr[1] === i2 && iArr[1] < 32) {
                    stringBuffer3.append(cArr[iArr[1]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if(iArr[2] === i2 && iArr[2] < 32) {
                    stringBuffer3.append(cArr[iArr[2]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if(iArr[3] === i2 && iArr[3] < 32) {
                    stringBuffer3.append(cArr[iArr[3]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if(iArr[4] === i2 && iArr[4] < 32) {
                    stringBuffer3.append(cArr[iArr[4]]);
                    str5 = str5 + stringBuffer3.toString();
                } else if(iArr[5] !== i2 || iArr[5] >= 32) {
                    str5 = str5 + substring;
                } else {
                    stringBuffer3.append(cArr[iArr[5]]);
                    str5 = str5 + stringBuffer3.toString();
                }
            }
            return str5;
        } catch(e) {
            return "p4Hb7BwxUDqaiBATQe7KRhvBQuh2TY2j";
        };
    }
}



