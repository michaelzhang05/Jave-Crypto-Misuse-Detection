package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.mbsignalcommon.c.a;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class i implements Handler.Callback, c {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f21674a;

    /* renamed from: b, reason: collision with root package name */
    protected String f21675b;

    /* renamed from: d, reason: collision with root package name */
    protected Context f21677d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f21678e;

    /* renamed from: c, reason: collision with root package name */
    protected final int f21676c = 1;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f21679f = new Handler(Looper.getMainLooper(), this);

    public i(Context context) {
        this.f21677d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public final void a(WindVaneWebView windVaneWebView) {
        this.f21678e = windVaneWebView;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 == 0) goto L9
            return
        L9:
            r2 = 0
            if (r8 != 0) goto Ld
            goto L68
        Ld:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r7.f21678e
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = com.mbridge.msdk.mbsignalcommon.mraid.c.a(r3, r8)
            if (r3 == 0) goto L1a
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.f21678e
            r3.f21648b = r8
            goto L69
        L1a:
            java.util.regex.Pattern r3 = r7.f21674a
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L68
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = new com.mbridge.msdk.mbsignalcommon.windvane.a
            r3.<init>()
            int r4 = r8.groupCount()
            r5 = 5
            if (r4 < r5) goto L38
            java.lang.String r5 = r8.group(r5)
            r3.f21652f = r5
        L38:
            r5 = 3
            if (r4 < r5) goto L68
            java.lang.String r4 = r8.group(r1)
            r3.f21650d = r4
            java.lang.String r4 = r8.group(r0)
            r3.f21653g = r4
            java.lang.String r8 = r8.group(r5)
            r3.f21651e = r8
            java.util.HashMap<java.lang.String, java.lang.String> r4 = com.mbridge.msdk.mbsignalcommon.base.e.f21547k
            if (r4 == 0) goto L63
            boolean r8 = r4.containsKey(r8)
            if (r8 == 0) goto L63
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.e.f21547k
            java.lang.String r4 = r3.f21651e
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            r3.f21651e = r8
        L63:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.f21678e
            r3.f21648b = r8
            goto L69
        L68:
            r3 = r2
        L69:
            if (r3 != 0) goto L6c
            return
        L6c:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r3.f21648b
            if (r8 != 0) goto L71
            goto L77
        L71:
            java.lang.String r2 = r3.f21650d
            java.lang.Object r2 = r8.getJsObject(r2)
        L77:
            if (r2 != 0) goto L7a
            goto Lc1
        L7a:
            android.content.Context r8 = r7.f21677d     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            com.mbridge.msdk.mbsignalcommon.c.a$c r8 = com.mbridge.msdk.mbsignalcommon.c.a.a(r8, r4)     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            java.lang.String r4 = r3.f21651e     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r6 = 0
            r0[r6] = r5     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r1] = r5     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            com.mbridge.msdk.mbsignalcommon.c.a$d r8 = r8.a(r4, r0)     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            r8.a()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            boolean r0 = r2 instanceof com.mbridge.msdk.mbsignalcommon.windvane.h     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            if (r0 == 0) goto Lc1
            r3.f21647a = r8     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            r3.f21649c = r2     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            android.os.Message r8 = android.os.Message.obtain()     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            r8.what = r1     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            r8.obj = r3     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            android.os.Handler r0 = r7.f21679f     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            r0.sendMessage(r8)     // Catch: java.lang.Exception -> Lb6 com.mbridge.msdk.mbsignalcommon.c.a.b.C0406a -> Lb8
            goto Lc1
        Lb6:
            r8 = move-exception
            goto Lba
        Lb8:
            r8 = move-exception
            goto Lbe
        Lba:
            r8.printStackTrace()
            goto Lc1
        Lbe:
            r8.printStackTrace()
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.windvane.i.b(java.lang.String):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = aVar.f21649c;
        a.d dVar = aVar.f21647a;
        if (dVar != null && obj != null) {
            if (TextUtils.isEmpty(aVar.f21652f)) {
                str = "{}";
            } else {
                str = aVar.f21652f;
            }
            dVar.a(obj, aVar, str);
        }
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public final boolean a(String str) {
        if (!j.a(str)) {
            return false;
        }
        this.f21674a = j.b(str);
        this.f21675b = str;
        return true;
    }
}
