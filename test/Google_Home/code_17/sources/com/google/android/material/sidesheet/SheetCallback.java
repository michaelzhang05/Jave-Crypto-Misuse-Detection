package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
interface SheetCallback {
    void onSlide(@NonNull View view, float f8);

    void onStateChanged(@NonNull View view, int i8);
}
