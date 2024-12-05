package I3;

import k6.C3225a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f4038a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4039b;

    /* renamed from: c, reason: collision with root package name */
    private final e f4040c;

    public /* synthetic */ f(long j8, int i8, e eVar, AbstractC3247p abstractC3247p) {
        this(j8, i8, eVar);
    }

    public static /* synthetic */ f b(f fVar, long j8, int i8, e eVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j8 = fVar.f4038a;
        }
        if ((i9 & 2) != 0) {
            i8 = fVar.f4039b;
        }
        if ((i9 & 4) != 0) {
            eVar = fVar.f4040c;
        }
        return fVar.a(j8, i8, eVar);
    }

    public final f a(long j8, int i8, e pollingState) {
        AbstractC3255y.i(pollingState, "pollingState");
        return new f(j8, i8, pollingState, null);
    }

    public final int c() {
        return this.f4039b;
    }

    public final long d() {
        return this.f4038a;
    }

    public final e e() {
        return this.f4040c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (C3225a.j(this.f4038a, fVar.f4038a) && this.f4039b == fVar.f4039b && this.f4040c == fVar.f4040c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C3225a.A(this.f4038a) * 31) + this.f4039b) * 31) + this.f4040c.hashCode();
    }

    public String toString() {
        return "PollingUiState(durationRemaining=" + C3225a.N(this.f4038a) + ", ctaText=" + this.f4039b + ", pollingState=" + this.f4040c + ")";
    }

    private f(long j8, int i8, e pollingState) {
        AbstractC3255y.i(pollingState, "pollingState");
        this.f4038a = j8;
        this.f4039b = i8;
        this.f4040c = pollingState;
    }

    public /* synthetic */ f(long j8, int i8, e eVar, int i9, AbstractC3247p abstractC3247p) {
        this(j8, i8, (i9 & 4) != 0 ? e.f4032a : eVar, null);
    }
}
