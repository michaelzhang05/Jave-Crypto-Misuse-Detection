package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface ViewRootForInspector {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static AbstractComposeView getSubCompositionView(ViewRootForInspector viewRootForInspector) {
            AbstractComposeView a8;
            a8 = a1.a(viewRootForInspector);
            return a8;
        }

        @Deprecated
        public static View getViewRoot(ViewRootForInspector viewRootForInspector) {
            View b8;
            b8 = a1.b(viewRootForInspector);
            return b8;
        }
    }

    AbstractComposeView getSubCompositionView();

    View getViewRoot();
}
