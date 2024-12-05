package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: b, reason: collision with root package name */
    private static final B f32087b = new B();

    /* renamed from: a, reason: collision with root package name */
    private final Object f32088a;

    private B() {
        this.f32088a = null;
    }

    private B(Object obj) {
        this.f32088a = Objects.requireNonNull(obj);
    }

    public static B a() {
        return f32087b;
    }

    public static B d(Object obj) {
        return new B(obj);
    }

    public final Object b() {
        Object obj = this.f32088a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f32088a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B) {
            return Objects.equals(this.f32088a, ((B) obj).f32088a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f32088a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f32088a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
