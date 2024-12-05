package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface RemeasurementModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RemeasurementModifier remeasurementModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(remeasurementModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(RemeasurementModifier remeasurementModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(remeasurementModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(RemeasurementModifier remeasurementModifier, R r8, X5.n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(remeasurementModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(RemeasurementModifier remeasurementModifier, R r8, X5.n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(remeasurementModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(RemeasurementModifier remeasurementModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(remeasurementModifier, modifier);
            return a8;
        }
    }

    void onRemeasurementAvailable(Remeasurement remeasurement);
}
