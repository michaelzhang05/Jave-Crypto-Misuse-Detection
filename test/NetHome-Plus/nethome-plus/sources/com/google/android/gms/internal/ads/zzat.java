package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class zzat extends zzaj {
    private final zzav a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f12972b;

    public zzat() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static List<zzl> d(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzl(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private static void e(HttpURLConnection httpURLConnection, zzr<?> zzrVar) throws IOException, zza {
        byte[] N = zzrVar.N();
        if (N != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(N);
            dataOutputStream.close();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x008a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:15:0x0068, B:16:0x0070, B:18:0x0076, B:20:0x0086, B:21:0x008a, B:22:0x008d, B:23:0x011f, B:24:0x0124, B:25:0x0091, B:26:0x009a, B:27:0x00a0, B:28:0x00a6, B:29:0x00ac, B:30:0x00b2, B:31:0x00bb, B:32:0x00c4, B:33:0x00c9, B:35:0x00d0, B:47:0x00ec, B:60:0x0117, B:61:0x011e), top: B:14:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117 A[Catch: all -> 0x0125, TRY_ENTER, TryCatch #1 {all -> 0x0125, blocks: (B:15:0x0068, B:16:0x0070, B:18:0x0076, B:20:0x0086, B:21:0x008a, B:22:0x008d, B:23:0x011f, B:24:0x0124, B:25:0x0091, B:26:0x009a, B:27:0x00a0, B:28:0x00a6, B:29:0x00ac, B:30:0x00b2, B:31:0x00bb, B:32:0x00c4, B:33:0x00c9, B:35:0x00d0, B:47:0x00ec, B:60:0x0117, B:61:0x011e), top: B:14:0x0068 }] */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzar b(com.google.android.gms.internal.ads.zzr<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException, com.google.android.gms.internal.ads.zza {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzat.b(com.google.android.gms.internal.ads.zzr, java.util.Map):com.google.android.gms.internal.ads.zzar");
    }

    private zzat(zzav zzavVar) {
        this(null, null);
    }

    private zzat(zzav zzavVar, SSLSocketFactory sSLSocketFactory) {
        this.a = null;
        this.f12972b = null;
    }
}
