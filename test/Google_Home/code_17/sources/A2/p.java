package A2;

import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes4.dex */
public final class p implements B {

    /* renamed from: b, reason: collision with root package name */
    private static final a f226b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f227a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ p(long j8, AbstractC3247p abstractC3247p) {
        this(j8);
    }

    @Override // A2.B
    public long a(int i8, int i9) {
        int k8 = (i8 - g6.m.k(i9, 1, i8)) + 1;
        long j8 = this.f227a;
        EnumC3228d enumC3228d = EnumC3228d.f34141e;
        return AbstractC3227c.r(Math.pow(C3225a.K(j8, enumC3228d), k8), enumC3228d);
    }

    @Override // A2.B
    public long b(int i8) {
        C3225a.C0782a c0782a = C3225a.f34131b;
        long s8 = AbstractC3227c.s(0, EnumC3228d.f34141e);
        for (int i9 = i8; i9 > 0; i9--) {
            s8 = C3225a.I(s8, a(i8, i9));
        }
        return s8;
    }

    private p(long j8) {
        this.f227a = j8;
    }

    public p() {
        this(AbstractC3227c.t(2L, EnumC3228d.f34141e), null);
    }
}
