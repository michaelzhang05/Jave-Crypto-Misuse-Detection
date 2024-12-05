package m0;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes.dex */
class j implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private Rect f7469a;

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f6, Rect rect, Rect rect2) {
        int i6 = rect.left + ((int) ((rect2.left - r0) * f6));
        int i7 = rect.top + ((int) ((rect2.top - r1) * f6));
        int i8 = rect.right + ((int) ((rect2.right - r2) * f6));
        int i9 = rect.bottom + ((int) ((rect2.bottom - r6) * f6));
        Rect rect3 = this.f7469a;
        if (rect3 == null) {
            return new Rect(i6, i7, i8, i9);
        }
        rect3.set(i6, i7, i8, i9);
        return this.f7469a;
    }
}
