package androidx.compose.ui.draw;

import X5.n;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface DrawModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawModifier drawModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(drawModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(DrawModifier drawModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(drawModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(DrawModifier drawModifier, R r8, n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(drawModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(DrawModifier drawModifier, R r8, n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(drawModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(DrawModifier drawModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(drawModifier, modifier);
            return a8;
        }
    }

    void draw(ContentDrawScope contentDrawScope);
}
