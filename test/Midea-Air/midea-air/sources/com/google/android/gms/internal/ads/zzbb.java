package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzbb extends zzdsu implements Closeable {
    private static zzdtc o = zzdtc.b(zzbb.class);

    public zzbb(zzdsw zzdswVar, zzba zzbaVar) throws IOException {
        o(zzdswVar, zzdswVar.size(), zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsu, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14975i.close();
    }

    @Override // com.google.android.gms.internal.ads.zzdsu
    public String toString() {
        String obj = this.f14975i.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
