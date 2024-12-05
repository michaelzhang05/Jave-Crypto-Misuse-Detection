package o6;

import a6.InterfaceC1668n;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3711k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.k$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f36649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36650b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3706f interfaceC3706f, S5.d dVar) {
            super(2, dVar);
            this.f36650b = interfaceC3706f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f36650b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f36649a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3706f interfaceC3706f = this.f36650b;
                this.f36649a = 1;
                if (AbstractC3708h.i(interfaceC3706f, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public static final Object a(InterfaceC3706f interfaceC3706f, S5.d dVar) {
        Object collect = interfaceC3706f.collect(p6.r.f37959a, dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return O5.I.f8278a;
    }

    public static final Object b(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        InterfaceC3706f b8;
        b8 = AbstractC3712l.b(AbstractC3708h.E(interfaceC3706f, interfaceC1668n), 0, null, 2, null);
        Object i8 = AbstractC3708h.i(b8, dVar);
        if (i8 == T5.b.e()) {
            return i8;
        }
        return O5.I.f8278a;
    }

    public static final Object c(InterfaceC3707g interfaceC3707g, InterfaceC3706f interfaceC3706f, S5.d dVar) {
        AbstractC3708h.u(interfaceC3707g);
        Object collect = interfaceC3706f.collect(interfaceC3707g, dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return O5.I.f8278a;
    }

    public static final InterfaceC3390x0 d(InterfaceC3706f interfaceC3706f, l6.M m8) {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(m8, null, null, new a(interfaceC3706f, null), 3, null);
        return d8;
    }
}
