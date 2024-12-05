package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    private static final C f32089c = new C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32090a;

    /* renamed from: b, reason: collision with root package name */
    private final double f32091b;

    private C() {
        this.f32090a = false;
        this.f32091b = Double.NaN;
    }

    private C(double d8) {
        this.f32090a = true;
        this.f32091b = d8;
    }

    public static C a() {
        return f32089c;
    }

    public static C d(double d8) {
        return new C(d8);
    }

    public final double b() {
        if (this.f32090a) {
            return this.f32091b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f32090a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        boolean z8 = this.f32090a;
        if (z8 && c8.f32090a) {
            if (Double.compare(this.f32091b, c8.f32091b) == 0) {
                return true;
            }
        } else if (z8 == c8.f32090a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f32090a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f32091b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f32090a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f32091b + "]";
    }
}
