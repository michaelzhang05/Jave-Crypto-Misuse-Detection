package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: c, reason: collision with root package name */
    private static final E f32095c = new E();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32096a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32097b;

    private E() {
        this.f32096a = false;
        this.f32097b = 0L;
    }

    private E(long j8) {
        this.f32096a = true;
        this.f32097b = j8;
    }

    public static E a() {
        return f32095c;
    }

    public static E d(long j8) {
        return new E(j8);
    }

    public final long b() {
        if (this.f32096a) {
            return this.f32097b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f32096a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e8 = (E) obj;
        boolean z8 = this.f32096a;
        if (z8 && e8.f32096a) {
            if (this.f32097b == e8.f32097b) {
                return true;
            }
        } else if (z8 == e8.f32096a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f32096a) {
            return 0;
        }
        long j8 = this.f32097b;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        if (!this.f32096a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.f32097b + "]";
    }
}
