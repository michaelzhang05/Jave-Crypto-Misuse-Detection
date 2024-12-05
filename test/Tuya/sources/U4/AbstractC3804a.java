package u4;

import L5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillNode;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3804a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0888a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AutofillNode f38492a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0888a(AutofillNode autofillNode) {
            super(1);
            this.f38492a = autofillNode;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutCoordinates) obj);
            return I.f6487a;
        }

        public final void invoke(LayoutCoordinates it) {
            AbstractC3159y.i(it, "it");
            this.f38492a.setBoundingBox(LayoutCoordinatesKt.boundsInWindow(it));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AutofillNode f38493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Autofill f38494b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AutofillNode autofillNode, Autofill autofill) {
            super(1);
            this.f38493a = autofillNode;
            this.f38494b = autofill;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return I.f6487a;
        }

        public final void invoke(FocusState focusState) {
            Autofill autofill;
            AbstractC3159y.i(focusState, "focusState");
            if (this.f38493a.getBoundingBox() == null || (autofill = this.f38494b) == null) {
                return;
            }
            AutofillNode autofillNode = this.f38493a;
            if (focusState.isFocused()) {
                autofill.requestAutofillForNode(autofillNode);
            } else {
                autofill.cancelAutofillForNode(autofillNode);
            }
        }
    }

    public static final Modifier a(Modifier modifier, List types, Function1 onFill, Composer composer, int i8) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(types, "types");
        AbstractC3159y.i(onFill, "onFill");
        composer.startReplaceableGroup(-322372817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-322372817, i8, -1, "com.stripe.android.uicore.text.autofill (AutofillModifier.kt:23)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onFill, composer, (i8 >> 6) & 14);
        composer.startReplaceableGroup(-1148860887);
        boolean changed = composer.changed(types);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AutofillNode(types, null, b(rememberUpdatedState), 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        AutofillNode autofillNode = (AutofillNode) rememberedValue;
        composer.endReplaceableGroup();
        Autofill autofill = (Autofill) composer.consume(CompositionLocalsKt.getLocalAutofill());
        ((AutofillTree) composer.consume(CompositionLocalsKt.getLocalAutofillTree())).plusAssign(autofillNode);
        Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new C0888a(autofillNode)), new b(autofillNode, autofill));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return onFocusChanged;
    }

    private static final Function1 b(State state) {
        return (Function1) state.getValue();
    }
}
