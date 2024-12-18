package com.google.android.material.slider;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface BaseOnSliderTouchListener<S> {
    void onStartTrackingTouch(@NonNull S s8);

    void onStopTrackingTouch(@NonNull S s8);
}
