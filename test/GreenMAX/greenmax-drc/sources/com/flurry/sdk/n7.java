package com.flurry.sdk;

import com.google.android.gms.ads.AdRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class n7 {
    private static final char[] a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f10065b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f10066c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f10067d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f10068e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f10069f;

    /* renamed from: g, reason: collision with root package name */
    private short f10070g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10071h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer f10072i;

    static {
        char[] cArr = {'F', 'C', 'B', 'M'};
        a = cArr;
        f10065b = new String(cArr);
        f10066c = (cArr.length * 2) + 2 + 1 + 105984;
        int length = cArr.length * 2;
        f10067d = length;
        int i2 = length + 2;
        f10068e = i2;
        f10069f = i2 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n7() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f10066c);
        this.f10072i = allocateDirect;
        allocateDirect.asCharBuffer().put(a);
    }

    private m7 a(int i2) {
        this.f10072i.position(f10069f + (i2 * AdRequest.MAX_CONTENT_URL_LENGTH));
        return new m7(this.f10072i.asCharBuffer().limit(this.f10072i.getInt()).toString(), this.f10072i.getLong());
    }

    public static int c() {
        return 1;
    }

    public final List<m7> b() {
        ArrayList arrayList = new ArrayList();
        if (this.f10072i == null) {
            return arrayList;
        }
        if (this.f10071h) {
            for (int i2 = this.f10070g; i2 < 207; i2++) {
                arrayList.add(a(i2));
            }
        }
        for (int i3 = 0; i3 < this.f10070g; i3++) {
            arrayList.add(a(i3));
        }
        return arrayList;
    }

    public final synchronized String toString() {
        short s;
        StringBuilder sb;
        if (this.f10072i == null) {
            s = 0;
        } else {
            s = this.f10071h ? (short) 207 : this.f10070g;
        }
        sb = new StringBuilder();
        sb.append("Total number of breadcrumbs: " + ((int) s) + "\n");
        Iterator<m7> it = b().iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        return sb.toString();
    }

    public n7(File file) {
        int i2;
        d1.c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs from %s", file.getAbsolutePath()));
        this.f10072i = ByteBuffer.allocate(f10066c);
        if (file.length() != this.f10072i.capacity()) {
            d1.c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "Crash breadcrumbs invalid file length %s != %s", Long.valueOf(file.length()), Integer.valueOf(this.f10072i.capacity())));
            this.f10072i = null;
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            try {
                i2 = channel.read(this.f10072i);
            } catch (IOException unused) {
                d1.c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", "Issue reading breadcrumbs from file.");
                i2 = 0;
            }
            c2.f(channel);
            c2.f(fileInputStream);
            if (i2 != this.f10072i.capacity()) {
                d1.c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs unexpected read size %s != %s", Integer.valueOf(i2), Integer.valueOf(this.f10072i.capacity())));
                this.f10072i = null;
                return;
            }
            this.f10072i.position(0);
            String obj = this.f10072i.asCharBuffer().limit(a.length).toString();
            if (!obj.equals(f10065b)) {
                d1.c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs invalid magic string: '%s'", obj));
                this.f10072i = null;
                return;
            }
            short s = this.f10072i.getShort(f10067d);
            this.f10070g = s;
            if (s >= 0 && s < 207) {
                this.f10071h = this.f10072i.get(f10068e) == 1;
            } else {
                d1.c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", String.format(Locale.getDefault(), "YCrashBreadcrumbs invalid index: '%s'", Short.valueOf(this.f10070g)));
                this.f10072i = null;
            }
        } catch (FileNotFoundException unused2) {
            d1.c(6, "com.flurry.android.common.newProviders.errorCrashBreadcrumbsManager", "Issue reading breadcrumbs file.");
            this.f10072i = null;
        }
    }
}
