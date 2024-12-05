package androidx.core.view.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f, reason: collision with root package name */
    private final int f989f;

    /* renamed from: g, reason: collision with root package name */
    private final c f990g;

    /* renamed from: h, reason: collision with root package name */
    private final int f991h;

    public a(int i2, c cVar, int i3) {
        this.f989f = i2;
        this.f990g = cVar;
        this.f991h = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f989f);
        this.f990g.O(this.f991h, bundle);
    }
}
