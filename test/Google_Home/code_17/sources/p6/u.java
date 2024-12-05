package p6;

import a6.InterfaceC1669o;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.Z;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1669o f37969a;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3252v implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37970a = new a();

        a() {
            super(3, InterfaceC3707g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3707g interfaceC3707g, Object obj, S5.d dVar) {
            return interfaceC3707g.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f37970a;
        AbstractC3255y.g(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f37969a = (InterfaceC1669o) Z.d(aVar, 3);
    }

    public static final /* synthetic */ InterfaceC1669o a() {
        return f37969a;
    }
}
