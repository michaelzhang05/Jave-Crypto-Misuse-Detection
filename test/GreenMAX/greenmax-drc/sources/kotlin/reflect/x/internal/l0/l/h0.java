package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes2.dex */
public final class h0 extends s1 {

    /* renamed from: g, reason: collision with root package name */
    private final n f21253g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0<e0> f21254h;

    /* renamed from: i, reason: collision with root package name */
    private final i<e0> f21255i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialTypes.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function0<e0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f21256f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0 f21257g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, h0 h0Var) {
            super(0);
            this.f21256f = gVar;
            this.f21257g = h0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f21256f.a((kotlin.reflect.x.internal.l0.l.w1.i) this.f21257g.f21254h.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(n nVar, Function0<? extends e0> function0) {
        l.f(nVar, "storageManager");
        l.f(function0, "computation");
        this.f21253g = nVar;
        this.f21254h = function0;
        this.f21255i = nVar.d(function0);
    }

    @Override // kotlin.reflect.x.internal.l0.l.s1
    protected e0 S0() {
        return this.f21255i.invoke();
    }

    @Override // kotlin.reflect.x.internal.l0.l.s1
    public boolean T0() {
        return this.f21255i.a();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public h0 Y0(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return new h0(this.f21253g, new a(gVar, this));
    }
}
