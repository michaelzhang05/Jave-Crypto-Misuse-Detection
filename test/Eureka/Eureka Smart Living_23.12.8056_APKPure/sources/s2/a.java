package s2;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f9246a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9247b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9248c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9249d;

    public a(Dialog dialog, Rect rect) {
        this.f9246a = dialog;
        this.f9247b = rect.left;
        this.f9248c = rect.top;
        this.f9249d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f9247b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f9248c + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i6 = this.f9249d;
            obtain.setLocation((-i6) - 1, (-i6) - 1);
        }
        view.performClick();
        return this.f9246a.onTouchEvent(obtain);
    }
}
