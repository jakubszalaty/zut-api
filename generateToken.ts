// tslint:disable:no-let
import * as Moment from 'moment'

export function generateToken(str: string, str2?: string): string {

    const str3: string = "d4Hb7BsxUDqaiBATQe7KuhvBQuh2T82j"
    try {
        const getRandom = (n) => Math.floor(Math.random() * n) + 1
        const stringBuffer: string[] = []
        let cArr: string[] = ['2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
        let cArr2: string[] = ['v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'W', 'X', 'Y', 'Z', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V']

        const length: number = cArr.length

        for (let i: number = 0; i < 32; i++) {
            stringBuffer.push(cArr[getRandom(length)])
        }

        const stringBuffer2: string = stringBuffer.join('')
        if (str2 == null || str2.length <= 0) {
            return stringBuffer2
        }

        const date = Moment()
        const monthDay = date.date()
        const weekDay = date.weekday()
        const weekMonth = Math.ceil(date.date() / 7)

        let str4: string = str + str2
        let iArr: number[] = [str4.length - 1, str4.length - 5, str4.length - 8, monthDay, weekDay, weekMonth]

        if ((((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4]) + iArr[5]) % 2 === 0) {
            iArr[0] = monthDay
            iArr[1] = str4.length + 3
            iArr[2] = str4.length + 9
            iArr[3] = weekDay
            iArr[4] = str4.length
            iArr[5] = weekMonth
            cArr = cArr2
        }
        let str5: string = ""
        for (let i2: number = 0; i2 < stringBuffer2.length; i2++) {
            let substring: string = stringBuffer2.substring(i2, i2 + 1)
            let stringBuffer3: string[] = []
            if (iArr[0] === i2 && iArr[0] < 32) {
                stringBuffer3.push(cArr[iArr[0]])
                str5 = str5 + stringBuffer3.join('')
            } else if (iArr[1] === i2 && iArr[1] < 32) {
                stringBuffer3.push(cArr[iArr[1]])
                str5 = str5 + stringBuffer3.join('')
            } else if (iArr[2] === i2 && iArr[2] < 32) {
                stringBuffer3.push(cArr[iArr[2]])
                str5 = str5 + stringBuffer3.join('')
            } else if (iArr[3] === i2 && iArr[3] < 32) {
                stringBuffer3.push(cArr[iArr[3]])
                str5 = str5 + stringBuffer3.join('')
            } else if (iArr[4] === i2 && iArr[4] < 32) {
                stringBuffer3.push(cArr[iArr[4]])
                str5 = str5 + stringBuffer3.join('')
            } else if (iArr[5] !== i2 || iArr[5] >= 32) {
                str5 = str5 + substring
            } else {
                stringBuffer3.push(cArr[iArr[5]])
                str5 = str5 + stringBuffer3.join('')
            }
        }
        return str5
    } catch (e) {
        return "p4Hb7BwxUDqaiBATQe7KRhvBQuh2TY2j"
    }
}
