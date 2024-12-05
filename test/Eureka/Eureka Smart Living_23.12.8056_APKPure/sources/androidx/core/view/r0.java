package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public abstract class r0 {
    public static boolean a(MotionEvent motionEvent, int i6) {
        return (motionEvent.getSource() & i6) == i6;
    }
}
