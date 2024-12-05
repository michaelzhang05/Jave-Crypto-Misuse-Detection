package w0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w0.g;

/* loaded from: classes.dex */
public abstract class n {
    public static String a(String str, String[] strArr, String[] strArr2, String str2) {
        String[] strArr3;
        int i6;
        String str3;
        String[] strArr4 = {"AND", "OR", "NOT"};
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= 3) {
                strArr3 = null;
                break;
            }
            String str4 = strArr4[i8];
            if (str.contains(str4)) {
                strArr3 = str.split("\\s*" + str4 + "\\s*");
                break;
            }
            i8++;
        }
        if (strArr3 == null) {
            strArr3 = new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        for (String str5 : strArr3) {
            String trim = str5.trim();
            String[] strArr5 = {"=", "<>", "<", "<=", ">", ">=", "IN", "BETWEEN", "LIKE"};
            int i9 = 0;
            int i10 = -1;
            while (true) {
                if (i9 >= 9) {
                    i6 = i10;
                    str3 = null;
                    break;
                }
                str3 = strArr5[i9];
                i6 = trim.indexOf(str3);
                if (i6 != -1) {
                    break;
                }
                i9++;
                i10 = i6;
            }
            if (str3 == null) {
                arrayList.add(trim);
            } else {
                String trim2 = trim.substring(0, i6).trim();
                String trim3 = trim.substring(i6 + str3.length()).trim();
                int f6 = f(trim2, strArr2);
                if (f6 != -1) {
                    trim2 = h(strArr, f6);
                }
                arrayList.add((str2 + trim2) + " " + str3 + " " + trim3);
            }
        }
        String str6 = strArr4[0];
        while (true) {
            if (i7 >= 3) {
                break;
            }
            String str7 = strArr4[i7];
            if (str.contains(str7)) {
                str6 = str7;
                break;
            }
            i7++;
        }
        return b.a(" " + str6 + " ", arrayList);
    }

    public static List b(String str) {
        HashSet hashSet = new HashSet(Arrays.asList("AND", "OR", "IN", "VALUES", "LIKE", "BETWEEN", "NOT"));
        Matcher matcher = Pattern.compile("\\b[a-zA-Z]\\w*\\b(?=\\s*(?:<=?|>=?|<>?|=|AND|OR|BETWEEN|NOT|IN|LIKE))|\\b[a-zA-Z]\\w*\\b\\s+BETWEEN\\s+'[^']+'\\s+AND\\s+'[^']+'|\\(([^)]+)\\)\\s+IN\\s+\\(\\s*VALUES\\s*\\(").matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                for (String str2 : group.split(",")) {
                    arrayList.add(str2.trim());
                }
            } else {
                String group2 = matcher.group();
                if (!hashSet.contains(group2.trim().toUpperCase())) {
                    arrayList.add(group2.trim());
                }
            }
        }
        return arrayList;
    }

    public static g.a c(String str) {
        Matcher matcher = Pattern.compile("\\bFOREIGN\\s+KEY\\s*\\(([^)]+)\\)\\s+REFERENCES\\s+(\\w+)\\s*\\(([^)]+)\\)\\s+(ON\\s+DELETE\\s+(RESTRICT|CASCADE|SET\\s+NULL|SET\\s+DEFAULT|NO\\s+ACTION))?").matcher(str);
        if (!matcher.find()) {
            throw new Exception("extractForeignKeyInfo: No FOREIGN KEY found");
        }
        String[] split = matcher.group(1).split(",");
        return new g.a(new ArrayList(Arrays.asList(split)), matcher.group(2), new ArrayList(Arrays.asList(matcher.group(3).split(","))), matcher.group(5) != null ? matcher.group(5) : "NO ACTION");
    }

    public static String d(String str) {
        Matcher matcher = Pattern.compile("(?:INSERT\\s+INTO|UPDATE|DELETE\\s+FROM)\\s+([^\\s]+)", 2).matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0) {
            return null;
        }
        return matcher.group(1);
    }

    public static String e(String str) {
        Matcher matcher = Pattern.compile("WHERE(.+?)(?:ORDER\\s+BY|LIMIT|$)", 2).matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0) {
            return null;
        }
        return matcher.group(1).trim();
    }

    public static int f(String str, String[] strArr) {
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (strArr[i6].equals(str)) {
                return i6;
            }
        }
        return -1;
    }

    public static String g(String str) {
        return x0.d.a(" ", str.split("\\r?\\n"));
    }

    public static String h(String[] strArr, int i6) {
        if (i6 < 0 || i6 >= strArr.length) {
            return null;
        }
        return strArr[i6];
    }

    public static List i(String str, String str2, int i6) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            int indexOf = str.indexOf(str2, i6);
            if (indexOf == -1) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(indexOf));
            i6 = indexOf + 1;
        }
    }
}
