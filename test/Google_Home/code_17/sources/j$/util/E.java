package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: c, reason: collision with root package name */
    private static final E f33289c = new E();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33290a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33291b;

    private E() {
        this.f33290a = false;
        this.f33291b = 0L;
    }

    private E(long j8) {
        this.f33290a = true;
        this.f33291b = j8;
    }

    public static E a() {
        return f33289c;
    }

    public static E d(long j8) {
        return new E(j8);
    }

    public final long b() {
        if (this.f33290a) {
            return this.f33291b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f33290a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e8 = (E) obj;
        boolean z8 = this.f33290a;
        if (z8 && e8.f33290a) {
            if (this.f33291b == e8.f33291b) {
                return true;
            }
        } else if (z8 == e8.f33290a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f33290a) {
            return 0;
        }
        long j8 = this.f33291b;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        if (!this.f33290a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.f33291b + "]";
    }
}
