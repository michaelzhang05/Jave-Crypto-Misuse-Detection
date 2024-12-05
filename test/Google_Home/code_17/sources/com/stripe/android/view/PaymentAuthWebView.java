package com.stripe.android.view;

import A2.y;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentAuthWebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f28515a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28516a = new a();

        a() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5562invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5562invoke();
            return O5.I.f8278a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    private final void a() {
        clearHistory();
        this.f28515a.invoke();
        loadUrl("about:blank");
        onPause();
        removeAllViews();
        destroyDrawingCache();
    }

    private final void b() {
        String c8 = y.d.c(A2.y.f261b, null, 1, null);
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        if (userAgentString == null) {
            userAgentString = "";
        }
        settings.setUserAgentString(userAgentString + " [" + c8 + "]");
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(false);
        getSettings().setDomStorageEnabled(true);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        a();
        super.destroy();
    }

    public final Function0 getOnLoadBlank$payments_core_release() {
        return this.f28515a;
    }

    public final void setOnLoadBlank$payments_core_release(Function0 function0) {
        AbstractC3255y.i(function0, "<set-?>");
        this.f28515a = function0;
    }

    public /* synthetic */ PaymentAuthWebView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f28515a = a.f28516a;
        b();
    }
}
