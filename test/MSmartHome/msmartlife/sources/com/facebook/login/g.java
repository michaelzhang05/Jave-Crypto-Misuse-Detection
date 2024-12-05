package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.d;
import com.facebook.internal.y;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: LoginManager.java */
/* loaded from: classes.dex */
public class g {
    private static final Set<String> a = f();

    /* renamed from: b, reason: collision with root package name */
    private static volatile g f9359b;

    /* renamed from: e, reason: collision with root package name */
    private final SharedPreferences f9362e;

    /* renamed from: c, reason: collision with root package name */
    private com.facebook.login.d f9360c = com.facebook.login.d.NATIVE_WITH_FALLBACK;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.login.b f9361d = com.facebook.login.b.FRIENDS;

    /* renamed from: f, reason: collision with root package name */
    private String f9363f = "rerequest";

    /* compiled from: LoginManager.java */
    /* loaded from: classes.dex */
    class a implements d.a {
        final /* synthetic */ com.facebook.e a;

        a(com.facebook.e eVar) {
            this.a = eVar;
        }

        @Override // com.facebook.internal.d.a
        public boolean a(int i2, Intent intent) {
            return g.this.n(i2, intent, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginManager.java */
    /* loaded from: classes.dex */
    public static class b extends HashSet<String> {
        b() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginManager.java */
    /* loaded from: classes.dex */
    public class c implements d.a {
        c() {
        }

        @Override // com.facebook.internal.d.a
        public boolean a(int i2, Intent intent) {
            return g.this.m(i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoginManager.java */
    /* loaded from: classes.dex */
    public static class d implements i {
        private final Activity a;

        d(Activity activity) {
            y.i(activity, "activity");
            this.a = activity;
        }

        @Override // com.facebook.login.i
        public Activity a() {
            return this.a;
        }

        @Override // com.facebook.login.i
        public void startActivityForResult(Intent intent, int i2) {
            this.a.startActivityForResult(intent, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoginManager.java */
    /* loaded from: classes.dex */
    public static class e {
        private static f a;

        /* JADX INFO: Access modifiers changed from: private */
        public static synchronized f b(Context context) {
            synchronized (e.class) {
                if (context == null) {
                    context = com.facebook.f.e();
                }
                if (context == null) {
                    return null;
                }
                if (a == null) {
                    a = new f(context, com.facebook.f.f());
                }
                return a;
            }
        }
    }

    g() {
        y.k();
        this.f9362e = com.facebook.f.e().getSharedPreferences("com.facebook.loginManager", 0);
        if (!com.facebook.f.q || com.facebook.internal.f.a() == null) {
            return;
        }
        c.c.b.b.a(com.facebook.f.e(), "com.android.chrome", new com.facebook.login.a());
        c.c.b.b.b(com.facebook.f.e(), com.facebook.f.e().getPackageName());
    }

    static h a(LoginClient.Request request, AccessToken accessToken) {
        Set<String> h2 = request.h();
        HashSet hashSet = new HashSet(accessToken.n());
        if (request.j()) {
            hashSet.retainAll(h2);
        }
        HashSet hashSet2 = new HashSet(h2);
        hashSet2.removeAll(hashSet);
        return new h(accessToken, hashSet, hashSet2);
    }

    private void c(AccessToken accessToken, LoginClient.Request request, FacebookException facebookException, boolean z, com.facebook.e<h> eVar) {
        if (accessToken != null) {
            AccessToken.v(accessToken);
            Profile.b();
        }
        if (eVar != null) {
            h a2 = accessToken != null ? a(request, accessToken) : null;
            if (z || (a2 != null && a2.b().size() == 0)) {
                eVar.onCancel();
                return;
            }
            if (facebookException != null) {
                eVar.onError(facebookException);
            } else if (accessToken != null) {
                q(true);
                eVar.onSuccess(a2);
            }
        }
    }

    public static g e() {
        if (f9359b == null) {
            synchronized (g.class) {
                if (f9359b == null) {
                    f9359b = new g();
                }
            }
        }
        return f9359b;
    }

    private static Set<String> f() {
        return Collections.unmodifiableSet(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || a.contains(str));
    }

    private void h(Context context, LoginClient.Result.b bVar, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        f b2 = e.b(context);
        if (b2 == null) {
            return;
        }
        if (request == null) {
            b2.g("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z ? "1" : "0");
        b2.e(request.b(), hashMap, bVar, map, exc);
    }

    private void l(Context context, LoginClient.Request request) {
        f b2 = e.b(context);
        if (b2 == null || request == null) {
            return;
        }
        b2.f(request);
    }

    private boolean p(Intent intent) {
        return com.facebook.f.e().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private void q(boolean z) {
        SharedPreferences.Editor edit = this.f9362e.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    private void r(i iVar, LoginClient.Request request) throws FacebookException {
        l(iVar.a(), request);
        com.facebook.internal.d.c(d.b.Login.d(), new c());
        if (s(iVar, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        h(iVar.a(), LoginClient.Result.b.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    private boolean s(i iVar, LoginClient.Request request) {
        Intent d2 = d(request);
        if (!p(d2)) {
            return false;
        }
        try {
            iVar.startActivityForResult(d2, LoginClient.q());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private void t(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (g(str)) {
                throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", str));
            }
        }
    }

    protected LoginClient.Request b(Collection<String> collection) {
        LoginClient.Request request = new LoginClient.Request(this.f9360c, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.f9361d, this.f9363f, com.facebook.f.f(), UUID.randomUUID().toString());
        request.l(AccessToken.t());
        return request;
    }

    protected Intent d(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(com.facebook.f.e(), FacebookActivity.class);
        intent.setAction(request.g().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public void i(Activity activity, Collection<String> collection) {
        r(new d(activity), b(collection));
    }

    public void j(Activity activity, Collection<String> collection) {
        t(collection);
        i(activity, collection);
    }

    public void k() {
        AccessToken.v(null);
        Profile.d(null);
        q(false);
    }

    boolean m(int i2, Intent intent) {
        return n(i2, intent, null);
    }

    boolean n(int i2, Intent intent, com.facebook.e<h> eVar) {
        LoginClient.Result.b bVar;
        AccessToken accessToken;
        LoginClient.Request request;
        Map<String, String> map;
        boolean z;
        Map<String, String> map2;
        LoginClient.Request request2;
        boolean z2;
        LoginClient.Result.b bVar2 = LoginClient.Result.b.ERROR;
        FacebookException facebookException = null;
        boolean z3 = false;
        if (intent != null) {
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request3 = result.f9322j;
                LoginClient.Result.b bVar3 = result.f9318f;
                if (i2 == -1) {
                    if (bVar3 == LoginClient.Result.b.SUCCESS) {
                        accessToken = result.f9319g;
                    } else {
                        facebookException = new FacebookAuthorizationException(result.f9320h);
                        accessToken = null;
                    }
                } else if (i2 == 0) {
                    accessToken = null;
                    z3 = true;
                } else {
                    accessToken = null;
                }
                map2 = result.f9323k;
                boolean z4 = z3;
                request2 = request3;
                bVar2 = bVar3;
                z2 = z4;
            } else {
                accessToken = null;
                map2 = null;
                request2 = null;
                z2 = false;
            }
            map = map2;
            bVar = bVar2;
            request = request2;
            z = z2;
        } else if (i2 == 0) {
            bVar = LoginClient.Result.b.CANCEL;
            accessToken = null;
            request = null;
            map = null;
            z = true;
        } else {
            bVar = bVar2;
            accessToken = null;
            request = null;
            map = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        h(null, bVar, map, facebookException, true, request);
        c(accessToken, request, facebookException, z, eVar);
        return true;
    }

    public void o(com.facebook.d dVar, com.facebook.e<h> eVar) {
        if (dVar instanceof com.facebook.internal.d) {
            ((com.facebook.internal.d) dVar).b(d.b.Login.d(), new a(eVar));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }
}
