package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.y;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileCache.java */
/* loaded from: classes.dex */
public final class m {
    private final SharedPreferences a = f.e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Profile b() {
        String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Profile profile) {
        y.i(profile, "profile");
        JSONObject e2 = profile.e();
        if (e2 != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", e2.toString()).apply();
        }
    }
}
