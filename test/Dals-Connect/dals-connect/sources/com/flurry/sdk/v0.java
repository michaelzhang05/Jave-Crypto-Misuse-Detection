package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v0 {
    private final w0 a;

    /* renamed from: b, reason: collision with root package name */
    private final File f10206b;

    /* renamed from: c, reason: collision with root package name */
    boolean f10207c;

    /* renamed from: d, reason: collision with root package name */
    private String f10208d;

    public v0() {
        this(b0.a());
    }

    private void b(String str) {
        if (str == null) {
            return;
        }
        this.f10208d = str;
    }

    public final synchronized Map<String, List<String>> a() {
        if (!this.f10207c) {
            this.f10207c = true;
            d1.c(4, "InstallLogger", "Loading referrer info from file: " + this.f10206b.getAbsolutePath());
            String f2 = b2.f(this.f10206b);
            d1.e("InstallLogger", "Referrer file contents: ".concat(String.valueOf(f2)));
            b(f2);
        }
        return w0.a(this.f10208d);
    }

    public v0(Context context) {
        this.a = new w0();
        File fileStreamPath = context.getFileStreamPath(".flurryinstallreceiver.");
        this.f10206b = fileStreamPath;
        d1.c(3, "InstallLogger", "Referrer file name if it exists:  " + fileStreamPath);
    }
}
