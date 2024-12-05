package o6;

/* renamed from: o6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3690D extends p6.d {

    /* renamed from: a, reason: collision with root package name */
    public long f36576a = -1;

    /* renamed from: b, reason: collision with root package name */
    public S5.d f36577b;

    @Override // p6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(C3688B c3688b) {
        if (this.f36576a >= 0) {
            return false;
        }
        this.f36576a = c3688b.X();
        return true;
    }

    @Override // p6.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public S5.d[] b(C3688B c3688b) {
        long j8 = this.f36576a;
        this.f36576a = -1L;
        this.f36577b = null;
        return c3688b.W(j8);
    }
}
