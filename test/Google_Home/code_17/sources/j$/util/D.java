package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    private static final D f33286c = new D();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33287a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33288b;

    private D() {
        this.f33287a = false;
        this.f33288b = 0;
    }

    private D(int i8) {
        this.f33287a = true;
        this.f33288b = i8;
    }

    public static D a() {
        return f33286c;
    }

    public static D d(int i8) {
        return new D(i8);
    }

    public final int b() {
        if (this.f33287a) {
            return this.f33288b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f33287a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        boolean z8 = this.f33287a;
        if (z8 && d8.f33287a) {
            if (this.f33288b == d8.f33288b) {
                return true;
            }
        } else if (z8 == d8.f33287a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f33287a) {
            return this.f33288b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f33287a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.f33288b + "]";
    }
}
