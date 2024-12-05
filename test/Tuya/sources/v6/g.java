package v6;

import L5.InterfaceC1227k;
import L5.l;
import L5.x;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.K;
import M5.Q;
import d6.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v6.f;
import x6.AbstractC3940c0;
import x6.AbstractC3946f0;
import x6.InterfaceC3952l;

/* loaded from: classes5.dex */
public final class g implements f, InterfaceC3952l {

    /* renamed from: a, reason: collision with root package name */
    private final String f38903a;

    /* renamed from: b, reason: collision with root package name */
    private final j f38904b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38905c;

    /* renamed from: d, reason: collision with root package name */
    private final List f38906d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f38907e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f38908f;

    /* renamed from: g, reason: collision with root package name */
    private final f[] f38909g;

    /* renamed from: h, reason: collision with root package name */
    private final List[] f38910h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f38911i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f38912j;

    /* renamed from: k, reason: collision with root package name */
    private final f[] f38913k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1227k f38914l;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(AbstractC3946f0.a(gVar, gVar.f38913k));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function1 {
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

    public g(String serialName, j kind, int i8, List typeParameters, C3834a builder) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(kind, "kind");
        AbstractC3159y.i(typeParameters, "typeParameters");
        AbstractC3159y.i(builder, "builder");
        this.f38903a = serialName;
        this.f38904b = kind;
        this.f38905c = i8;
        this.f38906d = builder.c();
        this.f38907e = AbstractC1246t.U0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f38908f = strArr;
        this.f38909g = AbstractC3940c0.b(builder.e());
        this.f38910h = (List[]) builder.d().toArray(new List[0]);
        this.f38911i = AbstractC1246t.R0(builder.g());
        Iterable<K> b12 = AbstractC1239l.b1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(b12, 10));
        for (K k8 : b12) {
            arrayList.add(x.a(k8.b(), Integer.valueOf(k8.a())));
        }
        this.f38912j = Q.w(arrayList);
        this.f38913k = AbstractC3940c0.b(typeParameters);
        this.f38914l = l.b(new a());
    }

    private final int k() {
        return ((Number) this.f38914l.getValue()).intValue();
    }

    @Override // v6.f
    public String a() {
        return this.f38903a;
    }

    @Override // x6.InterfaceC3952l
    public Set b() {
        return this.f38907e;
    }

    @Override // v6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // v6.f
    public int d(String name) {
        AbstractC3159y.i(name, "name");
        Integer num = (Integer) this.f38912j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // v6.f
    public int e() {
        return this.f38905c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (AbstractC3159y.d(a(), fVar.a()) && Arrays.equals(this.f38913k, ((g) obj).f38913k) && e() == fVar.e()) {
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
        return this.f38908f[i8];
    }

    @Override // v6.f
    public List g(int i8) {
        return this.f38910h[i8];
    }

    @Override // v6.f
    public List getAnnotations() {
        return this.f38906d;
    }

    @Override // v6.f
    public j getKind() {
        return this.f38904b;
    }

    @Override // v6.f
    public f h(int i8) {
        return this.f38909g[i8];
    }

    public int hashCode() {
        return k();
    }

    @Override // v6.f
    public boolean i(int i8) {
        return this.f38911i[i8];
    }

    @Override // v6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return AbstractC1246t.w0(m.s(0, e()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
