package m4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class g0 implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final int f35498c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Integer f35499a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f35500b;

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f35501a;

        /* renamed from: m4.g0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0818a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35502a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0818a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f35502a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new C[this.f35502a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f35503a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f35504b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f35505c;

            public b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C c8;
                Object e8 = Q5.b.e();
                int i8 = this.f35503a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35504b;
                    Iterator it = AbstractC1239l.V0((Object[]) this.f35505c).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c8 = (C) it.next();
                            if (c8 != null) {
                                break;
                            }
                        } else {
                            c8 = null;
                            break;
                        }
                    }
                    this.f35503a = 1;
                    if (interfaceC3359g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                b bVar = new b(dVar);
                bVar.f35504b = interfaceC3359g;
                bVar.f35505c = objArr;
                return bVar.invokeSuspend(L5.I.f6487a);
            }
        }

        public a(InterfaceC3358f[] interfaceC3358fArr) {
            this.f35501a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f35501a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0818a(interfaceC3358fArr), new b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35506a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f35506a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f35506a;
            ArrayList<C> arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            for (C c8 : arrayList) {
                if (c8 != null) {
                    return c8;
                }
            }
            return null;
        }
    }

    public g0(Integer num, List sectionFieldErrorControllers) {
        InterfaceC3358f aVar;
        C c8;
        AbstractC3159y.i(sectionFieldErrorControllers, "sectionFieldErrorControllers");
        this.f35499a = num;
        List list = sectionFieldErrorControllers;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).getError());
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = AbstractC1246t.m().iterator();
            while (true) {
                if (it2.hasNext()) {
                    c8 = (C) it2.next();
                    if (c8 != null) {
                        break;
                    }
                } else {
                    c8 = null;
                    break;
                }
            }
            aVar = v4.g.n(c8);
        } else {
            aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
        }
        this.f35500b = new v4.e(aVar, new b(arrayList));
    }

    public final InterfaceC3349K getError() {
        return this.f35500b;
    }

    public final Integer v() {
        return this.f35499a;
    }
}
