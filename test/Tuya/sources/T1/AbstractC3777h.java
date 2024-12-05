package t1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import u1.C3800a;

/* renamed from: t1.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3777h {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f38218a = Pattern.compile("^[0-1]*$", 2);

    public static List a(String str) {
        if (f38218a.matcher(str).matches()) {
            int i8 = 12;
            if (str.length() >= 12) {
                ArrayList arrayList = new ArrayList();
                int a8 = AbstractC3779j.a(str.substring(0, 12));
                int i9 = 0;
                for (int i10 = 0; i10 < a8; i10++) {
                    int i11 = i8 + 1;
                    if (AbstractC3773d.a(str.substring(i8, i11))) {
                        int indexOf = str.indexOf("11", i11) + 2;
                        int a9 = AbstractC3776g.a(str.substring(i11, indexOf)) + i9;
                        int indexOf2 = str.indexOf("11", indexOf) + 2;
                        int a10 = AbstractC3776g.a(str.substring(indexOf, indexOf2)) + a9;
                        while (a9 <= a10) {
                            arrayList.add(Integer.valueOf(a9));
                            a9++;
                        }
                        i9 = a10;
                        i8 = indexOf2;
                    } else {
                        i8 = str.indexOf("11", i11) + 2;
                        int a11 = AbstractC3776g.a(str.substring(i11, i8)) + i9;
                        arrayList.add(Integer.valueOf(a11));
                        i9 = a11;
                    }
                }
                return arrayList;
            }
        }
        throw new C3800a("Undecodable FibonacciIntegerRange '" + str + "'");
    }

    public static String b(List list) {
        Collections.sort(list);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < list.size()) {
            int i9 = i8;
            while (i9 < list.size() - 1) {
                int i10 = i9 + 1;
                if (((Integer) list.get(i9)).intValue() + 1 == ((Integer) list.get(i10)).intValue()) {
                    i9 = i10;
                }
            }
            int i11 = i9 + 1;
            arrayList.add(list.subList(i8, i11));
            i8 = i11;
        }
        String b8 = AbstractC3779j.b(arrayList.size(), 12);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((List) arrayList.get(i13)).size() == 1) {
                int intValue = ((Integer) ((List) arrayList.get(i13)).get(0)).intValue() - i12;
                i12 = ((Integer) ((List) arrayList.get(i13)).get(0)).intValue();
                b8 = b8 + MBridgeConstans.ENDCARD_URL_TYPE_PL + AbstractC3776g.b(intValue);
            } else {
                int intValue2 = ((Integer) ((List) arrayList.get(i13)).get(0)).intValue() - i12;
                int intValue3 = ((Integer) ((List) arrayList.get(i13)).get(((List) arrayList.get(i13)).size() - 1)).intValue() - ((Integer) ((List) arrayList.get(i13)).get(0)).intValue();
                i12 = ((Integer) ((List) arrayList.get(i13)).get(((List) arrayList.get(i13)).size() - 1)).intValue();
                b8 = b8 + "1" + AbstractC3776g.b(intValue2) + AbstractC3776g.b(intValue3);
            }
        }
        return b8;
    }
}
