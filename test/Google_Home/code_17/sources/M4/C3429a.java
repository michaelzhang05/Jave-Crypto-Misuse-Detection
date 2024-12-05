package m4;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3247p;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3429a {

    /* renamed from: a, reason: collision with root package name */
    private final long f35136a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35137b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35138c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35139d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35140e;

    public /* synthetic */ C3429a(long j8, long j9, long j10, long j11, long j12, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f35136a;
    }

    public final long b() {
        return this.f35138c;
    }

    public final long c() {
        return this.f35137b;
    }

    public final long d() {
        return this.f35140e;
    }

    public final long e() {
        return this.f35139d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3429a)) {
            return false;
        }
        C3429a c3429a = (C3429a) obj;
        if (Color.m2977equalsimpl0(this.f35136a, c3429a.f35136a) && Color.m2977equalsimpl0(this.f35137b, c3429a.f35137b) && Color.m2977equalsimpl0(this.f35138c, c3429a.f35138c) && Color.m2977equalsimpl0(this.f35139d, c3429a.f35139d) && Color.m2977equalsimpl0(this.f35140e, c3429a.f35140e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Color.m2983hashCodeimpl(this.f35136a) * 31) + Color.m2983hashCodeimpl(this.f35137b)) * 31) + Color.m2983hashCodeimpl(this.f35138c)) * 31) + Color.m2983hashCodeimpl(this.f35139d)) * 31) + Color.m2983hashCodeimpl(this.f35140e);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m2984toStringimpl(this.f35136a) + ", onBackground=" + Color.m2984toStringimpl(this.f35137b) + ", border=" + Color.m2984toStringimpl(this.f35138c) + ", successBackground=" + Color.m2984toStringimpl(this.f35139d) + ", onSuccessBackground=" + Color.m2984toStringimpl(this.f35140e) + ")";
    }

    private C3429a(long j8, long j9, long j10, long j11, long j12) {
        this.f35136a = j8;
        this.f35137b = j9;
        this.f35138c = j10;
        this.f35139d = j11;
        this.f35140e = j12;
    }
}
