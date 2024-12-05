package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class Y2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f15628a = new ArrayMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Y2 b(Context context, String str, Runnable runnable) {
        if (!AbstractC2134x2.b()) {
            synchronized (Y2.class) {
                android.support.v4.media.a.a(f15628a.get(null));
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } finally {
                }
            }
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        synchronized (Y2.class) {
            Map map = f15628a;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
        }
    }
}
