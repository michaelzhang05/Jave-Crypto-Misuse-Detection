package o6;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f36735a = q6.G.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f36736a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36737b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36738c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1668n interfaceC1668n, S5.d dVar) {
            super(3, dVar);
            this.f36739d = interfaceC1668n;
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3707g interfaceC3707g, Object obj, S5.d dVar) {
            a aVar = new a(this.f36739d, dVar);
            aVar.f36737b = interfaceC3707g;
            aVar.f36738c = obj;
            return aVar.invokeSuspend(O5.I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3707g interfaceC3707g;
            Object e8 = T5.b.e();
            int i8 = this.f36736a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3707g = (InterfaceC3707g) this.f36737b;
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                interfaceC3707g = (InterfaceC3707g) this.f36737b;
                Object obj2 = this.f36738c;
                InterfaceC1668n interfaceC1668n = this.f36739d;
                this.f36737b = interfaceC3707g;
                this.f36736a = 1;
                obj = interfaceC1668n.invoke(obj2, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f36737b = null;
            this.f36736a = 2;
            if (interfaceC3707g.emit(obj, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }
    }

    public static final InterfaceC3706f a(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n) {
        return AbstractC3708h.M(interfaceC3706f, new a(interfaceC1668n, null));
    }

    public static final InterfaceC3706f b(InterfaceC3706f interfaceC3706f, InterfaceC1669o interfaceC1669o) {
        return new p6.i(interfaceC1669o, interfaceC3706f, null, 0, null, 28, null);
    }
}
