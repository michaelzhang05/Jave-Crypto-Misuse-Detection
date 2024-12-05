package m4;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3430b {

    /* renamed from: a, reason: collision with root package name */
    private final float f35141a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35142b;

    public C3430b(float f8, float f9) {
        this.f35141a = f8;
        this.f35142b = f9;
    }

    public final float a() {
        return this.f35142b;
    }

    public final float b() {
        return this.f35141a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3430b)) {
            return false;
        }
        C3430b c3430b = (C3430b) obj;
        if (Float.compare(this.f35141a, c3430b.f35141a) == 0 && Float.compare(this.f35142b, c3430b.f35142b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f35141a) * 31) + Float.floatToIntBits(this.f35142b);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + this.f35141a + ", borderStrokeWidth=" + this.f35142b + ")";
    }
}
