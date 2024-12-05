package x6;

import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v6.f;
import v6.k;

/* renamed from: x6.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3944e0 implements v6.f, InterfaceC3952l {

    /* renamed from: a, reason: collision with root package name */
    private final String f39552a;

    /* renamed from: b, reason: collision with root package name */
    private final C f39553b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39554c;

    /* renamed from: d, reason: collision with root package name */
    private int f39555d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f39556e;

    /* renamed from: f, reason: collision with root package name */
    private final List[] f39557f;

    /* renamed from: g, reason: collision with root package name */
    private List f39558g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f39559h;

    /* renamed from: i, reason: collision with root package name */
    private Map f39560i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1227k f39561j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1227k f39562k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1227k f39563l;

    /* renamed from: x6.e0$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            C3944e0 c3944e0 = C3944e0.this;
            return Integer.valueOf(AbstractC3946f0.a(c3944e0, c3944e0.o()));
        }
    }

    /* renamed from: x6.e0$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b[] invoke() {
            t6.b[] d8;
            C c8 = C3944e0.this.f39553b;
            if (c8 == null || (d8 = c8.d()) == null) {
                return g0.f39571a;
            }
            return d8;
        }
    }

    /* renamed from: x6.e0$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        public final CharSequence a(int i8) {
            return C3944e0.this.f(i8) + ": " + C3944e0.this.h(i8).a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: x6.e0$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v6.f[] invoke() {
            ArrayList arrayList;
            t6.b[] b8;
            C c8 = C3944e0.this.f39553b;
            if (c8 != null && (b8 = c8.b()) != null) {
                arrayList = new ArrayList(b8.length);
                for (t6.b bVar : b8) {
                    arrayList.add(bVar.a());
                }
            } else {
                arrayList = null;
            }
            return AbstractC3940c0.b(arrayList);
        }
    }

    public C3944e0(String serialName, C c8, int i8) {
        AbstractC3159y.i(serialName, "serialName");
        this.f39552a = serialName;
        this.f39553b = c8;
        this.f39554c = i8;
        this.f39555d = -1;
        String[] strArr = new String[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f39556e = strArr;
        int i10 = this.f39554c;
        this.f39557f = new List[i10];
        this.f39559h = new boolean[i10];
        this.f39560i = M5.Q.h();
        L5.o oVar = L5.o.f6505b;
        this.f39561j = L5.l.a(oVar, new b());
        this.f39562k = L5.l.a(oVar, new d());
        this.f39563l = L5.l.a(oVar, new a());
    }

    public static /* synthetic */ void l(C3944e0 c3944e0, String str, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            c3944e0.k(str, z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    private final Map m() {
        HashMap hashMap = new HashMap();
        int length = this.f39556e.length;
        for (int i8 = 0; i8 < length; i8++) {
            hashMap.put(this.f39556e[i8], Integer.valueOf(i8));
        }
        return hashMap;
    }

    private final t6.b[] n() {
        return (t6.b[]) this.f39561j.getValue();
    }

    private final int p() {
        return ((Number) this.f39563l.getValue()).intValue();
    }

    @Override // v6.f
    public String a() {
        return this.f39552a;
    }

    @Override // x6.InterfaceC3952l
    public Set b() {
        return this.f39560i.keySet();
    }

    @Override // v6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // v6.f
    public int d(String name) {
        AbstractC3159y.i(name, "name");
        Integer num = (Integer) this.f39560i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // v6.f
    public final int e() {
        return this.f39554c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3944e0) {
            v6.f fVar = (v6.f) obj;
            if (AbstractC3159y.d(a(), fVar.a()) && Arrays.equals(o(), ((C3944e0) obj).o()) && e() == fVar.e()) {
                int e8 = e();
                for (int i8 = 0; i8 < e8; i8++) {
                    if (AbstractC3159y.d(h(i8).a(), fVar.h(i8).a()) && AbstractC3159y.d(h(i8).getKind(), fVar.h(i8).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // v6.f
    public String f(int i8) {
        return this.f39556e[i8];
    }

    @Override // v6.f
    public List g(int i8) {
        List list = this.f39557f[i8];
        if (list == null) {
            return AbstractC1246t.m();
        }
        return list;
    }

    @Override // v6.f
    public List getAnnotations() {
        List list = this.f39558g;
        if (list == null) {
            return AbstractC1246t.m();
        }
        return list;
    }

    @Override // v6.f
    public v6.j getKind() {
        return k.a.f38926a;
    }

    @Override // v6.f
    public v6.f h(int i8) {
        return n()[i8].a();
    }

    public int hashCode() {
        return p();
    }

    @Override // v6.f
    public boolean i(int i8) {
        return this.f39559h[i8];
    }

    @Override // v6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public final void k(String name, boolean z8) {
        AbstractC3159y.i(name, "name");
        String[] strArr = this.f39556e;
        int i8 = this.f39555d + 1;
        this.f39555d = i8;
        strArr[i8] = name;
        this.f39559h[i8] = z8;
        this.f39557f[i8] = null;
        if (i8 == this.f39554c - 1) {
            this.f39560i = m();
        }
    }

    public final v6.f[] o() {
        return (v6.f[]) this.f39562k.getValue();
    }

    public final void q(Annotation annotation) {
        AbstractC3159y.i(annotation, "annotation");
        List list = this.f39557f[this.f39555d];
        if (list == null) {
            list = new ArrayList(1);
            this.f39557f[this.f39555d] = list;
        }
        list.add(annotation);
    }

    public final void r(Annotation a8) {
        AbstractC3159y.i(a8, "a");
        if (this.f39558g == null) {
            this.f39558g = new ArrayList(1);
        }
        List list = this.f39558g;
        AbstractC3159y.f(list);
        list.add(a8);
    }

    public String toString() {
        return AbstractC1246t.w0(d6.m.s(0, this.f39554c), ", ", a() + '(', ")", 0, null, new c(), 24, null);
    }

    public /* synthetic */ C3944e0(String str, C c8, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(str, (i9 & 2) != 0 ? null : c8, i8);
    }
}
