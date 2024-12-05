package w1;

import java.util.Arrays;
import java.util.HashMap;
import s1.C3738f;
import s1.C3739g;
import t1.AbstractC3772c;
import t1.C3774e;

/* loaded from: classes3.dex */
public class n extends AbstractC3840a {

    /* renamed from: d, reason: collision with root package name */
    public static int f38986d = 9;

    /* renamed from: e, reason: collision with root package name */
    public static int f38987e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38988f = "usvav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38989c = new C3774e();

    public n() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f38944a = hashMap;
        hashMap.put(v1.i.f38759a, new C3738f(6, Integer.valueOf(f38987e)));
        this.f38944a.put(v1.i.f38760b, new C3738f(2, 0));
        this.f38944a.put(v1.i.f38761c, new C3738f(2, 0));
        this.f38944a.put(v1.i.f38762d, new C3738f(2, 0));
        this.f38944a.put(v1.i.f38763e, new C3738f(2, 0));
        this.f38944a.put(v1.i.f38764f, new C3738f(2, 0));
        this.f38944a.put(v1.i.f38765g, new C3739g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f38944a.put(v1.i.f38766h, new C3738f(2, 0));
        this.f38944a.put(v1.i.f38767i, new C3738f(2, 0));
        this.f38944a.put(v1.i.f38768j, new C3738f(2, 0));
        this.f38944a.put(v1.i.f38769k, new C3738f(2, 0));
        this.f38945b = new String[]{v1.i.f38759a, v1.i.f38760b, v1.i.f38761c, v1.i.f38762d, v1.i.f38763e, v1.i.f38764f, v1.i.f38765g, v1.i.f38766h, v1.i.f38767i, v1.i.f38768j, v1.i.f38769k};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        return this.f38989c.d(e());
    }

    public void f(String str) {
        d(this.f38989c.c(str));
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38986d;
    }

    public n(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
