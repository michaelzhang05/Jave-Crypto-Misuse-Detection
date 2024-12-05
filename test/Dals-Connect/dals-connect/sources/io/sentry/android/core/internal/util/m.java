package io.sentry.android.core.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.VisibleForTesting;

/* compiled from: CpuInfoUtils.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class m {
    private static final m a = new m();

    /* renamed from: b, reason: collision with root package name */
    private final List<Integer> f18715b = new ArrayList();

    private m() {
    }

    public static m a() {
        return a;
    }

    @VisibleForTesting
    String b() {
        return "/sys/devices/system/cpu";
    }

    public synchronized List<Integer> c() {
        if (!this.f18715b.isEmpty()) {
            return this.f18715b;
        }
        File[] listFiles = new File(b()).listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        for (File file : listFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String c2 = io.sentry.util.l.c(file2);
                        if (c2 != null) {
                            this.f18715b.add(Integer.valueOf((int) (Long.parseLong(c2.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f18715b;
    }
}
