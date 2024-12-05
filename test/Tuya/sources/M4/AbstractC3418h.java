package m4;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: m4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3418h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3416f f35507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3416f c3416f) {
            super(0);
            this.f35507a = c3416f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5611invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5611invoke() {
            this.f35507a.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f35508a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f35508a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5612invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5612invoke() {
            this.f35508a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3416f f35509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f35510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35511c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35512d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3416f c3416f, Function0 function0, int i8, int i9) {
            super(2);
            this.f35509a = c3416f;
            this.f35510b = function0;
            this.f35511c = i8;
            this.f35512d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3418h.a(this.f35509a, this.f35510b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35511c | 1), this.f35512d);
        }
    }

    public static final void a(C3416f controller, Function0 function0, Composer composer, int i8, int i9) {
        Function0 function02;
        int i10;
        boolean z8;
        AbstractC3159y.i(controller, "controller");
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
        int m4870getNexteUduSuo = ImeAction.Companion.m4870getNexteUduSuo();
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
        C0.c(controller, false, m4870getNexteUduSuo, ClickableKt.m315clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null), null, 0, 0, null, startRestartGroup, 440, PsExtractor.VIDEO_STREAM_MASK);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(controller, function02, i8, i9));
        }
    }
}
