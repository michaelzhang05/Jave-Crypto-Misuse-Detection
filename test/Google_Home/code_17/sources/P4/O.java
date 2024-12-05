package p4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import m4.AbstractC3441m;
import o6.InterfaceC3698L;
import x4.AbstractC4189a;

/* loaded from: classes4.dex */
public abstract class O {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f37159a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37160b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37161c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusRequester f37162d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f37163e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusManager f37164f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f37165g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ M f37166h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f37167i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ MutableIntState f37168j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p4.O$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0826a extends C3252v implements Function1 {
            C0826a(Object obj) {
                super(1, obj, K.class, "onAutofillDigit", "onAutofillDigit(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3255y.i(p02, "p0");
                ((K) this.receiver).z(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f37169a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f37170b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MutableIntState f37171c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(int i8, boolean z8, MutableIntState mutableIntState) {
                super(1);
                this.f37169a = i8;
                this.f37170b = z8;
                this.f37171c = mutableIntState;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusState) obj);
                return O5.I.f8278a;
            }

            public final void invoke(FocusState focusState) {
                AbstractC3255y.i(focusState, "focusState");
                if (focusState.isFocused()) {
                    O.c(this.f37171c, this.f37169a);
                } else {
                    if (focusState.isFocused() || !this.f37170b) {
                        return;
                    }
                    O.c(this.f37171c, -1);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f37172a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FocusManager f37173b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L f37174c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ State f37175d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(int i8, FocusManager focusManager, L l8, State state) {
                super(1);
                this.f37172a = i8;
                this.f37173b = focusManager;
                this.f37174c = l8;
                this.f37175d = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m5612invokeZmokQxo(((KeyEvent) obj).m3893unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m5612invokeZmokQxo(android.view.KeyEvent event) {
                AbstractC3255y.i(event, "event");
                if (this.f37172a != 0 && KeyEventType.m3897equalsimpl0(KeyEvent_androidKt.m3905getTypeZmokQxo(event), KeyEventType.Companion.m3901getKeyDownCS__XNY()) && event.getKeyCode() == 67 && a.b(this.f37175d).length() == 0) {
                    this.f37173b.mo2672moveFocus3ESFkO8(FocusDirection.Companion.m2668getPreviousdhqQ8s());
                    this.f37174c.f().A(this.f37172a - 1, "");
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final d f37176a = new d();

            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return O5.I.f8278a;
            }

            public final void invoke(SemanticsPropertyReceiver semantics) {
                AbstractC3255y.i(semantics, "$this$semantics");
                SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L l8, int i8, boolean z8, FocusRequester focusRequester, TextStyle textStyle, FocusManager focusManager, boolean z9, M m8, String str, MutableIntState mutableIntState) {
            super(2);
            this.f37159a = l8;
            this.f37160b = i8;
            this.f37161c = z8;
            this.f37162d = focusRequester;
            this.f37163e = textStyle;
            this.f37164f = focusManager;
            this.f37165g = z9;
            this.f37166h = m8;
            this.f37167i = str;
            this.f37168j = mutableIntState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String b(State state) {
            return (String) state.getValue();
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2113339167, i8, -1, "com.stripe.android.uicore.elements.OTPElementUI.<anonymous>.<anonymous>.<anonymous> (OTPElementUI.kt:139)");
            }
            State a8 = y4.f.a((InterfaceC3698L) this.f37159a.f().w().get(this.f37160b), composer, 8);
            Modifier a9 = AbstractC4189a.a(SizeKt.m638height3ABfNKs(Modifier.Companion, Dp.m5183constructorimpl(56)), AbstractC1378t.e(AutofillType.SmsOtpCode), new C0826a(this.f37159a.f()), composer, 54);
            composer.startReplaceableGroup(448324923);
            boolean changed = composer.changed(this.f37160b) | composer.changed(this.f37161c);
            int i9 = this.f37160b;
            boolean z8 = this.f37161c;
            MutableIntState mutableIntState = this.f37168j;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new b(i9, z8, mutableIntState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(TestTagKt.testTag(KeyInputModifierKt.onPreviewKeyEvent(FocusChangedModifierKt.onFocusChanged(a9, (Function1) rememberedValue), new c(this.f37160b, this.f37164f, this.f37159a, a8)), "OTP-" + this.f37160b), false, d.f37176a, 1, null);
            if (this.f37160b == 0) {
                semantics$default = FocusRequesterModifierKt.focusRequester(semantics$default, this.f37162d);
            }
            O.d(b(a8), this.f37161c, this.f37163e, this.f37159a, this.f37160b, this.f37164f, semantics$default, this.f37165g, this.f37166h, this.f37167i, composer, 266240);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37177a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f37178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f37179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Shape f37180d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f37181e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f37182f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f37183g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f37184h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ M f37185i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ FocusRequester f37186j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f37187k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f37188l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, L l8, Modifier modifier, Shape shape, TextStyle textStyle, float f8, float f9, String str, M m8, FocusRequester focusRequester, int i8, int i9) {
            super(2);
            this.f37177a = z8;
            this.f37178b = l8;
            this.f37179c = modifier;
            this.f37180d = shape;
            this.f37181e = textStyle;
            this.f37182f = f8;
            this.f37183g = f9;
            this.f37184h = str;
            this.f37185i = m8;
            this.f37186j = focusRequester;
            this.f37187k = i8;
            this.f37188l = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            O.a(this.f37177a, this.f37178b, this.f37179c, this.f37180d, this.f37181e, this.f37182f, this.f37183g, this.f37184h, this.f37185i, this.f37186j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37187k | 1), this.f37188l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f37189a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusManager focusManager) {
            super(1);
            this.f37189a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3255y.i($receiver, "$this$$receiver");
            this.f37189a.clearFocus(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f37190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FocusManager focusManager) {
            super(1);
            this.f37190a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3255y.i($receiver, "$this$$receiver");
            this.f37190a.mo2672moveFocus3ESFkO8(FocusDirection.Companion.m2667getNextdhqQ8s());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37191a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f37192b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37193c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusManager f37194d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, L l8, int i8, FocusManager focusManager) {
            super(1);
            this.f37191a = str;
            this.f37192b = l8;
            this.f37193c = i8;
            this.f37194d = focusManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return O5.I.f8278a;
        }

        public final void invoke(TextFieldValue it) {
            String text;
            AbstractC3255y.i(it, "it");
            if ((!j6.n.u(this.f37191a)) && (!j6.n.u(it.getText()))) {
                text = it.getText().substring(1);
                AbstractC3255y.h(text, "substring(...)");
            } else {
                text = it.getText();
            }
            g6.i s8 = g6.m.s(0, this.f37192b.f().A(this.f37193c, text));
            FocusManager focusManager = this.f37194d;
            Iterator it2 = s8.iterator();
            while (it2.hasNext()) {
                ((P5.N) it2).nextInt();
                focusManager.mo2672moveFocus3ESFkO8(FocusDirection.Companion.m2667getNextdhqQ8s());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37195a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37196b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f37197c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L f37198d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37199e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusManager f37200f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f37201g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f37202h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ M f37203i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f37204j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f37205k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z8, TextStyle textStyle, L l8, int i8, FocusManager focusManager, Modifier modifier, boolean z9, M m8, String str2, int i9) {
            super(2);
            this.f37195a = str;
            this.f37196b = z8;
            this.f37197c = textStyle;
            this.f37198d = l8;
            this.f37199e = i8;
            this.f37200f = focusManager;
            this.f37201g = modifier;
            this.f37202h = z9;
            this.f37203i = m8;
            this.f37204j = str2;
            this.f37205k = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            O.d(this.f37195a, this.f37196b, this.f37197c, this.f37198d, this.f37199e, this.f37200f, this.f37201g, this.f37202h, this.f37203i, this.f37204j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37205k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f37206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37207b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37208c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37209d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37210e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f37211a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f37212b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z8, String str) {
                super(2);
                this.f37211a = z8;
                this.f37212b = str;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return O5.I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1652073966, i8, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox.<anonymous>.<anonymous> (OTPElementUI.kt:257)");
                }
                TextKt.m1419Text4IGK_g(!this.f37211a ? this.f37212b : "", SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5080boximpl(TextAlign.Companion.m5087getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 48, 0, 130556);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(M m8, String str, boolean z8, boolean z9, String str2) {
            super(3);
            this.f37206a = m8;
            this.f37207b = str;
            this.f37208c = z8;
            this.f37209d = z9;
            this.f37210e = str2;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1668n) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(InterfaceC1668n innerTextField, Composer composer, int i8) {
            int i9;
            AbstractC3255y.i(innerTextField, "innerTextField");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changedInstance(innerTextField) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1095196779, i9, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox.<anonymous> (OTPElementUI.kt:252)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            VisualTransformation none = VisualTransformation.Companion.getNone();
            composer.startReplaceableGroup(-1549852397);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            composer.endReplaceableGroup();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            long h8 = AbstractC3441m.n(materialTheme, composer, i10).h();
            Color.Companion companion = Color.Companion;
            textFieldDefaults.TextFieldDecorationBox(this.f37207b, innerTextField, this.f37208c, true, none, mutableInteractionSource, false, null, ComposableLambdaKt.composableLambda(composer, 1652073966, true, new a(this.f37209d, this.f37210e)), null, null, textFieldDefaults.m1404textFieldColorsdx8h9Zs(h8, 0L, companion.m3011getTransparent0d7_KjU(), AbstractC3441m.n(materialTheme, composer, i10).k(), 0L, companion.m3011getTransparent0d7_KjU(), companion.m3011getTransparent0d7_KjU(), companion.m3011getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, this.f37206a.a(), this.f37206a.a(), composer, 14352768, 0, 48, 524050), PaddingKt.m600PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null), composer, ((i9 << 3) & 112) | 100887552, 3456, 1728);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void a(boolean z8, L element, Modifier modifier, Shape shape, TextStyle textStyle, float f8, float f9, String str, M m8, FocusRequester focusRequester, Composer composer, int i8, int i9) {
        Modifier modifier2;
        Shape shape2;
        int i10;
        TextStyle textStyle2;
        float f10;
        float f11;
        String str2;
        M m9;
        FocusRequester focusRequester2;
        boolean z9;
        float disabled;
        long e8;
        AbstractC3255y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(1579313268);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 8) != 0) {
            i10 = i8 & (-7169);
            shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getMedium();
        } else {
            shape2 = shape;
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            i10 &= -57345;
            textStyle2 = N.f37158a.a(startRestartGroup, 6);
        } else {
            textStyle2 = textStyle;
        }
        if ((i9 & 32) != 0) {
            f10 = Dp.m5183constructorimpl(8);
        } else {
            f10 = f8;
        }
        if ((i9 & 64) != 0) {
            f11 = Dp.m5183constructorimpl(20);
        } else {
            f11 = f9;
        }
        if ((i9 & 128) != 0) {
            str2 = "●";
        } else {
            str2 = str;
        }
        if ((i9 & 256) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            i10 &= -234881025;
            m9 = new M(materialTheme.getColors(startRestartGroup, i11).m1183getPrimary0d7_KjU(), AbstractC3441m.n(materialTheme, startRestartGroup, i11).i(), null);
        } else {
            m9 = m8;
        }
        int i12 = i10;
        if ((i9 & 512) != 0) {
            startRestartGroup.startReplaceableGroup(1737565169);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester2 = (FocusRequester) rememberedValue;
        } else {
            focusRequester2 = focusRequester;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1579313268, i12, -1, "com.stripe.android.uicore.elements.OTPElementUI (OTPElementUI.kt:108)");
        }
        FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(693286680);
        int i13 = 0;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
        Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-538968491);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(-1);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableIntState mutableIntState = (MutableIntState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-538962785);
        g6.i s8 = g6.m.s(0, element.f().y());
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            int nextInt = ((P5.N) it).nextInt();
            if (b(mutableIntState) == nextInt) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (nextInt == 0) {
                startRestartGroup.startReplaceableGroup(-1247423146);
                startRestartGroup.endReplaceableGroup();
            } else if (nextInt == element.f().y() / 2) {
                startRestartGroup.startReplaceableGroup(-1247421278);
                SpacerKt.Spacer(SizeKt.m657width3ABfNKs(Modifier.Companion, f11), startRestartGroup, i13);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1247418945);
                SpacerKt.Spacer(SizeKt.m657width3ABfNKs(Modifier.Companion, f10), startRestartGroup, i13);
                startRestartGroup.endReplaceableGroup();
            }
            Modifier.Companion companion2 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(-538952995);
            if (z8) {
                disabled = 1.0f;
            } else {
                disabled = ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier a8 = androidx.compose.foundation.layout.e.a(rowScopeInstance, AlphaKt.alpha(companion2, disabled), 1.0f, false, 2, null);
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            long d8 = AbstractC3441m.n(materialTheme2, startRestartGroup, i14).d();
            float h8 = AbstractC3441m.h(materialTheme2, z9, startRestartGroup, i14);
            startRestartGroup.startReplaceableGroup(-538942424);
            if (z9) {
                e8 = m9.b();
            } else {
                e8 = AbstractC3441m.n(materialTheme2, startRestartGroup, i14).e();
            }
            startRestartGroup.endReplaceableGroup();
            int i15 = i12;
            ArrayList arrayList2 = arrayList;
            p0.b(a8, shape2, false, d8, BorderStrokeKt.m314BorderStrokecXLIe8U(h8, e8), ComposableLambdaKt.composableLambda(startRestartGroup, -2113339167, true, new a(element, nextInt, z9, focusRequester2, textStyle2, focusManager, z8, m9, str2, mutableIntState)), startRestartGroup, ((i15 >> 6) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4);
            arrayList2.add(O5.I.f8278a);
            arrayList = arrayList2;
            i12 = i15;
            f11 = f11;
            f10 = f10;
            i13 = 0;
        }
        float f12 = f11;
        float f13 = f10;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, element, modifier2, shape2, textStyle2, f13, f12, str2, m9, focusRequester2, i8, i9));
        }
    }

    private static final int b(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableIntState mutableIntState, int i8) {
        mutableIntState.setIntValue(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, boolean z8, TextStyle textStyle, L l8, int i8, FocusManager focusManager, Modifier modifier, boolean z9, M m8, String str2, Composer composer, int i9) {
        long m4702getZerod9O1mEE;
        Composer startRestartGroup = composer.startRestartGroup(-1791721297);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1791721297, i9, -1, "com.stripe.android.uicore.elements.OTPInputBox (OTPElementUI.kt:203)");
        }
        if (z8) {
            m4702getZerod9O1mEE = TextRangeKt.TextRange(str.length());
        } else {
            m4702getZerod9O1mEE = TextRange.Companion.m4702getZerod9O1mEE();
        }
        TextFieldValue textFieldValue = new TextFieldValue(str, m4702getZerod9O1mEE, (TextRange) null, 4, (AbstractC3247p) null);
        SolidColor solidColor = new SolidColor(AbstractC3441m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).k(), null);
        int i10 = i9 >> 12;
        int i11 = i10 & 7168;
        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1) new e(str, l8, i8, focusManager), modifier, z9, false, textStyle, new KeyboardOptions(0, false, l8.f().x(), 0, 11, null), new KeyboardActions(new c(focusManager), null, new d(focusManager), null, null, null, 58, null), true, 0, 0, (VisualTransformation) null, (Function1) null, (MutableInteractionSource) null, (Brush) solidColor, e(str, z8, str2, z9, m8, startRestartGroup, (i9 & 126) | ((i9 >> 21) & 896) | i11 | (57344 & i10)), startRestartGroup, 100663296 | (i10 & 896) | i11 | ((i9 << 9) & 458752), 0, 15888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(str, z8, textStyle, l8, i8, focusManager, modifier, z9, m8, str2, i9));
        }
    }

    private static final InterfaceC1669o e(String str, boolean z8, String str2, boolean z9, M m8, Composer composer, int i8) {
        composer.startReplaceableGroup(1943015148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943015148, i8, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox (OTPElementUI.kt:251)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1095196779, true, new g(m8, str, z9, z8, str2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }
}
