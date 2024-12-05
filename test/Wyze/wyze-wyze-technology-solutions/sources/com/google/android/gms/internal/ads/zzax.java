package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class zzax extends zzr<String> {
    private final Object u;
    private zzaa<String> v;

    public zzax(int i2, String str, zzaa<String> zzaaVar, zzz zzzVar) {
        super(i2, str, zzzVar);
        this.u = new Object();
        this.v = zzaaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void E(String str) {
        zzaa<String> zzaaVar;
        synchronized (this.u) {
            zzaaVar = this.v;
        }
        if (zzaaVar != null) {
            zzaaVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzr
    public final zzy<String> x(zzp zzpVar) {
        String str;
        try {
            byte[] bArr = zzpVar.f15375b;
            String str2 = "ISO-8859-1";
            String str3 = zzpVar.f15376c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i2 = 1;
                while (true) {
                    if (i2 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i2].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i2++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzpVar.f15375b);
        }
        return zzy.a(str, zzaq.a(zzpVar));
    }
}
