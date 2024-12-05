package androidx.activity;

import O5.I;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import o6.AbstractC3708h;
import o6.InterfaceC3707g;

/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, S5.d dVar) {
        Object collect = AbstractC3708h.e(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new InterfaceC3707g() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            @Override // o6.InterfaceC3707g
            public final Object emit(Rect rect, S5.d dVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return I.f8278a;
            }
        }, dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
