package p4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import a6.InterfaceC1669o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class g0 implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final int f37524c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Integer f37525a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f37526b;

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f37527a;

        /* renamed from: p4.g0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0848a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37528a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0848a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f37528a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new C[this.f37528a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f37529a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37530b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37531c;

            public b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C c8;
                Object e8 = T5.b.e();
                int i8 = this.f37529a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37530b;
                    Iterator it = AbstractC1371l.V0((Object[]) this.f37531c).iterator();
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
                    this.f37529a = 1;
                    if (interfaceC3707g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                b bVar = new b(dVar);
                bVar.f37530b = interfaceC3707g;
                bVar.f37531c = objArr;
                return bVar.invokeSuspend(O5.I.f8278a);
            }
        }

        public a(InterfaceC3706f[] interfaceC3706fArr) {
            this.f37527a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f37527a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0848a(interfaceC3706fArr), new b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37532a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f37532a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f37532a;
            ArrayList<C> arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
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
        InterfaceC3706f aVar;
        C c8;
        AbstractC3255y.i(sectionFieldErrorControllers, "sectionFieldErrorControllers");
        this.f37525a = num;
        List list = sectionFieldErrorControllers;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).getError());
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = AbstractC1378t.m().iterator();
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
            aVar = y4.g.n(c8);
        } else {
            aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
        }
        this.f37526b = new y4.e(aVar, new b(arrayList));
    }

    public final InterfaceC3698L getError() {
        return this.f37526b;
    }

    public final Integer v() {
        return this.f37525a;
    }
}
