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
public class l extends AbstractC4221b {

    /* renamed from: d, reason: collision with root package name */
    public static int f41101d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static int f41102e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f41103f = "usnatv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4126c f41104c = new C4128e();

    public l() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f41069a = hashMap;
        hashMap.put(y1.g.f40859a, new C4091f(6, Integer.valueOf(f41102e)));
        this.f41069a.put(y1.g.f40860b, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40861c, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40862d, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40863e, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40864f, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40865g, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40866h, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40867i, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40868j, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40869k, new C4092g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
        this.f41069a.put(y1.g.f40870l, new C4092g(2, Arrays.asList(0, 0)));
        this.f41069a.put(y1.g.f40871m, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40872n, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40873o, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40874p, new C4091f(2, 0));
        this.f41069a.put(y1.g.f40875q, new C4091f(2, 1));
        this.f41069a.put(y1.g.f40876r, new C4087b(Boolean.TRUE));
        this.f41069a.put(y1.g.f40877s, new C4087b(Boolean.FALSE));
        this.f41070b = new String[][]{new String[]{y1.g.f40859a, y1.g.f40860b, y1.g.f40861c, y1.g.f40862d, y1.g.f40863e, y1.g.f40864f, y1.g.f40865g, y1.g.f40866h, y1.g.f40867i, y1.g.f40868j, y1.g.f40869k, y1.g.f40870l, y1.g.f40871m, y1.g.f40872n, y1.g.f40873o, y1.g.f40874p}, new String[]{y1.g.f40875q, y1.g.f40877s}};
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f41104c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC4086a) this.f41069a.get(y1.g.f40876r)).c()).booleanValue()) {
                arrayList.add(this.f41104c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f41104c.c(split[i8]);
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
        return f41101d;
    }

    public l(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
