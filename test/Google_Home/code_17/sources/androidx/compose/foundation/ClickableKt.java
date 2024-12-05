package androidx.compose.foundation;

import O5.I;
import S5.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.M;
import l6.N;

/* loaded from: classes.dex */
public final class ClickableKt {
    /* renamed from: clickable-O2vRcR0 */
    public static final Modifier m317clickableO2vRcR0(Modifier clickable, MutableInteractionSource interactionSource, Indication indication, boolean z8, String str, Role role, Function0 onClick) {
        Function1 noInspectorInfo;
        AbstractC3255y.i(clickable, "$this$clickable");
        AbstractC3255y.i(interactionSource, "interactionSource");
        AbstractC3255y.i(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1(interactionSource, indication, z8, str, role, onClick);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(clickable, noInspectorInfo, FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(Modifier.Companion, interactionSource, indication), interactionSource, z8), z8, interactionSource).then(new ClickableElement(interactionSource, z8, str, role, onClick, null)));
    }

    /* renamed from: clickable-O2vRcR0$default */
    public static /* synthetic */ Modifier m318clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z8, String str, Role role, Function0 function0, int i8, Object obj) {
        boolean z9;
        String str2;
        Role role2;
        if ((i8 & 4) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i8 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i8 & 16) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        return m317clickableO2vRcR0(modifier, mutableInteractionSource, indication, z9, str2, role2, function0);
    }

    /* renamed from: clickable-XHw0xAI */
    public static final Modifier m319clickableXHw0xAI(Modifier clickable, boolean z8, String str, Role role, Function0 onClick) {
        Function1 noInspectorInfo;
        AbstractC3255y.i(clickable, "$this$clickable");
        AbstractC3255y.i(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z8, str, role, onClick);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(clickable, noInspectorInfo, new ClickableKt$clickable$2(z8, str, role, onClick));
    }

    /* renamed from: clickable-XHw0xAI$default */
    public static /* synthetic */ Modifier m320clickableXHw0xAI$default(Modifier modifier, boolean z8, String str, Role role, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            role = null;
        }
        return m319clickableXHw0xAI(modifier, z8, str, role, function0);
    }

    @ExperimentalFoundationApi
    /* renamed from: combinedClickable-XVZzFYc */
    public static final Modifier m321combinedClickableXVZzFYc(Modifier combinedClickable, MutableInteractionSource interactionSource, Indication indication, boolean z8, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 onClick) {
        Function1 noInspectorInfo;
        AbstractC3255y.i(combinedClickable, "$this$combinedClickable");
        AbstractC3255y.i(interactionSource, "interactionSource");
        AbstractC3255y.i(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ClickableKt$combinedClickableXVZzFYc$$inlined$debugInspectorInfo$1(indication, interactionSource, z8, str, role, onClick, function02, function0, str2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(combinedClickable, noInspectorInfo, FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(Modifier.Companion, interactionSource, indication), interactionSource, z8), z8, interactionSource).then(new CombinedClickableElement(interactionSource, z8, str, role, onClick, str2, function0, function02, null)));
    }

    /* renamed from: combinedClickable-XVZzFYc$default */
    public static /* synthetic */ Modifier m322combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z8, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, int i8, Object obj) {
        boolean z9;
        String str3;
        Role role2;
        String str4;
        Function0 function04;
        Function0 function05;
        if ((i8 & 4) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i8 & 8) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i8 & 16) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        if ((i8 & 32) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i8 & 64) != 0) {
            function04 = null;
        } else {
            function04 = function0;
        }
        if ((i8 & 128) != 0) {
            function05 = null;
        } else {
            function05 = function02;
        }
        return m321combinedClickableXVZzFYc(modifier, mutableInteractionSource, indication, z9, str3, role2, str4, function04, function05, function03);
    }

    @ExperimentalFoundationApi
    /* renamed from: combinedClickable-cJG_KMw */
    public static final Modifier m323combinedClickablecJG_KMw(Modifier combinedClickable, boolean z8, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 onClick) {
        Function1 noInspectorInfo;
        AbstractC3255y.i(combinedClickable, "$this$combinedClickable");
        AbstractC3255y.i(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1(z8, str, role, onClick, function02, function0, str2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(combinedClickable, noInspectorInfo, new ClickableKt$combinedClickable$2(z8, str, role, str2, function0, function02, onClick));
    }

    /* renamed from: combinedClickable-cJG_KMw$default */
    public static /* synthetic */ Modifier m324combinedClickablecJG_KMw$default(Modifier modifier, boolean z8, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, int i8, Object obj) {
        boolean z9;
        String str3;
        Role role2;
        String str4;
        Function0 function04;
        Function0 function05;
        if ((i8 & 1) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i8 & 2) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i8 & 4) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        if ((i8 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i8 & 16) != 0) {
            function04 = null;
        } else {
            function04 = function0;
        }
        if ((i8 & 32) != 0) {
            function05 = null;
        } else {
            function05 = function02;
        }
        return m323combinedClickablecJG_KMw(modifier, z9, str3, role2, str4, function04, function05, function03);
    }

    /* renamed from: genericClickableWithoutGesture-Kqv-Bsg */
    public static final Modifier m325genericClickableWithoutGestureKqvBsg(Modifier genericClickableWithoutGesture, MutableInteractionSource interactionSource, Indication indication, M indicationScope, Map<Key, PressInteraction.Press> currentKeyPressInteractions, State<Offset> keyClickOffset, boolean z8, String str, Role role, String str2, Function0 function0, Function0 onClick) {
        AbstractC3255y.i(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        AbstractC3255y.i(interactionSource, "interactionSource");
        AbstractC3255y.i(indicationScope, "indicationScope");
        AbstractC3255y.i(currentKeyPressInteractions, "currentKeyPressInteractions");
        AbstractC3255y.i(keyClickOffset, "keyClickOffset");
        AbstractC3255y.i(onClick, "onClick");
        return genericClickableWithoutGesture.then(FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(new ClickableSemanticsElement(z8, role, str2, function0, str, onClick, null), z8, currentKeyPressInteractions, keyClickOffset, indicationScope, onClick, interactionSource), interactionSource, indication), interactionSource, z8), z8, interactionSource));
    }

    /* renamed from: genericClickableWithoutGesture-Kqv-Bsg$default */
    public static /* synthetic */ Modifier m326genericClickableWithoutGestureKqvBsg$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, M m8, Map map, State state, boolean z8, String str, Role role, String str2, Function0 function0, Function0 function02, int i8, Object obj) {
        boolean z9;
        String str3;
        Role role2;
        String str4;
        Function0 function03;
        if ((i8 & 32) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i8 & 64) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i8 & 128) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        if ((i8 & 256) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i8 & 512) != 0) {
            function03 = null;
        } else {
            function03 = function0;
        }
        return m325genericClickableWithoutGestureKqvBsg(modifier, mutableInteractionSource, indication, m8, map, state, z9, str3, role2, str4, function03, function02);
    }

    private static final Modifier genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(Modifier modifier, boolean z8, Map<Key, PressInteraction.Press> map, State<Offset> state, M m8, Function0 function0, MutableInteractionSource mutableInteractionSource) {
        return KeyInputModifierKt.onKeyEvent(modifier, new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1(z8, map, state, m8, function0, mutableInteractionSource));
    }

    /* renamed from: handlePressInteraction-EPk0efs */
    public static final Object m327handlePressInteractionEPk0efs(PressGestureScope pressGestureScope, long j8, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, Function0 function0, d dVar) {
        Object e8 = N.e(new ClickableKt$handlePressInteraction$2(pressGestureScope, j8, mutableInteractionSource, interactionData, function0, null), dVar);
        if (e8 == T5.b.e()) {
            return e8;
        }
        return I.f8278a;
    }
}
