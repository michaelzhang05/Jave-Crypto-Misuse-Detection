package kotlin.reflect.x.internal;

import cm.aptoide.pt.database.room.RoomInstalled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.a.k;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.c0;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* compiled from: KDeclarationContainerImpl.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\n\b \u0018\u0000 <2\u00020\u0001:\u0003<=>B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0019\u001a\u00020\"H&J\u0012\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020%H&J\"\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0004J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u0019\u001a\u00020\"H&J\u001a\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0.2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010/\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00100\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020%H\u0002JE\u00103\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t052\n\u00106\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u00107\u001a\u00020\u0013H\u0002¢\u0006\u0002\u00108J(\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015*\u0006\u0012\u0002\b\u00030\t2\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0.H\u0002J=\u0010:\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0010\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t052\n\u00106\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0002\u0010;R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006?"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", HttpUrl.FRAGMENT_ENCODE_SET, "result", HttpUrl.FRAGMENT_ENCODE_SET, "desc", HttpUrl.FRAGMENT_ENCODE_SET, "isConstructor", HttpUrl.FRAGMENT_ENCODE_SET, "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", RoomInstalled.SIGNATURE, "findMethodBySignature", "findPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "returnType", "isStaticDefault", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "tryGetConstructor", "tryGetMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.i, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* renamed from: f, reason: collision with root package name */
    public static final a f19600f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class<?> f19601g = Class.forName("kotlin.a0.d.g");

    /* renamed from: h, reason: collision with root package name */
    private static final Regex f19602h = new Regex("<v#(\\d+)>");

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.i$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Regex a() {
            return KDeclarationContainerImpl.f19602h;
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.i$b */
    /* loaded from: classes2.dex */
    public abstract class b {
        static final /* synthetic */ KProperty<Object>[] a = {b0.g(new v(b0.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: b, reason: collision with root package name */
        private final c0.a f19603b;

        /* compiled from: KDeclarationContainerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.i$b$a */
        /* loaded from: classes2.dex */
        static final class a extends Lambda implements Function0<k> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KDeclarationContainerImpl f19605f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(KDeclarationContainerImpl kDeclarationContainerImpl) {
                super(0);
                this.f19605f = kDeclarationContainerImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k invoke() {
                return b0.a(this.f19605f.a());
            }
        }

        public b() {
            this.f19603b = c0.d(new a(KDeclarationContainerImpl.this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final k a() {
            T d2 = this.f19603b.d(this, a[0]);
            l.e(d2, "<get-moduleData>(...)");
            return (k) d2;
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "accept", HttpUrl.FRAGMENT_ENCODE_SET, "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.i$c */
    /* loaded from: classes2.dex */
    protected enum c {
        DECLARED,
        INHERITED;

        public final boolean f(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "member");
            return bVar.i().d() == (this == DECLARED);
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.i$d */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function1<y, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f19609f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(y yVar) {
            l.f(yVar, "descriptor");
            return kotlin.reflect.x.internal.l0.h.c.f20764j.q(yVar) + " | " + RuntimeTypeMapper.a.g(yVar).getF19536b();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.i$e */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function1<t0, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f19610f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(t0 t0Var) {
            l.f(t0Var, "descriptor");
            return kotlin.reflect.x.internal.l0.h.c.f20764j.q(t0Var) + " | " + RuntimeTypeMapper.a.f(t0Var).getF19542f();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "kotlin.jvm.PlatformType", "second", "compare"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.i$f */
    /* loaded from: classes2.dex */
    static final class f<T> implements Comparator {

        /* renamed from: f, reason: collision with root package name */
        public static final f<T> f19611f = new f<>();

        f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(u uVar, u uVar2) {
            Integer d2 = t.d(uVar, uVar2);
            if (d2 == null) {
                return 0;
            }
            return d2.intValue();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$getMembers$visitor$1", "Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "visitConstructorDescriptor", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "data", HttpUrl.FRAGMENT_ENCODE_SET, "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.i$g */
    /* loaded from: classes2.dex */
    public static final class g extends CreateKCallableVisitor {
        g(KDeclarationContainerImpl kDeclarationContainerImpl) {
            super(kDeclarationContainerImpl);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.l, kotlin.reflect.jvm.internal.impl.descriptors.o
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public KCallableImpl<?> h(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, kotlin.u uVar) {
            l.f(lVar, "descriptor");
            l.f(uVar, "data");
            throw new IllegalStateException("No constructors should appear here: " + lVar);
        }
    }

    private final List<Class<?>> E(String str) {
        boolean E;
        int R;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        while (str.charAt(i3) != ')') {
            int i4 = i3;
            while (str.charAt(i4) == '[') {
                i4++;
            }
            char charAt = str.charAt(i4);
            E = kotlin.text.v.E("VZCBSIFJD", charAt, false, 2, null);
            if (E) {
                i2 = i4 + 1;
            } else if (charAt == 'L') {
                R = kotlin.text.v.R(str, ';', i3, false, 4, null);
                i2 = R + 1;
            } else {
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(H(str, i3, i2));
            i3 = i2;
        }
        return arrayList;
    }

    private final Class<?> F(String str) {
        int R;
        R = kotlin.text.v.R(str, ')', 0, false, 6, null);
        return H(str, R + 1, str.length());
    }

    private final Method G(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method G;
        if (z) {
            clsArr[0] = cls;
        }
        Method J = J(cls, str, clsArr, cls2);
        if (J != null) {
            return J;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (G = G(superclass, str, clsArr, cls2, z)) != null) {
            return G;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        l.e(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            l.e(cls3, "superInterface");
            Method G2 = G(cls3, str, clsArr, cls2, z);
            if (G2 != null) {
                return G2;
            }
            if (z) {
                Class<?> a2 = kotlin.reflect.jvm.internal.impl.descriptors.r1.a.e.a(kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.e(cls3), cls3.getName() + "$DefaultImpls");
                if (a2 != null) {
                    clsArr[0] = cls3;
                    Method J2 = J(a2, str, clsArr, cls2);
                    if (J2 != null) {
                        return J2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final Class<?> H(String str, int i2, int i3) {
        String v;
        char charAt = str.charAt(i2);
        if (charAt == 'L') {
            ClassLoader e2 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.e(a());
            String substring = str.substring(i2 + 1, i3 - 1);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            v = kotlin.text.u.v(substring, '/', '.', false, 4, null);
            Class<?> loadClass = e2.loadClass(v);
            l.e(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        }
        if (charAt == '[') {
            return i0.f(H(str, i2 + 1, i3));
        }
        if (charAt == 'V') {
            Class<?> cls = Void.TYPE;
            l.e(cls, "TYPE");
            return cls;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == 'C') {
            return Character.TYPE;
        }
        if (charAt == 'B') {
            return Byte.TYPE;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + str);
    }

    private final Constructor<?> I(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Class[] clsArr = (Class[]) array;
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method J(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (l.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            l.e(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (l.a(method.getName(), str) && l.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final void h(List<Class<?>> list, String str, boolean z) {
        list.addAll(E(str));
        int size = ((r5.size() + 32) - 1) / 32;
        for (int i2 = 0; i2 < size; i2++) {
            Class<?> cls = Integer.TYPE;
            l.e(cls, "TYPE");
            list.add(cls);
        }
        if (z) {
            Class<?> cls2 = f19601g;
            list.remove(cls2);
            l.e(cls2, "DEFAULT_CONSTRUCTOR_MARKER");
            list.add(cls2);
            return;
        }
        list.add(Object.class);
    }

    public abstract t0 A(int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<kotlin.reflect.x.internal.KCallableImpl<?>> B(kotlin.reflect.x.internal.l0.i.w.h r8, kotlin.reflect.x.internal.KDeclarationContainerImpl.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.l.f(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.l.f(r9, r0)
            kotlin.f0.x.e.i$g r0 = new kotlin.f0.x.e.i$g
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = kotlin.f0.x.e.l0.i.w.k.a.a(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = (kotlin.reflect.jvm.internal.impl.descriptors.m) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b
            if (r4 == 0) goto L4c
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.b) r4
            kotlin.reflect.jvm.internal.impl.descriptors.u r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.u r6 = kotlin.reflect.jvm.internal.impl.descriptors.t.f21866h
            boolean r5 = kotlin.jvm.internal.l.a(r5, r6)
            if (r5 != 0) goto L4c
            boolean r4 = r9.f(r4)
            if (r4 == 0) goto L4c
            kotlin.u r4 = kotlin.u.a
            java.lang.Object r3 = r3.L(r0, r4)
            kotlin.f0.x.e.f r3 = (kotlin.reflect.x.internal.KCallableImpl) r3
            goto L4d
        L4c:
            r3 = r1
        L4d:
            if (r3 == 0) goto L1e
            r2.add(r3)
            goto L1e
        L53:
            java.util.List r8 = kotlin.collections.r.y0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.KDeclarationContainerImpl.B(kotlin.f0.x.e.l0.i.w.h, kotlin.f0.x.e.i$c):java.util.Collection");
    }

    protected Class<?> C() {
        Class<?> f2 = kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.f(a());
        return f2 == null ? a() : f2;
    }

    public abstract Collection<t0> D(kotlin.reflect.x.internal.l0.f.f fVar);

    public final Constructor<?> r(String str) {
        l.f(str, "desc");
        return I(a(), E(str));
    }

    public final Constructor<?> s(String str) {
        l.f(str, "desc");
        Class<?> a2 = a();
        ArrayList arrayList = new ArrayList();
        h(arrayList, str, true);
        kotlin.u uVar = kotlin.u.a;
        return I(a2, arrayList);
    }

    public final Method t(String str, String str2, boolean z) {
        l.f(str, "name");
        l.f(str2, "desc");
        if (l.a(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(a());
        }
        h(arrayList, str2, false);
        Class<?> C = C();
        String str3 = str + "$default";
        Object[] array = arrayList.toArray(new Class[0]);
        l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return G(C, str3, (Class[]) array, F(str2), z);
    }

    public final y u(String str, String str2) {
        Collection<y> z;
        String b0;
        l.f(str, "name");
        l.f(str2, RoomInstalled.SIGNATURE);
        if (l.a(str, "<init>")) {
            z = kotlin.collections.b0.y0(y());
        } else {
            kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(str);
            l.e(r, "identifier(name)");
            z = z(r);
        }
        Collection<y> collection = z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (l.a(RuntimeTypeMapper.a.g((y) obj).getF19536b(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != 1) {
            b0 = kotlin.collections.b0.b0(collection, "\n", null, null, 0, null, d.f19609f, 30, null);
            StringBuilder sb = new StringBuilder();
            sb.append("Function '");
            sb.append(str);
            sb.append("' (JVM signature: ");
            sb.append(str2);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            sb.append(b0.length() == 0 ? " no members found" : '\n' + b0);
            throw new KotlinReflectionInternalError(sb.toString());
        }
        return (y) r.n0(arrayList);
    }

    public final Method v(String str, String str2) {
        Method G;
        l.f(str, "name");
        l.f(str2, "desc");
        if (l.a(str, "<init>")) {
            return null;
        }
        Object[] array = E(str2).toArray(new Class[0]);
        l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Class<?>[] clsArr = (Class[]) array;
        Class<?> F = F(str2);
        Method G2 = G(C(), str, clsArr, F, false);
        if (G2 != null) {
            return G2;
        }
        if (!C().isInterface() || (G = G(Object.class, str, clsArr, F, false)) == null) {
            return null;
        }
        return G;
    }

    public final t0 x(String str, String str2) {
        SortedMap h2;
        String b0;
        l.f(str, "name");
        l.f(str2, RoomInstalled.SIGNATURE);
        MatchResult a2 = f19602h.a(str2);
        if (a2 != null) {
            String str3 = a2.a().getA().b().get(1);
            t0 A = A(Integer.parseInt(str3));
            if (A != null) {
                return A;
            }
            throw new KotlinReflectionInternalError("Local property #" + str3 + " not found in " + a());
        }
        kotlin.reflect.x.internal.l0.f.f r = kotlin.reflect.x.internal.l0.f.f.r(str);
        l.e(r, "identifier(name)");
        Collection<t0> D = D(r);
        ArrayList arrayList = new ArrayList();
        for (Object obj : D) {
            if (l.a(RuntimeTypeMapper.a.f((t0) obj).getF19542f(), str2)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    u visibility = ((t0) obj2).getVisibility();
                    Object obj3 = linkedHashMap.get(visibility);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(visibility, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                h2 = n0.h(linkedHashMap, f.f19611f);
                Collection values = h2.values();
                l.e(values, "properties\n             …\n                }.values");
                List list = (List) r.c0(values);
                if (list.size() == 1) {
                    l.e(list, "mostVisibleProperties");
                    return (t0) r.R(list);
                }
                kotlin.reflect.x.internal.l0.f.f r2 = kotlin.reflect.x.internal.l0.f.f.r(str);
                l.e(r2, "identifier(name)");
                b0 = kotlin.collections.b0.b0(D(r2), "\n", null, null, 0, null, e.f19610f, 30, null);
                StringBuilder sb = new StringBuilder();
                sb.append("Property '");
                sb.append(str);
                sb.append("' (JVM signature: ");
                sb.append(str2);
                sb.append(") not resolved in ");
                sb.append(this);
                sb.append(':');
                sb.append(b0.length() == 0 ? " no members found" : '\n' + b0);
                throw new KotlinReflectionInternalError(sb.toString());
            }
            return (t0) r.n0(arrayList);
        }
        throw new KotlinReflectionInternalError("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
    }

    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> y();

    public abstract Collection<y> z(kotlin.reflect.x.internal.l0.f.f fVar);
}
