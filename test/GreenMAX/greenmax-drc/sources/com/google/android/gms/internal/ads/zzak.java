package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class zzak implements zzm {
    private static final boolean a = zzag.f12695b;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private final zzas f12753b;

    /* renamed from: c, reason: collision with root package name */
    private final zzaj f12754c;

    /* renamed from: d, reason: collision with root package name */
    private final zzal f12755d;

    @Deprecated
    public zzak(zzas zzasVar) {
        this(zzasVar, new zzal(RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    private static void b(String str, zzr<?> zzrVar, zzaf zzafVar) throws zzaf {
        zzac Q = zzrVar.Q();
        int P = zzrVar.P();
        try {
            Q.a(zzafVar);
            zzrVar.H(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(P)));
        } catch (zzaf e2) {
            zzrVar.H(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(P)));
            throw e2;
        }
    }

    private final byte[] c(InputStream inputStream, int i2) throws IOException, zzad {
        zzaw zzawVar = new zzaw(this.f12755d, i2);
        try {
            if (inputStream != null) {
                byte[] b2 = this.f12755d.b(1024);
                while (true) {
                    int read = inputStream.read(b2);
                    if (read == -1) {
                        break;
                    }
                    zzawVar.write(b2, 0, read);
                }
                byte[] byteArray = zzawVar.toByteArray();
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    zzag.c("Error occurred when closing InputStream", new Object[0]);
                }
                this.f12755d.a(b2);
                zzawVar.close();
                return byteArray;
            }
            throw new zzad();
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzag.c("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f12755d.a(null);
            zzawVar.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzp a(com.google.android.gms.internal.ads.zzr<?> r22) throws com.google.android.gms.internal.ads.zzaf {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzak.a(com.google.android.gms.internal.ads.zzr):com.google.android.gms.internal.ads.zzp");
    }

    @Deprecated
    private zzak(zzas zzasVar, zzal zzalVar) {
        this.f12753b = zzasVar;
        this.f12754c = new o0(zzasVar);
        this.f12755d = zzalVar;
    }

    public zzak(zzaj zzajVar) {
        this(zzajVar, new zzal(RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    private zzak(zzaj zzajVar, zzal zzalVar) {
        this.f12754c = zzajVar;
        this.f12753b = zzajVar;
        this.f12755d = zzalVar;
    }
}
