package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class v2 {
    long a;

    /* renamed from: b, reason: collision with root package name */
    final String f12254b;

    /* renamed from: c, reason: collision with root package name */
    final String f12255c;

    /* renamed from: d, reason: collision with root package name */
    final long f12256d;

    /* renamed from: e, reason: collision with root package name */
    final long f12257e;

    /* renamed from: f, reason: collision with root package name */
    final long f12258f;

    /* renamed from: g, reason: collision with root package name */
    final long f12259g;

    /* renamed from: h, reason: collision with root package name */
    final List<zzl> f12260h;

    private v2(String str, String str2, long j2, long j3, long j4, long j5, List<zzl> list) {
        this.f12254b = str;
        this.f12255c = HttpUrl.FRAGMENT_ENCODE_SET.equals(str2) ? null : str2;
        this.f12256d = j2;
        this.f12257e = j3;
        this.f12258f = j4;
        this.f12259g = j5;
        this.f12260h = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v2 b(y2 y2Var) throws IOException {
        if (zzan.k(y2Var) == 538247942) {
            return new v2(zzan.e(y2Var), zzan.e(y2Var), zzan.m(y2Var), zzan.m(y2Var), zzan.m(y2Var), zzan.m(y2Var), zzan.l(y2Var));
        }
        throw new IOException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(OutputStream outputStream) {
        try {
            zzan.f(outputStream, 538247942);
            zzan.h(outputStream, this.f12254b);
            String str = this.f12255c;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            zzan.h(outputStream, str);
            zzan.g(outputStream, this.f12256d);
            zzan.g(outputStream, this.f12257e);
            zzan.g(outputStream, this.f12258f);
            zzan.g(outputStream, this.f12259g);
            List<zzl> list = this.f12260h;
            if (list != null) {
                zzan.f(outputStream, list.size());
                for (zzl zzlVar : list) {
                    zzan.h(outputStream, zzlVar.a());
                    zzan.h(outputStream, zzlVar.b());
                }
            } else {
                zzan.f(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            zzag.a("%s", e2.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v2(java.lang.String r14, com.google.android.gms.internal.ads.zzc r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f13770b
            long r3 = r15.f13771c
            long r5 = r15.f13772d
            long r7 = r15.f13773e
            long r9 = r15.f13774f
            java.util.List<com.google.android.gms.internal.ads.zzl> r0 = r15.f13776h
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f13775g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzl r11 = new com.google.android.gms.internal.ads.zzl
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v2.<init>(java.lang.String, com.google.android.gms.internal.ads.zzc):void");
    }
}
