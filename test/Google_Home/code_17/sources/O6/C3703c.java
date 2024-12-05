package o6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC3247p;
import n6.EnumC3487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3703c extends p6.e {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f36629f = AtomicIntegerFieldUpdater.newUpdater(C3703c.class, "consumed");
    private volatile int consumed;

    /* renamed from: d, reason: collision with root package name */
    private final n6.u f36630d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f36631e;

    public /* synthetic */ C3703c(n6.u uVar, boolean z8, S5.g gVar, int i8, EnumC3487a enumC3487a, int i9, AbstractC3247p abstractC3247p) {
        this(uVar, z8, (i9 & 4) != 0 ? S5.h.f9825a : gVar, (i9 & 8) != 0 ? -3 : i8, (i9 & 16) != 0 ? EnumC3487a.SUSPEND : enumC3487a);
    }

    private final void n() {
        if (this.f36631e && f36629f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // p6.e
    protected String b() {
        return "channel=" + this.f36630d;
    }

    @Override // p6.e, o6.InterfaceC3706f
    public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        if (this.f37903b == -3) {
            n();
            Object d8 = AbstractC3710j.d(interfaceC3707g, this.f36630d, this.f36631e, dVar);
            if (d8 == T5.b.e()) {
                return d8;
            }
            return O5.I.f8278a;
        }
        Object collect = super.collect(interfaceC3707g, dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return O5.I.f8278a;
    }

    @Override // p6.e
    protected Object h(n6.s sVar, S5.d dVar) {
        Object d8 = AbstractC3710j.d(new p6.w(sVar), this.f36630d, this.f36631e, dVar);
        if (d8 == T5.b.e()) {
            return d8;
        }
        return O5.I.f8278a;
    }

    @Override // p6.e
    protected p6.e i(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return new C3703c(this.f36630d, this.f36631e, gVar, i8, enumC3487a);
    }

    @Override // p6.e
    public InterfaceC3706f j() {
        return new C3703c(this.f36630d, this.f36631e, null, 0, null, 28, null);
    }

    @Override // p6.e
    public n6.u m(l6.M m8) {
        n();
        if (this.f37903b == -3) {
            return this.f36630d;
        }
        return super.m(m8);
    }

    public C3703c(n6.u uVar, boolean z8, S5.g gVar, int i8, EnumC3487a enumC3487a) {
        super(gVar, i8, enumC3487a);
        this.f36630d = uVar;
        this.f36631e = z8;
        this.consumed = 0;
    }
}
