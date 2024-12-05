package N3;

import O5.I;
import O5.t;
import a6.InterfaceC1669o;
import a6.InterfaceC1673s;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3253w;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import p6.k;

/* loaded from: classes4.dex */
public abstract class c {

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f7719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1673s f7720b;

        /* renamed from: N3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0139a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f7721a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0139a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f7721a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f7721a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f7722a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f7723b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f7724c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC1673s f7725d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(S5.d dVar, InterfaceC1673s interfaceC1673s) {
                super(3, dVar);
                this.f7725d = interfaceC1673s;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3707g interfaceC3707g;
                Object e8 = T5.b.e();
                int i8 = this.f7722a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return I.f8278a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3707g = (InterfaceC3707g) this.f7723b;
                    t.b(obj);
                } else {
                    t.b(obj);
                    interfaceC3707g = (InterfaceC3707g) this.f7723b;
                    Object[] objArr = (Object[]) this.f7724c;
                    InterfaceC1673s interfaceC1673s = this.f7725d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    this.f7723b = interfaceC3707g;
                    this.f7722a = 1;
                    AbstractC3253w.c(6);
                    obj = interfaceC1673s.invoke(obj2, obj3, obj4, obj5, obj6, obj7, this);
                    AbstractC3253w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f7723b = null;
                this.f7722a = 2;
                if (interfaceC3707g.emit(obj, this) == e8) {
                    return e8;
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                b bVar = new b(dVar, this.f7725d);
                bVar.f7723b = interfaceC3707g;
                bVar.f7724c = objArr;
                return bVar.invokeSuspend(I.f8278a);
            }
        }

        public a(InterfaceC3706f[] interfaceC3706fArr, InterfaceC1673s interfaceC1673s) {
            this.f7719a = interfaceC3706fArr;
            this.f7720b = interfaceC1673s;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f7719a;
            Object a8 = k.a(interfaceC3707g, interfaceC3706fArr, new C0139a(interfaceC3706fArr), new b(null, this.f7720b), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return I.f8278a;
        }
    }

    public static final InterfaceC3706f a(InterfaceC3706f flow, InterfaceC3706f flow2, InterfaceC3706f flow3, InterfaceC3706f flow4, InterfaceC3706f flow5, InterfaceC3706f flow6, InterfaceC1673s transform) {
        AbstractC3255y.i(flow, "flow");
        AbstractC3255y.i(flow2, "flow2");
        AbstractC3255y.i(flow3, "flow3");
        AbstractC3255y.i(flow4, "flow4");
        AbstractC3255y.i(flow5, "flow5");
        AbstractC3255y.i(flow6, "flow6");
        AbstractC3255y.i(transform, "transform");
        return new a(new InterfaceC3706f[]{flow, flow2, flow3, flow4, flow5, flow6}, transform);
    }
}
