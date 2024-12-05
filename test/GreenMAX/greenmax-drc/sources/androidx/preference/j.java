package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PreferenceManager.java */
/* loaded from: classes.dex */
public class j {
    private Context a;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f1343c;

    /* renamed from: d, reason: collision with root package name */
    private e f1344d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences.Editor f1345e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1346f;

    /* renamed from: g, reason: collision with root package name */
    private String f1347g;

    /* renamed from: h, reason: collision with root package name */
    private int f1348h;

    /* renamed from: j, reason: collision with root package name */
    private PreferenceScreen f1350j;

    /* renamed from: k, reason: collision with root package name */
    private d f1351k;
    private c l;
    private a m;
    private b n;

    /* renamed from: b, reason: collision with root package name */
    private long f1342b = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f1349i = 0;

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void onDisplayPreferenceDialog(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface b {
        void onNavigateToScreen(PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean onPreferenceTreeClick(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    /* loaded from: classes.dex */
    public static abstract class d {
    }

    public j(Context context) {
        this.a = context;
        q(b(context));
    }

    private static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private void l(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f1345e) != null) {
            editor.apply();
        }
        this.f1346f = z;
    }

    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f1350j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.a1(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SharedPreferences.Editor c() {
        if (this.f1344d != null) {
            return null;
        }
        if (this.f1346f) {
            if (this.f1345e == null) {
                this.f1345e = j().edit();
            }
            return this.f1345e;
        }
        return j().edit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        long j2;
        synchronized (this) {
            j2 = this.f1342b;
            this.f1342b = 1 + j2;
        }
        return j2;
    }

    public b e() {
        return this.n;
    }

    public c f() {
        return this.l;
    }

    public d g() {
        return this.f1351k;
    }

    public e h() {
        return this.f1344d;
    }

    public PreferenceScreen i() {
        return this.f1350j;
    }

    public SharedPreferences j() {
        Context b2;
        if (h() != null) {
            return null;
        }
        if (this.f1343c == null) {
            if (this.f1349i != 1) {
                b2 = this.a;
            } else {
                b2 = androidx.core.content.a.b(this.a);
            }
            this.f1343c = b2.getSharedPreferences(this.f1347g, this.f1348h);
        }
        return this.f1343c;
    }

    public PreferenceScreen k(Context context, int i2, PreferenceScreen preferenceScreen) {
        l(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new i(context, this).d(i2, preferenceScreen);
        preferenceScreen2.h0(this);
        l(false);
        return preferenceScreen2;
    }

    public void m(a aVar) {
        this.m = aVar;
    }

    public void n(b bVar) {
        this.n = bVar;
    }

    public void o(c cVar) {
        this.l = cVar;
    }

    public boolean p(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f1350j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.m0();
        }
        this.f1350j = preferenceScreen;
        return true;
    }

    public void q(String str) {
        this.f1347g = str;
        this.f1343c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        return !this.f1346f;
    }

    public void s(Preference preference) {
        a aVar = this.m;
        if (aVar != null) {
            aVar.onDisplayPreferenceDialog(preference);
        }
    }
}
