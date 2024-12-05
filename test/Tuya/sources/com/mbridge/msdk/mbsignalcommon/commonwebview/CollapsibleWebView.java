package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class CollapsibleWebView extends CommonWebView {

    /* renamed from: e, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.a> f20498e;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.a> f20499f;

    /* renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f20500g;

    /* renamed from: h, reason: collision with root package name */
    private String f20501h;

    /* renamed from: i, reason: collision with root package name */
    private String f20502i;

    /* loaded from: classes4.dex */
    public interface a {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    static /* synthetic */ void a(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f20498e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static /* synthetic */ void b(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f20499f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public String getCollapseIconName() {
        return this.f20501h;
    }

    public String getExpandIconName() {
        return this.f20502i;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f20498e = new CopyOnWriteArrayList<>();
        this.f20499f = new CopyOnWriteArrayList<>();
        this.f20500g = new CopyOnWriteArrayList<>();
        this.f20501h = "mbridge_arrow_down_white_blackbg";
        this.f20502i = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        ToolBar.b bVar = new ToolBar.b("doCollapse");
        bVar.f20543c = false;
        bVar.f20542b = "mbridge_arrow_down_white_blackbg";
        bVar.f20544d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doCollapse");
                CollapsibleWebView.this.showToolBarButton("doSpand");
                CollapsibleWebView.a(CollapsibleWebView.this);
            }
        };
        arrayList.add(bVar);
        ToolBar.b bVar2 = new ToolBar.b("doSpand");
        bVar2.f20542b = "mbridge_arrow_up_black";
        bVar2.f20544d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doSpand");
                CollapsibleWebView.this.showToolBarButton("doCollapse");
                CollapsibleWebView.b(CollapsibleWebView.this);
            }
        };
        arrayList.add(bVar2);
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new CommonWebView.b() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.3
            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.b
            public final void a(String str) {
                CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
                CollapsibleWebView.a(collapsibleWebView, (View) collapsibleWebView.f20512d, str);
            }
        });
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.4

            /* renamed from: a, reason: collision with root package name */
            Boolean f20506a = Boolean.FALSE;

            /* renamed from: b, reason: collision with root package name */
            String f20507b = "";

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                if (!this.f20506a.booleanValue()) {
                    CollapsibleWebView.b(CollapsibleWebView.this, webView, str);
                    this.f20506a = Boolean.FALSE;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (!TextUtils.isEmpty(str)) {
                    this.f20507b = str;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i8, String str, String str2) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", CampaignEx.JSON_NATIVE_VIDEO_ERROR);
                hashMap.put("url", str2);
                hashMap.put("description", str);
                if (!this.f20506a.booleanValue() && this.f20507b.equals(str2)) {
                    this.f20506a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, webView, hashMap);
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, hashMap);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "http");
                String str = webResourceRequest.getUrl() + "";
                hashMap.put("url", str);
                hashMap.put("statusCode", webResourceResponse.getStatusCode() + "");
                hashMap.put("description", "http error");
                if (!this.f20506a.booleanValue() && (this.f20507b.equals(str) || TextUtils.isEmpty(this.f20507b))) {
                    this.f20506a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, webView, hashMap);
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, hashMap);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "ssl");
                hashMap.put("url", sslError.getUrl());
                hashMap.put("description", "ssl error");
                if (!this.f20506a.booleanValue()) {
                    if (this.f20507b.equals(sslError.getUrl() + "")) {
                        this.f20506a = Boolean.TRUE;
                        CollapsibleWebView.a(CollapsibleWebView.this, webView, hashMap);
                    }
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, hashMap);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                ad.b("CollapsibleWebView", "WebView called onRenderProcessGone");
                return true;
            }
        });
    }

    public void setCollapseIconName(String str) {
        this.f20501h = str;
    }

    public void setCollapseListener(CommonWebView.a aVar) {
        this.f20498e.add(aVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i8, int i9, int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20509a.getLayoutParams();
        layoutParams.setMargins(i8, i9, i10, i11);
        this.f20509a.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f20502i = str;
    }

    public void setExpandListener(CommonWebView.a aVar) {
        this.f20499f.add(aVar);
    }

    public void setPageLoadListener(a aVar) {
        this.f20500g.add(aVar);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<a> it = collapsibleWebView.f20500g.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }

    static /* synthetic */ void b(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<a> it = collapsibleWebView.f20500g.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<a> it = collapsibleWebView.f20500g.iterator();
        while (it.hasNext()) {
            it.next().a(view, (Map<String, String>) map);
        }
    }

    static /* synthetic */ void b(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<a> it = collapsibleWebView.f20500g.iterator();
        while (it.hasNext()) {
            it.next().b(view, (Map<String, String>) map);
        }
    }
}
