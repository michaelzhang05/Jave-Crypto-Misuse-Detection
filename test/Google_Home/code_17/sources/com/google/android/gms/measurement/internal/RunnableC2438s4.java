package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2438s4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f17805a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2418p4 f17806b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17807c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f17808d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2425q4 f17809e;

    public RunnableC2438s4(C2425q4 c2425q4, String str, URL url, byte[] bArr, Map map, InterfaceC2418p4 interfaceC2418p4) {
        this.f17809e = c2425q4;
        AbstractC1400p.f(str);
        AbstractC1400p.l(url);
        AbstractC1400p.l(interfaceC2418p4);
        this.f17805a = url;
        this.f17806b = interfaceC2418p4;
        this.f17807c = str;
        this.f17808d = null;
    }

    private final void b(final int i8, final Exception exc, final byte[] bArr, final Map map) {
        this.f17809e.e().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.r4
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2438s4.this.a(i8, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i8, Exception exc, byte[] bArr, Map map) {
        this.f17806b.a(this.f17807c, i8, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] s8;
        this.f17809e.i();
        int i8 = 0;
        try {
            URLConnection b8 = com.google.android.gms.internal.measurement.A0.a().b(this.f17805a, "client-measurement");
            if (b8 instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) b8;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i8 = httpURLConnection.getResponseCode();
                    map = httpURLConnection.getHeaderFields();
                    try {
                        C2425q4 c2425q4 = this.f17809e;
                        s8 = C2425q4.s(httpURLConnection);
                        httpURLConnection.disconnect();
                        b(i8, null, s8, map);
                    } catch (IOException e8) {
                        e = e8;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i8, e, null, map);
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        b(i8, null, null, map);
                        throw th;
                    }
                } catch (IOException e9) {
                    e = e9;
                    map = null;
                } catch (Throwable th2) {
                    th = th2;
                    map = null;
                }
            } else {
                throw new IOException("Failed to obtain HTTP connection");
            }
        } catch (IOException e10) {
            e = e10;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
