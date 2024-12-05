package F3;

import h6.C2758a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f2498a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2499b;

    /* renamed from: c, reason: collision with root package name */
    private final e f2500c;

    public /* synthetic */ f(long j8, int i8, e eVar, AbstractC3151p abstractC3151p) {
        this(j8, i8, eVar);
    }

    public static /* synthetic */ f b(f fVar, long j8, int i8, e eVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j8 = fVar.f2498a;
        }
        if ((i9 & 2) != 0) {
            i8 = fVar.f2499b;
        }
        if ((i9 & 4) != 0) {
            eVar = fVar.f2500c;
        }
        return fVar.a(j8, i8, eVar);
    }

    public final f a(long j8, int i8, e pollingState) {
        AbstractC3159y.i(pollingState, "pollingState");
        return new f(j8, i8, pollingState, null);
    }

    public final int c() {
        return this.f2499b;
    }

    public final long d() {
        return this.f2498a;
    }

    public final e e() {
        return this.f2500c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (C2758a.j(this.f2498a, fVar.f2498a) && this.f2499b == fVar.f2499b && this.f2500c == fVar.f2500c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C2758a.w(this.f2498a) * 31) + this.f2499b) * 31) + this.f2500c.hashCode();
    }

    public String toString() {
        return "PollingUiState(durationRemaining=" + C2758a.J(this.f2498a) + ", ctaText=" + this.f2499b + ", pollingState=" + this.f2500c + ")";
    }

    private f(long j8, int i8, e pollingState) {
        AbstractC3159y.i(pollingState, "pollingState");
        this.f2498a = j8;
        this.f2499b = i8;
        this.f2500c = pollingState;
    }

    public /* synthetic */ f(long j8, int i8, e eVar, int i9, AbstractC3151p abstractC3151p) {
        this(j8, i8, (i9 & 4) != 0 ? e.f2492a : eVar, null);
    }
}
