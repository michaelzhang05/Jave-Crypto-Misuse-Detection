package l6;

/* renamed from: l6.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3341C extends m6.d {

    /* renamed from: a, reason: collision with root package name */
    public long f34575a = -1;

    /* renamed from: b, reason: collision with root package name */
    public P5.d f34576b;

    @Override // m6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(C3339A c3339a) {
        if (this.f34575a >= 0) {
            return false;
        }
        this.f34575a = c3339a.X();
        return true;
    }

    @Override // m6.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public P5.d[] b(C3339A c3339a) {
        long j8 = this.f34575a;
        this.f34575a = -1L;
        this.f34576b = null;
        return c3339a.W(j8);
    }
}
