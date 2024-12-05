package C3;

import C3.c;
import O5.I;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import l6.X;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.w;
import y4.g;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final M f1188a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f1189b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f1190c;

    /* renamed from: d, reason: collision with root package name */
    private final w f1191d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f1192e;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1193a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3.c invoke(List it) {
            AbstractC3255y.i(it, "it");
            return (C3.c) AbstractC1378t.y0(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0016b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f1194a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f1195b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f1196c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0016b(Function0 function0, b bVar, S5.d dVar) {
            super(2, dVar);
            this.f1195b = function0;
            this.f1196c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0016b(this.f1195b, this.f1196c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f1194a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3225a.C0782a c0782a = C3225a.f34131b;
                long s8 = AbstractC3227c.s(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, EnumC3228d.f34140d);
                this.f1194a = 1;
                if (X.c(s8, this) == e8) {
                    return e8;
                }
            }
            this.f1195b.invoke();
            this.f1196c.f1190c.set(false);
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0016b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            b.this.j();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3.c f1199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3.c cVar) {
            super(0);
            this.f1199b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            b.this.n(this.f1199b);
        }
    }

    public b(M coroutineScope, Function1 poppedScreenHandler) {
        AbstractC3255y.i(coroutineScope, "coroutineScope");
        AbstractC3255y.i(poppedScreenHandler, "poppedScreenHandler");
        this.f1188a = coroutineScope;
        this.f1189b = poppedScreenHandler;
        this.f1190c = new AtomicBoolean(false);
        w a8 = AbstractC3700N.a(AbstractC1378t.e(c.g.f1251a));
        this.f1191d = a8;
        this.f1192e = g.m(a8, a.f1193a);
    }

    private final void g(Function0 function0) {
        if (!this.f1190c.getAndSet(true)) {
            AbstractC3364k.d(this.f1188a, null, null, new C0016b(function0, this, null), 3, null);
        }
    }

    private final void h(C3.c cVar) {
        if (cVar instanceof Closeable) {
            ((Closeable) cVar).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        Object value;
        List Z02;
        w wVar = this.f1191d;
        do {
            value = wVar.getValue();
            Z02 = AbstractC1378t.Z0((List) value);
            C3.c cVar = (C3.c) AbstractC1378t.P(Z02);
            h(cVar);
            this.f1189b.invoke(cVar);
        } while (!wVar.c(value, AbstractC1378t.W0(Z02)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(C3.c cVar) {
        Object value;
        w wVar = this.f1191d;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, AbstractC1378t.H0(AbstractC1378t.E0((List) value, c.g.f1251a), cVar)));
    }

    public final void d() {
        Iterator it = ((Iterable) this.f1191d.getValue()).iterator();
        while (it.hasNext()) {
            h((C3.c) it.next());
        }
    }

    public final boolean e() {
        if (((List) this.f1191d.getValue()).size() > 1) {
            return true;
        }
        return false;
    }

    public final InterfaceC3698L f() {
        return this.f1192e;
    }

    public final void i() {
        if (!this.f1190c.get()) {
            j();
        }
    }

    public final void k() {
        g(new c());
    }

    public final void l(List screens) {
        AbstractC3255y.i(screens, "screens");
        if (!this.f1190c.get()) {
            List<C3.c> list = (List) this.f1191d.getValue();
            this.f1191d.setValue(screens);
            for (C3.c cVar : list) {
                if (!screens.contains(cVar)) {
                    h(cVar);
                }
            }
        }
    }

    public final void m(C3.c target) {
        AbstractC3255y.i(target, "target");
        if (!this.f1190c.get()) {
            n(target);
        }
    }

    public final void o(C3.c target) {
        AbstractC3255y.i(target, "target");
        g(new d(target));
    }
}
