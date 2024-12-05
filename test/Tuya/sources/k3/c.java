package K3;

import L5.I;
import L5.t;
import X5.o;
import X5.s;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m6.k;

/* loaded from: classes4.dex */
public abstract class c {

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f5940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f5941b;

        /* renamed from: K3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0114a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f5942a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0114a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f5942a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f5942a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements o {

            /* renamed from: a, reason: collision with root package name */
            int f5943a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f5944b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f5945c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ s f5946d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(P5.d dVar, s sVar) {
                super(3, dVar);
                this.f5946d = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3359g interfaceC3359g;
                Object e8 = Q5.b.e();
                int i8 = this.f5943a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return I.f6487a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3359g = (InterfaceC3359g) this.f5944b;
                    t.b(obj);
                } else {
                    t.b(obj);
                    interfaceC3359g = (InterfaceC3359g) this.f5944b;
                    Object[] objArr = (Object[]) this.f5945c;
                    s sVar = this.f5946d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    this.f5944b = interfaceC3359g;
                    this.f5943a = 1;
                    AbstractC3157w.c(6);
                    obj = sVar.invoke(obj2, obj3, obj4, obj5, obj6, obj7, this);
                    AbstractC3157w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f5944b = null;
                this.f5943a = 2;
                if (interfaceC3359g.emit(obj, this) == e8) {
                    return e8;
                }
                return I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                b bVar = new b(dVar, this.f5946d);
                bVar.f5944b = interfaceC3359g;
                bVar.f5945c = objArr;
                return bVar.invokeSuspend(I.f6487a);
            }
        }

        public a(InterfaceC3358f[] interfaceC3358fArr, s sVar) {
            this.f5940a = interfaceC3358fArr;
            this.f5941b = sVar;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f5940a;
            Object a8 = k.a(interfaceC3359g, interfaceC3358fArr, new C0114a(interfaceC3358fArr), new b(null, this.f5941b), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return I.f6487a;
        }
    }

    public static final InterfaceC3358f a(InterfaceC3358f flow, InterfaceC3358f flow2, InterfaceC3358f flow3, InterfaceC3358f flow4, InterfaceC3358f flow5, InterfaceC3358f flow6, s transform) {
        AbstractC3159y.i(flow, "flow");
        AbstractC3159y.i(flow2, "flow2");
        AbstractC3159y.i(flow3, "flow3");
        AbstractC3159y.i(flow4, "flow4");
        AbstractC3159y.i(flow5, "flow5");
        AbstractC3159y.i(flow6, "flow6");
        AbstractC3159y.i(transform, "transform");
        return new a(new InterfaceC3358f[]{flow, flow2, flow3, flow4, flow5, flow6}, transform);
    }
}
