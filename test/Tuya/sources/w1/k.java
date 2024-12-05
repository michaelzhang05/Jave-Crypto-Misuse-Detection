package w1;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import s1.AbstractC3733a;
import s1.C3734b;
import s1.C3738f;
import s1.C3739g;
import t1.AbstractC3772c;
import t1.C3774e;
import u1.C3800a;
import v1.AbstractC3823d;

/* loaded from: classes3.dex */
public class k extends AbstractC3841b {

    /* renamed from: d, reason: collision with root package name */
    public static int f38974d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static int f38975e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38976f = "usctv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38977c = new C3774e();

    public k() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f38946a = hashMap;
        hashMap.put(v1.f.f38714a, new C3738f(6, Integer.valueOf(f38975e)));
        this.f38946a.put(v1.f.f38715b, new C3738f(2, 0));
        this.f38946a.put(v1.f.f38716c, new C3738f(2, 0));
        this.f38946a.put(v1.f.f38717d, new C3738f(2, 0));
        this.f38946a.put(v1.f.f38718e, new C3738f(2, 0));
        this.f38946a.put(v1.f.f38719f, new C3738f(2, 0));
        this.f38946a.put(v1.f.f38720g, new C3739g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f38946a.put(v1.f.f38721h, new C3739g(2, Arrays.asList(0, 0, 0)));
        this.f38946a.put(v1.f.f38722i, new C3738f(2, 0));
        this.f38946a.put(v1.f.f38723j, new C3738f(2, 0));
        this.f38946a.put(v1.f.f38724k, new C3738f(2, 0));
        this.f38946a.put(v1.f.f38725l, new C3738f(2, 1));
        this.f38946a.put(v1.f.f38726m, new C3734b(Boolean.TRUE));
        this.f38946a.put(v1.f.f38727n, new C3734b(Boolean.FALSE));
        this.f38947b = new String[][]{new String[]{v1.f.f38714a, v1.f.f38715b, v1.f.f38716c, v1.f.f38717d, v1.f.f38718e, v1.f.f38719f, v1.f.f38720g, v1.f.f38721h, v1.f.f38722i, v1.f.f38723j, v1.f.f38724k}, new String[]{v1.f.f38725l, v1.f.f38727n}};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f38977c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC3733a) this.f38946a.get(v1.f.f38726m)).c()).booleanValue()) {
                arrayList.add(this.f38977c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f38977c.c(split[i8]);
            String substring = c8.substring(0, 2);
            substring.hashCode();
            if (!substring.equals("00")) {
                if (substring.equals("01")) {
                    strArr[1] = c8;
                    z8 = true;
                } else {
                    throw new C3800a("Unable to decode segment '" + split[i8] + "'");
                }
            } else {
                strArr[0] = c8;
            }
        }
        d(Arrays.asList(strArr));
        ((AbstractC3733a) this.f38946a.get(AbstractC3823d.f38698n)).d(Boolean.valueOf(z8));
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38974d;
    }

    public k(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
