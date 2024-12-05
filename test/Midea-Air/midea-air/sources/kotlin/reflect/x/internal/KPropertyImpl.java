package kotlin.reflect.x.internal;

import cm.aptoide.pt.database.room.RoomInstalled;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.x.internal.JvmPropertySignature;
import kotlin.reflect.x.internal.c0;
import kotlin.reflect.x.internal.calls.Caller;
import kotlin.reflect.x.internal.calls.h;
import kotlin.reflect.x.internal.l0.d.a.k;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.a0.b.d;
import kotlin.reflect.x.internal.l0.e.a0.b.i;
import kotlin.u;
import okhttp3.HttpUrl;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000 @*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004?@ABB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0011J\n\u00104\u001a\u0004\u0018\u000105H\u0004J\u0013\u00106\u001a\u00020)2\b\u00107\u001a\u0004\u0018\u00010\nH\u0096\u0002J(\u00108\u001a\u0004\u0018\u00010\n2\b\u00109\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u00010\n2\b\u0010;\u001a\u0004\u0018\u00010\nH\u0004J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0007H\u0016R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\r0\r0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00102¨\u0006C"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "V", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "_descriptor", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "_javaField", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Ljava/lang/reflect/Field;", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getter", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "isBound", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isConst", "isLateinit", "isSuspend", "javaField", "getJavaField", "()Ljava/lang/reflect/Field;", "getName", "()Ljava/lang/String;", "getSignature", "computeDelegateSource", "Ljava/lang/reflect/Member;", "equals", "other", "getDelegateImpl", "fieldOrMethod", "receiver1", "receiver2", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.v, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements KProperty<V> {

    /* renamed from: j, reason: collision with root package name */
    public static final b f21499j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    private static final Object f21500k = new Object();
    private final KDeclarationContainerImpl l;
    private final String m;
    private final String n;
    private final Object o;
    private final c0.b<Field> p;
    private final c0.a<t0> q;

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "()V", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getDefaultCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "isBound", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "property", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.v$a */
    /* loaded from: classes2.dex */
    public static abstract class a<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, KProperty.a<PropertyType> {
        @Override // kotlin.reflect.x.internal.KCallableImpl
        public boolean C() {
            return n().C();
        }

        public abstract s0 D();

        /* renamed from: E */
        public abstract KPropertyImpl<PropertyType> n();

        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return D().isSuspend();
        }

        @Override // kotlin.reflect.x.internal.KCallableImpl
        /* renamed from: y */
        public KDeclarationContainerImpl getL() {
            return n().getL();
        }

        @Override // kotlin.reflect.x.internal.KCallableImpl
        public Caller<?> z() {
            return null;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "EXTENSION_PROPERTY_DELEGATE", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.v$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016R\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getName", "()Ljava/lang/String;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.v$c */
    /* loaded from: classes2.dex */
    public static abstract class c<V> extends a<V, V> implements KProperty.b<V> {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f21501j = {b0.g(new v(b0.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), b0.g(new v(b0.b(c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: k, reason: collision with root package name */
        private final c0.a f21502k = c0.d(new b(this));
        private final c0.b l = c0.b(new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "kotlin.jvm.PlatformType", "V", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.v$c$a */
        /* loaded from: classes2.dex */
        static final class a extends Lambda implements Function0<Caller<?>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c<V> f21503f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? extends V> cVar) {
                super(0);
                this.f21503f = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Caller<?> invoke() {
                return w.a(this.f21503f, true);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "kotlin.jvm.PlatformType", "V", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.v$c$b */
        /* loaded from: classes2.dex */
        static final class b extends Lambda implements Function0<u0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c<V> f21504f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(c<? extends V> cVar) {
                super(0);
                this.f21504f = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final u0 invoke() {
                u0 getter = this.f21504f.n().D().getGetter();
                return getter == null ? kotlin.reflect.x.internal.l0.i.c.d(this.f21504f.n().D(), kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c.b()) : getter;
            }
        }

        @Override // kotlin.reflect.x.internal.KPropertyImpl.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public u0 D() {
            T d2 = this.f21502k.d(this, f21501j[0]);
            l.e(d2, "<get-descriptor>(...)");
            return (u0) d2;
        }

        public boolean equals(Object other) {
            return (other instanceof c) && l.a(n(), ((c) other).n());
        }

        @Override // kotlin.reflect.KCallable
        /* renamed from: getName */
        public String getM() {
            return "<get-" + n().getM() + '>';
        }

        public int hashCode() {
            return n().hashCode();
        }

        public String toString() {
            return "getter of " + n();
        }

        @Override // kotlin.reflect.x.internal.KCallableImpl
        public Caller<?> x() {
            T d2 = this.l.d(this, f21501j[1]);
            l.e(d2, "<get-caller>(...)");
            return (Caller) d2;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016R\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KMutableProperty$Setter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getName", "()Ljava/lang/String;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.v$d */
    /* loaded from: classes2.dex */
    public static abstract class d<V> extends a<V, u> implements KMutableProperty.a<V> {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f21505j = {b0.g(new v(b0.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), b0.g(new v(b0.b(d.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: k, reason: collision with root package name */
        private final c0.a f21506k = c0.d(new b(this));
        private final c0.b l = c0.b(new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "kotlin.jvm.PlatformType", "V", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.v$d$a */
        /* loaded from: classes2.dex */
        static final class a extends Lambda implements Function0<Caller<?>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ d<V> f21507f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d<V> dVar) {
                super(0);
                this.f21507f = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Caller<?> invoke() {
                return w.a(this.f21507f, false);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "kotlin.jvm.PlatformType", "V", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.v$d$b */
        /* loaded from: classes2.dex */
        static final class b extends Lambda implements Function0<v0> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ d<V> f21508f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d<V> dVar) {
                super(0);
                this.f21508f = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final v0 invoke() {
                v0 setter = this.f21508f.n().D().getSetter();
                if (setter != null) {
                    return setter;
                }
                t0 D = this.f21508f.n().D();
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c;
                return kotlin.reflect.x.internal.l0.i.c.e(D, aVar.b(), aVar.b());
            }
        }

        @Override // kotlin.reflect.x.internal.KPropertyImpl.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public v0 D() {
            T d2 = this.f21506k.d(this, f21505j[0]);
            l.e(d2, "<get-descriptor>(...)");
            return (v0) d2;
        }

        public boolean equals(Object other) {
            return (other instanceof d) && l.a(n(), ((d) other).n());
        }

        @Override // kotlin.reflect.KCallable
        /* renamed from: getName */
        public String getM() {
            return "<set-" + n().getM() + '>';
        }

        public int hashCode() {
            return n().hashCode();
        }

        public String toString() {
            return "setter of " + n();
        }

        @Override // kotlin.reflect.x.internal.KCallableImpl
        public Caller<?> x() {
            T d2 = this.l.d(this, f21505j[1]);
            l.e(d2, "<get-caller>(...)");
            return (Caller) d2;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin.jvm.PlatformType", "V", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.v$e */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function0<t0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ KPropertyImpl<V> f21509f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(KPropertyImpl<? extends V> kPropertyImpl) {
            super(0);
            this.f21509f = kPropertyImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0 invoke() {
            return this.f21509f.getL().x(this.f21509f.getM(), this.f21509f.getN());
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "V", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.v$f */
    /* loaded from: classes2.dex */
    static final class f extends Lambda implements Function0<Field> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ KPropertyImpl<V> f21510f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(KPropertyImpl<? extends V> kPropertyImpl) {
            super(0);
            this.f21510f = kPropertyImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class<?> enclosingClass;
            JvmPropertySignature f2 = RuntimeTypeMapper.a.f(this.f21510f.D());
            if (f2 instanceof JvmPropertySignature.c) {
                JvmPropertySignature.c cVar = (JvmPropertySignature.c) f2;
                t0 a = cVar.getA();
                d.a d2 = i.d(i.a, cVar.getF19538b(), cVar.getF19540d(), cVar.getF19541e(), false, 8, null);
                if (d2 == null) {
                    return null;
                }
                KPropertyImpl<V> kPropertyImpl = this.f21510f;
                if (!k.e(a) && !i.f(cVar.getF19538b())) {
                    m b2 = a.b();
                    enclosingClass = b2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? i0.p((kotlin.reflect.jvm.internal.impl.descriptors.e) b2) : kPropertyImpl.getL().a();
                } else {
                    enclosingClass = kPropertyImpl.getL().a().getEnclosingClass();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(d2.c());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            }
            if (f2 instanceof JvmPropertySignature.a) {
                return ((JvmPropertySignature.a) f2).getA();
            }
            if ((f2 instanceof JvmPropertySignature.b) || (f2 instanceof JvmPropertySignature.d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, t0 t0Var, Object obj) {
        this.l = kDeclarationContainerImpl;
        this.m = str;
        this.n = str2;
        this.o = obj;
        c0.b<Field> b2 = c0.b(new f(this));
        l.e(b2, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.p = b2;
        c0.a<t0> c2 = c0.c(t0Var, new e(this));
        l.e(c2, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.q = c2;
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    public boolean C() {
        return !l.a(this.o, kotlin.jvm.internal.c.NO_RECEIVER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Member D() {
        if (!D().O()) {
            return null;
        }
        JvmPropertySignature f2 = RuntimeTypeMapper.a.f(D());
        if (f2 instanceof JvmPropertySignature.c) {
            JvmPropertySignature.c cVar = (JvmPropertySignature.c) f2;
            if (cVar.getF19539c().G()) {
                a.c B = cVar.getF19539c().B();
                if (!B.B() || !B.A()) {
                    return null;
                }
                return getL().v(cVar.getF19540d().getString(B.z()), cVar.getF19540d().getString(B.y()));
            }
        }
        return I();
    }

    public final Object E() {
        return h.a(this.o, D());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object F(Member member, Object obj, Object obj2) {
        try {
            Object obj3 = f21500k;
            if ((obj != obj3 && obj2 != obj3) || D().m0() != null) {
                Object E = C() ? E() : obj;
                if (!(E != obj3)) {
                    E = null;
                }
                if (!C()) {
                    obj = obj2;
                }
                if (!(obj != obj3)) {
                    obj = null;
                }
                if (member == null) {
                    return null;
                }
                if (member instanceof Field) {
                    return ((Field) member).get(E);
                }
                if (!(member instanceof Method)) {
                    throw new AssertionError("delegate field/method " + member + " neither field nor method");
                }
                int length = ((Method) member).getParameterTypes().length;
                if (length == 0) {
                    return ((Method) member).invoke(null, new Object[0]);
                }
                if (length == 1) {
                    Method method = (Method) member;
                    Object[] objArr = new Object[1];
                    if (E == null) {
                        Class<?> cls = ((Method) member).getParameterTypes()[0];
                        l.e(cls, "fieldOrMethod.parameterTypes[0]");
                        E = i0.g(cls);
                    }
                    objArr[0] = E;
                    return method.invoke(null, objArr);
                }
                if (length == 2) {
                    Method method2 = (Method) member;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = E;
                    if (obj == null) {
                        Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                        l.e(cls2, "fieldOrMethod.parameterTypes[1]");
                        obj = i0.g(cls2);
                    }
                    objArr2[1] = obj;
                    return method2.invoke(null, objArr2);
                }
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
        } catch (IllegalAccessException e2) {
            throw new IllegalPropertyDelegateAccessException(e2);
        }
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public t0 D() {
        t0 invoke = this.q.invoke();
        l.e(invoke, "_descriptor()");
        return invoke;
    }

    /* renamed from: H */
    public abstract c<V> getGetter();

    public final Field I() {
        return this.p.invoke();
    }

    /* renamed from: J, reason: from getter */
    public final String getN() {
        return this.n;
    }

    public boolean equals(Object other) {
        KPropertyImpl<?> d2 = i0.d(other);
        return d2 != null && l.a(getL(), d2.getL()) && l.a(getM(), d2.getM()) && l.a(this.n, d2.n) && l.a(this.o, d2.o);
    }

    @Override // kotlin.reflect.KCallable
    /* renamed from: getName, reason: from getter */
    public String getM() {
        return this.m;
    }

    public int hashCode() {
        return (((getL().hashCode() * 31) + getM().hashCode()) * 31) + this.n.hashCode();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return D().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return D().s0();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return ReflectionObjectRenderer.a.g(D());
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    public Caller<?> x() {
        return getGetter().x();
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    /* renamed from: y, reason: from getter */
    public KDeclarationContainerImpl getL() {
        return this.l;
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    public Caller<?> z() {
        return getGetter().z();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        l.f(kDeclarationContainerImpl, "container");
        l.f(str, "name");
        l.f(str2, RoomInstalled.SIGNATURE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KPropertyImpl(kotlin.reflect.x.internal.KDeclarationContainerImpl r8, kotlin.reflect.jvm.internal.impl.descriptors.t0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.l.f(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.l.f(r9, r0)
            kotlin.f0.x.e.l0.f.f r0 = r9.getName()
            java.lang.String r3 = r0.f()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.l.e(r3, r0)
            kotlin.f0.x.e.f0 r0 = kotlin.reflect.x.internal.RuntimeTypeMapper.a
            kotlin.f0.x.e.e r0 = r0.f(r9)
            java.lang.String r4 = r0.getF19542f()
            java.lang.Object r6 = kotlin.jvm.internal.c.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.KPropertyImpl.<init>(kotlin.f0.x.e.i, kotlin.reflect.jvm.internal.impl.descriptors.t0):void");
    }
}
