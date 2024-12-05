package androidx.compose.ui.semantics;

import X5.n;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface SemanticsModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, Function1 function1) {
            boolean a8;
            a8 = b.a(semanticsModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, Function1 function1) {
            boolean b8;
            b8 = b.b(semanticsModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r8, n nVar) {
            Object c8;
            c8 = b.c(semanticsModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r8, n nVar) {
            Object d8;
            d8 = b.d(semanticsModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            int a8;
            a8 = a.a(semanticsModifier);
            return a8;
        }

        public static /* synthetic */ void getId$annotations() {
        }

        @Deprecated
        public static Modifier then(SemanticsModifier semanticsModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(semanticsModifier, modifier);
            return a8;
        }
    }

    int getId();

    SemanticsConfiguration getSemanticsConfiguration();
}
