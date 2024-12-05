package s1;

import t1.AbstractC3773d;

/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3734b extends AbstractC3733a {
    public C3734b(Boolean bool) {
        d(bool);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37835a = Boolean.valueOf(AbstractC3773d.a(str));
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return AbstractC3773d.b((Boolean) this.f37835a);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, i8 + 1);
    }
}
