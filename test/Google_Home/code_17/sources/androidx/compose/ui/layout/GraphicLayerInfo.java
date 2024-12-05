package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public interface GraphicLayerInfo {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static long getOwnerViewId(GraphicLayerInfo graphicLayerInfo) {
            long a8;
            a8 = a.a(graphicLayerInfo);
            return a8;
        }
    }

    long getLayerId();

    long getOwnerViewId();
}
