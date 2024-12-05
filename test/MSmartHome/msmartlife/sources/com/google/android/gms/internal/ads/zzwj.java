package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzwj {
    private final zzwo a;

    /* renamed from: b, reason: collision with root package name */
    private final zzxn f15695b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15696c;

    public zzwj(zzwo zzwoVar) {
        this.a = zzwoVar;
        this.f15696c = ((Boolean) zzyt.e().c(zzacu.S3)).booleanValue();
        this.f15695b = new zzxn();
        g();
    }

    private final synchronized void c(zzwl.zza.zzb zzbVar) {
        this.f15695b.f15770h = h();
        this.a.a(zzdrw.b(this.f15695b)).b(zzbVar.b()).c();
        String valueOf = String.valueOf(Integer.toString(zzbVar.b(), 10));
        zzawz.m(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void d(zzwl.zza.zzb zzbVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(e(zzbVar).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zzawz.m("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zzawz.m("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zzawz.m("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    zzawz.m("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            zzawz.m("Could not find file for Clearcut");
        }
    }

    private final synchronized String e(zzwl.zza.zzb zzbVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f15695b.f15766d, Long.valueOf(zzk.zzln().b()), Integer.valueOf(zzbVar.b()), Base64.encodeToString(zzdrw.b(this.f15695b), 3));
    }

    public static zzwj f() {
        return new zzwj();
    }

    private final synchronized void g() {
        this.f15695b.l = new zzxj();
        this.f15695b.l.f15746f = new zzxk();
        this.f15695b.f15771i = new zzxl();
    }

    private static long[] h() {
        int i2;
        List<String> d2 = zzacu.d();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = d2.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(",");
            int length = split.length;
            while (i2 < length) {
                try {
                    arrayList.add(Long.valueOf(split[i2]));
                } catch (NumberFormatException unused) {
                    zzawz.m("Experiment ID is not a number");
                }
                i2++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jArr[i3] = ((Long) obj).longValue();
            i3++;
        }
        return jArr;
    }

    public final synchronized void a(zzwk zzwkVar) {
        if (this.f15696c) {
            try {
                zzwkVar.a(this.f15695b);
            } catch (NullPointerException e2) {
                zzk.zzlk().e(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void b(zzwl.zza.zzb zzbVar) {
        if (this.f15696c) {
            if (((Boolean) zzyt.e().c(zzacu.T3)).booleanValue()) {
                d(zzbVar);
            } else {
                c(zzbVar);
            }
        }
    }

    private zzwj() {
        this.f15696c = false;
        this.a = new zzwo();
        this.f15695b = new zzxn();
        g();
    }
}
