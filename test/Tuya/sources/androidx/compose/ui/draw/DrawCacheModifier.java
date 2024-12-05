package androidx.compose.ui.draw;

import X5.n;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface DrawCacheModifier extends DrawModifier {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawCacheModifier drawCacheModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(drawCacheModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(DrawCacheModifier drawCacheModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(drawCacheModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(DrawCacheModifier drawCacheModifier, R r8, n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(drawCacheModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(DrawCacheModifier drawCacheModifier, R r8, n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(drawCacheModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(DrawCacheModifier drawCacheModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(drawCacheModifier, modifier);
            return a8;
        }
    }

    void onBuildCache(BuildDrawCacheParams buildDrawCacheParams);
}
