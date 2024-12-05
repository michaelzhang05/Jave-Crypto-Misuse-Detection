package e4;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.AbstractC3422l;

/* loaded from: classes4.dex */
public abstract class D0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B0 f30336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f30337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B0 b02, State state) {
            super(1);
            this.f30336a = b02;
            this.f30337b = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L5.I.f6487a;
        }

        public final void invoke(boolean z8) {
            this.f30336a.x(!D0.b(this.f30337b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30338a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0 f30339b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f30340c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30341d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30342e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C0 c02, Modifier modifier, int i8, int i9) {
            super(2);
            this.f30338a = z8;
            this.f30339b = c02;
            this.f30340c = modifier;
            this.f30341d = i8;
            this.f30342e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            D0.a(this.f30338a, this.f30339b, this.f30340c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30341d | 1), this.f30342e);
        }
    }

    public static final void a(boolean z8, C0 element, Modifier modifier, Composer composer, int i8, int i9) {
        AbstractC3159y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(1061070076);
        if ((i9 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1061070076, i8, -1, "com.stripe.android.ui.core.elements.SaveForFutureUseElementUI (SaveForFutureUseElementUI.kt:18)");
        }
        B0 f8 = element.f();
        State a8 = v4.f.a(f8.w(), startRestartGroup, 8);
        State a9 = v4.f.a(f8.b(), startRestartGroup, 8);
        AbstractC3422l.a(modifier, "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG", b(a8), ((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(c(a9), element.g()), z8, new a(f8, a8), startRestartGroup, ((i8 >> 6) & 14) | 48 | ((i8 << 12) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, element, modifier, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final int c(State state) {
        return ((Number) state.getValue()).intValue();
    }
}
