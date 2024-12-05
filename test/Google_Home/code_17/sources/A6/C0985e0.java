package A6;

import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y6.f;
import y6.k;

/* renamed from: A6.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0985e0 implements y6.f, InterfaceC0993l {

    /* renamed from: a, reason: collision with root package name */
    private final String f547a;

    /* renamed from: b, reason: collision with root package name */
    private final C f548b;

    /* renamed from: c, reason: collision with root package name */
    private final int f549c;

    /* renamed from: d, reason: collision with root package name */
    private int f550d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f551e;

    /* renamed from: f, reason: collision with root package name */
    private final List[] f552f;

    /* renamed from: g, reason: collision with root package name */
    private List f553g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f554h;

    /* renamed from: i, reason: collision with root package name */
    private Map f555i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1355k f556j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1355k f557k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1355k f558l;

    /* renamed from: A6.e0$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            C0985e0 c0985e0 = C0985e0.this;
            return Integer.valueOf(AbstractC0987f0.a(c0985e0, c0985e0.o()));
        }
    }

    /* renamed from: A6.e0$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b[] invoke() {
            w6.b[] e8;
            C c8 = C0985e0.this.f548b;
            if (c8 == null || (e8 = c8.e()) == null) {
                return g0.f566a;
            }
            return e8;
        }
    }

    /* renamed from: A6.e0$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC3256z implements Function1 {
        c() {
            super(1);
        }

        public final CharSequence a(int i8) {
            return C0985e0.this.f(i8) + ": " + C0985e0.this.h(i8).a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: A6.e0$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.f[] invoke() {
            ArrayList arrayList;
            w6.b[] c8;
            C c9 = C0985e0.this.f548b;
            if (c9 != null && (c8 = c9.c()) != null) {
                arrayList = new ArrayList(c8.length);
                for (w6.b bVar : c8) {
                    arrayList.add(bVar.a());
                }
            } else {
                arrayList = null;
            }
            return AbstractC0981c0.b(arrayList);
        }
    }

    public C0985e0(String serialName, C c8, int i8) {
        AbstractC3255y.i(serialName, "serialName");
        this.f547a = serialName;
        this.f548b = c8;
        this.f549c = i8;
        this.f550d = -1;
        String[] strArr = new String[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f551e = strArr;
        int i10 = this.f549c;
        this.f552f = new List[i10];
        this.f554h = new boolean[i10];
        this.f555i = P5.Q.h();
        O5.o oVar = O5.o.f8296b;
        this.f556j = O5.l.a(oVar, new b());
        this.f557k = O5.l.a(oVar, new d());
        this.f558l = O5.l.a(oVar, new a());
    }

    public static /* synthetic */ void l(C0985e0 c0985e0, String str, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            c0985e0.k(str, z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    private final Map m() {
        HashMap hashMap = new HashMap();
        int length = this.f551e.length;
        for (int i8 = 0; i8 < length; i8++) {
            hashMap.put(this.f551e[i8], Integer.valueOf(i8));
        }
        return hashMap;
    }

    private final w6.b[] n() {
        return (w6.b[]) this.f556j.getValue();
    }

    private final int p() {
        return ((Number) this.f558l.getValue()).intValue();
    }

    @Override // y6.f
    public String a() {
        return this.f547a;
    }

    @Override // A6.InterfaceC0993l
    public Set b() {
        return this.f555i.keySet();
    }

    @Override // y6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // y6.f
    public int d(String name) {
        AbstractC3255y.i(name, "name");
        Integer num = (Integer) this.f555i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // y6.f
    public final int e() {
        return this.f549c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0985e0) {
            y6.f fVar = (y6.f) obj;
            if (AbstractC3255y.d(a(), fVar.a()) && Arrays.equals(o(), ((C0985e0) obj).o()) && e() == fVar.e()) {
                int e8 = e();
                for (int i8 = 0; i8 < e8; i8++) {
                    if (AbstractC3255y.d(h(i8).a(), fVar.h(i8).a()) && AbstractC3255y.d(h(i8).getKind(), fVar.h(i8).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // y6.f
    public String f(int i8) {
        return this.f551e[i8];
    }

    @Override // y6.f
    public List g(int i8) {
        List list = this.f552f[i8];
        if (list == null) {
            return AbstractC1378t.m();
        }
        return list;
    }

    @Override // y6.f
    public List getAnnotations() {
        List list = this.f553g;
        if (list == null) {
            return AbstractC1378t.m();
        }
        return list;
    }

    @Override // y6.f
    public y6.j getKind() {
        return k.a.f41057a;
    }

    @Override // y6.f
    public y6.f h(int i8) {
        return n()[i8].a();
    }

    public int hashCode() {
        return p();
    }

    @Override // y6.f
    public boolean i(int i8) {
        return this.f554h[i8];
    }

    @Override // y6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public final void k(String name, boolean z8) {
        AbstractC3255y.i(name, "name");
        String[] strArr = this.f551e;
        int i8 = this.f550d + 1;
        this.f550d = i8;
        strArr[i8] = name;
        this.f554h[i8] = z8;
        this.f552f[i8] = null;
        if (i8 == this.f549c - 1) {
            this.f555i = m();
        }
    }

    public final y6.f[] o() {
        return (y6.f[]) this.f557k.getValue();
    }

    public final void q(Annotation annotation) {
        AbstractC3255y.i(annotation, "annotation");
        List list = this.f552f[this.f550d];
        if (list == null) {
            list = new ArrayList(1);
            this.f552f[this.f550d] = list;
        }
        list.add(annotation);
    }

    public final void r(Annotation a8) {
        AbstractC3255y.i(a8, "a");
        if (this.f553g == null) {
            this.f553g = new ArrayList(1);
        }
        List list = this.f553g;
        AbstractC3255y.f(list);
        list.add(a8);
    }

    public String toString() {
        return AbstractC1378t.w0(g6.m.s(0, this.f549c), ", ", a() + '(', ")", 0, null, new c(), 24, null);
    }

    public /* synthetic */ C0985e0(String str, C c8, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(str, (i9 & 2) != 0 ? null : c8, i8);
    }
}
