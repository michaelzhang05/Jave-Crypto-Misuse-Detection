package g6;

/* renamed from: g6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2884d implements InterfaceC2885e {

    /* renamed from: a, reason: collision with root package name */
    private final float f32069a;

    /* renamed from: b, reason: collision with root package name */
    private final float f32070b;

    public C2884d(float f8, float f9) {
        this.f32069a = f8;
        this.f32070b = f9;
    }

    public boolean a(float f8) {
        if (f8 >= this.f32069a && f8 <= this.f32070b) {
            return true;
        }
        return false;
    }

    @Override // g6.InterfaceC2886f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f32070b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g6.InterfaceC2885e
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g6.InterfaceC2885e
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @Override // g6.InterfaceC2886f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f32069a);
    }

    public boolean e(float f8, float f9) {
        if (f8 <= f9) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2884d) {
            if (!isEmpty() || !((C2884d) obj).isEmpty()) {
                C2884d c2884d = (C2884d) obj;
                if (this.f32069a != c2884d.f32069a || this.f32070b != c2884d.f32070b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f32069a) * 31) + Float.floatToIntBits(this.f32070b);
    }

    @Override // g6.InterfaceC2885e, g6.InterfaceC2886f
    public boolean isEmpty() {
        if (this.f32069a > this.f32070b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f32069a + ".." + this.f32070b;
    }
}
