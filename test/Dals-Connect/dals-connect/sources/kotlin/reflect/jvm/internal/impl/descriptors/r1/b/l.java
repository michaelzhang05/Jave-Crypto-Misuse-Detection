package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.m1;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.v;
import kotlin.reflect.x.internal.l0.d.a.n0.d0;
import kotlin.sequences.Sequence;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final class l extends p implements kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h, v, kotlin.reflect.x.internal.l0.d.a.n0.g {
    private final Class<?> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.i implements Function1<Member, Boolean> {

        /* renamed from: h, reason: collision with root package name */
        public static final a f21844h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.b0.b(Member.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member member) {
            kotlin.jvm.internal.l.f(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.i implements Function1<Constructor<?>, o> {

        /* renamed from: h, reason: collision with root package name */
        public static final b f21845h = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.b0.b(o.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final o invoke(Constructor<?> constructor) {
            kotlin.jvm.internal.l.f(constructor, "p0");
            return new o(constructor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends kotlin.jvm.internal.i implements Function1<Member, Boolean> {

        /* renamed from: h, reason: collision with root package name */
        public static final c f21846h = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.b0.b(Member.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member member) {
            kotlin.jvm.internal.l.f(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.i implements Function1<Field, r> {

        /* renamed from: h, reason: collision with root package name */
        public static final d f21847h = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.b0.b(r.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final r invoke(Field field) {
            kotlin.jvm.internal.l.f(field, "p0");
            return new r(field);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function1<Class<?>, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f21848f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            kotlin.jvm.internal.l.e(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements Function1<Class<?>, kotlin.reflect.x.internal.l0.f.f> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f21849f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.f.f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!kotlin.reflect.x.internal.l0.f.f.B(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return kotlin.reflect.x.internal.l0.f.f.r(simpleName);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements Function1<Method, Boolean> {
        g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        
            if (r0.a0(r5) == false) goto L9;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto La
            L8:
                r1 = 0
                goto L1f
            La:
                kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l.this
                boolean r0 = r0.B()
                if (r0 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l.this
                java.lang.String r3 = "method"
                kotlin.jvm.internal.l.e(r5, r3)
                boolean r5 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l.R(r0, r5)
                if (r5 != 0) goto L8
            L1f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l.g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class h extends kotlin.jvm.internal.i implements Function1<Method, u> {

        /* renamed from: h, reason: collision with root package name */
        public static final h f21851h = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.b0.b(u.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final u invoke(Method method) {
            kotlin.jvm.internal.l.f(method, "p0");
            return new u(method);
        }
    }

    public l(Class<?> cls) {
        kotlin.jvm.internal.l.f(cls, "klass");
        this.a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a0(Method method) {
        String name = method.getName();
        if (kotlin.jvm.internal.l.a(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            kotlin.jvm.internal.l.e(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (kotlin.jvm.internal.l.a(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public boolean B() {
        return this.a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.v
    public int E() {
        return this.a.getModifiers();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public boolean H() {
        return this.a.isInterface();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public d0 I() {
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.j> N() {
        List i2;
        Class<?>[] c2 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.b.a.c(this.a);
        if (c2 != null) {
            ArrayList arrayList = new ArrayList(c2.length);
            for (Class<?> cls : c2) {
                arrayList.add(new n(cls));
            }
            return arrayList;
        }
        i2 = kotlin.collections.t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.s
    public boolean Q() {
        return v.a.d(this);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.r1.b.e e(kotlin.reflect.x.internal.l0.f.c cVar) {
        return h.a.a(this, cVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.r1.b.e> getAnnotations() {
        return h.a.b(this);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public List<o> k() {
        Sequence q;
        Sequence m;
        Sequence u;
        List<o> A;
        Constructor<?>[] declaredConstructors = this.a.getDeclaredConstructors();
        kotlin.jvm.internal.l.e(declaredConstructors, "klass.declaredConstructors");
        q = kotlin.collections.n.q(declaredConstructors);
        m = kotlin.sequences.n.m(q, a.f21844h);
        u = kotlin.sequences.n.u(m, b.f21845h);
        A = kotlin.sequences.n.A(u);
        return A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Class<?> v() {
        return this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public List<r> D() {
        Sequence q;
        Sequence m;
        Sequence u;
        List<r> A;
        Field[] declaredFields = this.a.getDeclaredFields();
        kotlin.jvm.internal.l.e(declaredFields, "klass.declaredFields");
        q = kotlin.collections.n.q(declaredFields);
        m = kotlin.sequences.n.m(q, c.f21846h);
        u = kotlin.sequences.n.u(m, d.f21847h);
        A = kotlin.sequences.n.A(u);
        return A;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.x.internal.l0.f.f> K() {
        Sequence q;
        Sequence m;
        Sequence v;
        List<kotlin.reflect.x.internal.l0.f.f> A;
        Class<?>[] declaredClasses = this.a.getDeclaredClasses();
        kotlin.jvm.internal.l.e(declaredClasses, "klass.declaredClasses");
        q = kotlin.collections.n.q(declaredClasses);
        m = kotlin.sequences.n.m(q, e.f21848f);
        v = kotlin.sequences.n.v(m, f.f21849f);
        A = kotlin.sequences.n.A(v);
        return A;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List<u> M() {
        Sequence q;
        Sequence l;
        Sequence u;
        List<u> A;
        Method[] declaredMethods = this.a.getDeclaredMethods();
        kotlin.jvm.internal.l.e(declaredMethods, "klass.declaredMethods");
        q = kotlin.collections.n.q(declaredMethods);
        l = kotlin.sequences.n.l(q, new g());
        u = kotlin.sequences.n.u(l, h.f21851h);
        A = kotlin.sequences.n.A(u);
        return A;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public l i() {
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass != null) {
            return new l(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.j> a() {
        Class cls;
        List l;
        int t;
        List i2;
        cls = Object.class;
        if (kotlin.jvm.internal.l.a(this.a, cls)) {
            i2 = kotlin.collections.t.i();
            return i2;
        }
        e0 e0Var = new e0(2);
        Object genericSuperclass = this.a.getGenericSuperclass();
        e0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.a.getGenericInterfaces();
        kotlin.jvm.internal.l.e(genericInterfaces, "klass.genericInterfaces");
        e0Var.b(genericInterfaces);
        l = kotlin.collections.t.l(e0Var.d(new Type[e0Var.c()]));
        t = kotlin.collections.u.t(l, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(new n((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public kotlin.reflect.x.internal.l0.f.c d() {
        kotlin.reflect.x.internal.l0.f.c b2 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.a(this.a).b();
        kotlin.jvm.internal.l.e(b2, "klass.classId.asSingleFqName()");
        return b2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && kotlin.jvm.internal.l.a(this.a, ((l) obj).a);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.t
    public kotlin.reflect.x.internal.l0.f.f getName() {
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(this.a.getSimpleName());
        kotlin.jvm.internal.l.e(r, "identifier(klass.simpleName)");
        return r;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.z
    public List<a0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.a.getTypeParameters();
        kotlin.jvm.internal.l.e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.s
    public m1 getVisibility() {
        return v.a.a(this);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.s
    public boolean isAbstract() {
        return v.a.b(this);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.s
    public boolean isFinal() {
        return v.a.c(this);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.w> j() {
        Object[] d2 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.b.a.d(this.a);
        if (d2 == null) {
            d2 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d2.length);
        for (Object obj : d2) {
            arrayList.add(new y(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.d
    public boolean l() {
        return h.a.c(this);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public boolean o() {
        Boolean f2 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.b.a.f(this.a);
        if (f2 != null) {
            return f2.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public boolean q() {
        return this.a.isAnnotation();
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public boolean s() {
        Boolean e2 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.b.a.e(this.a);
        if (e2 != null) {
            return e2.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.g
    public boolean t() {
        return false;
    }

    public String toString() {
        return l.class.getName() + ": " + this.a;
    }
}
