package kotlin.reflect.x.internal.l0.h;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.v;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.x.internal.l0.h.b;
import kotlin.reflect.x.internal.l0.h.c;
import kotlin.reflect.x.internal.l0.h.f;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.text.u;

/* compiled from: DescriptorRendererOptionsImpl.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    static final /* synthetic */ KProperty<Object>[] a = {b0.f(new r(b0.b(g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), b0.f(new r(b0.b(g.class), "withDefinedIn", "getWithDefinedIn()Z")), b0.f(new r(b0.b(g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), b0.f(new r(b0.b(g.class), "modifiers", "getModifiers()Ljava/util/Set;")), b0.f(new r(b0.b(g.class), "startFromName", "getStartFromName()Z")), b0.f(new r(b0.b(g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), b0.f(new r(b0.b(g.class), "debugMode", "getDebugMode()Z")), b0.f(new r(b0.b(g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), b0.f(new r(b0.b(g.class), "verbose", "getVerbose()Z")), b0.f(new r(b0.b(g.class), "unitReturnType", "getUnitReturnType()Z")), b0.f(new r(b0.b(g.class), "withoutReturnType", "getWithoutReturnType()Z")), b0.f(new r(b0.b(g.class), "enhancedTypes", "getEnhancedTypes()Z")), b0.f(new r(b0.b(g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), b0.f(new r(b0.b(g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), b0.f(new r(b0.b(g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), b0.f(new r(b0.b(g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), b0.f(new r(b0.b(g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), b0.f(new r(b0.b(g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), b0.f(new r(b0.b(g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), b0.f(new r(b0.b(g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), b0.f(new r(b0.b(g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), b0.f(new r(b0.b(g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), b0.f(new r(b0.b(g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), b0.f(new r(b0.b(g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), b0.f(new r(b0.b(g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), b0.f(new r(b0.b(g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), b0.f(new r(b0.b(g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), b0.f(new r(b0.b(g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), b0.f(new r(b0.b(g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), b0.f(new r(b0.b(g.class), "receiverAfterName", "getReceiverAfterName()Z")), b0.f(new r(b0.b(g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), b0.f(new r(b0.b(g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), b0.f(new r(b0.b(g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), b0.f(new r(b0.b(g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), b0.f(new r(b0.b(g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), b0.f(new r(b0.b(g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), b0.f(new r(b0.b(g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), b0.f(new r(b0.b(g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), b0.f(new r(b0.b(g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), b0.f(new r(b0.b(g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), b0.f(new r(b0.b(g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), b0.f(new r(b0.b(g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), b0.f(new r(b0.b(g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), b0.f(new r(b0.b(g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), b0.f(new r(b0.b(g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), b0.f(new r(b0.b(g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), b0.f(new r(b0.b(g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), b0.f(new r(b0.b(g.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    private final ReadWriteProperty A;
    private final ReadWriteProperty B;
    private final ReadWriteProperty C;
    private final ReadWriteProperty D;
    private final ReadWriteProperty E;
    private final ReadWriteProperty F;
    private final ReadWriteProperty G;
    private final ReadWriteProperty H;
    private final ReadWriteProperty I;
    private final ReadWriteProperty J;
    private final ReadWriteProperty K;
    private final ReadWriteProperty L;
    private final ReadWriteProperty M;
    private final ReadWriteProperty N;
    private final ReadWriteProperty O;
    private final ReadWriteProperty P;
    private final ReadWriteProperty Q;
    private final ReadWriteProperty R;
    private final ReadWriteProperty S;
    private final ReadWriteProperty T;
    private final ReadWriteProperty U;
    private final ReadWriteProperty V;
    private final ReadWriteProperty W;
    private final ReadWriteProperty X;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20790b;

    /* renamed from: c, reason: collision with root package name */
    private final ReadWriteProperty f20791c = m0(b.c.a);

    /* renamed from: d, reason: collision with root package name */
    private final ReadWriteProperty f20792d;

    /* renamed from: e, reason: collision with root package name */
    private final ReadWriteProperty f20793e;

    /* renamed from: f, reason: collision with root package name */
    private final ReadWriteProperty f20794f;

    /* renamed from: g, reason: collision with root package name */
    private final ReadWriteProperty f20795g;

    /* renamed from: h, reason: collision with root package name */
    private final ReadWriteProperty f20796h;

    /* renamed from: i, reason: collision with root package name */
    private final ReadWriteProperty f20797i;

    /* renamed from: j, reason: collision with root package name */
    private final ReadWriteProperty f20798j;

    /* renamed from: k, reason: collision with root package name */
    private final ReadWriteProperty f20799k;
    private final ReadWriteProperty l;
    private final ReadWriteProperty m;
    private final ReadWriteProperty n;
    private final ReadWriteProperty o;
    private final ReadWriteProperty p;
    private final ReadWriteProperty q;
    private final ReadWriteProperty r;
    private final ReadWriteProperty s;
    private final ReadWriteProperty t;
    private final ReadWriteProperty u;
    private final ReadWriteProperty v;
    private final ReadWriteProperty w;
    private final ReadWriteProperty x;
    private final ReadWriteProperty y;
    private final ReadWriteProperty z;

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<i1, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f20800f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(i1 i1Var) {
            l.f(i1Var, "it");
            return "...";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delegates.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> extends ObservableProperty<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f20801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, g gVar) {
            super(obj);
            this.f20801b = gVar;
        }

        @Override // kotlin.properties.ObservableProperty
        protected boolean d(KProperty<?> kProperty, T t, T t2) {
            l.f(kProperty, "property");
            if (this.f20801b.k0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<e0, e0> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f20802f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(e0 e0Var) {
            l.f(e0Var, "it");
            return e0Var;
        }
    }

    public g() {
        Set d2;
        Boolean bool = Boolean.TRUE;
        this.f20792d = m0(bool);
        this.f20793e = m0(bool);
        this.f20794f = m0(e.f20785g);
        Boolean bool2 = Boolean.FALSE;
        this.f20795g = m0(bool2);
        this.f20796h = m0(bool2);
        this.f20797i = m0(bool2);
        this.f20798j = m0(bool2);
        this.f20799k = m0(bool2);
        this.l = m0(bool);
        this.m = m0(bool2);
        this.n = m0(bool2);
        this.o = m0(bool2);
        this.p = m0(bool);
        this.q = m0(bool);
        this.r = m0(bool2);
        this.s = m0(bool2);
        this.t = m0(bool2);
        this.u = m0(bool2);
        this.v = m0(bool2);
        this.w = m0(bool2);
        this.x = m0(bool2);
        this.y = m0(c.f20802f);
        this.z = m0(a.f20800f);
        this.A = m0(bool);
        this.B = m0(j.RENDER_OPEN);
        this.C = m0(c.l.a.a);
        this.D = m0(m.PLAIN);
        this.E = m0(k.ALL);
        this.F = m0(bool2);
        this.G = m0(bool2);
        this.H = m0(l.DEBUG);
        this.I = m0(bool2);
        this.J = m0(bool2);
        d2 = u0.d();
        this.K = m0(d2);
        this.L = m0(h.a.a());
        this.M = m0(null);
        this.N = m0(kotlin.reflect.x.internal.l0.h.a.NO_ARGUMENTS);
        this.O = m0(bool2);
        this.P = m0(bool);
        this.Q = m0(bool);
        this.R = m0(bool2);
        this.S = m0(bool);
        this.T = m0(bool);
        this.U = m0(bool2);
        this.V = m0(bool2);
        this.W = m0(bool2);
        this.X = m0(bool);
    }

    private final <T> ReadWriteProperty<g, T> m0(T t) {
        Delegates delegates = Delegates.a;
        return new b(t, this);
    }

    public boolean A() {
        return ((Boolean) this.S.a(this, a[42])).booleanValue();
    }

    public boolean B() {
        return f.a.a(this);
    }

    public boolean C() {
        return f.a.b(this);
    }

    public boolean D() {
        return ((Boolean) this.v.a(this, a[19])).booleanValue();
    }

    public boolean E() {
        return ((Boolean) this.X.a(this, a[47])).booleanValue();
    }

    public Set<e> F() {
        return (Set) this.f20794f.a(this, a[3]);
    }

    public boolean G() {
        return ((Boolean) this.o.a(this, a[12])).booleanValue();
    }

    public j H() {
        return (j) this.B.a(this, a[25]);
    }

    public k I() {
        return (k) this.E.a(this, a[28]);
    }

    public boolean J() {
        return ((Boolean) this.T.a(this, a[43])).booleanValue();
    }

    public boolean K() {
        return ((Boolean) this.V.a(this, a[45])).booleanValue();
    }

    public l L() {
        return (l) this.H.a(this, a[31]);
    }

    public boolean M() {
        return ((Boolean) this.F.a(this, a[29])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.G.a(this, a[30])).booleanValue();
    }

    public boolean O() {
        return ((Boolean) this.r.a(this, a[15])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.P.a(this, a[39])).booleanValue();
    }

    public boolean Q() {
        return ((Boolean) this.I.a(this, a[32])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.q.a(this, a[14])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.p.a(this, a[13])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.s.a(this, a[16])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.R.a(this, a[41])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.Q.a(this, a[40])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.A.a(this, a[24])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f20796h.a(this, a[5])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f20795g.a(this, a[4])).booleanValue();
    }

    public m Z() {
        return (m) this.D.a(this, a[27]);
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void a(Set<kotlin.reflect.x.internal.l0.f.c> set) {
        l.f(set, "<set-?>");
        this.L.b(this, a[35], set);
    }

    public Function1<e0, e0> a0() {
        return (Function1) this.y.a(this, a[22]);
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void b(boolean z) {
        this.f20795g.b(this, a[4], Boolean.valueOf(z));
    }

    public boolean b0() {
        return ((Boolean) this.u.a(this, a[18])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void c(Set<? extends e> set) {
        l.f(set, "<set-?>");
        this.f20794f.b(this, a[3], set);
    }

    public boolean c0() {
        return ((Boolean) this.l.a(this, a[9])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void d(k kVar) {
        l.f(kVar, "<set-?>");
        this.E.b(this, a[28], kVar);
    }

    public c.l d0() {
        return (c.l) this.C.a(this, a[26]);
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void e(boolean z) {
        this.f20792d.b(this, a[1], Boolean.valueOf(z));
    }

    public boolean e0() {
        return ((Boolean) this.f20799k.a(this, a[8])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public boolean f() {
        return ((Boolean) this.n.a(this, a[11])).booleanValue();
    }

    public boolean f0() {
        return ((Boolean) this.f20792d.a(this, a[1])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void g(kotlin.reflect.x.internal.l0.h.b bVar) {
        l.f(bVar, "<set-?>");
        this.f20791c.b(this, a[0], bVar);
    }

    public boolean g0() {
        return ((Boolean) this.f20793e.a(this, a[2])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void h(boolean z) {
        this.x.b(this, a[21], Boolean.valueOf(z));
    }

    public boolean h0() {
        return ((Boolean) this.m.a(this, a[10])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void i(boolean z) {
        this.f20797i.b(this, a[6], Boolean.valueOf(z));
    }

    public boolean i0() {
        return ((Boolean) this.x.a(this, a[21])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void j(boolean z) {
        this.G.b(this, a[30], Boolean.valueOf(z));
    }

    public boolean j0() {
        return ((Boolean) this.w.a(this, a[20])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void k(boolean z) {
        this.F.b(this, a[29], Boolean.valueOf(z));
    }

    public final boolean k0() {
        return this.f20790b;
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void l(m mVar) {
        l.f(mVar, "<set-?>");
        this.D.b(this, a[27], mVar);
    }

    public final void l0() {
        this.f20790b = true;
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public Set<kotlin.reflect.x.internal.l0.f.c> m() {
        return (Set) this.L.a(this, a[35]);
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public boolean n() {
        return ((Boolean) this.f20797i.a(this, a[6])).booleanValue();
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public kotlin.reflect.x.internal.l0.h.a o() {
        return (kotlin.reflect.x.internal.l0.h.a) this.N.a(this, a[37]);
    }

    @Override // kotlin.reflect.x.internal.l0.h.f
    public void p(boolean z) {
        this.w.b(this, a[20], Boolean.valueOf(z));
    }

    public final g q() {
        g gVar = new g();
        Field[] declaredFields = g.class.getDeclaredFields();
        l.e(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    l.e(name, "field.name");
                    u.A(name, "is", false, 2, null);
                    KClass b2 = b0.b(g.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    String name3 = field.getName();
                    l.e(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        l.e(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb.append(name3);
                    field.set(gVar, gVar.m0(observableProperty.a(this, new v(b2, name2, sb.toString()))));
                }
            }
        }
        return gVar;
    }

    public boolean r() {
        return ((Boolean) this.t.a(this, a[17])).booleanValue();
    }

    public boolean s() {
        return ((Boolean) this.O.a(this, a[38])).booleanValue();
    }

    public Function1<kotlin.reflect.jvm.internal.impl.descriptors.n1.c, Boolean> t() {
        return (Function1) this.M.a(this, a[36]);
    }

    public boolean u() {
        return ((Boolean) this.W.a(this, a[46])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.f20798j.a(this, a[7])).booleanValue();
    }

    public kotlin.reflect.x.internal.l0.h.b w() {
        return (kotlin.reflect.x.internal.l0.h.b) this.f20791c.a(this, a[0]);
    }

    public Function1<i1, String> x() {
        return (Function1) this.z.a(this, a[23]);
    }

    public boolean y() {
        return ((Boolean) this.J.a(this, a[33])).booleanValue();
    }

    public Set<kotlin.reflect.x.internal.l0.f.c> z() {
        return (Set) this.K.a(this, a[34]);
    }
}
