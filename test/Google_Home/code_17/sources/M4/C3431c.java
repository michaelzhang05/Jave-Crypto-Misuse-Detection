package m4;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3431c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f35143e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C3429a f35144a;

    /* renamed from: b, reason: collision with root package name */
    private final C3429a f35145b;

    /* renamed from: c, reason: collision with root package name */
    private final C3430b f35146c;

    /* renamed from: d, reason: collision with root package name */
    private final C3432d f35147d;

    public C3431c(C3429a colorsLight, C3429a colorsDark, C3430b shape, C3432d typography) {
        AbstractC3255y.i(colorsLight, "colorsLight");
        AbstractC3255y.i(colorsDark, "colorsDark");
        AbstractC3255y.i(shape, "shape");
        AbstractC3255y.i(typography, "typography");
        this.f35144a = colorsLight;
        this.f35145b = colorsDark;
        this.f35146c = shape;
        this.f35147d = typography;
    }

    public final C3431c a(C3429a colorsLight, C3429a colorsDark, C3430b shape, C3432d typography) {
        AbstractC3255y.i(colorsLight, "colorsLight");
        AbstractC3255y.i(colorsDark, "colorsDark");
        AbstractC3255y.i(shape, "shape");
        AbstractC3255y.i(typography, "typography");
        return new C3431c(colorsLight, colorsDark, shape, typography);
    }

    public final C3429a b() {
        return this.f35145b;
    }

    public final C3429a c() {
        return this.f35144a;
    }

    public final C3430b d() {
        return this.f35146c;
    }

    public final C3432d e() {
        return this.f35147d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3431c)) {
            return false;
        }
        C3431c c3431c = (C3431c) obj;
        if (AbstractC3255y.d(this.f35144a, c3431c.f35144a) && AbstractC3255y.d(this.f35145b, c3431c.f35145b) && AbstractC3255y.d(this.f35146c, c3431c.f35146c) && AbstractC3255y.d(this.f35147d, c3431c.f35147d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f35144a.hashCode() * 31) + this.f35145b.hashCode()) * 31) + this.f35146c.hashCode()) * 31) + this.f35147d.hashCode();
    }

    public String toString() {
        return "PrimaryButtonStyle(colorsLight=" + this.f35144a + ", colorsDark=" + this.f35145b + ", shape=" + this.f35146c + ", typography=" + this.f35147d + ")";
    }
}
