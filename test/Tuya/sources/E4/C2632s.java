package e4;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import r4.C3688a;
import y2.InterfaceC3983b;

/* renamed from: e4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2632s extends m4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30815b;

    /* renamed from: c, reason: collision with root package name */
    private final m4.H f30816c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30817d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30818e;

    /* renamed from: e4.s$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C3688a entry) {
            AbstractC3159y.i(entry, "entry");
            return AbstractC1246t.e(L5.x.a(C2632s.this.a(), entry));
        }
    }

    public /* synthetic */ C2632s(m4.G g8, m4.H h8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? m4.G.Companion.e() : g8, (i8 & 2) != 0 ? new m4.s0(new r(), false, null, 6, null) : h8);
    }

    @Override // m4.o0, m4.k0
    public m4.G a() {
        return this.f30815b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30818e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30817d;
    }

    @Override // m4.o0, m4.k0
    public InterfaceC3349K d() {
        return v4.g.m(i().m(), new a());
    }

    @Override // m4.o0
    public m4.H i() {
        return this.f30816c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2632s(m4.G identifier, m4.H controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30815b = identifier;
        this.f30816c = controller;
        this.f30817d = true;
    }
}
