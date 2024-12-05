package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface ParentDataModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(parentDataModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(ParentDataModifier parentDataModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(parentDataModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r8, X5.n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(parentDataModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier parentDataModifier, R r8, X5.n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(parentDataModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(parentDataModifier, modifier);
            return a8;
        }
    }

    Object modifyParentData(Density density, Object obj);
}
