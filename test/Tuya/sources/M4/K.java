package m4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import androidx.compose.ui.text.input.KeyboardType;
import d6.C2559c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class K implements r {

    /* renamed from: f, reason: collision with root package name */
    private static final a f35110f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f35111g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final C2559c f35112h = new C2559c('0', '9');

    /* renamed from: a, reason: collision with root package name */
    private final int f35113a;

    /* renamed from: b, reason: collision with root package name */
    private String f35114b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35115c;

    /* renamed from: d, reason: collision with root package name */
    private final List f35116d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f35117e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f35118a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35119a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f35119a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new String[this.f35119a.length];
            }
        }

        /* renamed from: m4.K$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0795b extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f35120a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f35121b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f35122c;

            public C0795b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f35120a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35121b;
                    String w02 = AbstractC1246t.w0(AbstractC1239l.V0((Object[]) this.f35122c), "", null, null, 0, null, null, 62, null);
                    this.f35120a = 1;
                    if (interfaceC3359g.emit(w02, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                C0795b c0795b = new C0795b(dVar);
                c0795b.f35121b = interfaceC3359g;
                c0795b.f35122c = objArr;
                return c0795b.invokeSuspend(L5.I.f6487a);
            }
        }

        public b(InterfaceC3358f[] interfaceC3358fArr) {
            this.f35118a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f35118a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new a(interfaceC3358fArr), new C0795b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35123a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f35123a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f35123a;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            return AbstractC1246t.w0(arrayList, "", null, null, 0, null, null, 62, null);
        }
    }

    public K(int i8) {
        InterfaceC3358f bVar;
        this.f35113a = i8;
        this.f35114b = "";
        this.f35115c = KeyboardType.Companion.m4919getNumberPasswordPjHm6EE();
        d6.i s8 = d6.m.s(0, i8);
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            ((M5.N) it).nextInt();
            arrayList.add(AbstractC3351M.a(""));
        }
        this.f35116d = arrayList;
        if (arrayList.isEmpty()) {
            bVar = v4.g.n(AbstractC1246t.w0(AbstractC1246t.m(), "", null, null, 0, null, null, 62, null));
        } else {
            bVar = new b((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
        }
        this.f35117e = new v4.e(bVar, new c(arrayList));
    }

    private final String v(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (f35112h.l(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public final int A(int i8, String text) {
        AbstractC3159y.i(text, "text");
        if (AbstractC3159y.d(text, ((l6.v) this.f35116d.get(i8)).getValue())) {
            return 1;
        }
        if (text.length() == 0) {
            ((l6.v) this.f35116d.get(i8)).setValue("");
            return 0;
        }
        String v8 = v(text);
        int length = v8.length();
        int i9 = this.f35113a;
        if (length == i9) {
            i8 = 0;
        }
        int min = Math.min(i9, v8.length());
        Iterator it = d6.m.s(0, min).iterator();
        while (it.hasNext()) {
            int nextInt = ((M5.N) it).nextInt();
            ((l6.v) this.f35116d.get(i8 + nextInt)).setValue(String.valueOf(v8.charAt(nextInt)));
        }
        return min;
    }

    public final InterfaceC3349K k() {
        return this.f35117e;
    }

    public final List w() {
        return this.f35116d;
    }

    public final int x() {
        return this.f35115c;
    }

    public final int y() {
        return this.f35113a;
    }

    public final void z(String digit) {
        AbstractC3159y.i(digit, "digit");
        String str = this.f35114b + digit;
        this.f35114b = str;
        if (str.length() == this.f35113a) {
            A(0, this.f35114b);
            this.f35114b = "";
        }
    }

    public /* synthetic */ K(int i8, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? 6 : i8);
    }
}
