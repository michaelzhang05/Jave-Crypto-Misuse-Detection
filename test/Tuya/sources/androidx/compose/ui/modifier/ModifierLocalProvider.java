package androidx.compose.ui.modifier;

import X5.n;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

@Stable
/* loaded from: classes.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> modifierLocalProvider, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(modifierLocalProvider, function1);
            return a8;
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> modifierLocalProvider, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(modifierLocalProvider, function1);
            return b8;
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> modifierLocalProvider, R r8, n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(modifierLocalProvider, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> modifierLocalProvider, R r8, n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(modifierLocalProvider, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> modifierLocalProvider, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(modifierLocalProvider, modifier);
            return a8;
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();
}
