package n3;

import android.content.Context;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import g3.l;
import g3.n;
import g3.o;
import g3.q;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import u3.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f7973d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final String f7974e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final q f7975a;

    /* renamed from: b, reason: collision with root package name */
    private final g3.a f7976b;

    /* renamed from: c, reason: collision with root package name */
    private o f7977c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f7978a = null;

        /* renamed from: b, reason: collision with root package name */
        private String f7979b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f7980c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f7981d = null;

        /* renamed from: e, reason: collision with root package name */
        private g3.a f7982e = null;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7983f = true;

        /* renamed from: g, reason: collision with root package name */
        private l f7984g = null;

        /* renamed from: h, reason: collision with root package name */
        private o f7985h;

        private o g() {
            if (this.f7984g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            o a6 = o.i().a(this.f7984g);
            o h6 = a6.h(a6.d().i().Z(0).Z());
            d dVar = new d(this.f7978a, this.f7979b, this.f7980c);
            if (this.f7982e != null) {
                h6.d().r(dVar, this.f7982e);
            } else {
                g3.c.b(h6.d(), dVar);
            }
            return h6;
        }

        private static byte[] h(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        private o i(byte[] bArr) {
            return o.j(g3.c.a(g3.b.c(bArr)));
        }

        private o j(byte[] bArr) {
            try {
                this.f7982e = new c().a(this.f7981d);
                try {
                    return o.j(n.n(g3.b.c(bArr), this.f7982e));
                } catch (IOException | GeneralSecurityException e6) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e6;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e7) {
                try {
                    o i6 = i(bArr);
                    Log.w(a.f7974e, "cannot use Android Keystore, it'll be disabled", e7);
                    return i6;
                } catch (IOException unused2) {
                    throw e7;
                }
            }
        }

        private g3.a k() {
            if (!a.b()) {
                Log.w(a.f7974e, "Android Keystore requires at least Android M");
                return null;
            }
            c cVar = new c();
            try {
                boolean d6 = c.d(this.f7981d);
                try {
                    return cVar.a(this.f7981d);
                } catch (GeneralSecurityException | ProviderException e6) {
                    if (!d6) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f7981d), e6);
                    }
                    Log.w(a.f7974e, "cannot use Android Keystore, it'll be disabled", e6);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e7) {
                Log.w(a.f7974e, "cannot use Android Keystore, it'll be disabled", e7);
                return null;
            }
        }

        public synchronized a f() {
            o i6;
            a aVar;
            if (this.f7979b == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (a.f7973d) {
                byte[] h6 = h(this.f7978a, this.f7979b, this.f7980c);
                if (h6 == null) {
                    if (this.f7981d != null) {
                        this.f7982e = k();
                    }
                    i6 = g();
                } else {
                    if (this.f7981d != null && a.b()) {
                        i6 = j(h6);
                    }
                    i6 = i(h6);
                }
                this.f7985h = i6;
                aVar = new a(this);
            }
            return aVar;
        }

        public b l(l lVar) {
            this.f7984g = lVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f7983f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f7981d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f7978a = context;
            this.f7979b = str;
            this.f7980c = str2;
            return this;
        }
    }

    private a(b bVar) {
        this.f7975a = new d(bVar.f7978a, bVar.f7979b, bVar.f7980c);
        this.f7976b = bVar.f7982e;
        this.f7977c = bVar.f7985h;
    }

    static /* synthetic */ boolean b() {
        return e();
    }

    private static boolean e() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public synchronized n d() {
        return this.f7977c.d();
    }
}
