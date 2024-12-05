package com.getcapacitor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.core.content.FileProvider;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private androidx.activity.result.c f4264a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.activity.result.c f4265b;

    /* renamed from: c, reason: collision with root package name */
    private b f4266c;

    /* renamed from: d, reason: collision with root package name */
    private a f4267d;

    /* renamed from: e, reason: collision with root package name */
    private h f4268e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        void a(androidx.activity.result.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        void a(Boolean bool);
    }

    public a0(h hVar) {
        this.f4268e = hVar;
        this.f4264a = hVar.l0(new c.b(), new androidx.activity.result.b() { // from class: com.getcapacitor.l
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                a0.this.v((Map) obj);
            }
        });
        this.f4265b = hVar.l0(new c.c(), new androidx.activity.result.b() { // from class: com.getcapacitor.m
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                a0.this.w((androidx.activity.result.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(JsResult jsResult, DialogInterface dialogInterface, int i6) {
        dialogInterface.dismiss();
        jsResult.confirm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(JsResult jsResult, DialogInterface dialogInterface, int i6) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(JsResult jsResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(JsPromptResult jsPromptResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsPromptResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(EditText editText, JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i6) {
        dialogInterface.dismiss();
        jsPromptResult.confirm(editText.getText().toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i6) {
        dialogInterface.dismiss();
        jsPromptResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(PermissionRequest permissionRequest, Boolean bool) {
        if (bool.booleanValue()) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            permissionRequest.deny();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, boolean z5, Boolean bool) {
        if (bool.booleanValue()) {
            N(valueCallback, fileChooserParams, z5);
        } else {
            l0.o(l0.k("FileChooser"), "Camera permission not granted");
            valueCallback.onReceiveValue(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(ValueCallback valueCallback, androidx.activity.result.a aVar) {
        Uri[] parseResult;
        Intent a6 = aVar.a();
        if (aVar.b() != -1 || a6.getClipData() == null) {
            parseResult = WebChromeClient.FileChooserParams.parseResult(aVar.b(), a6);
        } else {
            int itemCount = a6.getClipData().getItemCount();
            parseResult = new Uri[itemCount];
            for (int i6 = 0; i6 < itemCount; i6++) {
                parseResult[i6] = a6.getClipData().getItemAt(i6).getUri();
            }
        }
        valueCallback.onReceiveValue(parseResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(Uri uri, ValueCallback valueCallback, androidx.activity.result.a aVar) {
        valueCallback.onReceiveValue(aVar.b() == -1 ? new Uri[]{uri} : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(ValueCallback valueCallback, androidx.activity.result.a aVar) {
        valueCallback.onReceiveValue(aVar.b() == -1 ? new Uri[]{aVar.a().getData()} : null);
    }

    private void L(final ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent = fileChooserParams.createIntent();
        if (fileChooserParams.getMode() == 1) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (fileChooserParams.getAcceptTypes().length > 1 || createIntent.getType().startsWith(".")) {
            String[] s5 = s(fileChooserParams.getAcceptTypes());
            createIntent.putExtra("android.intent.extra.MIME_TYPES", s5);
            if (createIntent.getType().startsWith(".")) {
                createIntent.setType(s5[0]);
            }
        }
        try {
            this.f4267d = new a() { // from class: com.getcapacitor.p
                @Override // com.getcapacitor.a0.a
                public final void a(androidx.activity.result.a aVar) {
                    a0.I(valueCallback, aVar);
                }
            };
            this.f4265b.a(createIntent);
        } catch (ActivityNotFoundException unused) {
            valueCallback.onReceiveValue(null);
        }
    }

    private boolean M(final ValueCallback valueCallback) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.f4268e.j().getPackageManager()) == null) {
            return false;
        }
        try {
            final Uri r5 = r();
            intent.putExtra("output", r5);
            this.f4267d = new a() { // from class: com.getcapacitor.o
                @Override // com.getcapacitor.a0.a
                public final void a(androidx.activity.result.a aVar) {
                    a0.J(r5, valueCallback, aVar);
                }
            };
            this.f4265b.a(intent);
            return true;
        } catch (Exception e6) {
            l0.c("Unable to create temporary media capture file: " + e6.getMessage());
            return false;
        }
    }

    private void N(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, boolean z5) {
        if ((z5 && (Build.VERSION.SDK_INT >= 24)) ? O(valueCallback) : M(valueCallback)) {
            return;
        }
        l0.o(l0.k("FileChooser"), "Media capture intent could not be launched. Falling back to default file picker.");
        L(valueCallback, fileChooserParams);
    }

    private boolean O(final ValueCallback valueCallback) {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (intent.resolveActivity(this.f4268e.j().getPackageManager()) == null) {
            return false;
        }
        this.f4267d = new a() { // from class: com.getcapacitor.q
            @Override // com.getcapacitor.a0.a
            public final void a(androidx.activity.result.a aVar) {
                a0.K(valueCallback, aVar);
            }
        };
        this.f4265b.a(intent);
        return true;
    }

    private File q(Activity activity) {
        return File.createTempFile("JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_", ".jpg", activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    private Uri r() {
        androidx.appcompat.app.c j6 = this.f4268e.j();
        return FileProvider.f(j6, this.f4268e.o().getPackageName() + ".fileprovider", q(j6));
    }

    private String[] s(String[] strArr) {
        int i6;
        ArrayList arrayList = new ArrayList();
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        int length = strArr.length;
        while (i6 < length) {
            String str = strArr[i6];
            if (str.startsWith(".")) {
                str = singleton.getMimeTypeFromExtension(str.substring(1));
                if (str != null) {
                    if (arrayList.contains(str)) {
                    }
                    arrayList.add(str);
                }
            } else {
                i6 = arrayList.contains(str) ? i6 + 1 : 0;
                arrayList.add(str);
            }
        }
        Object[] array = arrayList.toArray();
        return (String[]) Arrays.copyOf(array, array.length, String[].class);
    }

    private boolean t() {
        return a1.d.e(this.f4268e.o(), new String[]{"android.permission.CAMERA"}) || !a1.d.c(this.f4268e.o(), "android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Map map) {
        if (this.f4266c != null) {
            Iterator it = map.entrySet().iterator();
            boolean z5 = true;
            while (it.hasNext()) {
                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    z5 = false;
                }
            }
            this.f4266c.a(Boolean.valueOf(z5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(androidx.activity.result.a aVar) {
        a aVar2 = this.f4267d;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(GeolocationPermissions.Callback callback, String str, Boolean bool) {
        if (!bool.booleanValue()) {
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION"};
            if (Build.VERSION.SDK_INT < 31 || !a1.d.e(this.f4268e.o(), strArr)) {
                callback.invoke(str, false, false);
                return;
            }
        }
        callback.invoke(str, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(JsResult jsResult, DialogInterface dialogInterface, int i6) {
        dialogInterface.dismiss();
        jsResult.confirm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(JsResult jsResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String k6 = l0.k("Console");
        if (consoleMessage.message() != null && u(consoleMessage.message())) {
            String format = String.format("File: %s - Line %d - Msg: %s", consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message());
            String name = consoleMessage.messageLevel().name();
            if ("ERROR".equalsIgnoreCase(name)) {
                l0.d(k6, format, null);
            } else if ("WARNING".equalsIgnoreCase(name)) {
                l0.o(k6, format);
            } else if ("TIP".equalsIgnoreCase(name)) {
                l0.b(k6, format);
            } else {
                l0.g(k6, format);
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        l0.a("onGeolocationPermissionsShowPrompt: DOING IT HERE FOR ORIGIN: " + str);
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        if (a1.d.e(this.f4268e.o(), strArr)) {
            callback.invoke(str, true, false);
            l0.a("onGeolocationPermissionsShowPrompt: has required permission");
        } else {
            this.f4266c = new b() { // from class: com.getcapacitor.z
                @Override // com.getcapacitor.a0.b
                public final void a(Boolean bool) {
                    a0.this.x(callback, str, bool);
                }
            };
            this.f4264a.a(strArr);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        if (this.f4268e.j().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setMessage(str2).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.getcapacitor.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                a0.y(jsResult, dialogInterface, i6);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.getcapacitor.y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                a0.z(jsResult, dialogInterface);
            }
        });
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        if (this.f4268e.j().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setMessage(str2).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.getcapacitor.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                a0.A(jsResult, dialogInterface, i6);
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.getcapacitor.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                a0.B(jsResult, dialogInterface, i6);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.getcapacitor.w
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                a0.C(jsResult, dialogInterface);
            }
        });
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        if (this.f4268e.j().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        final EditText editText = new EditText(webView.getContext());
        builder.setMessage(str2).setView(editText).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.getcapacitor.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                a0.E(editText, jsPromptResult, dialogInterface, i6);
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.getcapacitor.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                a0.F(jsPromptResult, dialogInterface, i6);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.getcapacitor.t
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                a0.D(jsPromptResult, dialogInterface);
            }
        });
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        boolean z5 = Build.VERSION.SDK_INT >= 23;
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.VIDEO_CAPTURE")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.AUDIO_CAPTURE")) {
            arrayList.add("android.permission.MODIFY_AUDIO_SETTINGS");
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (arrayList.isEmpty() || !z5) {
            permissionRequest.grant(permissionRequest.getResources());
            return;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f4266c = new b() { // from class: com.getcapacitor.n
            @Override // com.getcapacitor.a0.b
            public final void a(Boolean bool) {
                a0.G(permissionRequest, bool);
            }
        };
        this.f4264a.a(strArr);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, final ValueCallback valueCallback, final WebChromeClient.FileChooserParams fileChooserParams) {
        List asList = Arrays.asList(fileChooserParams.getAcceptTypes());
        boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
        final boolean z5 = false;
        boolean z6 = isCaptureEnabled && asList.contains("image/*");
        if (isCaptureEnabled && asList.contains("video/*")) {
            z5 = true;
        }
        if (!z6 && !z5) {
            L(valueCallback, fileChooserParams);
        } else if (t()) {
            N(valueCallback, fileChooserParams, z5);
        } else {
            this.f4266c = new b() { // from class: com.getcapacitor.k
                @Override // com.getcapacitor.a0.b
                public final void a(Boolean bool) {
                    a0.this.H(valueCallback, fileChooserParams, z5, bool);
                }
            };
            this.f4264a.a(new String[]{"android.permission.CAMERA"});
        }
        return true;
    }

    public boolean u(String str) {
        return (str.contains("%cresult %c") || str.contains("%cnative %c") || str.equalsIgnoreCase("[object Object]") || str.equalsIgnoreCase("console.groupEnd")) ? false : true;
    }
}
