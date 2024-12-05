package com.facebook.internal.b0.e;

import android.content.Context;
import com.facebook.f;
import com.facebook.internal.x;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: MonitorLoggingStore.java */
/* loaded from: classes.dex */
public class d implements com.facebook.internal.b0.d {
    private static d a;

    private d() {
    }

    public static synchronized d b() {
        d dVar;
        synchronized (d.class) {
            if (a == null) {
                a = new d();
            }
            dVar = a;
        }
        return dVar;
    }

    @Override // com.facebook.internal.b0.d
    public Collection<com.facebook.internal.b0.a> a() {
        ArrayList arrayList = new ArrayList();
        Context e2 = f.e();
        ObjectInputStream objectInputStream = null;
        try {
            ObjectInputStream objectInputStream2 = new ObjectInputStream(new BufferedInputStream(e2.openFileInput("facebooksdk.monitoring.persistedlogs")));
            try {
                Collection<com.facebook.internal.b0.a> collection = (Collection) objectInputStream2.readObject();
                x.h(objectInputStream2);
                try {
                    e2.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                } catch (Exception unused) {
                }
                return collection;
            } catch (Exception unused2) {
                objectInputStream = objectInputStream2;
                x.h(objectInputStream);
                try {
                    e2.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                    return arrayList;
                } catch (Exception unused3) {
                    return arrayList;
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream = objectInputStream2;
                x.h(objectInputStream);
                try {
                    e2.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
