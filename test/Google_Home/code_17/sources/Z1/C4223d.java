package z1;

import java.util.ArrayList;
import java.util.HashMap;
import v1.AbstractC4086a;
import v1.C4089d;
import v1.C4091f;
import w1.AbstractC4126c;
import w1.C4128e;
import y1.AbstractC4197a;

/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4223d extends AbstractC4220a {

    /* renamed from: d, reason: collision with root package name */
    public static int f41071d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static int f41072e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f41073f = "header";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4126c f41074c = new C4128e();

    public C4223d() {
        h();
    }

    private void h() {
        HashMap hashMap = new HashMap();
        this.f41067a = hashMap;
        hashMap.put(AbstractC4197a.f40763a, new C4091f(6, Integer.valueOf(f41071d)));
        this.f41067a.put(AbstractC4197a.f40764b, new C4091f(6, Integer.valueOf(f41072e)));
        this.f41067a.put(AbstractC4197a.f40765c, new C4089d(new ArrayList()));
        this.f41068b = new String[]{AbstractC4197a.f40763a, AbstractC4197a.f40764b, AbstractC4197a.f40765c};
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        return this.f41074c.d(e());
    }

    public void f(String str) {
        d(this.f41074c.c(str));
    }

    public Integer g() {
        return (Integer) ((AbstractC4086a) this.f41067a.get(AbstractC4197a.f40764b)).c();
    }

    @Override // z1.InterfaceC4222c
    public int getId() {
        return f41071d;
    }

    public C4223d(String str) {
        h();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
