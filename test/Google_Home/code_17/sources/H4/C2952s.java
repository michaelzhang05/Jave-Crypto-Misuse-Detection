package h4;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import u4.C4061a;

/* renamed from: h4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2952s extends p4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final p4.G f32736b;

    /* renamed from: c, reason: collision with root package name */
    private final p4.H f32737c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32738d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f32739e;

    /* renamed from: h4.s$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C4061a entry) {
            AbstractC3255y.i(entry, "entry");
            return AbstractC1378t.e(O5.x.a(C2952s.this.a(), entry));
        }
    }

    public /* synthetic */ C2952s(p4.G g8, p4.H h8, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? p4.G.Companion.e() : g8, (i8 & 2) != 0 ? new p4.s0(new r(), false, null, 6, null) : h8);
    }

    @Override // p4.o0, p4.k0
    public p4.G a() {
        return this.f32736b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f32739e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f32738d;
    }

    @Override // p4.o0, p4.k0
    public InterfaceC3698L d() {
        return y4.g.m(i().m(), new a());
    }

    @Override // p4.o0
    public p4.H i() {
        return this.f32737c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2952s(p4.G identifier, p4.H controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f32736b = identifier;
        this.f32737c = controller;
        this.f32738d = true;
    }
}
