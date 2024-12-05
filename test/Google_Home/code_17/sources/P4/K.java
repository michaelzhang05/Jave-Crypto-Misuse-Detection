package p4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import a6.InterfaceC1669o;
import androidx.compose.ui.text.input.KeyboardType;
import g6.C2883c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class K implements r {

    /* renamed from: f, reason: collision with root package name */
    private static final a f37136f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f37137g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final C2883c f37138h = new C2883c('0', '9');

    /* renamed from: a, reason: collision with root package name */
    private final int f37139a;

    /* renamed from: b, reason: collision with root package name */
    private String f37140b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37141c;

    /* renamed from: d, reason: collision with root package name */
    private final List f37142d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f37143e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f37144a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37145a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f37145a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new String[this.f37145a.length];
            }
        }

        /* renamed from: p4.K$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0825b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f37146a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37147b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37148c;

            public C0825b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f37146a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37147b;
                    String w02 = AbstractC1378t.w0(AbstractC1371l.V0((Object[]) this.f37148c), "", null, null, 0, null, null, 62, null);
                    this.f37146a = 1;
                    if (interfaceC3707g.emit(w02, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                C0825b c0825b = new C0825b(dVar);
                c0825b.f37147b = interfaceC3707g;
                c0825b.f37148c = objArr;
                return c0825b.invokeSuspend(O5.I.f8278a);
            }
        }

        public b(InterfaceC3706f[] interfaceC3706fArr) {
            this.f37144a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f37144a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new a(interfaceC3706fArr), new C0825b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f37149a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f37149a;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
            }
            return AbstractC1378t.w0(arrayList, "", null, null, 0, null, null, 62, null);
        }
    }

    public K(int i8) {
        InterfaceC3706f bVar;
        this.f37139a = i8;
        this.f37140b = "";
        this.f37141c = KeyboardType.Companion.m4924getNumberPasswordPjHm6EE();
        g6.i s8 = g6.m.s(0, i8);
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            ((P5.N) it).nextInt();
            arrayList.add(AbstractC3700N.a(""));
        }
        this.f37142d = arrayList;
        if (arrayList.isEmpty()) {
            bVar = y4.g.n(AbstractC1378t.w0(AbstractC1378t.m(), "", null, null, 0, null, null, 62, null));
        } else {
            bVar = new b((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
        }
        this.f37143e = new y4.e(bVar, new c(arrayList));
    }

    private final String v(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (f37138h.k(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    public final int A(int i8, String text) {
        AbstractC3255y.i(text, "text");
        if (AbstractC3255y.d(text, ((o6.w) this.f37142d.get(i8)).getValue())) {
            return 1;
        }
        if (text.length() == 0) {
            ((o6.w) this.f37142d.get(i8)).setValue("");
            return 0;
        }
        String v8 = v(text);
        int length = v8.length();
        int i9 = this.f37139a;
        if (length == i9) {
            i8 = 0;
        }
        int min = Math.min(i9, v8.length());
        Iterator it = g6.m.s(0, min).iterator();
        while (it.hasNext()) {
            int nextInt = ((P5.N) it).nextInt();
            ((o6.w) this.f37142d.get(i8 + nextInt)).setValue(String.valueOf(v8.charAt(nextInt)));
        }
        return min;
    }

    public final InterfaceC3698L j() {
        return this.f37143e;
    }

    public final List w() {
        return this.f37142d;
    }

    public final int x() {
        return this.f37141c;
    }

    public final int y() {
        return this.f37139a;
    }

    public final void z(String digit) {
        AbstractC3255y.i(digit, "digit");
        String str = this.f37140b + digit;
        this.f37140b = str;
        if (str.length() == this.f37139a) {
            A(0, this.f37140b);
            this.f37140b = "";
        }
    }

    public /* synthetic */ K(int i8, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? 6 : i8);
    }
}
