package androidx.compose.ui.platform;

import f6.InterfaceC2680g;

/* loaded from: classes.dex */
public interface InspectableValue {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static InterfaceC2680g getInspectableElements(InspectableValue inspectableValue) {
            InterfaceC2680g a8;
            a8 = K.a(inspectableValue);
            return a8;
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            String b8;
            b8 = K.b(inspectableValue);
            return b8;
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            Object c8;
            c8 = K.c(inspectableValue);
            return c8;
        }
    }

    InterfaceC2680g getInspectableElements();

    String getNameFallback();

    Object getValueOverride();
}
