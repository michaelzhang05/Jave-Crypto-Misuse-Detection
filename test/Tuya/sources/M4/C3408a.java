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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3408a implements m0, j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f35322c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f35323a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f35324b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0800a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f35327c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35328d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f35329e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f35330f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35331g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35332h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35333i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0800a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35326b = z8;
            this.f35327c = k0Var;
            this.f35328d = modifier;
            this.f35329e = set;
            this.f35330f = g8;
            this.f35331g = i8;
            this.f35332h = i9;
            this.f35333i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C3408a.this.f(this.f35326b, this.f35327c, this.f35328d, this.f35329e, this.f35330f, this.f35331g, this.f35332h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35333i | 1));
        }
    }

    /* renamed from: m4.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35334a = new b();

        /* renamed from: m4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0801a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35335a;

            /* renamed from: m4.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0802a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f[] f35336a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0802a(InterfaceC3358f[] interfaceC3358fArr) {
                    super(0);
                    this.f35336a = interfaceC3358fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new C[this.f35336a.length];
                }
            }

            /* renamed from: m4.a$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0803b extends kotlin.coroutines.jvm.internal.l implements X5.o {

                /* renamed from: a, reason: collision with root package name */
                int f35337a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f35338b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f35339c;

                public C0803b(P5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f35337a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35338b;
                        C c8 = (C) AbstractC1246t.o0(AbstractC1246t.j0(AbstractC1239l.V0((Object[]) this.f35339c)));
                        this.f35337a = 1;
                        if (interfaceC3359g.emit(c8, this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6487a;
                }

                @Override // X5.o
                public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                    C0803b c0803b = new C0803b(dVar);
                    c0803b.f35338b = interfaceC3359g;
                    c0803b.f35339c = objArr;
                    return c0803b.invokeSuspend(L5.I.f6487a);
                }
            }

            public C0801a(InterfaceC3358f[] interfaceC3358fArr) {
                this.f35335a = interfaceC3358fArr;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                InterfaceC3358f[] interfaceC3358fArr = this.f35335a;
                Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0802a(interfaceC3358fArr), new C0803b(null), dVar);
                if (a8 == Q5.b.e()) {
                    return a8;
                }
                return L5.I.f6487a;
            }
        }

        /* renamed from: m4.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0804b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f35340a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0804b(List list) {
                super(0);
                this.f35340a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f35340a;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3349K) it.next()).getValue());
                }
                return (C) AbstractC1246t.o0(AbstractC1246t.j0(arrayList));
            }
        }

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(List sectionFieldElements) {
            InterfaceC3358f c0801a;
            AbstractC3159y.i(sectionFieldElements, "sectionFieldElements");
            List list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).f().getError());
            }
            if (arrayList.isEmpty()) {
                c0801a = v4.g.n((C) AbstractC1246t.o0(AbstractC1246t.j0(AbstractC1246t.m())));
            } else {
                c0801a = new C0801a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
            }
            return new v4.e(c0801a, new C0804b(arrayList));
        }
    }

    public C3408a(InterfaceC3349K fieldsFlowable) {
        AbstractC3159y.i(fieldsFlowable, "fieldsFlowable");
        this.f35323a = fieldsFlowable;
        this.f35324b = v4.g.l(fieldsFlowable, b.f35334a);
    }

    @Override // m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(791653481);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(791653481, i10, -1, "com.stripe.android.uicore.elements.AddressController.ComposeUI (AddressController.kt:40)");
        }
        AbstractC3414d.a(z8, this, hiddenIdentifiers, g8, startRestartGroup, (i10 & 14) | 576 | ((i10 >> 3) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0800a(z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
        }
    }

    @Override // m4.m0
    public InterfaceC3349K getError() {
        return this.f35324b;
    }

    public final InterfaceC3349K v() {
        return this.f35323a;
    }
}
