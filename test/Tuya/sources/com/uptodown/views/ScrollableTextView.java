package com.uptodown.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.AbstractC3159y;
import p5.AbstractC3611i;

/* loaded from: classes5.dex */
public final class ScrollableTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC3159y.i(context, "context");
        if (getText().toString().length() > 0) {
            AbstractC3611i.d(this);
            AbstractC3611i.b(this);
        }
    }
}
