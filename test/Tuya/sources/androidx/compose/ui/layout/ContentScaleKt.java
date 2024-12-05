package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4123access$computeFillHeightiLBOSCw(long j8, long j9) {
        return m4127computeFillHeightiLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4124access$computeFillMaxDimensioniLBOSCw(long j8, long j9) {
        return m4128computeFillMaxDimensioniLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4125access$computeFillMinDimensioniLBOSCw(long j8, long j9) {
        return m4129computeFillMinDimensioniLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4126access$computeFillWidthiLBOSCw(long j8, long j9) {
        return m4130computeFillWidthiLBOSCw(j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m4127computeFillHeightiLBOSCw(long j8, long j9) {
        return Size.m2801getHeightimpl(j9) / Size.m2801getHeightimpl(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m4128computeFillMaxDimensioniLBOSCw(long j8, long j9) {
        return Math.max(m4130computeFillWidthiLBOSCw(j8, j9), m4127computeFillHeightiLBOSCw(j8, j9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m4129computeFillMinDimensioniLBOSCw(long j8, long j9) {
        return Math.min(m4130computeFillWidthiLBOSCw(j8, j9), m4127computeFillHeightiLBOSCw(j8, j9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m4130computeFillWidthiLBOSCw(long j8, long j9) {
        return Size.m2804getWidthimpl(j9) / Size.m2804getWidthimpl(j8);
    }
}
