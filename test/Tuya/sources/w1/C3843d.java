package w1;

import java.util.ArrayList;
import java.util.HashMap;
import s1.AbstractC3733a;
import s1.C3736d;
import s1.C3738f;
import t1.AbstractC3772c;
import t1.C3774e;
import v1.AbstractC3820a;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3843d extends AbstractC3840a {

    /* renamed from: d, reason: collision with root package name */
    public static int f38948d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static int f38949e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38950f = "header";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38951c = new C3774e();

    public C3843d() {
        h();
    }

    private void h() {
        HashMap hashMap = new HashMap();
        this.f38944a = hashMap;
        hashMap.put(AbstractC3820a.f38632a, new C3738f(6, Integer.valueOf(f38948d)));
        this.f38944a.put(AbstractC3820a.f38633b, new C3738f(6, Integer.valueOf(f38949e)));
        this.f38944a.put(AbstractC3820a.f38634c, new C3736d(new ArrayList()));
        this.f38945b = new String[]{AbstractC3820a.f38632a, AbstractC3820a.f38633b, AbstractC3820a.f38634c};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        return this.f38951c.d(e());
    }

    public void f(String str) {
        d(this.f38951c.c(str));
    }

    public Integer g() {
        return (Integer) ((AbstractC3733a) this.f38944a.get(AbstractC3820a.f38633b)).c();
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38948d;
    }

    public C3843d(String str) {
        h();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
