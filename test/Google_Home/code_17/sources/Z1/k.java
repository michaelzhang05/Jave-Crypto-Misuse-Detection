package z1;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import v1.AbstractC4086a;
import v1.C4087b;
import v1.C4091f;
import v1.C4092g;
import w1.AbstractC4126c;
import w1.C4128e;
import x1.C4185a;
import y1.AbstractC4200d;

/* loaded from: classes4.dex */
public class k extends AbstractC4221b {

    /* renamed from: d, reason: collision with root package name */
    public static int f41097d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static int f41098e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f41099f = "usctv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4126c f41100c = new C4128e();

    public k() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f41069a = hashMap;
        hashMap.put(y1.f.f40845a, new C4091f(6, Integer.valueOf(f41098e)));
        this.f41069a.put(y1.f.f40846b, new C4091f(2, 0));
        this.f41069a.put(y1.f.f40847c, new C4091f(2, 0));
        this.f41069a.put(y1.f.f40848d, new C4091f(2, 0));
        this.f41069a.put(y1.f.f40849e, new C4091f(2, 0));
        this.f41069a.put(y1.f.f40850f, new C4091f(2, 0));
        this.f41069a.put(y1.f.f40851g, new C4092g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f41069a.put(y1.f.f40852h, new C4092g(2, Arrays.asList(0, 0, 0)));
        this.f41069a.put(y1.f.f40853i, new C4091f(2, 0));
        this.f41069a.put(y1.f.f40854j, new C4091f(2, 0));
        this.f41069a.put(y1.f.f40855k, new C4091f(2, 0));
        this.f41069a.put(y1.f.f40856l, new C4091f(2, 1));
        this.f41069a.put(y1.f.f40857m, new C4087b(Boolean.TRUE));
        this.f41069a.put(y1.f.f40858n, new C4087b(Boolean.FALSE));
        this.f41070b = new String[][]{new String[]{y1.f.f40845a, y1.f.f40846b, y1.f.f40847c, y1.f.f40848d, y1.f.f40849e, y1.f.f40850f, y1.f.f40851g, y1.f.f40852h, y1.f.f40853i, y1.f.f40854j, y1.f.f40855k}, new String[]{y1.f.f40856l, y1.f.f40858n}};
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f41100c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC4086a) this.f41069a.get(y1.f.f40857m)).c()).booleanValue()) {
                arrayList.add(this.f41100c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f41100c.c(split[i8]);
            String substring = c8.substring(0, 2);
            substring.hashCode();
            if (!substring.equals("00")) {
                if (substring.equals("01")) {
                    strArr[1] = c8;
                    z8 = true;
                } else {
                    throw new C4185a("Unable to decode segment '" + split[i8] + "'");
                }
            } else {
                strArr[0] = c8;
            }
        }
        d(Arrays.asList(strArr));
        ((AbstractC4086a) this.f41069a.get(AbstractC4200d.f40829n)).d(Boolean.valueOf(z8));
    }

    @Override // z1.InterfaceC4222c
    public int getId() {
        return f41097d;
    }

    public k(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
