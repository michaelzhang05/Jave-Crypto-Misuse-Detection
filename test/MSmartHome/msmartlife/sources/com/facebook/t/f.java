package com.facebook.t;

import android.content.Context;
import android.util.Log;
import com.facebook.internal.x;
import com.facebook.t.a;
import com.facebook.t.c;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* compiled from: AppEventStore.java */
/* loaded from: classes.dex */
class f {
    private static final String a = "com.facebook.t.f";

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppEventStore.java */
    /* loaded from: classes.dex */
    public static class a extends ObjectInputStream {
        public a(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(a.b.class);
            }
            return readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(c.b.class) : readClassDescriptor;
        }
    }

    f() {
    }

    public static synchronized void a(com.facebook.t.a aVar, o oVar) {
        synchronized (f.class) {
            com.facebook.t.u.b.b();
            n c2 = c();
            if (c2.b(aVar)) {
                c2.c(aVar).addAll(oVar.d());
            } else {
                c2.a(aVar, oVar.d());
            }
            d(c2);
        }
    }

    public static synchronized void b(d dVar) {
        synchronized (f.class) {
            com.facebook.t.u.b.b();
            n c2 = c();
            for (com.facebook.t.a aVar : dVar.f()) {
                c2.a(aVar, dVar.c(aVar).d());
            }
            d(c2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:10:0x0021, B:12:0x0024, B:16:0x008a, B:23:0x002f, B:35:0x0047, B:37:0x004a, B:40:0x0055, B:32:0x0059, B:43:0x005e, B:45:0x0061, B:46:0x0073, B:49:0x006c, B:26:0x0075, B:28:0x0078, B:31:0x0083), top: B:3:0x0003, inners: #1, #4, #8, #10 }] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.facebook.t.n c() {
        /*
            java.lang.Class<com.facebook.t.f> r0 = com.facebook.t.f.class
            monitor-enter(r0)
            com.facebook.t.u.b.b()     // Catch: java.lang.Throwable -> L91
            android.content.Context r1 = com.facebook.f.e()     // Catch: java.lang.Throwable -> L91
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.FileNotFoundException -> L74
            com.facebook.t.f$a r4 = new com.facebook.t.f$a     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.FileNotFoundException -> L74
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.FileNotFoundException -> L74
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.FileNotFoundException -> L74
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.FileNotFoundException -> L74
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L5d java.io.FileNotFoundException -> L75
            com.facebook.t.n r3 = (com.facebook.t.n) r3     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L5d java.io.FileNotFoundException -> L75
            com.facebook.internal.x.h(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L91
            r1.delete()     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L91
            goto L36
        L2e:
            r1 = move-exception
            java.lang.String r2 = com.facebook.t.f.a     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L91
        L36:
            r2 = r3
            goto L88
        L38:
            r3 = move-exception
            goto L40
        L3a:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L5e
        L3e:
            r3 = move-exception
            r4 = r2
        L40:
            java.lang.String r5 = com.facebook.t.f.a     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L5d
            com.facebook.internal.x.h(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L91
            r1.delete()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L91
            goto L88
        L54:
            r1 = move-exception
            java.lang.String r3 = com.facebook.t.f.a     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L59:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L91
            goto L88
        L5d:
            r2 = move-exception
        L5e:
            com.facebook.internal.x.h(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L91
            r1.delete()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L91
            goto L73
        L6b:
            r1 = move-exception
            java.lang.String r3 = com.facebook.t.f.a     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L91
        L73:
            throw r2     // Catch: java.lang.Throwable -> L91
        L74:
            r4 = r2
        L75:
            com.facebook.internal.x.h(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> L91
            r1.delete()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> L91
            goto L88
        L82:
            r1 = move-exception
            java.lang.String r3 = com.facebook.t.f.a     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L59
        L88:
            if (r2 != 0) goto L8f
            com.facebook.t.n r2 = new com.facebook.t.n     // Catch: java.lang.Throwable -> L91
            r2.<init>()     // Catch: java.lang.Throwable -> L91
        L8f:
            monitor-exit(r0)
            return r2
        L91:
            r1 = move-exception
            monitor-exit(r0)
            goto L95
        L94:
            throw r1
        L95:
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.t.f.c():com.facebook.t.n");
    }

    private static void d(n nVar) {
        ObjectOutputStream objectOutputStream;
        Context e2 = com.facebook.f.e();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(e2.openFileOutput("AppEventsLogger.persistedevents", 0)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e3) {
            e = e3;
        }
        try {
            objectOutputStream.writeObject(nVar);
            x.h(objectOutputStream);
        } catch (Exception e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            Log.w(a, "Got unexpected exception while persisting events: ", e);
            try {
                e2.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            } catch (Exception unused) {
            }
            x.h(objectOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            x.h(objectOutputStream2);
            throw th;
        }
    }
}
