package w1;

import java.util.Arrays;
import java.util.HashMap;
import s1.C3738f;
import s1.C3739g;
import t1.AbstractC3772c;
import t1.C3774e;

/* loaded from: classes3.dex */
public class m extends AbstractC3840a {

    /* renamed from: d, reason: collision with root package name */
    public static int f38982d = 11;

    /* renamed from: e, reason: collision with root package name */
    public static int f38983e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38984f = "usutv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38985c = new C3774e();

    public m() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f38944a = hashMap;
        hashMap.put(v1.h.f38747a, new C3738f(6, Integer.valueOf(f38983e)));
        this.f38944a.put(v1.h.f38748b, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38749c, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38750d, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38751e, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38752f, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38753g, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38754h, new C3739g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f38944a.put(v1.h.f38755i, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38756j, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38757k, new C3738f(2, 0));
        this.f38944a.put(v1.h.f38758l, new C3738f(2, 0));
        this.f38945b = new String[]{v1.h.f38747a, v1.h.f38748b, v1.h.f38749c, v1.h.f38750d, v1.h.f38751e, v1.h.f38752f, v1.h.f38753g, v1.h.f38754h, v1.h.f38755i, v1.h.f38756j, v1.h.f38757k, v1.h.f38758l};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        return this.f38985c.d(e());
    }

    public void f(String str) {
        d(this.f38985c.c(str));
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38982d;
    }

    public m(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
