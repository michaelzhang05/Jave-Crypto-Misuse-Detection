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
public class i extends AbstractC4221b {

    /* renamed from: d, reason: collision with root package name */
    public static int f41089d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static int f41090e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f41091f = "uscav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4126c f41092c = new C4128e();

    public i() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f41069a = hashMap;
        hashMap.put(AbstractC4200d.f40816a, new C4091f(6, Integer.valueOf(f41090e)));
        this.f41069a.put(AbstractC4200d.f40817b, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40818c, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40819d, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40820e, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40821f, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40822g, new C4092g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0)));
        this.f41069a.put(AbstractC4200d.f40823h, new C4092g(2, Arrays.asList(0, 0)));
        this.f41069a.put(AbstractC4200d.f40824i, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40825j, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40826k, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40827l, new C4091f(2, 0));
        this.f41069a.put(AbstractC4200d.f40828m, new C4091f(2, 1));
        this.f41069a.put(AbstractC4200d.f40829n, new C4087b(Boolean.TRUE));
        this.f41069a.put(AbstractC4200d.f40830o, new C4087b(Boolean.FALSE));
        this.f41070b = new String[][]{new String[]{AbstractC4200d.f40816a, AbstractC4200d.f40817b, AbstractC4200d.f40818c, AbstractC4200d.f40819d, AbstractC4200d.f40820e, AbstractC4200d.f40821f, AbstractC4200d.f40822g, AbstractC4200d.f40823h, AbstractC4200d.f40824i, AbstractC4200d.f40825j, AbstractC4200d.f40826k, AbstractC4200d.f40827l}, new String[]{AbstractC4200d.f40828m, AbstractC4200d.f40830o}};
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f41092c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC4086a) this.f41069a.get(AbstractC4200d.f40829n)).c()).booleanValue()) {
                arrayList.add(this.f41092c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f41092c.c(split[i8]);
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
        return f41089d;
    }

    public i(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
