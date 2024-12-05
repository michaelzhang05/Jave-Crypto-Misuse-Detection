package kotlin.reflect.x.internal.l0.b.q;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.x;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.k.i;
import kotlin.reflect.x.internal.l0.k.m;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes2.dex */
public final class f extends h {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f19774h = {b0.g(new v(b0.b(f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: i, reason: collision with root package name */
    private final a f19775i;

    /* renamed from: j, reason: collision with root package name */
    private Function0<b> f19776j;

    /* renamed from: k, reason: collision with root package name */
    private final i f19777k;

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes2.dex */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private final g0 a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f19782b;

        public b(g0 g0Var, boolean z) {
            l.f(g0Var, "ownerModuleDescriptor");
            this.a = g0Var;
            this.f19782b = z;
        }

        public final g0 a() {
            return this.a;
        }

        public final boolean b() {
            return this.f19782b;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[a.FALLBACK.ordinal()] = 3;
            a = iArr;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements Function0<g> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f19784g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: JvmBuiltIns.kt */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<b> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f19785f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f19785f = fVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b invoke() {
                Function0 function0 = this.f19785f.f19776j;
                if (function0 != null) {
                    b bVar = (b) function0.invoke();
                    this.f19785f.f19776j = null;
                    return bVar;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            this.f19784g = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            x r = f.this.r();
            l.e(r, "builtInsModule");
            return new g(r, this.f19784g, new a(f.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function0<b> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f19786f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f19787g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g0 g0Var, boolean z) {
            super(0);
            this.f19786f = g0Var;
            this.f19787g = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(this.f19786f, this.f19787g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, a aVar) {
        super(nVar);
        l.f(nVar, "storageManager");
        l.f(aVar, "kind");
        this.f19775i = aVar;
        this.f19777k = nVar.d(new d(nVar));
        int i2 = c.a[aVar.ordinal()];
        if (i2 == 2) {
            f(false);
        } else {
            if (i2 != 3) {
                return;
            }
            f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.b.h
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.o1.b> v() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.o1.b> j0;
        Iterable<kotlin.reflect.jvm.internal.impl.descriptors.o1.b> v = super.v();
        l.e(v, "super.getClassDescriptorFactories()");
        n U = U();
        l.e(U, "storageManager");
        x r = r();
        l.e(r, "builtInsModule");
        j0 = kotlin.collections.b0.j0(v, new kotlin.reflect.x.internal.l0.b.q.e(U, r, null, 4, null));
        return j0;
    }

    public final g H0() {
        return (g) m.a(this.f19777k, this, f19774h[0]);
    }

    public final void I0(g0 g0Var, boolean z) {
        l.f(g0Var, "moduleDescriptor");
        J0(new e(g0Var, z));
    }

    public final void J0(Function0<b> function0) {
        l.f(function0, "computation");
        Function0<b> function02 = this.f19776j;
        this.f19776j = function0;
    }

    @Override // kotlin.reflect.x.internal.l0.b.h
    protected kotlin.reflect.jvm.internal.impl.descriptors.o1.c M() {
        return H0();
    }

    @Override // kotlin.reflect.x.internal.l0.b.h
    protected kotlin.reflect.jvm.internal.impl.descriptors.o1.a g() {
        return H0();
    }
}
