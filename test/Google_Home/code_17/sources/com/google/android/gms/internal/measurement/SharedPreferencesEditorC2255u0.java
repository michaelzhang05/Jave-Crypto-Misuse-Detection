package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class SharedPreferencesEditorC2255u0 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16853a;

    /* renamed from: b, reason: collision with root package name */
    private Set f16854b;

    /* renamed from: c, reason: collision with root package name */
    private Map f16855c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ SharedPreferencesC2264v0 f16856d;

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f16855c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f16853a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        Map map;
        Set<SharedPreferences.OnSharedPreferenceChangeListener> set;
        Map map2;
        Map map3;
        if (this.f16853a) {
            map3 = this.f16856d.f16864a;
            map3.clear();
        }
        map = this.f16856d.f16864a;
        map.keySet().removeAll(this.f16854b);
        for (Map.Entry entry : this.f16855c.entrySet()) {
            map2 = this.f16856d.f16864a;
            map2.put((String) entry.getKey(), entry.getValue());
        }
        set = this.f16856d.f16865b;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : set) {
            x0.S it = x0.M.c(this.f16854b, this.f16855c.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f16856d, (String) it.next());
            }
        }
        if (!this.f16853a && this.f16854b.isEmpty() && this.f16855c.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z8) {
        a(str, Boolean.valueOf(z8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f8) {
        a(str, Float.valueOf(f8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i8) {
        a(str, Integer.valueOf(i8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j8) {
        a(str, Long.valueOf(j8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f16854b.add(str);
        return this;
    }

    private SharedPreferencesEditorC2255u0(SharedPreferencesC2264v0 sharedPreferencesC2264v0) {
        this.f16856d = sharedPreferencesC2264v0;
        this.f16853a = false;
        this.f16854b = new HashSet();
        this.f16855c = new HashMap();
    }
}
