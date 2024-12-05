package s1;

import t1.n;

/* renamed from: s1.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3741i extends AbstractC3733a {

    /* renamed from: b, reason: collision with root package name */
    private int f37840b;

    public C3741i(int i8, String str) {
        this.f37840b = i8;
        d(str);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37835a = n.a(str);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return n.b((String) this.f37835a, this.f37840b);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, (this.f37840b * 6) + i8);
    }
}
