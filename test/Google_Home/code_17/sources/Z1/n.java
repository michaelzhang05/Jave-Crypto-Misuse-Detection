package z1;

import java.util.Arrays;
import java.util.HashMap;
import v1.C4091f;
import v1.C4092g;
import w1.AbstractC4126c;
import w1.C4128e;

/* loaded from: classes4.dex */
public class n extends AbstractC4220a {

    /* renamed from: d, reason: collision with root package name */
    public static int f41109d = 9;

    /* renamed from: e, reason: collision with root package name */
    public static int f41110e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f41111f = "usvav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4126c f41112c = new C4128e();

    public n() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f41067a = hashMap;
        hashMap.put(y1.i.f40890a, new C4091f(6, Integer.valueOf(f41110e)));
        this.f41067a.put(y1.i.f40891b, new C4091f(2, 0));
        this.f41067a.put(y1.i.f40892c, new C4091f(2, 0));
        this.f41067a.put(y1.i.f40893d, new C4091f(2, 0));
        this.f41067a.put(y1.i.f40894e, new C4091f(2, 0));
        this.f41067a.put(y1.i.f40895f, new C4091f(2, 0));
        this.f41067a.put(y1.i.f40896g, new C4092g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f41067a.put(y1.i.f40897h, new C4091f(2, 0));
        this.f41067a.put(y1.i.f40898i, new C4091f(2, 0));
        this.f41067a.put(y1.i.f40899j, new C4091f(2, 0));
        this.f41067a.put(y1.i.f40900k, new C4091f(2, 0));
        this.f41068b = new String[]{y1.i.f40890a, y1.i.f40891b, y1.i.f40892c, y1.i.f40893d, y1.i.f40894e, y1.i.f40895f, y1.i.f40896g, y1.i.f40897h, y1.i.f40898i, y1.i.f40899j, y1.i.f40900k};
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        return this.f41112c.d(e());
    }

    public void f(String str) {
        d(this.f41112c.c(str));
    }

    @Override // z1.InterfaceC4222c
    public int getId() {
        return f41109d;
    }

    public n(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
