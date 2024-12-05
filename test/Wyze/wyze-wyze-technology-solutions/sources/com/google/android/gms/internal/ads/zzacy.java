package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
/* loaded from: classes2.dex */
public final class zzacy {

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    private ExecutorService f12635b;

    /* renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    private String f12638e;

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    private Context f12639f;

    /* renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    private String f12640g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f12641h;

    /* renamed from: i, reason: collision with root package name */
    private File f12642i;

    @VisibleForTesting
    private BlockingQueue<zzadi> a = new ArrayBlockingQueue(100);

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    private LinkedHashMap<String, String> f12636c = new LinkedHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    private Map<String, zzadc> f12637d = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        FileOutputStream fileOutputStream;
        while (true) {
            try {
                zzadi take = this.a.take();
                String e2 = take.e();
                if (!TextUtils.isEmpty(e2)) {
                    Map<String, String> a = a(this.f12636c, take.f());
                    Uri.Builder buildUpon = Uri.parse(this.f12638e).buildUpon();
                    for (Map.Entry<String, String> entry : a.entrySet()) {
                        buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    String str = buildUpon.build().toString() + "&it=" + e2;
                    if (this.f12641h.get()) {
                        File file = this.f12642i;
                        if (file != null) {
                            FileOutputStream fileOutputStream2 = null;
                            try {
                                try {
                                    fileOutputStream = new FileOutputStream(file, true);
                                } catch (IOException e3) {
                                    e = e3;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                fileOutputStream.write(str.getBytes());
                                fileOutputStream.write(10);
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    zzbad.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                }
                            } catch (IOException e5) {
                                e = e5;
                                fileOutputStream2 = fileOutputStream;
                                zzbad.d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e6) {
                                        zzbad.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e6);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream2 = fileOutputStream;
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e7) {
                                        zzbad.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e7);
                                    }
                                }
                                throw th;
                            }
                        } else {
                            zzbad.i("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        zzk.zzlg();
                        zzaxi.J(this.f12639f, this.f12640g, str);
                    }
                }
            } catch (InterruptedException e8) {
                zzbad.d("CsiReporter:reporter interrupted", e8);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, e(key).a((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    public final void b(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f12639f = context;
        this.f12640g = str;
        this.f12638e = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f12641h = atomicBoolean;
        atomicBoolean.set(((Boolean) zzyt.e().c(zzacu.g0)).booleanValue());
        if (this.f12641h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f12642i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f12636c.put(entry.getKey(), entry.getValue());
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f12635b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new t(this));
        Map<String, zzadc> map2 = this.f12637d;
        zzadc zzadcVar = zzadc.f12643b;
        map2.put("action", zzadcVar);
        this.f12637d.put("ad_format", zzadcVar);
        this.f12637d.put("e", zzadc.f12644c);
    }

    public final boolean d(zzadi zzadiVar) {
        return this.a.offer(zzadiVar);
    }

    public final zzadc e(String str) {
        zzadc zzadcVar = this.f12637d.get(str);
        return zzadcVar != null ? zzadcVar : zzadc.a;
    }
}
