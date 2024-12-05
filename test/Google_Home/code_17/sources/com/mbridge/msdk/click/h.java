package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19197a = "h";

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.c.g f19198b;

    /* renamed from: c, reason: collision with root package name */
    private String f19199c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19200d = true;

    /* renamed from: e, reason: collision with root package name */
    private final int f19201e = 3145728;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f19202f;

    public h() {
        com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        this.f19198b = b8;
        if (b8 == null) {
            com.mbridge.msdk.c.h.a();
            this.f19198b = com.mbridge.msdk.c.i.a();
        }
    }

    public final com.mbridge.msdk.click.entity.a a(String str, boolean z8, boolean z9, CampaignEx campaignEx) {
        HttpURLConnection httpURLConnection;
        int i8;
        HttpURLConnection httpURLConnection2 = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String replace = str.replace(" ", "%20");
        this.f19202f = new com.mbridge.msdk.click.entity.a();
        try {
            httpURLConnection = (HttpURLConnection) new URL(replace).openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            if ((!z8 && !z9) || campaignEx == null) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            if (z8 && campaignEx != null && campaignEx.getcUA() == 1) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            if (z9 && campaignEx != null && campaignEx.getImpUA() == 1) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            if (this.f19198b.aI() && !TextUtils.isEmpty(this.f19199c)) {
                httpURLConnection.setRequestProperty("referer", this.f19199c);
            }
            httpURLConnection.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
            httpURLConnection.setReadTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.connect();
            this.f19202f.f19176a = httpURLConnection.getHeaderField("Location");
            this.f19202f.f19179d = httpURLConnection.getHeaderField("Referer");
            this.f19202f.f19181f = httpURLConnection.getResponseCode();
            this.f19202f.f19177b = httpURLConnection.getContentType();
            this.f19202f.f19180e = httpURLConnection.getContentLength();
            this.f19202f.f19178c = httpURLConnection.getContentEncoding();
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(this.f19202f.f19178c);
            com.mbridge.msdk.click.entity.a aVar = this.f19202f;
            if (aVar.f19181f == 200 && this.f19200d && (i8 = aVar.f19180e) > 0 && i8 < 3145728 && !TextUtils.isEmpty(replace)) {
                try {
                    String a8 = a(httpURLConnection.getInputStream(), equalsIgnoreCase);
                    if (!TextUtils.isEmpty(a8)) {
                        byte[] bytes = a8.getBytes();
                        if (bytes.length > 0 && bytes.length < 3145728) {
                            this.f19202f.f19182g = a8.trim();
                        }
                    }
                } catch (Throwable th2) {
                    ad.b(f19197a, th2.getMessage());
                }
            }
            this.f19199c = replace;
            httpURLConnection.disconnect();
            return this.f19202f;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            try {
                this.f19202f.f19183h = th.getMessage();
                return this.f19202f;
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[Catch: all -> 0x000f, TryCatch #5 {all -> 0x000f, blocks: (B:41:0x0008, B:4:0x0013, B:8:0x003c, B:10:0x0040, B:11:0x004d), top: B:40:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: Exception -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0031, blocks: (B:34:0x002d, B:13:0x0058), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.io.InputStream r4, boolean r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto L13
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r4 = r5
            goto L13
        Lf:
            r4 = move-exception
            goto L60
        L11:
            r4 = move-exception
            goto L3c
        L13:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
        L1d:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            if (r4 == 0) goto L2d
            r0.append(r4)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            goto L1d
        L27:
            r4 = move-exception
            r1 = r5
            goto L60
        L2a:
            r4 = move-exception
            r1 = r5
            goto L3c
        L2d:
            r5.close()     // Catch: java.lang.Exception -> L31
            goto L5b
        L31:
            r4 = move-exception
            java.lang.String r5 = com.mbridge.msdk.click.h.f19197a
            java.lang.String r4 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r5, r4)
            goto L5b
        L3c:
            com.mbridge.msdk.click.entity.a r5 = r3.f19202f     // Catch: java.lang.Throwable -> Lf
            if (r5 != 0) goto L4d
            com.mbridge.msdk.click.entity.a r5 = new com.mbridge.msdk.click.entity.a     // Catch: java.lang.Throwable -> Lf
            r5.<init>()     // Catch: java.lang.Throwable -> Lf
            r3.f19202f = r5     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> Lf
            r5.f19183h = r2     // Catch: java.lang.Throwable -> Lf
        L4d:
            java.lang.String r5 = com.mbridge.msdk.click.h.f19197a     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lf
            com.mbridge.msdk.foundation.tools.ad.b(r5, r4)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Exception -> L31
        L5b:
            java.lang.String r4 = r0.toString()
            return r4
        L60:
            if (r1 == 0) goto L70
            r1.close()     // Catch: java.lang.Exception -> L66
            goto L70
        L66:
            r5 = move-exception
            java.lang.String r0 = com.mbridge.msdk.click.h.f19197a
            java.lang.String r5 = r5.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r0, r5)
        L70:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.h.a(java.io.InputStream, boolean):java.lang.String");
    }
}
