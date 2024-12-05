package p4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* renamed from: p4.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3752a0 implements m0, j0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f37367a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f37368b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.a0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37370b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f37371c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37372d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f37373e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f37374f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37375g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37376h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37377i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f37370b = z8;
            this.f37371c = k0Var;
            this.f37372d = modifier;
            this.f37373e = set;
            this.f37374f = g8;
            this.f37375g = i8;
            this.f37376h = i9;
            this.f37377i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C3752a0.this.c(this.f37370b, this.f37371c, this.f37372d, this.f37373e, this.f37374f, this.f37375g, this.f37376h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37377i | 1));
        }
    }

    /* renamed from: p4.a0$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f37378a;

        /* renamed from: p4.a0$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37379a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f37379a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new C[this.f37379a.length];
            }
        }

        /* renamed from: p4.a0$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0835b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f37380a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37381b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37382c;

            public C0835b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f37380a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37381b;
                    C c8 = (C) AbstractC1378t.o0(AbstractC1378t.j0(AbstractC1371l.V0((Object[]) this.f37382c)));
                    this.f37380a = 1;
                    if (interfaceC3707g.emit(c8, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                C0835b c0835b = new C0835b(dVar);
                c0835b.f37381b = interfaceC3707g;
                c0835b.f37382c = objArr;
                return c0835b.invokeSuspend(O5.I.f8278a);
            }
        }

        public b(InterfaceC3706f[] interfaceC3706fArr) {
            this.f37378a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f37378a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new a(interfaceC3706fArr), new C0835b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* renamed from: p4.a0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37383a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f37383a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f37383a;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
            }
            return (C) AbstractC1378t.o0(AbstractC1378t.j0(arrayList));
        }
    }

    public C3752a0(List fields) {
        InterfaceC3706f bVar;
        AbstractC3255y.i(fields, "fields");
        this.f37367a = fields;
        List list = fields;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0) it.next()).f().getError());
        }
        if (arrayList.isEmpty()) {
            bVar = y4.g.n((C) AbstractC1378t.o0(AbstractC1378t.j0(AbstractC1378t.m())));
        } else {
            bVar = new b((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
        }
        this.f37368b = new y4.e(bVar, new c(arrayList));
    }

    @Override // p4.j0
    public void c(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-55811811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-55811811, i10, -1, "com.stripe.android.uicore.elements.RowController.ComposeUI (RowController.kt:28)");
        }
        AbstractC3756c0.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | ((i10 >> 3) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f37368b;
    }

    public final List v() {
        return this.f37367a;
    }
}
