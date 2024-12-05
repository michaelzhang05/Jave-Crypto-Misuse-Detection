package m4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import j4.AbstractC3081g;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* renamed from: m4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3423m implements m0, j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f35597f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final b f35598a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35599b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35600c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f35601d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f35602e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.m$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35604b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f35605c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35606d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f35607e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f35608f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35609g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35610h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35611i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f35604b = z8;
            this.f35605c = k0Var;
            this.f35606d = modifier;
            this.f35607e = set;
            this.f35608f = g8;
            this.f35609g = i8;
            this.f35610h = i9;
            this.f35611i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C3423m.this.f(this.f35604b, this.f35605c, this.f35606d, this.f35607e, this.f35608f, this.f35609g, this.f35610h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35611i | 1));
        }
    }

    /* renamed from: m4.m$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f35612a;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f35613b;

        public b(int i8, Object... args) {
            AbstractC3159y.i(args, "args");
            this.f35612a = i8;
            this.f35613b = args;
        }

        public final Object[] a() {
            return this.f35613b;
        }

        public final int b() {
            return this.f35612a;
        }
    }

    /* renamed from: m4.m$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        public final C a(boolean z8) {
            if (z8 || !C3423m.this.f35600c) {
                return null;
            }
            return new C(AbstractC3081g.f33182D, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public C3423m(b bVar, String debugTag, boolean z8) {
        AbstractC3159y.i(debugTag, "debugTag");
        this.f35598a = bVar;
        this.f35599b = debugTag;
        l6.v a8 = AbstractC3351M.a(Boolean.valueOf(z8));
        this.f35601d = a8;
        this.f35602e = v4.g.m(a8, new c());
    }

    @Override // m4.j0
    public void f(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(modifier, "modifier");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(579664739);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(579664739, i10, -1, "com.stripe.android.uicore.elements.CheckboxFieldController.ComposeUI (CheckboxFieldController.kt:55)");
        }
        AbstractC3425o.a(modifier, this, z8, startRestartGroup, ((i10 >> 6) & 14) | 64 | ((i10 << 6) & 896), 0);
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
        return this.f35602e;
    }

    public final String w() {
        return this.f35599b;
    }

    public final b x() {
        return this.f35598a;
    }

    public final InterfaceC3349K y() {
        return this.f35601d;
    }

    public final void z(boolean z8) {
        if (!this.f35600c) {
            this.f35600c = true;
        }
        this.f35601d.setValue(Boolean.valueOf(z8));
    }
}
