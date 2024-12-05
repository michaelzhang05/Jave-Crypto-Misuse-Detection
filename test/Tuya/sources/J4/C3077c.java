package j4;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3077c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f33167e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C3075a f33168a;

    /* renamed from: b, reason: collision with root package name */
    private final C3075a f33169b;

    /* renamed from: c, reason: collision with root package name */
    private final C3076b f33170c;

    /* renamed from: d, reason: collision with root package name */
    private final C3078d f33171d;

    public C3077c(C3075a colorsLight, C3075a colorsDark, C3076b shape, C3078d typography) {
        AbstractC3159y.i(colorsLight, "colorsLight");
        AbstractC3159y.i(colorsDark, "colorsDark");
        AbstractC3159y.i(shape, "shape");
        AbstractC3159y.i(typography, "typography");
        this.f33168a = colorsLight;
        this.f33169b = colorsDark;
        this.f33170c = shape;
        this.f33171d = typography;
    }

    public final C3077c a(C3075a colorsLight, C3075a colorsDark, C3076b shape, C3078d typography) {
        AbstractC3159y.i(colorsLight, "colorsLight");
        AbstractC3159y.i(colorsDark, "colorsDark");
        AbstractC3159y.i(shape, "shape");
        AbstractC3159y.i(typography, "typography");
        return new C3077c(colorsLight, colorsDark, shape, typography);
    }

    public final C3075a b() {
        return this.f33169b;
    }

    public final C3075a c() {
        return this.f33168a;
    }

    public final C3076b d() {
        return this.f33170c;
    }

    public final C3078d e() {
        return this.f33171d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3077c)) {
            return false;
        }
        C3077c c3077c = (C3077c) obj;
        if (AbstractC3159y.d(this.f33168a, c3077c.f33168a) && AbstractC3159y.d(this.f33169b, c3077c.f33169b) && AbstractC3159y.d(this.f33170c, c3077c.f33170c) && AbstractC3159y.d(this.f33171d, c3077c.f33171d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f33168a.hashCode() * 31) + this.f33169b.hashCode()) * 31) + this.f33170c.hashCode()) * 31) + this.f33171d.hashCode();
    }

    public String toString() {
        return "PrimaryButtonStyle(colorsLight=" + this.f33168a + ", colorsDark=" + this.f33169b + ", shape=" + this.f33170c + ", typography=" + this.f33171d + ")";
    }
}
