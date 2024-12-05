package p4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import a6.InterfaceC1669o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* renamed from: p4.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3754b0 extends n0 {

    /* renamed from: b, reason: collision with root package name */
    private final List f37430b;

    /* renamed from: c, reason: collision with root package name */
    private final C3752a0 f37431c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37432d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f37433e;

    /* renamed from: p4.b0$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f37434a;

        /* renamed from: p4.b0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0846a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37435a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0846a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f37435a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f37435a.length];
            }
        }

        /* renamed from: p4.b0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f37436a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37437b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37438c;

            public b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f37436a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37437b;
                    List z8 = AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f37438c)));
                    this.f37436a = 1;
                    if (interfaceC3707g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                b bVar = new b(dVar);
                bVar.f37437b = interfaceC3707g;
                bVar.f37438c = objArr;
                return bVar.invokeSuspend(O5.I.f8278a);
            }
        }

        public a(InterfaceC3706f[] interfaceC3706fArr) {
            this.f37434a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f37434a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0846a(interfaceC3706fArr), new b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* renamed from: p4.b0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37439a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f37439a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f37439a;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
            }
            return AbstractC1378t.z(AbstractC1378t.W0(arrayList));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3754b0(G _identifier, List fields, C3752a0 controller) {
        super(_identifier);
        AbstractC3255y.i(_identifier, "_identifier");
        AbstractC3255y.i(fields, "fields");
        AbstractC3255y.i(controller, "controller");
        this.f37430b = fields;
        this.f37431c = controller;
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
        this.f37432d = z8;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f37433e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f37432d;
    }

    @Override // p4.k0
    public InterfaceC3698L d() {
        InterfaceC3706f aVar;
        List list = this.f37430b;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).d());
        }
        if (arrayList.isEmpty()) {
            aVar = y4.g.n(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m())));
        } else {
            aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
        }
        return new y4.e(aVar, new b(arrayList));
    }

    @Override // p4.k0
    public InterfaceC3698L e() {
        List list = this.f37430b;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).e());
        }
        return (InterfaceC3698L) AbstractC1378t.y0(arrayList);
    }

    @Override // p4.k0
    public void h(Map rawValuesMap) {
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
        Iterator it = this.f37430b.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).h(rawValuesMap);
        }
    }

    @Override // p4.k0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C3752a0 f() {
        return this.f37431c;
    }
}
