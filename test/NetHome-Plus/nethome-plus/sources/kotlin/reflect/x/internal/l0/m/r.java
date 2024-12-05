package kotlin.reflect.x.internal.l0.m;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.m.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public abstract class r implements f {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<h, e0> f21436b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21437c;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends r {

        /* renamed from: d, reason: collision with root package name */
        public static final a f21438d = new a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.f0.x.e.l0.m.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0361a extends Lambda implements Function1<h, e0> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0361a f21439f = new C0361a();

            C0361a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(h hVar) {
                l.f(hVar, "$this$null");
                m0 n = hVar.n();
                l.e(n, "booleanType");
                return n;
            }
        }

        private a() {
            super("Boolean", C0361a.f21439f, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends r {

        /* renamed from: d, reason: collision with root package name */
        public static final b f21440d = new b();

        /* compiled from: modifierChecks.kt */
        /* loaded from: classes2.dex */
        static final class a extends Lambda implements Function1<h, e0> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f21441f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(h hVar) {
                l.f(hVar, "$this$null");
                m0 D = hVar.D();
                l.e(D, "intType");
                return D;
            }
        }

        private b() {
            super("Int", a.f21441f, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class c extends r {

        /* renamed from: d, reason: collision with root package name */
        public static final c f21442d = new c();

        /* compiled from: modifierChecks.kt */
        /* loaded from: classes2.dex */
        static final class a extends Lambda implements Function1<h, e0> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f21443f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(h hVar) {
                l.f(hVar, "$this$null");
                m0 Z = hVar.Z();
                l.e(Z, "unitType");
                return Z;
            }
        }

        private c() {
            super("Unit", a.f21443f, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r(String str, Function1<? super h, ? extends e0> function1) {
        this.a = str;
        this.f21436b = function1;
        this.f21437c = "must return " + str;
    }

    public /* synthetic */ r(String str, Function1 function1, g gVar) {
        this(str, function1);
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public String a(y yVar) {
        return f.a.a(this, yVar);
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public boolean b(y yVar) {
        l.f(yVar, "functionDescriptor");
        return l.a(yVar.getReturnType(), this.f21436b.invoke(kotlin.reflect.x.internal.l0.i.t.a.f(yVar)));
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public String getDescription() {
        return this.f21437c;
    }
}
