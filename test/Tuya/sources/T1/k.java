package t1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import u1.C3800a;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f38221a = Pattern.compile("^[0-1]*$", 2);

    public static List a(String str, int i8, int i9) {
        if (f38221a.matcher(str).matches()) {
            int i10 = i8 * i9;
            if (str.length() <= i10) {
                if (str.length() % i8 == 0) {
                    while (str.length() < i10) {
                        str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    }
                    if (str.length() > i10) {
                        str = str.substring(0, i10);
                    }
                    ArrayList arrayList = new ArrayList();
                    int i11 = 0;
                    while (i11 < str.length()) {
                        int i12 = i11 + i8;
                        arrayList.add(Integer.valueOf(AbstractC3779j.a(str.substring(i11, i12))));
                        i11 = i12;
                    }
                    while (arrayList.size() < i9) {
                        arrayList.add(0);
                    }
                    return arrayList;
                }
                throw new C3800a("Undecodable FixedIntegerList '" + str + "'");
            }
            throw new C3800a("Undecodable FixedIntegerList '" + str + "'");
        }
        throw new C3800a("Undecodable FixedIntegerList '" + str + "'");
    }

    public static String b(List list, int i8, int i9) {
        String str = "";
        for (int i10 = 0; i10 < list.size(); i10++) {
            str = str + AbstractC3779j.b(((Integer) list.get(i10)).intValue(), i8);
        }
        while (str.length() < i8 * i9) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return str;
    }
}
