package m4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.x0;

/* loaded from: classes4.dex */
public interface w0 extends H, j0 {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: m4.w0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0822a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w0 f35767a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f35768b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f35769c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Modifier f35770d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Set f35771e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ G f35772f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f35773g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f35774h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f35775i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0822a(w0 w0Var, boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, int i10) {
                super(2);
                this.f35767a = w0Var;
                this.f35768b = z8;
                this.f35769c = k0Var;
                this.f35770d = modifier;
                this.f35771e = set;
                this.f35772f = g8;
                this.f35773g = i8;
                this.f35774h = i9;
                this.f35775i = i10;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return L5.I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                this.f35767a.f(this.f35768b, this.f35769c, this.f35770d, this.f35771e, this.f35772f, this.f35773g, this.f35774h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35775i | 1));
            }
        }

        public static void a(w0 w0Var, boolean z8, k0 field, Modifier modifier, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10) {
            int i11;
            int m4870getNexteUduSuo;
            Composer composer2;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            AbstractC3159y.i(field, "field");
            AbstractC3159y.i(modifier, "modifier");
            AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
            Composer startRestartGroup = composer.startRestartGroup(-2028039881);
            if ((i10 & 14) == 0) {
                if (startRestartGroup.changed(z8)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i11 = i18 | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 112) == 0) {
                if (startRestartGroup.changed(field)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i11 |= i17;
            }
            if ((i10 & 896) == 0) {
                if (startRestartGroup.changed(modifier)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i11 |= i16;
            }
            if ((57344 & i10) == 0) {
                if (startRestartGroup.changed(g8)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i11 |= i15;
            }
            if ((i10 & 458752) == 0) {
                if (startRestartGroup.changed(i8)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i11 |= i14;
            }
            if ((i10 & 3670016) == 0) {
                if (startRestartGroup.changed(i9)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i11 |= i13;
            }
            if ((29360128 & i10) == 0) {
                if (startRestartGroup.changed(w0Var)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i11 |= i12;
            }
            if ((23962331 & i11) == 4792466 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2028039881, i11, -1, "com.stripe.android.uicore.elements.TextFieldController.ComposeUI (TextFieldController.kt:64)");
                }
                if (AbstractC3159y.d(g8, field.a())) {
                    m4870getNexteUduSuo = ImeAction.Companion.m4868getDoneeUduSuo();
                } else {
                    m4870getNexteUduSuo = ImeAction.Companion.m4870getNexteUduSuo();
                }
                int i19 = i11 << 3;
                int i20 = m4870getNexteUduSuo;
                composer2 = startRestartGroup;
                C0.c(w0Var, z8, i20, modifier, null, i8, i9, null, startRestartGroup, (458752 & i11) | ((i11 >> 21) & 14) | (i19 & 112) | (i19 & 7168) | (i11 & 3670016), 144);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C0822a(w0Var, z8, field, modifier, hiddenIdentifiers, g8, i8, i9, i10));
            }
        }

        public static boolean b(w0 w0Var) {
            return true;
        }

        public static InterfaceC3349K c(w0 w0Var) {
            return v4.g.n(null);
        }

        public static void d(w0 w0Var, x0.a.C0823a item) {
            AbstractC3159y.i(item, "item");
        }
    }

    InterfaceC3349K a();

    InterfaceC3349K b();

    InterfaceC3349K c();

    VisualTransformation d();

    InterfaceC3349K e();

    void f(boolean z8, k0 k0Var, Modifier modifier, Set set, G g8, int i8, int i9, Composer composer, int i10);

    int g();

    InterfaceC3349K getContentDescription();

    void h(x0.a.C0823a c0823a);

    void i(boolean z8);

    int j();

    InterfaceC3349K k();

    y0 l(String str);

    InterfaceC3349K n();

    InterfaceC3349K o();

    AutofillType p();

    boolean q();

    String s();

    boolean u();
}
