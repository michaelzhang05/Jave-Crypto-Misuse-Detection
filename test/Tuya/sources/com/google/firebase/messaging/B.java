package com.google.firebase.messaging;

import N.C1255c;
import a1.InterfaceC1554e;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import r0.InterfaceC3671b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private final y0.e f17298a;

    /* renamed from: b, reason: collision with root package name */
    private final G f17299b;

    /* renamed from: c, reason: collision with root package name */
    private final C1255c f17300c;

    /* renamed from: d, reason: collision with root package name */
    private final Z0.b f17301d;

    /* renamed from: e, reason: collision with root package name */
    private final Z0.b f17302e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1554e f17303f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(y0.e eVar, G g8, Z0.b bVar, Z0.b bVar2, InterfaceC1554e interfaceC1554e) {
        this(eVar, g8, new C1255c(eVar.k()), bVar, bVar2, interfaceC1554e);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task c(Task task) {
        return task.f(new androidx.profileinstaller.c(), new InterfaceC3671b() { // from class: com.google.firebase.messaging.A
            @Override // r0.InterfaceC3671b
            public final Object a(Task task2) {
                String h8;
                h8 = B.this.h(task2);
                return h8;
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f17298a.m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h(Task task) {
        return f((Bundle) task.k(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            y0.e r3 = r2.f17298a
            y0.m r3 = r3.n()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.G r3 = r2.f17299b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.G r3 = r2.f17299b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.G r3 = r2.f17299b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.d()
            r5.putString(r3, r4)
            a1.e r3 = r2.f17303f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            com.google.android.gms.tasks.Task r3 = r3.a(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = r0.l.a(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            com.google.firebase.installations.g r3 = (com.google.firebase.installations.g) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.b()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L85:
            a1.e r3 = r2.f17303f
            com.google.android.gms.tasks.Task r3 = r3.getId()
            java.lang.Object r3 = r0.l.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "23.2.1"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            Z0.b r3 = r2.f17302e
            java.lang.Object r3 = r3.get()
            X0.j r3 = (X0.j) r3
            Z0.b r4 = r2.f17301d
            java.lang.Object r4 = r4.get()
            h1.i r4 = (h1.i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            X0.j$a r3 = r3.b(r0)
            X0.j$a r0 = X0.j.a.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.a()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.B.i(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    private Task j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.f17300c.a(bundle);
        } catch (InterruptedException | ExecutionException e8) {
            return r0.l.d(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task e() {
        return c(j(G.c(this.f17298a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(j(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(j(str, "/topics/" + str2, bundle));
    }

    B(y0.e eVar, G g8, C1255c c1255c, Z0.b bVar, Z0.b bVar2, InterfaceC1554e interfaceC1554e) {
        this.f17298a = eVar;
        this.f17299b = g8;
        this.f17300c = c1255c;
        this.f17301d = bVar;
        this.f17302e = bVar2;
        this.f17303f = interfaceC1554e;
    }
}
