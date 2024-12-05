package U2;

import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f10353a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10354b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10355c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10356d;

    /* renamed from: e, reason: collision with root package name */
    private final Colors f10357e;

    public /* synthetic */ b(long j8, long j9, long j10, long j11, Colors colors, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, colors);
    }

    public static /* synthetic */ b b(b bVar, long j8, long j9, long j10, long j11, Colors colors, int i8, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        Colors colors2;
        if ((i8 & 1) != 0) {
            j12 = bVar.f10353a;
        } else {
            j12 = j8;
        }
        if ((i8 & 2) != 0) {
            j13 = bVar.f10354b;
        } else {
            j13 = j9;
        }
        if ((i8 & 4) != 0) {
            j14 = bVar.f10355c;
        } else {
            j14 = j10;
        }
        if ((i8 & 8) != 0) {
            j15 = bVar.f10356d;
        } else {
            j15 = j11;
        }
        if ((i8 & 16) != 0) {
            colors2 = bVar.f10357e;
        } else {
            colors2 = colors;
        }
        return bVar.a(j12, j13, j14, j15, colors2);
    }

    public final b a(long j8, long j9, long j10, long j11, Colors materialColors) {
        AbstractC3255y.i(materialColors, "materialColors");
        return new b(j8, j9, j10, j11, materialColors, null);
    }

    public final long c() {
        return this.f10354b;
    }

    public final long d() {
        return this.f10353a;
    }

    public final long e() {
        return this.f10356d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Color.m2977equalsimpl0(this.f10353a, bVar.f10353a) && Color.m2977equalsimpl0(this.f10354b, bVar.f10354b) && Color.m2977equalsimpl0(this.f10355c, bVar.f10355c) && Color.m2977equalsimpl0(this.f10356d, bVar.f10356d) && AbstractC3255y.d(this.f10357e, bVar.f10357e)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f10355c;
    }

    public final Colors g() {
        return this.f10357e;
    }

    public int hashCode() {
        return (((((((Color.m2983hashCodeimpl(this.f10353a) * 31) + Color.m2983hashCodeimpl(this.f10354b)) * 31) + Color.m2983hashCodeimpl(this.f10355c)) * 31) + Color.m2983hashCodeimpl(this.f10356d)) * 31) + this.f10357e.hashCode();
    }

    public String toString() {
        return "LinkColors(buttonLabel=" + Color.m2984toStringimpl(this.f10353a) + ", actionLabelLight=" + Color.m2984toStringimpl(this.f10354b) + ", errorText=" + Color.m2984toStringimpl(this.f10355c) + ", errorComponentBackground=" + Color.m2984toStringimpl(this.f10356d) + ", materialColors=" + this.f10357e + ")";
    }

    private b(long j8, long j9, long j10, long j11, Colors materialColors) {
        AbstractC3255y.i(materialColors, "materialColors");
        this.f10353a = j8;
        this.f10354b = j9;
        this.f10355c = j10;
        this.f10356d = j11;
        this.f10357e = materialColors;
    }
}
