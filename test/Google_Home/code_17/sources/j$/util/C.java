package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    private static final C f33283c = new C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33284a;

    /* renamed from: b, reason: collision with root package name */
    private final double f33285b;

    private C() {
        this.f33284a = false;
        this.f33285b = Double.NaN;
    }

    private C(double d8) {
        this.f33284a = true;
        this.f33285b = d8;
    }

    public static C a() {
        return f33283c;
    }

    public static C d(double d8) {
        return new C(d8);
    }

    public final double b() {
        if (this.f33284a) {
            return this.f33285b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f33284a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        boolean z8 = this.f33284a;
        if (z8 && c8.f33284a) {
            if (Double.compare(this.f33285b, c8.f33285b) == 0) {
                return true;
            }
        } else if (z8 == c8.f33284a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f33284a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f33285b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f33284a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f33285b + "]";
    }
}
