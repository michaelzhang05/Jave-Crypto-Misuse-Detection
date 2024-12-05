package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import i4.j;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final w3.e f5858a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f5859b;

    /* renamed from: c, reason: collision with root package name */
    private final r1.c f5860c;

    /* renamed from: d, reason: collision with root package name */
    private final k4.b f5861d;

    /* renamed from: e, reason: collision with root package name */
    private final k4.b f5862e;

    /* renamed from: f, reason: collision with root package name */
    private final l4.e f5863f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(w3.e eVar, g0 g0Var, k4.b bVar, k4.b bVar2, l4.e eVar2) {
        this(eVar, g0Var, new r1.c(eVar.j()), bVar, bVar2, eVar2);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private l2.i d(l2.i iVar) {
        return iVar.f(new androidx.profileinstaller.g(), new l2.a() { // from class: com.google.firebase.messaging.a0
            @Override // l2.a
            public final Object a(l2.i iVar2) {
                String i6;
                i6 = b0.this.i(iVar2);
                return i6;
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f5858a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i(l2.i iVar) {
        return g((Bundle) iVar.j(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) {
        j.a b6;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f5858a.m().c());
        bundle.putString("gmsv", Integer.toString(this.f5859b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f5859b.a());
        bundle.putString("app_ver_name", this.f5859b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String b7 = ((com.google.firebase.installations.g) l2.l.a(this.f5863f.b(false))).b();
            if (TextUtils.isEmpty(b7)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", b7);
            }
        } catch (InterruptedException | ExecutionException e6) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e6);
        }
        bundle.putString("appid", (String) l2.l.a(this.f5863f.a()));
        bundle.putString("cliv", "fcm-23.1.2");
        i4.j jVar = (i4.j) this.f5862e.get();
        s4.i iVar = (s4.i) this.f5861d.get();
        if (jVar == null || iVar == null || (b6 = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b6.a()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private l2.i k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f5860c.a(bundle);
        } catch (InterruptedException | ExecutionException e6) {
            return l2.l.d(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2.i c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(k(g0.c(this.f5858a), "*", bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2.i f() {
        return d(k(g0.c(this.f5858a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2.i l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(k(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2.i m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(k(str, "/topics/" + str2, bundle));
    }

    b0(w3.e eVar, g0 g0Var, r1.c cVar, k4.b bVar, k4.b bVar2, l4.e eVar2) {
        this.f5858a = eVar;
        this.f5859b = g0Var;
        this.f5860c = cVar;
        this.f5861d = bVar;
        this.f5862e = bVar2;
        this.f5863f = eVar2;
    }
}
