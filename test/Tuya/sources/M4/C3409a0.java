package m4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* renamed from: m4.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3409a0 implements m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f35341a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f35342b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.a0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35344b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f35345c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35346d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f35347e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f35348f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35349g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35350h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35351i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35344b = z8;
            this.f35345c = k0Var;
            this.f35346d = modifier;
            this.f35347e = set;
            this.f35348f = g8;
            this.f35349g = i8;
            this.f35350h = i9;
            this.f35351i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C3409a0.this.f(this.f35344b, this.f35345c, this.f35346d, this.f35347e, this.f35348f, this.f35349g, this.f35350h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35351i | 1));
        }
    }

    /* renamed from: m4.a0$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f35352a;

        /* renamed from: m4.a0$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35353a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f35353a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new C[this.f35353a.length];
            }
        }

        /* renamed from: m4.a0$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0805b extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f35354a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f35355b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f35356c;

            public C0805b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f35354a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35355b;
                    C c8 = (C) AbstractC1246t.o0(AbstractC1246t.j0(AbstractC1239l.V0((Object[]) this.f35356c)));
                    this.f35354a = 1;
                    if (interfaceC3359g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                C0805b c0805b = new C0805b(dVar);
                c0805b.f35355b = interfaceC3359g;
                c0805b.f35356c = objArr;
                return c0805b.invokeSuspend(L5.I.f6487a);
            }
        }

        public b(InterfaceC3358f[] interfaceC3358fArr) {
            this.f35352a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f35352a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new a(interfaceC3358fArr), new C0805b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* renamed from: m4.a0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35357a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f35357a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f35357a;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            return (C) AbstractC1246t.o0(AbstractC1246t.j0(arrayList));
        }
    }

    public C3409a0(List fields) {
        InterfaceC3358f bVar;
        AbstractC3159y.i(fields, "fields");
        this.f35341a = fields;
        List list = fields;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).f().getError());
        }
        if (arrayList.isEmpty()) {
            bVar = v4.g.n((C) AbstractC1246t.o0(AbstractC1246t.j0(AbstractC1246t.m())));
        } else {
            bVar = new b((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
        }
        this.f35342b = new v4.e(bVar, new c(arrayList));
    }

    @Override // m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-55811811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-55811811, i10, -1, "com.stripe.android.uicore.elements.RowController.ComposeUI (RowController.kt:28)");
        }
        AbstractC3413c0.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | ((i10 >> 3) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f35342b;
    }

    public final List v() {
        return this.f35341a;
    }
}
