package m6;

import P5.g;
import i6.InterfaceC2855x0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import n6.C3482B;

/* loaded from: classes5.dex */
public abstract class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f35945a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar) {
            super(2);
            this.f35945a = tVar;
        }

        public final Integer a(int i8, g.b bVar) {
            int i9;
            g.c key = bVar.getKey();
            g.b bVar2 = this.f35945a.f35938b.get(key);
            if (key != InterfaceC2855x0.f31809n0) {
                if (bVar != bVar2) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i9 = i8 + 1;
                }
                return Integer.valueOf(i9);
            }
            InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) bVar2;
            AbstractC3159y.g(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC2855x0 b8 = v.b((InterfaceC2855x0) bVar, interfaceC2855x0);
            if (b8 == interfaceC2855x0) {
                if (interfaceC2855x0 != null) {
                    i8++;
                }
                return Integer.valueOf(i8);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b8 + ", expected child of " + interfaceC2855x0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(t tVar, P5.g gVar) {
        if (((Number) gVar.fold(0, new a(tVar))).intValue() == tVar.f35939c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + tVar.f35938b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC2855x0 b(InterfaceC2855x0 interfaceC2855x0, InterfaceC2855x0 interfaceC2855x02) {
        while (interfaceC2855x0 != null) {
            if (interfaceC2855x0 == interfaceC2855x02) {
                return interfaceC2855x0;
            }
            if (!(interfaceC2855x0 instanceof C3482B)) {
                return interfaceC2855x0;
            }
            interfaceC2855x0 = interfaceC2855x0.getParent();
        }
        return null;
    }
}
