package z1;

import java.util.Arrays;
import java.util.HashMap;
import v1.C4091f;
import v1.C4092g;
import w1.AbstractC4126c;
import w1.C4128e;

/* loaded from: classes4.dex */
public class m extends AbstractC4220a {

    /* renamed from: d, reason: collision with root package name */
    public static int f41105d = 11;

    /* renamed from: e, reason: collision with root package name */
    public static int f41106e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f41107f = "usutv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4126c f41108c = new C4128e();

    public m() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f41067a = hashMap;
        hashMap.put(y1.h.f40878a, new C4091f(6, Integer.valueOf(f41106e)));
        this.f41067a.put(y1.h.f40879b, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40880c, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40881d, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40882e, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40883f, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40884g, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40885h, new C4092g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f41067a.put(y1.h.f40886i, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40887j, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40888k, new C4091f(2, 0));
        this.f41067a.put(y1.h.f40889l, new C4091f(2, 0));
        this.f41068b = new String[]{y1.h.f40878a, y1.h.f40879b, y1.h.f40880c, y1.h.f40881d, y1.h.f40882e, y1.h.f40883f, y1.h.f40884g, y1.h.f40885h, y1.h.f40886i, y1.h.f40887j, y1.h.f40888k, y1.h.f40889l};
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        return this.f41108c.d(e());
    }

    public void f(String str) {
        d(this.f41108c.c(str));
    }

    @Override // z1.InterfaceC4222c
    public int getId() {
        return f41105d;
    }

    public m(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
