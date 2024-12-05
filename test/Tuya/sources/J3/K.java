package J3;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final long f4849a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4850b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4851c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4852d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4853e;

    public /* synthetic */ K(long j8, long j9, long j10, long j11, long j12, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f4849a;
    }

    public final long b() {
        return this.f4853e;
    }

    public final long c() {
        return this.f4850b;
    }

    public final long d() {
        return this.f4852d;
    }

    public final long e() {
        return this.f4851c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        if (Color.m2972equalsimpl0(this.f4849a, k8.f4849a) && Color.m2972equalsimpl0(this.f4850b, k8.f4850b) && Color.m2972equalsimpl0(this.f4851c, k8.f4851c) && Color.m2972equalsimpl0(this.f4852d, k8.f4852d) && Color.m2972equalsimpl0(this.f4853e, k8.f4853e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Color.m2978hashCodeimpl(this.f4849a) * 31) + Color.m2978hashCodeimpl(this.f4850b)) * 31) + Color.m2978hashCodeimpl(this.f4851c)) * 31) + Color.m2978hashCodeimpl(this.f4852d)) * 31) + Color.m2978hashCodeimpl(this.f4853e);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m2979toStringimpl(this.f4849a) + ", onBackground=" + Color.m2979toStringimpl(this.f4850b) + ", successBackground=" + Color.m2979toStringimpl(this.f4851c) + ", onSuccessBackground=" + Color.m2979toStringimpl(this.f4852d) + ", border=" + Color.m2979toStringimpl(this.f4853e) + ")";
    }

    private K(long j8, long j9, long j10, long j11, long j12) {
        this.f4849a = j8;
        this.f4850b = j9;
        this.f4851c = j10;
        this.f4852d = j11;
        this.f4853e = j12;
    }

    public /* synthetic */ K(long j8, long j9, long j10, long j11, long j12, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j9, (i8 & 4) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j10, (i8 & 8) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j11, (i8 & 16) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j12, null);
    }
}
