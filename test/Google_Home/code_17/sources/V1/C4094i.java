package v1;

import w1.n;

/* renamed from: v1.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4094i extends AbstractC4086a {

    /* renamed from: b, reason: collision with root package name */
    private int f40113b;

    public C4094i(int i8, String str) {
        this.f40113b = i8;
        d(str);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = n.a(str);
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return n.b((String) this.f40108a, this.f40113b);
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        return str.substring(i8, (this.f40113b * 6) + i8);
    }
}
