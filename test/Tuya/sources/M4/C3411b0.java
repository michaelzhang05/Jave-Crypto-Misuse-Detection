package m4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import y2.InterfaceC3983b;

/* renamed from: m4.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3411b0 extends n0 {

    /* renamed from: b, reason: collision with root package name */
    private final List f35404b;

    /* renamed from: c, reason: collision with root package name */
    private final C3409a0 f35405c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35406d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35407e;

    /* renamed from: m4.b0$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f35408a;

        /* renamed from: m4.b0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0816a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35409a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0816a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f35409a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f35409a.length];
            }
        }

        /* renamed from: m4.b0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f35410a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f35411b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f35412c;

            public b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f35410a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35411b;
                    List z8 = AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f35412c)));
                    this.f35410a = 1;
                    if (interfaceC3359g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                b bVar = new b(dVar);
                bVar.f35411b = interfaceC3359g;
                bVar.f35412c = objArr;
                return bVar.invokeSuspend(L5.I.f6487a);
            }
        }

        public a(InterfaceC3358f[] interfaceC3358fArr) {
            this.f35408a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f35408a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0816a(interfaceC3358fArr), new b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* renamed from: m4.b0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35413a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f35413a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f35413a;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            return AbstractC1246t.z(AbstractC1246t.W0(arrayList));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3411b0(G _identifier, List fields, C3409a0 controller) {
        super(_identifier);
        AbstractC3159y.i(_identifier, "_identifier");
        AbstractC3159y.i(fields, "fields");
        AbstractC3159y.i(controller, "controller");
        this.f35404b = fields;
        this.f35405c = controller;
        List list = fields;
        boolean z8 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((o0) it.next()).c()) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f35406d = z8;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35407e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35406d;
    }

    @Override // m4.k0
    public InterfaceC3349K d() {
        InterfaceC3358f aVar;
        List list = this.f35404b;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).d());
        }
        if (arrayList.isEmpty()) {
            aVar = v4.g.n(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m())));
        } else {
            aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
        }
        return new v4.e(aVar, new b(arrayList));
    }

    @Override // m4.k0
    public InterfaceC3349K e() {
        List list = this.f35404b;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).e());
        }
        return (InterfaceC3349K) AbstractC1246t.y0(arrayList);
    }

    @Override // m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
        Iterator it = this.f35404b.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).h(rawValuesMap);
        }
    }

    @Override // m4.k0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C3409a0 f() {
        return this.f35405c;
    }
}
