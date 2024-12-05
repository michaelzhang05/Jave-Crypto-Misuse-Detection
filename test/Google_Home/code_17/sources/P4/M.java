package p4;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final long f37156a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37157b;

    public /* synthetic */ M(long j8, long j9, AbstractC3247p abstractC3247p) {
        this(j8, j9);
    }

    public final long a() {
        return this.f37157b;
    }

    public final long b() {
        return this.f37156a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (Color.m2977equalsimpl0(this.f37156a, m8.f37156a) && Color.m2977equalsimpl0(this.f37157b, m8.f37157b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Color.m2983hashCodeimpl(this.f37156a) * 31) + Color.m2983hashCodeimpl(this.f37157b);
    }

    public String toString() {
        return "OTPElementColors(selectedBorder=" + Color.m2984toStringimpl(this.f37156a) + ", placeholder=" + Color.m2984toStringimpl(this.f37157b) + ")";
    }

    private M(long j8, long j9) {
        this.f37156a = j8;
        this.f37157b = j9;
    }
}
