package m4;

import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3436h {

    /* renamed from: a, reason: collision with root package name */
    private final long f35190a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35191b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35192c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35193d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35194e;

    /* renamed from: f, reason: collision with root package name */
    private final long f35195f;

    /* renamed from: g, reason: collision with root package name */
    private final long f35196g;

    /* renamed from: h, reason: collision with root package name */
    private final long f35197h;

    /* renamed from: i, reason: collision with root package name */
    private final Colors f35198i;

    public /* synthetic */ C3436h(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors colors, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, colors);
    }

    public static /* synthetic */ C3436h b(C3436h c3436h, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors colors, int i8, Object obj) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        Colors colors2;
        if ((i8 & 1) != 0) {
            j16 = c3436h.f35190a;
        } else {
            j16 = j8;
        }
        if ((i8 & 2) != 0) {
            j17 = c3436h.f35191b;
        } else {
            j17 = j9;
        }
        if ((i8 & 4) != 0) {
            j18 = c3436h.f35192c;
        } else {
            j18 = j10;
        }
        if ((i8 & 8) != 0) {
            j19 = c3436h.f35193d;
        } else {
            j19 = j11;
        }
        if ((i8 & 16) != 0) {
            j20 = c3436h.f35194e;
        } else {
            j20 = j12;
        }
        if ((i8 & 32) != 0) {
            j21 = c3436h.f35195f;
        } else {
            j21 = j13;
        }
        if ((i8 & 64) != 0) {
            j22 = c3436h.f35196g;
        } else {
            j22 = j14;
        }
        long j24 = j22;
        if ((i8 & 128) != 0) {
            j23 = c3436h.f35197h;
        } else {
            j23 = j15;
        }
        if ((i8 & 256) != 0) {
            colors2 = c3436h.f35198i;
        } else {
            colors2 = colors;
        }
        return c3436h.a(j16, j17, j18, j19, j20, j21, j24, j23, colors2);
    }

    public final C3436h a(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors materialColors) {
        AbstractC3255y.i(materialColors, "materialColors");
        return new C3436h(j8, j9, j10, j11, j12, j13, j14, j15, materialColors, null);
    }

    public final long c() {
        return this.f35197h;
    }

    public final long d() {
        return this.f35190a;
    }

    public final long e() {
        return this.f35191b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3436h)) {
            return false;
        }
        C3436h c3436h = (C3436h) obj;
        if (Color.m2977equalsimpl0(this.f35190a, c3436h.f35190a) && Color.m2977equalsimpl0(this.f35191b, c3436h.f35191b) && Color.m2977equalsimpl0(this.f35192c, c3436h.f35192c) && Color.m2977equalsimpl0(this.f35193d, c3436h.f35193d) && Color.m2977equalsimpl0(this.f35194e, c3436h.f35194e) && Color.m2977equalsimpl0(this.f35195f, c3436h.f35195f) && Color.m2977equalsimpl0(this.f35196g, c3436h.f35196g) && Color.m2977equalsimpl0(this.f35197h, c3436h.f35197h) && AbstractC3255y.d(this.f35198i, c3436h.f35198i)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f35192c;
    }

    public final Colors g() {
        return this.f35198i;
    }

    public final long h() {
        return this.f35193d;
    }

    public int hashCode() {
        return (((((((((((((((Color.m2983hashCodeimpl(this.f35190a) * 31) + Color.m2983hashCodeimpl(this.f35191b)) * 31) + Color.m2983hashCodeimpl(this.f35192c)) * 31) + Color.m2983hashCodeimpl(this.f35193d)) * 31) + Color.m2983hashCodeimpl(this.f35194e)) * 31) + Color.m2983hashCodeimpl(this.f35195f)) * 31) + Color.m2983hashCodeimpl(this.f35196g)) * 31) + Color.m2983hashCodeimpl(this.f35197h)) * 31) + this.f35198i.hashCode();
    }

    public final long i() {
        return this.f35196g;
    }

    public final long j() {
        return this.f35194e;
    }

    public final long k() {
        return this.f35195f;
    }

    public String toString() {
        return "StripeColors(component=" + Color.m2984toStringimpl(this.f35190a) + ", componentBorder=" + Color.m2984toStringimpl(this.f35191b) + ", componentDivider=" + Color.m2984toStringimpl(this.f35192c) + ", onComponent=" + Color.m2984toStringimpl(this.f35193d) + ", subtitle=" + Color.m2984toStringimpl(this.f35194e) + ", textCursor=" + Color.m2984toStringimpl(this.f35195f) + ", placeholderText=" + Color.m2984toStringimpl(this.f35196g) + ", appBarIcon=" + Color.m2984toStringimpl(this.f35197h) + ", materialColors=" + this.f35198i + ")";
    }

    private C3436h(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors materialColors) {
        AbstractC3255y.i(materialColors, "materialColors");
        this.f35190a = j8;
        this.f35191b = j9;
        this.f35192c = j10;
        this.f35193d = j11;
        this.f35194e = j12;
        this.f35195f = j13;
        this.f35196g = j14;
        this.f35197h = j15;
        this.f35198i = materialColors;
    }
}
