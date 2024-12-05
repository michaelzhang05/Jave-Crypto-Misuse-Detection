package com.flurry.sdk;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o7 {
    public static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        b(hashMap);
        c(hashMap);
        e(hashMap);
        h(hashMap);
        i(hashMap);
        d(hashMap);
        f(hashMap);
        g(hashMap);
        return hashMap;
    }

    private static void b(Map<String, String> map) {
        try {
            map.put("mem.java.max", Long.toString(Runtime.getRuntime().maxMemory()));
        } catch (RuntimeException e2) {
            d1.d(6, "CrashParameterCollector", "Error retrieving max memory", e2);
        }
    }

    private static void c(Map<String, String> map) {
        try {
            Debug.getMemoryInfo(new Debug.MemoryInfo());
            map.put("mem.pss", Long.toString(r0.getTotalPss() * 1024));
        } catch (RuntimeException e2) {
            d1.d(6, "CrashParameterCollector", "Error retrieving pss memory", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r7 == 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r7 == 2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        r10.put("mem.virt.max", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r10.put("mem.virt", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.o7.d(java.util.Map):void");
    }

    private static void e(Map<String, String> map) {
        map.put("application.state", Integer.toString(e7.a().f9845j.y().f9914j));
    }

    private static void f(Map<String, String> map) {
        long blockSize;
        long availableBlocks;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18) {
            blockSize = statFs.getBlockSizeLong();
        } else {
            blockSize = statFs.getBlockSize();
        }
        if (i2 >= 18) {
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            availableBlocks = statFs.getAvailableBlocks();
        }
        map.put("disk.size.free", Long.toString(availableBlocks * blockSize));
    }

    private static void g(Map<String, String> map) {
        long blockSize;
        long blockCount;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18) {
            blockSize = statFs.getBlockSizeLong();
        } else {
            blockSize = statFs.getBlockSize();
        }
        if (i2 >= 18) {
            blockCount = statFs.getBlockCountLong();
        } else {
            blockCount = statFs.getBlockCount();
        }
        map.put("disk.size.total", Long.toString(blockCount * blockSize));
    }

    private static void h(Map<String, String> map) {
        map.put("net.status", Integer.toString(e7.a().f9838c.T().ordinal()));
    }

    private static void i(Map<String, String> map) {
        map.put("orientation", Integer.toString(e7.a().f9839d.q));
    }
}
