package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface OnRemeasuredModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnRemeasuredModifier onRemeasuredModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(onRemeasuredModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(OnRemeasuredModifier onRemeasuredModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(onRemeasuredModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(OnRemeasuredModifier onRemeasuredModifier, R r8, X5.n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(onRemeasuredModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(OnRemeasuredModifier onRemeasuredModifier, R r8, X5.n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(onRemeasuredModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(OnRemeasuredModifier onRemeasuredModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(onRemeasuredModifier, modifier);
            return a8;
        }
    }

    /* renamed from: onRemeasured-ozmzZPI */
    void mo376onRemeasuredozmzZPI(long j8);
}
