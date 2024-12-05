package j4;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3075a {

    /* renamed from: a, reason: collision with root package name */
    private final long f33160a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33161b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33162c;

    /* renamed from: d, reason: collision with root package name */
    private final long f33163d;

    /* renamed from: e, reason: collision with root package name */
    private final long f33164e;

    public /* synthetic */ C3075a(long j8, long j9, long j10, long j11, long j12, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f33160a;
    }

    public final long b() {
        return this.f33162c;
    }

    public final long c() {
        return this.f33161b;
    }

    public final long d() {
        return this.f33164e;
    }

    public final long e() {
        return this.f33163d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3075a)) {
            return false;
        }
        C3075a c3075a = (C3075a) obj;
        if (Color.m2972equalsimpl0(this.f33160a, c3075a.f33160a) && Color.m2972equalsimpl0(this.f33161b, c3075a.f33161b) && Color.m2972equalsimpl0(this.f33162c, c3075a.f33162c) && Color.m2972equalsimpl0(this.f33163d, c3075a.f33163d) && Color.m2972equalsimpl0(this.f33164e, c3075a.f33164e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Color.m2978hashCodeimpl(this.f33160a) * 31) + Color.m2978hashCodeimpl(this.f33161b)) * 31) + Color.m2978hashCodeimpl(this.f33162c)) * 31) + Color.m2978hashCodeimpl(this.f33163d)) * 31) + Color.m2978hashCodeimpl(this.f33164e);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m2979toStringimpl(this.f33160a) + ", onBackground=" + Color.m2979toStringimpl(this.f33161b) + ", border=" + Color.m2979toStringimpl(this.f33162c) + ", successBackground=" + Color.m2979toStringimpl(this.f33163d) + ", onSuccessBackground=" + Color.m2979toStringimpl(this.f33164e) + ")";
    }

    private C3075a(long j8, long j9, long j10, long j11, long j12) {
        this.f33160a = j8;
        this.f33161b = j9;
        this.f33162c = j10;
        this.f33163d = j11;
        this.f33164e = j12;
    }
}
