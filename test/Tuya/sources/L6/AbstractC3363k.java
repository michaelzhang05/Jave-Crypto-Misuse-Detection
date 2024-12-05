package l6;

import i6.AbstractC2829k;
import i6.InterfaceC2855x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3363k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.k$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f34648a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f34649b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3358f interfaceC3358f, P5.d dVar) {
            super(2, dVar);
            this.f34649b = interfaceC3358f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f34649b, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f34648a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3358f interfaceC3358f = this.f34649b;
                this.f34648a = 1;
                if (AbstractC3360h.g(interfaceC3358f, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    public static final Object a(InterfaceC3358f interfaceC3358f, P5.d dVar) {
        Object collect = interfaceC3358f.collect(m6.r.f35933a, dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return L5.I.f6487a;
    }

    public static final Object b(InterfaceC3358f interfaceC3358f, X5.n nVar, P5.d dVar) {
        InterfaceC3358f b8;
        b8 = AbstractC3364l.b(AbstractC3360h.C(interfaceC3358f, nVar), 0, null, 2, null);
        Object g8 = AbstractC3360h.g(b8, dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    public static final Object c(InterfaceC3359g interfaceC3359g, InterfaceC3358f interfaceC3358f, P5.d dVar) {
        AbstractC3360h.s(interfaceC3359g);
        Object collect = interfaceC3358f.collect(interfaceC3359g, dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return L5.I.f6487a;
    }

    public static final InterfaceC2855x0 d(InterfaceC3358f interfaceC3358f, i6.M m8) {
        InterfaceC2855x0 d8;
        d8 = AbstractC2829k.d(m8, null, null, new a(interfaceC3358f, null), 3, null);
        return d8;
    }
}
