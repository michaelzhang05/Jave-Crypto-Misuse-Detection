package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.a0;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements a0 {

    /* renamed from: f, reason: collision with root package name */
    private a0.a f389f;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        a0.a aVar = this.f389f;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.a0
    public void setOnFitSystemWindowsListener(a0.a aVar) {
        this.f389f = aVar;
    }
}
