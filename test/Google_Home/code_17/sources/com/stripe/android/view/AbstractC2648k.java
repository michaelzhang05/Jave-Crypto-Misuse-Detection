package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2648k extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2648k(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
    }

    public abstract com.stripe.android.model.p getCreateParams();

    public void setCommunicatingProgress(boolean z8) {
    }
}
