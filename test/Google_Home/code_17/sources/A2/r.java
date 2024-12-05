package A2;

import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes4.dex */
public final class r implements B {

    /* renamed from: b, reason: collision with root package name */
    private static final a f228b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f229a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ r(long j8, AbstractC3247p abstractC3247p) {
        this(j8);
    }

    @Override // A2.B
    public long a(int i8, int i9) {
        return this.f229a;
    }

    @Override // A2.B
    public long b(int i8) {
        return C3225a.J(this.f229a, i8);
    }

    private r(long j8) {
        this.f229a = j8;
    }

    public r() {
        this(AbstractC3227c.t(3L, EnumC3228d.f34141e), null);
    }
}
