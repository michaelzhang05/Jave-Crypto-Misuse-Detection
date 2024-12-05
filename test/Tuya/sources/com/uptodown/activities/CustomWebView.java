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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class CustomWebView extends AbstractActivityC2489a {

    /* renamed from: P, reason: collision with root package name */
    public static final a f28182P = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private String f28183N;

    /* renamed from: O, reason: collision with root package name */
    private String f28184O;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest request) {
            AbstractC3159y.i(request, "request");
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            AbstractC3159y.i(view, "view");
            AbstractC3159y.i(url, "url");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(CustomWebView this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.custom_web_view);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(CampaignEx.JSON_KEY_TITLE)) {
                this.f28183N = extras.getString(CampaignEx.JSON_KEY_TITLE);
            }
            if (extras.containsKey("url")) {
                this.f28184O = extras.getString("url");
            }
        }
        ((ImageView) findViewById(R.id.iv_back_custom_web_view)).setOnClickListener(new View.OnClickListener() { // from class: A4.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomWebView.Z2(CustomWebView.this, view);
            }
        });
        TextView textView = (TextView) findViewById(R.id.tv_title_custom_web_view);
        textView.setTypeface(E4.j.f2274g.u());
        textView.setText(this.f28183N);
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
        String str = this.f28184O;
        if (str != null) {
            AbstractC3159y.f(str);
            webView.loadUrl(str);
        }
    }
}
