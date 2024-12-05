package x2;

import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public final class r implements InterfaceC3864B {

    /* renamed from: b, reason: collision with root package name */
    private static final a f39233b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f39234a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ r(long j8, AbstractC3151p abstractC3151p) {
        this(j8);
    }

    @Override // x2.InterfaceC3864B
    public long a(int i8, int i9) {
        return this.f39234a;
    }

    @Override // x2.InterfaceC3864B
    public long b(int i8) {
        return C2758a.F(this.f39234a, i8);
    }

    private r(long j8) {
        this.f39234a = j8;
    }

    public r() {
        this(AbstractC2760c.t(3L, EnumC2761d.f31419e), null);
    }
}
