package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(@NonNull Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f8, @NonNull Rect rect, @NonNull Rect rect2) {
        this.rect.set(rect.left + ((int) ((rect2.left - r0) * f8)), rect.top + ((int) ((rect2.top - r1) * f8)), rect.right + ((int) ((rect2.right - r2) * f8)), rect.bottom + ((int) ((rect2.bottom - r6) * f8)));
        return this.rect;
    }
}
