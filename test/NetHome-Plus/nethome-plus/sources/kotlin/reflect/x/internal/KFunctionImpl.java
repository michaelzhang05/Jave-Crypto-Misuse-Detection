package kotlin.reflect.x.internal;

import cm.aptoide.pt.database.room.RoomInstalled;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.FunctionWithAllInvokes;
import kotlin.reflect.x.internal.JvmFunctionSignature;
import kotlin.reflect.x.internal.c0;
import kotlin.reflect.x.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.x.internal.calls.Caller;
import kotlin.reflect.x.internal.calls.CallerImpl;
import kotlin.reflect.x.internal.calls.f;
import kotlin.reflect.x.internal.calls.h;
import okhttp3.HttpUrl;

/* compiled from: KFunctionImpl.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B)\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0012J.\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304032\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00106\u001a\u00020)H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u00105\u001a\u000209H\u0002J\u0013\u0010<\u001a\u00020)2\b\u0010=\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010>\u001a\u00020\u0014H\u0016J\b\u0010?\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R!\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "arity", HttpUrl.FRAGMENT_ENCODE_SET, "getArity", "()I", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "isBound", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "member", "isDefault", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", "other", "hashCode", "toString", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.j, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f19612j = {b0.g(new v(b0.b(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), b0.g(new v(b0.b(KFunctionImpl.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), b0.g(new v(b0.b(KFunctionImpl.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: k, reason: collision with root package name */
    private final KDeclarationContainerImpl f19613k;
    private final String l;
    private final Object m;
    private final c0.a n;
    private final c0.b o;
    private final c0.b p;

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.j$a */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<Caller<? extends Member>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Caller<Member> invoke() {
            int t;
            Object b2;
            Caller J;
            int t2;
            JvmFunctionSignature g2 = RuntimeTypeMapper.a.g(KFunctionImpl.this.D());
            if (g2 instanceof JvmFunctionSignature.d) {
                if (KFunctionImpl.this.B()) {
                    Class<?> a = KFunctionImpl.this.getF19613k().a();
                    List<KParameter> parameters = KFunctionImpl.this.getParameters();
                    t2 = u.t(parameters, 10);
                    ArrayList arrayList = new ArrayList(t2);
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        l.c(name);
                        arrayList.add(name);
                    }
                    return new AnnotationConstructorCaller(a, arrayList, AnnotationConstructorCaller.a.POSITIONAL_CALL, AnnotationConstructorCaller.b.KOTLIN, null, 16, null);
                }
                b2 = KFunctionImpl.this.getF19613k().r(((JvmFunctionSignature.d) g2).b());
            } else if (g2 instanceof JvmFunctionSignature.e) {
                JvmFunctionSignature.e eVar = (JvmFunctionSignature.e) g2;
                b2 = KFunctionImpl.this.getF19613k().v(eVar.c(), eVar.b());
            } else if (g2 instanceof JvmFunctionSignature.c) {
                b2 = ((JvmFunctionSignature.c) g2).getA();
            } else {
                if (!(g2 instanceof JvmFunctionSignature.b)) {
                    if (!(g2 instanceof JvmFunctionSignature.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<Method> b3 = ((JvmFunctionSignature.a) g2).b();
                    Class<?> a2 = KFunctionImpl.this.getF19613k().a();
                    t = u.t(b3, 10);
                    ArrayList arrayList2 = new ArrayList(t);
                    Iterator<T> it2 = b3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(a2, arrayList2, AnnotationConstructorCaller.a.POSITIONAL_CALL, AnnotationConstructorCaller.b.JAVA, b3);
                }
                b2 = ((JvmFunctionSignature.b) g2).b();
            }
            if (b2 instanceof Constructor) {
                KFunctionImpl kFunctionImpl = KFunctionImpl.this;
                J = kFunctionImpl.I((Constructor) b2, kFunctionImpl.D(), false);
            } else if (b2 instanceof Method) {
                Method method = (Method) b2;
                J = !Modifier.isStatic(method.getModifiers()) ? KFunctionImpl.this.J(method) : KFunctionImpl.this.D().getAnnotations().e(i0.j()) != null ? KFunctionImpl.this.K(method) : KFunctionImpl.this.L(method);
            } else {
                throw new KotlinReflectionInternalError("Could not compute caller for function: " + KFunctionImpl.this.D() + " (member = " + b2 + ')');
            }
            return h.c(J, KFunctionImpl.this.D(), false, 2, null);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.j$b */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function0<Caller<? extends Member>> {
        b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.reflect.Member, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Caller<Member> invoke() {
            GenericDeclaration genericDeclaration;
            int t;
            int t2;
            Caller caller;
            JvmFunctionSignature g2 = RuntimeTypeMapper.a.g(KFunctionImpl.this.D());
            if (g2 instanceof JvmFunctionSignature.e) {
                KDeclarationContainerImpl f19613k = KFunctionImpl.this.getF19613k();
                JvmFunctionSignature.e eVar = (JvmFunctionSignature.e) g2;
                String c2 = eVar.c();
                String b2 = eVar.b();
                l.c(KFunctionImpl.this.x().getMember());
                genericDeclaration = f19613k.t(c2, b2, !Modifier.isStatic(r5.getModifiers()));
            } else if (g2 instanceof JvmFunctionSignature.d) {
                if (KFunctionImpl.this.B()) {
                    Class<?> a = KFunctionImpl.this.getF19613k().a();
                    List<KParameter> parameters = KFunctionImpl.this.getParameters();
                    t2 = u.t(parameters, 10);
                    ArrayList arrayList = new ArrayList(t2);
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        l.c(name);
                        arrayList.add(name);
                    }
                    return new AnnotationConstructorCaller(a, arrayList, AnnotationConstructorCaller.a.CALL_BY_NAME, AnnotationConstructorCaller.b.KOTLIN, null, 16, null);
                }
                genericDeclaration = KFunctionImpl.this.getF19613k().s(((JvmFunctionSignature.d) g2).b());
            } else {
                if (g2 instanceof JvmFunctionSignature.a) {
                    List<Method> b3 = ((JvmFunctionSignature.a) g2).b();
                    Class<?> a2 = KFunctionImpl.this.getF19613k().a();
                    t = u.t(b3, 10);
                    ArrayList arrayList2 = new ArrayList(t);
                    Iterator<T> it2 = b3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(a2, arrayList2, AnnotationConstructorCaller.a.CALL_BY_NAME, AnnotationConstructorCaller.b.JAVA, b3);
                }
                genericDeclaration = null;
            }
            if (genericDeclaration instanceof Constructor) {
                KFunctionImpl kFunctionImpl = KFunctionImpl.this;
                caller = kFunctionImpl.I((Constructor) genericDeclaration, kFunctionImpl.D(), true);
            } else if (genericDeclaration instanceof Method) {
                if (KFunctionImpl.this.D().getAnnotations().e(i0.j()) != null) {
                    m b4 = KFunctionImpl.this.D().b();
                    l.d(b4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((e) b4).A()) {
                        caller = KFunctionImpl.this.K((Method) genericDeclaration);
                    }
                }
                caller = KFunctionImpl.this.L((Method) genericDeclaration);
            } else {
                caller = null;
            }
            if (caller != null) {
                return h.b(caller, KFunctionImpl.this.D(), true);
            }
            return null;
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.j$c */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<y> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f19617g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f19617g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return KFunctionImpl.this.getF19613k().u(this.f19617g, KFunctionImpl.this.l);
        }
    }

    /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, y yVar, Object obj, int i2, g gVar) {
        this(kDeclarationContainerImpl, str, str2, yVar, (i2 & 16) != 0 ? kotlin.jvm.internal.c.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallerImpl<Constructor<?>> I(Constructor<?> constructor, y yVar, boolean z) {
        if (!z && kotlin.reflect.x.internal.l0.i.u.b.f(yVar)) {
            if (C()) {
                return new CallerImpl.a(constructor, M());
            }
            return new CallerImpl.b(constructor);
        }
        if (C()) {
            return new CallerImpl.c(constructor, M());
        }
        return new CallerImpl.e(constructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallerImpl.h J(Method method) {
        return C() ? new CallerImpl.h.a(method, M()) : new CallerImpl.h.d(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallerImpl.h K(Method method) {
        return C() ? new CallerImpl.h.b(method) : new CallerImpl.h.e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallerImpl.h L(Method method) {
        return C() ? new CallerImpl.h.c(method, M()) : new CallerImpl.h.f(method);
    }

    private final Object M() {
        return h.a(this.m, D());
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    public boolean C() {
        return !l.a(this.m, kotlin.jvm.internal.c.NO_RECEIVER);
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public y D() {
        T d2 = this.n.d(this, f19612j[0]);
        l.e(d2, "<get-descriptor>(...)");
        return (y) d2;
    }

    @Override // kotlin.jvm.functions.Function3
    public Object c(Object obj, Object obj2, Object obj3) {
        return FunctionWithAllInvokes.a.d(this, obj, obj2, obj3);
    }

    public boolean equals(Object other) {
        KFunctionImpl c2 = i0.c(other);
        return c2 != null && l.a(getF19613k(), c2.getF19613k()) && l.a(getM(), c2.getM()) && l.a(this.l, c2.l) && l.a(this.m, c2.m);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return f.a(x());
    }

    @Override // kotlin.reflect.KCallable
    /* renamed from: getName */
    public String getM() {
        String f2 = D().getName().f();
        l.e(f2, "descriptor.name.asString()");
        return f2;
    }

    public int hashCode() {
        return (((getF19613k().hashCode() * 31) + getM().hashCode()) * 31) + this.l.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return FunctionWithAllInvokes.a.a(this);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return D().isSuspend();
    }

    public String toString() {
        return ReflectionObjectRenderer.a.d(D());
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    public Caller<?> x() {
        T d2 = this.o.d(this, f19612j[1]);
        l.e(d2, "<get-caller>(...)");
        return (Caller) d2;
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    /* renamed from: y, reason: from getter */
    public KDeclarationContainerImpl getF19613k() {
        return this.f19613k;
    }

    @Override // kotlin.reflect.x.internal.KCallableImpl
    public Caller<?> z() {
        return (Caller) this.p.d(this, f19612j[2]);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return FunctionWithAllInvokes.a.b(this, obj);
    }

    private KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, y yVar, Object obj) {
        this.f19613k = kDeclarationContainerImpl;
        this.l = str2;
        this.m = obj;
        this.n = c0.c(yVar, new c(str));
        this.o = c0.b(new a());
        this.p = c0.b(new b());
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return FunctionWithAllInvokes.a.c(this, obj, obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
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
    public KFunctionImpl(kotlin.reflect.x.internal.KDeclarationContainerImpl r10, kotlin.reflect.jvm.internal.impl.descriptors.y r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.l.f(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.l.f(r11, r0)
            kotlin.f0.x.e.l0.f.f r0 = r11.getName()
            java.lang.String r3 = r0.f()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.l.e(r3, r0)
            kotlin.f0.x.e.f0 r0 = kotlin.reflect.x.internal.RuntimeTypeMapper.a
            kotlin.f0.x.e.d r0 = r0.g(r11)
            java.lang.String r4 = r0.getF19536b()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.KFunctionImpl.<init>(kotlin.f0.x.e.i, kotlin.reflect.jvm.internal.impl.descriptors.y):void");
    }
}
