package M3;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final long f6555a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6556b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6557c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6558d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6559e;

    public /* synthetic */ K(long j8, long j9, long j10, long j11, long j12, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f6555a;
    }

    public final long b() {
        return this.f6559e;
    }

    public final long c() {
        return this.f6556b;
    }

    public final long d() {
        return this.f6558d;
    }

    public final long e() {
        return this.f6557c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        if (Color.m2977equalsimpl0(this.f6555a, k8.f6555a) && Color.m2977equalsimpl0(this.f6556b, k8.f6556b) && Color.m2977equalsimpl0(this.f6557c, k8.f6557c) && Color.m2977equalsimpl0(this.f6558d, k8.f6558d) && Color.m2977equalsimpl0(this.f6559e, k8.f6559e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Color.m2983hashCodeimpl(this.f6555a) * 31) + Color.m2983hashCodeimpl(this.f6556b)) * 31) + Color.m2983hashCodeimpl(this.f6557c)) * 31) + Color.m2983hashCodeimpl(this.f6558d)) * 31) + Color.m2983hashCodeimpl(this.f6559e);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m2984toStringimpl(this.f6555a) + ", onBackground=" + Color.m2984toStringimpl(this.f6556b) + ", successBackground=" + Color.m2984toStringimpl(this.f6557c) + ", onSuccessBackground=" + Color.m2984toStringimpl(this.f6558d) + ", border=" + Color.m2984toStringimpl(this.f6559e) + ")";
    }

    private K(long j8, long j9, long j10, long j11, long j12) {
        this.f6555a = j8;
        this.f6556b = j9;
        this.f6557c = j10;
        this.f6558d = j11;
        this.f6559e = j12;
    }

    public /* synthetic */ K(long j8, long j9, long j10, long j11, long j12, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j9, (i8 & 4) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j10, (i8 & 8) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j11, (i8 & 16) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j12, null);
    }
}
