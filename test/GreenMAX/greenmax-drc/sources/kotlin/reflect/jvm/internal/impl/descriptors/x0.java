package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.x.internal.l0.i.w.h;

/* compiled from: ScopesHolderForClass.kt */
/* loaded from: classes2.dex */
public final class x0<T extends kotlin.reflect.x.internal.l0.i.w.h> {

    /* renamed from: c, reason: collision with root package name */
    private final e f21873c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<kotlin.reflect.x.internal.l0.l.t1.g, T> f21874d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.l.t1.g f21875e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.i f21876f;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f21872b = {kotlin.jvm.internal.b0.g(new kotlin.jvm.internal.v(kotlin.jvm.internal.b0.b(x0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public static final a a = new a(null);

    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final <T extends kotlin.reflect.x.internal.l0.i.w.h> x0<T> a(e eVar, kotlin.reflect.x.internal.l0.k.n nVar, kotlin.reflect.x.internal.l0.l.t1.g gVar, Function1<? super kotlin.reflect.x.internal.l0.l.t1.g, ? extends T> function1) {
            kotlin.jvm.internal.l.f(eVar, "classDescriptor");
            kotlin.jvm.internal.l.f(nVar, "storageManager");
            kotlin.jvm.internal.l.f(gVar, "kotlinTypeRefinerForOwnerModule");
            kotlin.jvm.internal.l.f(function1, "scopeFactory");
            return new x0<>(eVar, nVar, function1, gVar, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x0<T> f21877f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.l.t1.g f21878g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x0<T> x0Var, kotlin.reflect.x.internal.l0.l.t1.g gVar) {
            super(0);
            this.f21877f = x0Var;
            this.f21878g = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((x0) this.f21877f).f21874d.invoke(this.f21878g);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x0<T> f21879f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(x0<T> x0Var) {
            super(0);
            this.f21879f = x0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((x0) this.f21879f).f21874d.invoke(((x0) this.f21879f).f21875e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private x0(e eVar, kotlin.reflect.x.internal.l0.k.n nVar, Function1<? super kotlin.reflect.x.internal.l0.l.t1.g, ? extends T> function1, kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        this.f21873c = eVar;
        this.f21874d = function1;
        this.f21875e = gVar;
        this.f21876f = nVar.d(new c(this));
    }

    public /* synthetic */ x0(e eVar, kotlin.reflect.x.internal.l0.k.n nVar, Function1 function1, kotlin.reflect.x.internal.l0.l.t1.g gVar, kotlin.jvm.internal.g gVar2) {
        this(eVar, nVar, function1, gVar);
    }

    private final T d() {
        return (T) kotlin.reflect.x.internal.l0.k.m.a(this.f21876f, this, f21872b[0]);
    }

    public final T c(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        kotlin.jvm.internal.l.f(gVar, "kotlinTypeRefiner");
        if (!gVar.d(kotlin.reflect.x.internal.l0.i.t.a.l(this.f21873c))) {
            return d();
        }
        kotlin.reflect.x.internal.l0.l.e1 g2 = this.f21873c.g();
        kotlin.jvm.internal.l.e(g2, "classDescriptor.typeConstructor");
        return !gVar.e(g2) ? d() : (T) gVar.c(this.f21873c, new b(this, gVar));
    }
}
