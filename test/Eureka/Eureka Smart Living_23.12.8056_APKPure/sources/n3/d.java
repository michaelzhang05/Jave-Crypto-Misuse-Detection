package n3;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import g3.q;
import java.io.IOException;
import t3.c0;
import t3.t;
import u3.k;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f7994a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7995b;

    public d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f7995b = str;
        Context applicationContext = context.getApplicationContext();
        this.f7994a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    @Override // g3.q
    public void a(t tVar) {
        if (!this.f7994a.putString(this.f7995b, k.b(tVar.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // g3.q
    public void b(c0 c0Var) {
        if (!this.f7994a.putString(this.f7995b, k.b(c0Var.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
