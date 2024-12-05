package v1;

import w1.AbstractC4133j;

/* renamed from: v1.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4091f extends AbstractC4086a {

    /* renamed from: b, reason: collision with root package name */
    private int f40110b;

    public C4091f(int i8, Integer num) {
        this.f40110b = i8;
        d(num);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = Integer.valueOf(AbstractC4133j.a(str));
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return AbstractC4133j.b(((Integer) this.f40108a).intValue(), this.f40110b);
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        return str.substring(i8, this.f40110b + i8);
    }
}
