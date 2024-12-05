package v1;

import w1.AbstractC4127d;

/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4087b extends AbstractC4086a {
    public C4087b(Boolean bool) {
        d(bool);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = Boolean.valueOf(AbstractC4127d.a(str));
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return AbstractC4127d.b((Boolean) this.f40108a);
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        return str.substring(i8, i8 + 1);
    }
}
