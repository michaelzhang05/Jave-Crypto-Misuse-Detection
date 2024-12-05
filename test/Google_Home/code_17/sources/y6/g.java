package y6;

import A6.AbstractC0981c0;
import A6.AbstractC0987f0;
import A6.InterfaceC0993l;
import O5.InterfaceC1355k;
import O5.l;
import O5.x;
import P5.AbstractC1371l;
import P5.AbstractC1378t;
import P5.K;
import P5.Q;
import g6.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y6.f;

/* loaded from: classes5.dex */
public final class g implements f, InterfaceC0993l {

    /* renamed from: a, reason: collision with root package name */
    private final String f41034a;

    /* renamed from: b, reason: collision with root package name */
    private final j f41035b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41036c;

    /* renamed from: d, reason: collision with root package name */
    private final List f41037d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f41038e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f41039f;

    /* renamed from: g, reason: collision with root package name */
    private final f[] f41040g;

    /* renamed from: h, reason: collision with root package name */
    private final List[] f41041h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f41042i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f41043j;

    /* renamed from: k, reason: collision with root package name */
    private final f[] f41044k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1355k f41045l;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(AbstractC0987f0.a(gVar, gVar.f41044k));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements Function1 {
        b() {
            super(1);
        }

        public final CharSequence a(int i8) {
            return g.this.f(i8) + ": " + g.this.h(i8).a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(String serialName, j kind, int i8, List typeParameters, C4211a builder) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(kind, "kind");
        AbstractC3255y.i(typeParameters, "typeParameters");
        AbstractC3255y.i(builder, "builder");
        this.f41034a = serialName;
        this.f41035b = kind;
        this.f41036c = i8;
        this.f41037d = builder.c();
        this.f41038e = AbstractC1378t.U0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f41039f = strArr;
        this.f41040g = AbstractC0981c0.b(builder.e());
        this.f41041h = (List[]) builder.d().toArray(new List[0]);
        this.f41042i = AbstractC1378t.R0(builder.g());
        Iterable<K> b12 = AbstractC1371l.b1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(b12, 10));
        for (K k8 : b12) {
            arrayList.add(x.a(k8.b(), Integer.valueOf(k8.a())));
        }
        this.f41043j = Q.w(arrayList);
        this.f41044k = AbstractC0981c0.b(typeParameters);
        this.f41045l = l.b(new a());
    }

    private final int k() {
        return ((Number) this.f41045l.getValue()).intValue();
    }

    @Override // y6.f
    public String a() {
        return this.f41034a;
    }

    @Override // A6.InterfaceC0993l
    public Set b() {
        return this.f41038e;
    }

    @Override // y6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // y6.f
    public int d(String name) {
        AbstractC3255y.i(name, "name");
        Integer num = (Integer) this.f41043j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // y6.f
    public int e() {
        return this.f41036c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (AbstractC3255y.d(a(), fVar.a()) && Arrays.equals(this.f41044k, ((g) obj).f41044k) && e() == fVar.e()) {
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
        return this.f41039f[i8];
    }

    @Override // y6.f
    public List g(int i8) {
        return this.f41041h[i8];
    }

    @Override // y6.f
    public List getAnnotations() {
        return this.f41037d;
    }

    @Override // y6.f
    public j getKind() {
        return this.f41035b;
    }

    @Override // y6.f
    public f h(int i8) {
        return this.f41040g[i8];
    }

    public int hashCode() {
        return k();
    }

    @Override // y6.f
    public boolean i(int i8) {
        return this.f41042i[i8];
    }

    @Override // y6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return AbstractC1378t.w0(m.s(0, e()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
