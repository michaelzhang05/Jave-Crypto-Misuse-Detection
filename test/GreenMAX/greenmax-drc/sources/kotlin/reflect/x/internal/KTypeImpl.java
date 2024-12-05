package kotlin.reflect.x.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d;
import kotlin.reflect.x.internal.c0;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.n1;
import kotlin.reflect.x.internal.l0.l.r1;
import okhttp3.HttpUrl;

/* compiled from: KTypeImpl.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0013\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001bH\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020,H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006-²\u0006\u0010\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getComputeJavaType$annotations", "()V", "isMarkedNullable", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "javaType", "getJavaType", "()Ljava/lang/reflect/Type;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "makeNullableAsSpecified", "nullable", "makeNullableAsSpecified$kotlin_reflection", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection", "parameterizedTypeArguments"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.x, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KTypeImpl implements KTypeBase {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f21511f = {b0.g(new v(b0.b(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), b0.g(new v(b0.b(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: g, reason: collision with root package name */
    private final e0 f21512g;

    /* renamed from: h, reason: collision with root package name */
    private final c0.a<Type> f21513h;

    /* renamed from: i, reason: collision with root package name */
    private final c0.a f21514i;

    /* renamed from: j, reason: collision with root package name */
    private final c0.a f21515j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KTypeImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.x$a */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function0<List<? extends KTypeProjection>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Type> f21517g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KTypeImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0364a extends Lambda implements Function0<Type> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KTypeImpl f21518f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f21519g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Lazy<List<Type>> f21520h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0364a(KTypeImpl kTypeImpl, int i2, Lazy<? extends List<? extends Type>> lazy) {
                super(0);
                this.f21518f = kTypeImpl;
                this.f21519g = i2;
                this.f21520h = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type e2 = this.f21518f.e();
                if (e2 instanceof Class) {
                    Class cls = (Class) e2;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    l.e(componentType, "{\n                      …                        }");
                    return componentType;
                }
                if (e2 instanceof GenericArrayType) {
                    if (this.f21519g == 0) {
                        Type genericComponentType = ((GenericArrayType) e2).getGenericComponentType();
                        l.e(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + this.f21518f);
                }
                if (e2 instanceof ParameterizedType) {
                    Type type = (Type) a.d(this.f21520h).get(this.f21519g);
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        l.e(lowerBounds, "argument.lowerBounds");
                        Type type2 = (Type) j.w(lowerBounds);
                        if (type2 == null) {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            l.e(upperBounds, "argument.upperBounds");
                            type = (Type) j.v(upperBounds);
                        } else {
                            type = type2;
                        }
                    }
                    l.e(type, "{\n                      …                        }");
                    return type;
                }
                throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + this.f21518f);
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.x$a$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[r1.values().length];
                iArr[r1.INVARIANT.ordinal()] = 1;
                iArr[r1.IN_VARIANCE.ordinal()] = 2;
                iArr[r1.OUT_VARIANCE.ordinal()] = 3;
                a = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KTypeImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.x$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends Lambda implements Function0<List<? extends Type>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KTypeImpl f21521f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(KTypeImpl kTypeImpl) {
                super(0);
                this.f21521f = kTypeImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Type> invoke() {
                Type e2 = this.f21521f.e();
                l.c(e2);
                return d.c(e2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends Type> function0) {
            super(0);
            this.f21517g = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List<Type> d(Lazy<? extends List<? extends Type>> lazy) {
            return (List) lazy.getValue();
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeProjection> invoke() {
            Lazy a;
            int t;
            KTypeProjection d2;
            List<? extends KTypeProjection> i2;
            List<g1> M0 = KTypeImpl.this.getF21512g().M0();
            if (M0.isEmpty()) {
                i2 = t.i();
                return i2;
            }
            a = i.a(LazyThreadSafetyMode.PUBLICATION, new c(KTypeImpl.this));
            Function0<Type> function0 = this.f21517g;
            KTypeImpl kTypeImpl = KTypeImpl.this;
            t = u.t(M0, 10);
            ArrayList arrayList = new ArrayList(t);
            int i3 = 0;
            for (Object obj : M0) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    t.s();
                }
                g1 g1Var = (g1) obj;
                if (g1Var.c()) {
                    d2 = KTypeProjection.a.c();
                } else {
                    e0 type = g1Var.getType();
                    l.e(type, "typeProjection.type");
                    KTypeImpl kTypeImpl2 = new KTypeImpl(type, function0 == null ? null : new C0364a(kTypeImpl, i3, a));
                    int i5 = b.a[g1Var.a().ordinal()];
                    if (i5 == 1) {
                        d2 = KTypeProjection.a.d(kTypeImpl2);
                    } else if (i5 != 2) {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d2 = KTypeProjection.a.b(kTypeImpl2);
                    } else {
                        d2 = KTypeProjection.a.a(kTypeImpl2);
                    }
                }
                arrayList.add(d2);
                i3 = i4;
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.x$b */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<KClassifier> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KClassifier invoke() {
            KTypeImpl kTypeImpl = KTypeImpl.this;
            return kTypeImpl.c(kTypeImpl.getF21512g());
        }
    }

    public KTypeImpl(e0 e0Var, Function0<? extends Type> function0) {
        l.f(e0Var, "type");
        this.f21512g = e0Var;
        c0.a<Type> aVar = null;
        c0.a<Type> aVar2 = function0 instanceof c0.a ? (c0.a) function0 : null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (function0 != null) {
            aVar = c0.d(function0);
        }
        this.f21513h = aVar;
        this.f21514i = c0.d(new b());
        this.f21515j = c0.d(new a(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KClassifier c(e0 e0Var) {
        e0 type;
        h w = e0Var.O0().w();
        if (w instanceof e) {
            Class<?> p = i0.p((e) w);
            if (p == null) {
                return null;
            }
            if (p.isArray()) {
                g1 g1Var = (g1) r.p0(e0Var.M0());
                if (g1Var != null && (type = g1Var.getType()) != null) {
                    KClassifier c2 = c(type);
                    if (c2 != null) {
                        return new KClassImpl(i0.f(kotlin.jvm.a.b(kotlin.reflect.x.b.a(c2))));
                    }
                    throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
                }
                return new KClassImpl(p);
            }
            if (!n1.l(e0Var)) {
                Class<?> d2 = d.d(p);
                if (d2 != null) {
                    p = d2;
                }
                return new KClassImpl(p);
            }
            return new KClassImpl(p);
        }
        if (w instanceof e1) {
            return new KTypeParameterImpl(null, (e1) w);
        }
        if (!(w instanceof d1)) {
            return null;
        }
        throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
    }

    @Override // kotlin.reflect.KType
    public KClassifier b() {
        return (KClassifier) this.f21514i.d(this, f21511f[0]);
    }

    @Override // kotlin.reflect.KType
    public boolean d() {
        return this.f21512g.P0();
    }

    @Override // kotlin.jvm.internal.KTypeBase
    public Type e() {
        c0.a<Type> aVar = this.f21513h;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public boolean equals(Object other) {
        return (other instanceof KTypeImpl) && l.a(this.f21512g, ((KTypeImpl) other).f21512g);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return i0.e(this.f21512g);
    }

    /* renamed from: h, reason: from getter */
    public final e0 getF21512g() {
        return this.f21512g;
    }

    public int hashCode() {
        return this.f21512g.hashCode();
    }

    public String toString() {
        return ReflectionObjectRenderer.a.h(this.f21512g);
    }

    @Override // kotlin.reflect.KType
    public List<KTypeProjection> w() {
        T d2 = this.f21515j.d(this, f21511f[1]);
        l.e(d2, "<get-arguments>(...)");
        return (List) d2;
    }

    public /* synthetic */ KTypeImpl(e0 e0Var, Function0 function0, int i2, g gVar) {
        this(e0Var, (i2 & 2) != 0 ? null : function0);
    }
}
