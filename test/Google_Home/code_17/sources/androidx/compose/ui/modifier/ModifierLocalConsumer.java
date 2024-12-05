package androidx.compose.ui.modifier;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

@Stable
/* loaded from: classes.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ModifierLocalConsumer modifierLocalConsumer, Function1 function1) {
            return a.a(modifierLocalConsumer, function1);
        }

        @Deprecated
        public static boolean any(ModifierLocalConsumer modifierLocalConsumer, Function1 function1) {
            return a.b(modifierLocalConsumer, function1);
        }

        @Deprecated
        public static <R> R foldIn(ModifierLocalConsumer modifierLocalConsumer, R r8, InterfaceC1668n interfaceC1668n) {
            return (R) a.c(modifierLocalConsumer, r8, interfaceC1668n);
        }

        @Deprecated
        public static <R> R foldOut(ModifierLocalConsumer modifierLocalConsumer, R r8, InterfaceC1668n interfaceC1668n) {
            return (R) a.d(modifierLocalConsumer, r8, interfaceC1668n);
        }

        @Deprecated
        public static Modifier then(ModifierLocalConsumer modifierLocalConsumer, Modifier modifier) {
            return a.e(modifierLocalConsumer, modifier);
        }
    }

    void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope);
}
