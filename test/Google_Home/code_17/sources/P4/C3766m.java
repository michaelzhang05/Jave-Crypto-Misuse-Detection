package p4;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3435g;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* renamed from: p4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3766m implements m0, j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f37623f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final b f37624a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37625b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37626c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f37627d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f37628e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.m$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f37631c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37632d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f37633e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f37634f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37635g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37636h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37637i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
            super(2);
            this.f37630b = z8;
            this.f37631c = k0Var;
            this.f37632d = modifier;
            this.f37633e = set;
            this.f37634f = g8;
            this.f37635g = i8;
            this.f37636h = i9;
            this.f37637i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C3766m.this.c(this.f37630b, this.f37631c, this.f37632d, this.f37633e, this.f37634f, this.f37635g, this.f37636h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37637i | 1));
        }
    }

    /* renamed from: p4.m$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f37638a;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f37639b;

        public b(int i8, Object... args) {
            AbstractC3255y.i(args, "args");
            this.f37638a = i8;
            this.f37639b = args;
        }

        public final Object[] a() {
            return this.f37639b;
        }

        public final int b() {
            return this.f37638a;
        }
    }

    /* renamed from: p4.m$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function1 {
        c() {
            super(1);
        }

        public final C a(boolean z8) {
            if (z8 || !C3766m.this.f37626c) {
                return null;
            }
            return new C(AbstractC3435g.f35158D, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public C3766m(b bVar, String debugTag, boolean z8) {
        AbstractC3255y.i(debugTag, "debugTag");
        this.f37624a = bVar;
        this.f37625b = debugTag;
        o6.w a8 = AbstractC3700N.a(Boolean.valueOf(z8));
        this.f37627d = a8;
        this.f37628e = y4.g.m(a8, new c());
    }

    @Override // p4.j0
    public void c(boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(modifier, "modifier");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(579664739);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(579664739, i10, -1, "com.stripe.android.uicore.elements.CheckboxFieldController.ComposeUI (CheckboxFieldController.kt:55)");
        }
        AbstractC3768o.a(modifier, this, z8, startRestartGroup, ((i10 >> 6) & 14) | 64 | ((i10 << 6) & 896), 0);
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
        return this.f37628e;
    }

    public final String w() {
        return this.f37625b;
    }

    public final b x() {
        return this.f37624a;
    }

    public final InterfaceC3698L y() {
        return this.f37627d;
    }

    public final void z(boolean z8) {
        if (!this.f37626c) {
            this.f37626c = true;
        }
        this.f37627d.setValue(Boolean.valueOf(z8));
    }
}
