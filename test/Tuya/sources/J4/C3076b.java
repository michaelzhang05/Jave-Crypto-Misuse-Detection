package j4;

/* renamed from: j4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3076b {

    /* renamed from: a, reason: collision with root package name */
    private final float f33165a;

    /* renamed from: b, reason: collision with root package name */
    private final float f33166b;

    public C3076b(float f8, float f9) {
        this.f33165a = f8;
        this.f33166b = f9;
    }

    public final float a() {
        return this.f33166b;
    }

    public final float b() {
        return this.f33165a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3076b)) {
            return false;
        }
        C3076b c3076b = (C3076b) obj;
        if (Float.compare(this.f33165a, c3076b.f33165a) == 0 && Float.compare(this.f33166b, c3076b.f33166b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f33165a) * 31) + Float.floatToIntBits(this.f33166b);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + this.f33165a + ", borderStrokeWidth=" + this.f33166b + ")";
    }
}
