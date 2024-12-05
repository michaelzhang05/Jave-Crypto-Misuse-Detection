package kotlin.reflect.x.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.v;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.x.internal.KDeclarationContainerImpl;
import kotlin.reflect.x.internal.c0;
import kotlin.reflect.x.internal.l0.c.b.d;
import kotlin.reflect.x.internal.l0.e.a0.b.e;
import kotlin.reflect.x.internal.l0.e.a0.b.i;
import kotlin.reflect.x.internal.l0.e.l;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.t;
import kotlin.reflect.x.internal.l0.e.z.g;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.j.b.w;
import kotlin.text.u;
import okhttp3.HttpUrl;

/* compiled from: KPackageImpl.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00000\u000eR\u00020\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getProperties", "hashCode", "toString", "Data", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.o, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* renamed from: i, reason: collision with root package name */
    private final Class<?> f21466i;

    /* renamed from: j, reason: collision with root package name */
    private final String f21467j;

    /* renamed from: k, reason: collision with root package name */
    private final c0.b<a> f21468k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R%\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR/\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "members", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "multifileFacade", "Ljava/lang/Class;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade$delegate", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope$delegate", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.o$a */
    /* loaded from: classes2.dex */
    public final class a extends KDeclarationContainerImpl.b {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f21469d = {b0.g(new v(b0.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), b0.g(new v(b0.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), b0.g(new v(b0.b(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), b0.g(new v(b0.b(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), b0.g(new v(b0.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: e, reason: collision with root package name */
        private final c0.a f21470e;

        /* renamed from: f, reason: collision with root package name */
        private final c0.a f21471f;

        /* renamed from: g, reason: collision with root package name */
        private final c0.b f21472g;

        /* renamed from: h, reason: collision with root package name */
        private final c0.b f21473h;

        /* renamed from: i, reason: collision with root package name */
        private final c0.a f21474i;

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0363a extends Lambda implements Function0<f> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KPackageImpl f21476f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0363a(KPackageImpl kPackageImpl) {
                super(0);
                this.f21476f = kPackageImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f invoke() {
                return f.a.a(this.f21476f.a());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.o$a$b */
        /* loaded from: classes2.dex */
        static final class b extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KPackageImpl f21477f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ a f21478g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(KPackageImpl kPackageImpl, a aVar) {
                super(0);
                this.f21477f = kPackageImpl;
                this.f21478g = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                return this.f21477f.B(this.f21478g.f(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.o$a$c */
        /* loaded from: classes2.dex */
        static final class c extends Lambda implements Function0<Triple<? extends kotlin.reflect.x.internal.l0.e.a0.b.f, ? extends l, ? extends kotlin.reflect.x.internal.l0.e.a0.b.e>> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Triple<kotlin.reflect.x.internal.l0.e.a0.b.f, l, kotlin.reflect.x.internal.l0.e.a0.b.e> invoke() {
                kotlin.reflect.x.internal.l0.d.b.c0.a a;
                f c2 = a.this.c();
                if (c2 == null || (a = c2.a()) == null) {
                    return null;
                }
                String[] a2 = a.a();
                String[] g2 = a.g();
                if (a2 == null || g2 == null) {
                    return null;
                }
                Pair<kotlin.reflect.x.internal.l0.e.a0.b.f, l> m = i.m(a2, g2);
                return new Triple<>(m.a(), m.b(), a.d());
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.o$a$d */
        /* loaded from: classes2.dex */
        static final class d extends Lambda implements Function0<Class<?>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ KPackageImpl f21481g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(KPackageImpl kPackageImpl) {
                super(0);
                this.f21481g = kPackageImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Class<?> invoke() {
                String v;
                kotlin.reflect.x.internal.l0.d.b.c0.a a;
                f c2 = a.this.c();
                String e2 = (c2 == null || (a = c2.a()) == null) ? null : a.e();
                if (e2 == null) {
                    return null;
                }
                if (!(e2.length() > 0)) {
                    return null;
                }
                ClassLoader classLoader = this.f21481g.a().getClassLoader();
                v = u.v(e2, '/', '.', false, 4, null);
                return classLoader.loadClass(v);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.o$a$e */
        /* loaded from: classes2.dex */
        static final class e extends Lambda implements Function0<h> {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h invoke() {
                f c2 = a.this.c();
                if (c2 != null) {
                    return a.this.a().c().a(c2);
                }
                return h.b.f20931b;
            }
        }

        public a() {
            super();
            this.f21470e = c0.d(new C0363a(KPackageImpl.this));
            this.f21471f = c0.d(new e());
            this.f21472g = c0.b(new d(KPackageImpl.this));
            this.f21473h = c0.b(new c());
            this.f21474i = c0.d(new b(KPackageImpl.this, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final f c() {
            return (f) this.f21470e.d(this, f21469d[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Triple<kotlin.reflect.x.internal.l0.e.a0.b.f, l, kotlin.reflect.x.internal.l0.e.a0.b.e> d() {
            return (Triple) this.f21473h.d(this, f21469d[3]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Class<?> e() {
            return (Class) this.f21472g.d(this, f21469d[2]);
        }

        public final h f() {
            T d2 = this.f21471f.d(this, f21469d[1]);
            kotlin.jvm.internal.l.e(d2, "<get-scope>(...)");
            return (h) d2;
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012 \u0003*\b\u0018\u00010\u0001R\u00020\u00020\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.o$b */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a();
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.o$c */
    /* loaded from: classes2.dex */
    /* synthetic */ class c extends kotlin.jvm.internal.i implements Function2<w, n, t0> {

        /* renamed from: h, reason: collision with root package name */
        public static final c f21484h = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return b0.b(w.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(w wVar, n nVar) {
            kotlin.jvm.internal.l.f(wVar, "p0");
            kotlin.jvm.internal.l.f(nVar, "p1");
            return wVar.l(nVar);
        }
    }

    public KPackageImpl(Class<?> cls, String str) {
        kotlin.jvm.internal.l.f(cls, "jClass");
        this.f21466i = cls;
        this.f21467j = str;
        c0.b<a> b2 = c0.b(new b());
        kotlin.jvm.internal.l.e(b2, "lazy { Data() }");
        this.f21468k = b2;
    }

    private final h K() {
        return this.f21468k.invoke().f();
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    public t0 A(int i2) {
        Triple<kotlin.reflect.x.internal.l0.e.a0.b.f, l, e> d2 = this.f21468k.invoke().d();
        if (d2 == null) {
            return null;
        }
        kotlin.reflect.x.internal.l0.e.a0.b.f a2 = d2.a();
        l b2 = d2.b();
        e c2 = d2.c();
        h.f<l, List<n>> fVar = kotlin.reflect.x.internal.l0.e.a0.a.n;
        kotlin.jvm.internal.l.e(fVar, "packageLocalVariable");
        n nVar = (n) kotlin.reflect.x.internal.l0.e.z.e.b(b2, fVar, i2);
        if (nVar == null) {
            return null;
        }
        Class<?> a3 = a();
        t X = b2.X();
        kotlin.jvm.internal.l.e(X, "packageProto.typeTable");
        return (t0) i0.h(a3, nVar, a2, new g(X), c2, c.f21484h);
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    protected Class<?> C() {
        Class<?> e2 = this.f21468k.invoke().e();
        return e2 == null ? a() : e2;
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    public Collection<t0> D(kotlin.reflect.x.internal.l0.f.f fVar) {
        kotlin.jvm.internal.l.f(fVar, "name");
        return K().c(fVar, d.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public Class<?> a() {
        return this.f21466i;
    }

    public boolean equals(Object other) {
        return (other instanceof KPackageImpl) && kotlin.jvm.internal.l.a(a(), ((KPackageImpl) other).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "file class " + kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.a(a()).b();
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> y() {
        List i2;
        i2 = kotlin.collections.t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    public Collection<y> z(kotlin.reflect.x.internal.l0.f.f fVar) {
        kotlin.jvm.internal.l.f(fVar, "name");
        return K().a(fVar, d.FROM_REFLECTION);
    }
}
