package kotlin.reflect.x.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.c0;
import kotlin.reflect.x.internal.l0.d.b.k;
import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.reflect.x.internal.l0.j.b.g0.f;
import kotlin.reflect.x.internal.l0.j.b.g0.g;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.r1;
import okhttp3.HttpUrl;

/* compiled from: KTypeParameterImpl.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u0006\u0012\u0002\b\u00030#*\u00020$H\u0002J\u0010\u0010%\u001a\u0006\u0012\u0002\b\u00030&*\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "container", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "isReified", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getName", "()Ljava/lang/String;", "upperBounds", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KType;", "getUpperBounds", "()Ljava/util/List;", "upperBounds$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "variance", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "getContainerClass", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;", "toKClassImpl", "Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.y, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KTypeParameterImpl implements KTypeParameter {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f21523f = {b0.g(new v(b0.b(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: g, reason: collision with root package name */
    private final e1 f21524g;

    /* renamed from: h, reason: collision with root package name */
    private final c0.a f21525h;

    /* renamed from: i, reason: collision with root package name */
    private final KTypeParameterOwnerImpl f21526i;

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.y$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r1.values().length];
            iArr[r1.INVARIANT.ordinal()] = 1;
            iArr[r1.IN_VARIANCE.ordinal()] = 2;
            iArr[r1.OUT_VARIANCE.ordinal()] = 3;
            a = iArr;
        }
    }

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.y$b */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<List<? extends KTypeImpl>> {
        b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeImpl> invoke() {
            int t;
            List<e0> upperBounds = KTypeParameterImpl.this.getF21524g().getUpperBounds();
            l.e(upperBounds, "descriptor.upperBounds");
            t = u.t(upperBounds, 10);
            ArrayList arrayList = new ArrayList(t);
            Iterator<T> it = upperBounds.iterator();
            while (it.hasNext()) {
                arrayList.add(new KTypeImpl((e0) it.next(), null, 2, 0 == true ? 1 : 0));
            }
            return arrayList;
        }
    }

    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, e1 e1Var) {
        KClassImpl<?> kClassImpl;
        Object L;
        l.f(e1Var, "descriptor");
        this.f21524g = e1Var;
        this.f21525h = c0.d(new b());
        if (kTypeParameterOwnerImpl == null) {
            m b2 = getF21524g().b();
            l.e(b2, "descriptor.containingDeclaration");
            if (b2 instanceof e) {
                L = c((e) b2);
            } else if (b2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                m b3 = ((kotlin.reflect.jvm.internal.impl.descriptors.b) b2).b();
                l.e(b3, "declaration.containingDeclaration");
                if (b3 instanceof e) {
                    kClassImpl = c((e) b3);
                } else {
                    g gVar = b2 instanceof g ? (g) b2 : null;
                    if (gVar != null) {
                        KClass e2 = kotlin.jvm.a.e(a(gVar));
                        l.d(e2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        kClassImpl = (KClassImpl) e2;
                    } else {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + b2);
                    }
                }
                L = b2.L(new CreateKCallableVisitor(kClassImpl), kotlin.u.a);
            } else {
                throw new KotlinReflectionInternalError("Unknown type parameter container: " + b2);
            }
            l.e(L, "when (val declaration = … $declaration\")\n        }");
            kTypeParameterOwnerImpl = (KTypeParameterOwnerImpl) L;
        }
        this.f21526i = kTypeParameterOwnerImpl;
    }

    private final Class<?> a(g gVar) {
        Class<?> e2;
        f c0 = gVar.c0();
        if (!(c0 instanceof k)) {
            c0 = null;
        }
        k kVar = (k) c0;
        q g2 = kVar != null ? kVar.g() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f fVar = (kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f) (g2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f ? g2 : null);
        if (fVar != null && (e2 = fVar.e()) != null) {
            return e2;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + gVar);
    }

    private final KClassImpl<?> c(e eVar) {
        Class<?> p = i0.p(eVar);
        KClassImpl<?> kClassImpl = (KClassImpl) (p != null ? kotlin.jvm.a.e(p) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + eVar.b());
    }

    /* renamed from: b, reason: from getter */
    public e1 getF21524g() {
        return this.f21524g;
    }

    public boolean equals(Object other) {
        if (other instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) other;
            if (l.a(this.f21526i, kTypeParameterImpl.f21526i) && l.a(getName(), kTypeParameterImpl.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        String f2 = getF21524g().getName().f();
        l.e(f2, "descriptor.name.asString()");
        return f2;
    }

    @Override // kotlin.reflect.KTypeParameter
    public List<KType> getUpperBounds() {
        T d2 = this.f21525h.d(this, f21523f[0]);
        l.e(d2, "<get-upperBounds>(...)");
        return (List) d2;
    }

    public int hashCode() {
        return (this.f21526i.hashCode() * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.KTypeParameter
    public KVariance n() {
        int i2 = a.a[getF21524g().n().ordinal()];
        if (i2 == 1) {
            return KVariance.INVARIANT;
        }
        if (i2 == 2) {
            return KVariance.IN;
        }
        if (i2 == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return TypeParameterReference.f19469f.a(this);
    }
}
