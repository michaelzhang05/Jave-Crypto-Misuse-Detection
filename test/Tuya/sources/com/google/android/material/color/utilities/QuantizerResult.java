package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class QuantizerResult {
    public final Map<Integer, Integer> colorToCount;

    /* JADX INFO: Access modifiers changed from: package-private */
    public QuantizerResult(Map<Integer, Integer> map) {
        this.colorToCount = map;
    }
}
