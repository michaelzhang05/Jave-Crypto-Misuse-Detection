package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f2272a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f2273b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2274c;

    public a(int i6, g0 g0Var, int i7) {
        this.f2272a = i6;
        this.f2273b = g0Var;
        this.f2274c = i7;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2272a);
        this.f2273b.O(this.f2274c, bundle);
    }
}
