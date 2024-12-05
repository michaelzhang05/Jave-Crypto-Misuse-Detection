package androidx.compose.ui;

import X5.o;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ComposedModifierKt {
    public static final Modifier composed(Modifier modifier, Function1 function1, o oVar) {
        return modifier.then(new ComposedModifier(function1, oVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, Function1 function1, o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, function1, oVar);
    }

    public static final Modifier materializeModifier(Composer composer, Modifier modifier) {
        if (modifier.all(ComposedModifierKt$materialize$1.INSTANCE)) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new ComposedModifierKt$materialize$result$1(composer));
        composer.endReplaceableGroup();
        return modifier2;
    }

    public static final Modifier materializeWithCompositionLocalInjectionInternal(Composer composer, Modifier modifier) {
        if (modifier != Modifier.Companion) {
            return materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
        }
        return modifier;
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, Function1 function1, o oVar) {
        return modifier.then(new KeyedComposedModifier1(str, obj, function1, oVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Function1 function1, o oVar, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, function1, oVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Function1 function1, o oVar) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, function1, oVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Function1 function1, o oVar, int i8, Object obj3) {
        if ((i8 & 8) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, function1, oVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, Function1 function1, o oVar) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, function1, oVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, Function1 function1, o oVar, int i8, Object obj4) {
        if ((i8 & 16) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, function1, oVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, Function1 function1, o oVar) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, function1, oVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, Function1 function1, o oVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, function1, oVar);
    }
}
