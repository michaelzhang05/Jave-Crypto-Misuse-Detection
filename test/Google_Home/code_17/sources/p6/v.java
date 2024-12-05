package p6;

import S5.g;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.InterfaceC3390x0;
import q6.C3861B;

/* loaded from: classes5.dex */
public abstract class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f37971a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar) {
            super(2);
            this.f37971a = tVar;
        }

        public final Integer a(int i8, g.b bVar) {
            int i9;
            g.c key = bVar.getKey();
            g.b bVar2 = this.f37971a.f37964b.get(key);
            if (key != InterfaceC3390x0.f34661n0) {
                if (bVar != bVar2) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i9 = i8 + 1;
                }
                return Integer.valueOf(i9);
            }
            InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) bVar2;
            AbstractC3255y.g(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC3390x0 b8 = v.b((InterfaceC3390x0) bVar, interfaceC3390x0);
            if (b8 == interfaceC3390x0) {
                if (interfaceC3390x0 != null) {
                    i8++;
                }
                return Integer.valueOf(i8);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b8 + ", expected child of " + interfaceC3390x0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(t tVar, S5.g gVar) {
        if (((Number) gVar.fold(0, new a(tVar))).intValue() == tVar.f37965c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + tVar.f37964b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC3390x0 b(InterfaceC3390x0 interfaceC3390x0, InterfaceC3390x0 interfaceC3390x02) {
        while (interfaceC3390x0 != null) {
            if (interfaceC3390x0 == interfaceC3390x02) {
                return interfaceC3390x0;
            }
            if (!(interfaceC3390x0 instanceof C3861B)) {
                return interfaceC3390x0;
            }
            interfaceC3390x0 = interfaceC3390x0.getParent();
        }
        return null;
    }
}
