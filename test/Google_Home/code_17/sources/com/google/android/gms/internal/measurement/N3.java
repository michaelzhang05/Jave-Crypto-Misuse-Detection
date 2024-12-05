package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class N3 {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static volatile w0.g f16235a;

        public static w0.g a(Context context) {
            w0.g c8;
            boolean isDeviceProtectedStorage;
            w0.g gVar = f16235a;
            if (gVar == null) {
                synchronized (a.class) {
                    try {
                        gVar = f16235a;
                        if (gVar == null) {
                            new N3();
                            if (!O3.c(Build.TYPE, Build.TAGS)) {
                                c8 = w0.g.a();
                            } else {
                                if (B3.a()) {
                                    isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                                    if (!isDeviceProtectedStorage) {
                                        context = context.createDeviceProtectedStorageContext();
                                    }
                                }
                                c8 = N3.c(context);
                            }
                            f16235a = c8;
                            gVar = c8;
                        }
                    } finally {
                    }
                }
            }
            return gVar;
        }
    }

    private static L3 a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" ", 3);
                        if (split.length != 3) {
                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                        } else {
                            String b8 = b(split[0]);
                            String decode = Uri.decode(b(split[1]));
                            String str = (String) hashMap.get(split[2]);
                            if (str == null) {
                                String b9 = b(split[2]);
                                str = Uri.decode(b9);
                                if (str.length() < 1024 || str == b9) {
                                    hashMap.put(b9, str);
                                }
                            }
                            SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(b8);
                            if (simpleArrayMap2 == null) {
                                simpleArrayMap2 = new SimpleArrayMap();
                                simpleArrayMap.put(b8, simpleArrayMap2);
                            }
                            simpleArrayMap2.put(decode, str);
                        }
                    } else {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        G3 g32 = new G3(simpleArrayMap);
                        bufferedReader.close();
                        return g32;
                    }
                }
            } finally {
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static final String b(String str) {
        return new String(str);
    }

    static w0.g c(Context context) {
        w0.g a8;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            w0.g d8 = d(context);
            if (d8.c()) {
                a8 = w0.g.d(a(context, (File) d8.b()));
            } else {
                a8 = w0.g.a();
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a8;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static w0.g d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return w0.g.d(file);
            }
            return w0.g.a();
        } catch (RuntimeException e8) {
            Log.e("HermeticFileOverrides", "no data dir", e8);
            return w0.g.a();
        }
    }
}
