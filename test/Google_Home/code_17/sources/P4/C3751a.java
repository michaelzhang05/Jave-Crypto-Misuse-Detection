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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3751a implements m0, j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f37348c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3698L f37349a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f37350b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0830a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37352b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f37353c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37354d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f37355e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f37356f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37357g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37358h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37359i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0830a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f37352b = z8;
            this.f37353c = k0Var;
            this.f37354d = modifier;
            this.f37355e = set;
            this.f37356f = g8;
            this.f37357g = i8;
            this.f37358h = i9;
            this.f37359i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C3751a.this.c(this.f37352b, this.f37353c, this.f37354d, this.f37355e, this.f37356f, this.f37357g, this.f37358h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37359i | 1));
        }
    }

    /* renamed from: p4.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37360a = new b();

        /* renamed from: p4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0831a implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37361a;

            /* renamed from: p4.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0832a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f[] f37362a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0832a(InterfaceC3706f[] interfaceC3706fArr) {
                    super(0);
                    this.f37362a = interfaceC3706fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new C[this.f37362a.length];
                }
            }

            /* renamed from: p4.a$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0833b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                int f37363a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f37364b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f37365c;

                public C0833b(S5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f37363a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37364b;
                        C c8 = (C) AbstractC1378t.o0(AbstractC1378t.j0(AbstractC1371l.V0((Object[]) this.f37365c)));
                        this.f37363a = 1;
                        if (interfaceC3707g.emit(c8, this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1669o
                public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                    C0833b c0833b = new C0833b(dVar);
                    c0833b.f37364b = interfaceC3707g;
                    c0833b.f37365c = objArr;
                    return c0833b.invokeSuspend(O5.I.f8278a);
                }
            }

            public C0831a(InterfaceC3706f[] interfaceC3706fArr) {
                this.f37361a = interfaceC3706fArr;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                InterfaceC3706f[] interfaceC3706fArr = this.f37361a;
                Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0832a(interfaceC3706fArr), new C0833b(null), dVar);
                if (a8 == T5.b.e()) {
                    return a8;
                }
                return O5.I.f8278a;
            }
        }

        /* renamed from: p4.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0834b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f37366a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0834b(List list) {
                super(0);
                this.f37366a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f37366a;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3698L) it.next()).getValue());
                }
                return (C) AbstractC1378t.o0(AbstractC1378t.j0(arrayList));
            }
        }

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(List sectionFieldElements) {
            InterfaceC3706f c0831a;
            AbstractC3255y.i(sectionFieldElements, "sectionFieldElements");
            List list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).f().getError());
            }
            if (arrayList.isEmpty()) {
                c0831a = y4.g.n((C) AbstractC1378t.o0(AbstractC1378t.j0(AbstractC1378t.m())));
            } else {
                c0831a = new C0831a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
            }
            return new y4.e(c0831a, new C0834b(arrayList));
        }
    }

    public C3751a(InterfaceC3698L fieldsFlowable) {
        AbstractC3255y.i(fieldsFlowable, "fieldsFlowable");
        this.f37349a = fieldsFlowable;
        this.f37350b = y4.g.l(fieldsFlowable, b.f37360a);
    }

    @Override // p4.j0
    public void c(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(791653481);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(791653481, i10, -1, "com.stripe.android.uicore.elements.AddressController.ComposeUI (AddressController.kt:40)");
        }
        AbstractC3757d.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | ((i10 >> 3) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0830a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // p4.m0
    public InterfaceC3698L getError() {
        return this.f37350b;
    }

    public final InterfaceC3698L v() {
        return this.f37349a;
    }
}
