package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p.l;

/* loaded from: classes.dex */
public abstract class i extends b {

    /* renamed from: i, reason: collision with root package name */
    private boolean f1861i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1862j;

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1690a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == h.f1739h1) {
                    this.f1861i = true;
                } else if (index == h.f1788o1) {
                    this.f1862j = true;
                }
            }
        }
    }

    public abstract void n(l lVar, int i6, int i7);

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1861i || this.f1862j) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i6 = 0; i6 < this.f1591b; i6++) {
                View h6 = constraintLayout.h(this.f1590a[i6]);
                if (h6 != null) {
                    if (this.f1861i) {
                        h6.setVisibility(visibility);
                    }
                    if (this.f1862j && elevation > 0.0f) {
                        h6.setTranslationZ(h6.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        c();
    }
}
