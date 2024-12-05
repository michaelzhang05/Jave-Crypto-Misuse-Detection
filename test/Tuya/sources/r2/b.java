package R2;

import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f8727a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8728b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8729c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8730d;

    /* renamed from: e, reason: collision with root package name */
    private final Colors f8731e;

    public /* synthetic */ b(long j8, long j9, long j10, long j11, Colors colors, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, colors);
    }

    public static /* synthetic */ b b(b bVar, long j8, long j9, long j10, long j11, Colors colors, int i8, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        Colors colors2;
        if ((i8 & 1) != 0) {
            j12 = bVar.f8727a;
        } else {
            j12 = j8;
        }
        if ((i8 & 2) != 0) {
            j13 = bVar.f8728b;
        } else {
            j13 = j9;
        }
        if ((i8 & 4) != 0) {
            j14 = bVar.f8729c;
        } else {
            j14 = j10;
        }
        if ((i8 & 8) != 0) {
            j15 = bVar.f8730d;
        } else {
            j15 = j11;
        }
        if ((i8 & 16) != 0) {
            colors2 = bVar.f8731e;
        } else {
            colors2 = colors;
        }
        return bVar.a(j12, j13, j14, j15, colors2);
    }

    public final b a(long j8, long j9, long j10, long j11, Colors materialColors) {
        AbstractC3159y.i(materialColors, "materialColors");
        return new b(j8, j9, j10, j11, materialColors, null);
    }

    public final long c() {
        return this.f8728b;
    }

    public final long d() {
        return this.f8727a;
    }

    public final long e() {
        return this.f8730d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Color.m2972equalsimpl0(this.f8727a, bVar.f8727a) && Color.m2972equalsimpl0(this.f8728b, bVar.f8728b) && Color.m2972equalsimpl0(this.f8729c, bVar.f8729c) && Color.m2972equalsimpl0(this.f8730d, bVar.f8730d) && AbstractC3159y.d(this.f8731e, bVar.f8731e)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f8729c;
    }

    public final Colors g() {
        return this.f8731e;
    }

    public int hashCode() {
        return (((((((Color.m2978hashCodeimpl(this.f8727a) * 31) + Color.m2978hashCodeimpl(this.f8728b)) * 31) + Color.m2978hashCodeimpl(this.f8729c)) * 31) + Color.m2978hashCodeimpl(this.f8730d)) * 31) + this.f8731e.hashCode();
    }

    public String toString() {
        return "LinkColors(buttonLabel=" + Color.m2979toStringimpl(this.f8727a) + ", actionLabelLight=" + Color.m2979toStringimpl(this.f8728b) + ", errorText=" + Color.m2979toStringimpl(this.f8729c) + ", errorComponentBackground=" + Color.m2979toStringimpl(this.f8730d) + ", materialColors=" + this.f8731e + ")";
    }

    private b(long j8, long j9, long j10, long j11, Colors materialColors) {
        AbstractC3159y.i(materialColors, "materialColors");
        this.f8727a = j8;
        this.f8728b = j9;
        this.f8729c = j10;
        this.f8730d = j11;
        this.f8731e = materialColors;
    }
}
