package androidx.activity;

import L5.I;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import l6.AbstractC3360h;
import l6.InterfaceC3359g;

/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, P5.d dVar) {
        Object collect = AbstractC3360h.e(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new InterfaceC3359g() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            @Override // l6.InterfaceC3359g
            public final Object emit(Rect rect, P5.d dVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return I.f6487a;
            }
        }, dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
