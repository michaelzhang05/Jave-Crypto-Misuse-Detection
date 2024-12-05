package com.uptodown.activities;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.R;
import com.uptodown.activities.CustomWebView;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class CustomWebView extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    public static final a f29264P = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private String f29265N;

    /* renamed from: O, reason: collision with root package name */
    private String f29266O;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest request) {
            AbstractC3255y.i(request, "request");
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            AbstractC3255y.i(view, "view");
            AbstractC3255y.i(url, "url");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(CustomWebView this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.custom_web_view);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(CampaignEx.JSON_KEY_TITLE)) {
                this.f29265N = extras.getString(CampaignEx.JSON_KEY_TITLE);
            }
            if (extras.containsKey("url")) {
                this.f29266O = extras.getString("url");
            }
        }
        ((ImageView) findViewById(R.id.iv_back_custom_web_view)).setOnClickListener(new View.OnClickListener() { // from class: D4.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomWebView.Z2(CustomWebView.this, view);
            }
        });
        TextView textView = (TextView) findViewById(R.id.tv_title_custom_web_view);
        textView.setTypeface(H4.j.f3824g.u());
        textView.setText(this.f29265N);
        WebView webView = (WebView) findViewById(R.id.wv_custom_web_view);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(true);
        webView.setScrollBarStyle(33554432);
        webView.setScrollbarFadingEnabled(true);
        webView.setInitialScale(80);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.setWebViewClient(new b());
        String str = this.f29266O;
        if (str != null) {
            AbstractC3255y.f(str);
            webView.loadUrl(str);
        }
    }
}
