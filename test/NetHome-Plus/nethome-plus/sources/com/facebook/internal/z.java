package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.reviews.RateAndReviewsFragment;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WebDialog.java */
/* loaded from: classes.dex */
public class z extends Dialog {

    /* renamed from: f, reason: collision with root package name */
    private static final int f9241f = com.facebook.common.e.a;

    /* renamed from: g, reason: collision with root package name */
    private static volatile int f9242g;

    /* renamed from: h, reason: collision with root package name */
    private String f9243h;

    /* renamed from: i, reason: collision with root package name */
    private String f9244i;

    /* renamed from: j, reason: collision with root package name */
    private g f9245j;

    /* renamed from: k, reason: collision with root package name */
    private WebView f9246k;
    private ProgressDialog l;
    private ImageView m;
    private FrameLayout n;
    private h o;
    private boolean p;
    private boolean q;
    private boolean r;
    private WindowManager.LayoutParams s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebDialog.java */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            z.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebDialog.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                z.this.cancel();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebDialog.java */
    /* loaded from: classes.dex */
    public class c extends WebView {
        c(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebDialog.java */
    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebDialog.java */
    /* loaded from: classes.dex */
    public class f extends WebViewClient {
        private f() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!z.this.q) {
                z.this.l.dismiss();
            }
            z.this.n.setBackgroundColor(0);
            z.this.f9246k.setVisibility(0);
            z.this.m.setVisibility(0);
            z.this.r = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            x.V("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (z.this.q) {
                return;
            }
            z.this.l.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            z.this.t(new FacebookDialogException(str, i2, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            z.this.t(new FacebookDialogException(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                com.facebook.internal.x.V(r0, r6)
                com.facebook.internal.z r6 = com.facebook.internal.z.this
                java.lang.String r6 = com.facebook.internal.z.a(r6)
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto La6
                com.facebook.internal.z r6 = com.facebook.internal.z.this
                android.os.Bundle r6 = r6.r(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L37
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L37:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L45
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L45:
                if (r1 != 0) goto L4d
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L4d:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = com.facebook.internal.x.Q(r2)
                r4 = -1
                if (r3 != 0) goto L5f
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L5f
                goto L60
            L5f:
                r2 = -1
            L60:
                boolean r3 = com.facebook.internal.x.Q(r7)
                if (r3 == 0) goto L74
                boolean r3 = com.facebook.internal.x.Q(r1)
                if (r3 == 0) goto L74
                if (r2 != r4) goto L74
                com.facebook.internal.z r7 = com.facebook.internal.z.this
                r7.u(r6)
                goto La5
            L74:
                if (r7 == 0) goto L8c
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L86
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L8c
            L86:
                com.facebook.internal.z r6 = com.facebook.internal.z.this
                r6.cancel()
                goto La5
            L8c:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L96
                com.facebook.internal.z r6 = com.facebook.internal.z.this
                r6.cancel()
                goto La5
            L96:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                com.facebook.internal.z r7 = com.facebook.internal.z.this
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r6, r1)
                r7.t(r2)
            La5:
                return r0
            La6:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto Lb4
                com.facebook.internal.z r6 = com.facebook.internal.z.this
                r6.cancel()
                return r0
            Lb4:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto Lbe
                return r1
            Lbe:
                com.facebook.internal.z r6 = com.facebook.internal.z.this     // Catch: android.content.ActivityNotFoundException -> Ld3
                android.content.Context r6 = r6.getContext()     // Catch: android.content.ActivityNotFoundException -> Ld3
                android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> Ld3
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: android.content.ActivityNotFoundException -> Ld3
                r2.<init>(r3, r7)     // Catch: android.content.ActivityNotFoundException -> Ld3
                r6.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> Ld3
                return r0
            Ld3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.z.f.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        /* synthetic */ f(z zVar, a aVar) {
            this();
        }
    }

    /* compiled from: WebDialog.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(Bundle bundle, FacebookException facebookException);
    }

    /* compiled from: WebDialog.java */
    /* loaded from: classes.dex */
    private class h extends AsyncTask<Void, Void, String[]> {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private Bundle f9257b;

        /* renamed from: c, reason: collision with root package name */
        private Exception[] f9258c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WebDialog.java */
        /* loaded from: classes.dex */
        public class a implements GraphRequest.f {
            final /* synthetic */ String[] a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f9260b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CountDownLatch f9261c;

            a(String[] strArr, int i2, CountDownLatch countDownLatch) {
                this.a = strArr;
                this.f9260b = i2;
                this.f9261c = countDownLatch;
            }

            @Override // com.facebook.GraphRequest.f
            public void b(com.facebook.i iVar) {
                FacebookRequestError g2;
                String str;
                try {
                    g2 = iVar.g();
                    str = "Error staging photo.";
                } catch (Exception e2) {
                    h.this.f9258c[this.f9260b] = e2;
                }
                if (g2 != null) {
                    String d2 = g2.d();
                    if (d2 != null) {
                        str = d2;
                    }
                    throw new FacebookGraphResponseException(iVar, str);
                }
                JSONObject h2 = iVar.h();
                if (h2 != null) {
                    String optString = h2.optString(DeepLinkIntentReceiver.DeepLinksKeys.URI);
                    if (optString != null) {
                        this.a[this.f9260b] = optString;
                        this.f9261c.countDown();
                        return;
                    }
                    throw new FacebookException("Error staging photo.");
                }
                throw new FacebookException("Error staging photo.");
            }
        }

        h(String str, Bundle bundle) {
            this.a = str;
            this.f9257b = bundle;
        }

        protected String[] b(Void... voidArr) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return null;
            }
            try {
                String[] stringArray = this.f9257b.getStringArray("media");
                String[] strArr = new String[stringArray.length];
                this.f9258c = new Exception[stringArray.length];
                CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken g2 = AccessToken.g();
                for (int i2 = 0; i2 < stringArray.length; i2++) {
                    try {
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((AsyncTask) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri parse = Uri.parse(stringArray[i2]);
                        if (x.S(parse)) {
                            strArr[i2] = parse.toString();
                            countDownLatch.countDown();
                        } else {
                            concurrentLinkedQueue.add(com.facebook.share.internal.b.b(g2, parse, new a(strArr, i2, countDownLatch)).i());
                        }
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((AsyncTask) it2.next()).cancel(true);
                        }
                        return null;
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
                return null;
            }
        }

        protected void c(String[] strArr) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                z.this.l.dismiss();
                for (Exception exc : this.f9258c) {
                    if (exc != null) {
                        z.this.t(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    z.this.t(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                List asList = Arrays.asList(strArr);
                if (asList.contains(null)) {
                    z.this.t(new FacebookException("Failed to stage photos for web dialog"));
                    return;
                }
                x.b0(this.f9257b, "media", new JSONArray((Collection) asList));
                z.this.f9243h = x.e(v.b(), com.facebook.f.o() + "/dialog/" + this.a, this.f9257b).toString();
                z.this.x((z.this.m.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return null;
            }
            try {
                return b(voidArr);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                c(strArr);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z(Context context, String str) {
        this(context, str, l());
    }

    private void j() {
        ImageView imageView = new ImageView(getContext());
        this.m = imageView;
        imageView.setOnClickListener(new b());
        this.m.setImageDrawable(getContext().getResources().getDrawable(com.facebook.common.a.a));
        this.m.setVisibility(4);
    }

    private int k(int i2, float f2, int i3, int i4) {
        int i5 = (int) (i2 / f2);
        double d2 = 0.5d;
        if (i5 <= i3) {
            d2 = 1.0d;
        } else if (i5 < i4) {
            double d3 = i4 - i5;
            double d4 = i4 - i3;
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = 0.5d + ((d3 / d4) * 0.5d);
        }
        double d5 = i2;
        Double.isNaN(d5);
        return (int) (d5 * d2);
    }

    public static int l() {
        y.k();
        return f9242g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void n(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || f9242g != 0) {
                return;
            }
            y(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static z q(Context context, String str, Bundle bundle, int i2, g gVar) {
        n(context);
        return new z(context, str, bundle, i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void x(int i2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        c cVar = new c(getContext());
        this.f9246k = cVar;
        cVar.setVerticalScrollBarEnabled(false);
        this.f9246k.setHorizontalScrollBarEnabled(false);
        this.f9246k.setWebViewClient(new f(this, null));
        this.f9246k.getSettings().setJavaScriptEnabled(true);
        this.f9246k.loadUrl(this.f9243h);
        this.f9246k.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f9246k.setVisibility(4);
        this.f9246k.getSettings().setSavePassword(false);
        this.f9246k.getSettings().setSaveFormData(false);
        this.f9246k.setFocusable(true);
        this.f9246k.setFocusableInTouchMode(true);
        this.f9246k.setOnTouchListener(new d());
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.f9246k);
        linearLayout.setBackgroundColor(-872415232);
        this.n.addView(linearLayout);
    }

    public static void y(int i2) {
        if (i2 == 0) {
            i2 = f9241f;
        }
        f9242g = i2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f9245j == null || this.p) {
            return;
        }
        t(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f9246k;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.q && (progressDialog = this.l) != null && progressDialog.isShowing()) {
            this.l.dismiss();
        }
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WebView m() {
        return this.f9246k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o() {
        return this.p;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        this.q = false;
        if (x.Z(getContext()) && (layoutParams = this.s) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            x.V("FacebookSDK.WebDialog", "Set token on onAttachedToWindow(): " + this.s.token);
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.l = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.l.setMessage(getContext().getString(com.facebook.common.d.f9067d));
        this.l.setCanceledOnTouchOutside(false);
        this.l.setOnCancelListener(new a());
        requestWindowFeature(1);
        this.n = new FrameLayout(getContext());
        s();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        j();
        if (this.f9243h != null) {
            x((this.m.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.n.addView(this.m, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.n);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.q = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            cancel();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        h hVar = this.o;
        if (hVar != null && hVar.getStatus() == AsyncTask.Status.PENDING) {
            this.o.execute(new Void[0]);
            this.l.show();
        } else {
            s();
        }
    }

    @Override // android.app.Dialog
    protected void onStop() {
        h hVar = this.o;
        if (hVar != null) {
            hVar.cancel(true);
            this.l.dismiss();
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.s = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p() {
        return this.r;
    }

    protected Bundle r(String str) {
        Uri parse = Uri.parse(str);
        Bundle a0 = x.a0(parse.getQuery());
        a0.putAll(x.a0(parse.getFragment()));
        return a0;
    }

    public void s() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        int i4 = i2 < i3 ? i2 : i3;
        if (i2 < i3) {
            i2 = i3;
        }
        getWindow().setLayout(Math.min(k(i4, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(k(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    protected void t(Throwable th) {
        FacebookException facebookException;
        if (this.f9245j == null || this.p) {
            return;
        }
        this.p = true;
        if (th instanceof FacebookException) {
            facebookException = (FacebookException) th;
        } else {
            facebookException = new FacebookException(th);
        }
        this.f9245j.a(null, facebookException);
        dismiss();
    }

    protected void u(Bundle bundle) {
        g gVar = this.f9245j;
        if (gVar == null || this.p) {
            return;
        }
        this.p = true;
        gVar.a(bundle, null);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v(String str) {
        this.f9244i = str;
    }

    public void w(g gVar) {
        this.f9245j = gVar;
    }

    private z(Context context, String str, int i2) {
        super(context, i2 == 0 ? l() : i2);
        this.f9244i = "fbconnect://success";
        this.p = false;
        this.q = false;
        this.r = false;
        this.f9243h = str;
    }

    /* compiled from: WebDialog.java */
    /* loaded from: classes.dex */
    public static class e {
        private Context a;

        /* renamed from: b, reason: collision with root package name */
        private String f9251b;

        /* renamed from: c, reason: collision with root package name */
        private String f9252c;

        /* renamed from: d, reason: collision with root package name */
        private int f9253d;

        /* renamed from: e, reason: collision with root package name */
        private g f9254e;

        /* renamed from: f, reason: collision with root package name */
        private Bundle f9255f;

        /* renamed from: g, reason: collision with root package name */
        private AccessToken f9256g;

        public e(Context context, String str, Bundle bundle) {
            this.f9256g = AccessToken.g();
            if (!AccessToken.t()) {
                String z = x.z(context);
                if (z != null) {
                    this.f9251b = z;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            b(context, str, bundle);
        }

        private void b(Context context, String str, Bundle bundle) {
            this.a = context;
            this.f9252c = str;
            if (bundle != null) {
                this.f9255f = bundle;
            } else {
                this.f9255f = new Bundle();
            }
        }

        public z a() {
            AccessToken accessToken = this.f9256g;
            if (accessToken != null) {
                this.f9255f.putString(RateAndReviewsFragment.BundleCons.APP_ID, accessToken.f());
                this.f9255f.putString("access_token", this.f9256g.r());
            } else {
                this.f9255f.putString(RateAndReviewsFragment.BundleCons.APP_ID, this.f9251b);
            }
            return z.q(this.a, this.f9252c, this.f9255f, this.f9253d, this.f9254e);
        }

        public String c() {
            return this.f9251b;
        }

        public Context d() {
            return this.a;
        }

        public g e() {
            return this.f9254e;
        }

        public Bundle f() {
            return this.f9255f;
        }

        public int g() {
            return this.f9253d;
        }

        public e h(g gVar) {
            this.f9254e = gVar;
            return this;
        }

        public e(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? x.z(context) : str;
            y.j(str, "applicationId");
            this.f9251b = str;
            b(context, str2, bundle);
        }
    }

    private z(Context context, String str, Bundle bundle, int i2, g gVar) {
        super(context, i2 == 0 ? l() : i2);
        this.f9244i = "fbconnect://success";
        this.p = false;
        this.q = false;
        this.r = false;
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = x.L(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f9244i = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", com.facebook.f.f());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", com.facebook.f.t()));
        this.f9245j = gVar;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.o = new h(str, bundle);
            return;
        }
        this.f9243h = x.e(v.b(), com.facebook.f.o() + "/dialog/" + str, bundle).toString();
    }
}
