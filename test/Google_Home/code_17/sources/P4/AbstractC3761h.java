package p4;

import a6.InterfaceC1668n;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: p4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3761h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3759f f37533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3759f c3759f) {
            super(0);
            this.f37533a = c3759f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5615invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5615invoke() {
            this.f37533a.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f37534a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f37534a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5616invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5616invoke() {
            this.f37534a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3759f f37535a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f37536b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37537c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37538d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3759f c3759f, Function0 function0, int i8, int i9) {
            super(2);
            this.f37535a = c3759f;
            this.f37536b = function0;
            this.f37537c = i8;
            this.f37538d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3761h.a(this.f37535a, this.f37536b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37537c | 1), this.f37538d);
        }
    }

    public static final void a(C3759f controller, Function0 function0, Composer composer, int i8, int i9) {
        Function0 function02;
        int i10;
        boolean z8;
        AbstractC3255y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(-2118013992);
        if ((i9 & 2) != 0) {
            i10 = i8 & (-113);
            function02 = new a(controller);
        } else {
            function02 = function0;
            i10 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2118013992, i10, -1, "com.stripe.android.uicore.elements.AddressTextFieldUI (AddressTextFieldUI.kt:15)");
        }
        int m4875getNexteUduSuo = ImeAction.Companion.m4875getNexteUduSuo();
        Modifier.Companion companion = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(-814672579);
        if ((((i8 & 112) ^ 48) > 32 && startRestartGroup.changed(function02)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new b(function02);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        C0.c(controller, false, m4875getNexteUduSuo, ClickableKt.m320clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null), null, 0, 0, null, startRestartGroup, 440, PsExtractor.VIDEO_STREAM_MASK);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(controller, function02, i8, i9));
        }
    }
}
