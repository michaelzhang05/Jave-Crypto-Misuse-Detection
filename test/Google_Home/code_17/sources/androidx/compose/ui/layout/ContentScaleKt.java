package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4128access$computeFillHeightiLBOSCw(long j8, long j9) {
        return m4132computeFillHeightiLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4129access$computeFillMaxDimensioniLBOSCw(long j8, long j9) {
        return m4133computeFillMaxDimensioniLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4130access$computeFillMinDimensioniLBOSCw(long j8, long j9) {
        return m4134computeFillMinDimensioniLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4131access$computeFillWidthiLBOSCw(long j8, long j9) {
        return m4135computeFillWidthiLBOSCw(j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m4132computeFillHeightiLBOSCw(long j8, long j9) {
        return Size.m2806getHeightimpl(j9) / Size.m2806getHeightimpl(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m4133computeFillMaxDimensioniLBOSCw(long j8, long j9) {
        return Math.max(m4135computeFillWidthiLBOSCw(j8, j9), m4132computeFillHeightiLBOSCw(j8, j9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m4134computeFillMinDimensioniLBOSCw(long j8, long j9) {
        return Math.min(m4135computeFillWidthiLBOSCw(j8, j9), m4132computeFillHeightiLBOSCw(j8, j9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m4135computeFillWidthiLBOSCw(long j8, long j9) {
        return Size.m2809getWidthimpl(j9) / Size.m2809getWidthimpl(j8);
    }
}
