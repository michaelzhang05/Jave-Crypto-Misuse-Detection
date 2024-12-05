package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16089a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f16090b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f16091c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ I1 f16092d;

    public E1(I1 i12, String str, Bundle bundle) {
        this.f16092d = i12;
        AbstractC1319p.f("default_event_parameters");
        this.f16089a = "default_event_parameters";
        this.f16090b = new Bundle();
    }

    public final Bundle a() {
        char c8;
        if (this.f16091c == null) {
            String string = this.f16092d.o().getString(this.f16089a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i8);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals("s")) {
                                        c8 = 0;
                                    }
                                    c8 = 65535;
                                } else {
                                    if (string3.equals("l")) {
                                        c8 = 2;
                                    }
                                    c8 = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c8 = 1;
                                }
                                c8 = 65535;
                            }
                            if (c8 != 0) {
                                if (c8 != 1) {
                                    if (c8 != 2) {
                                        this.f16092d.f16777a.d().r().b("Unrecognized persisted bundle type. Type", string3);
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString("v"));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f16092d.f16777a.d().r().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f16091c = bundle;
                } catch (JSONException unused2) {
                    this.f16092d.f16777a.d().r().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f16091c == null) {
                this.f16091c = this.f16090b;
            }
        }
        return this.f16091c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f16092d.o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f16089a);
        } else {
            String str = this.f16089a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f16092d.f16777a.d().r().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e8) {
                        this.f16092d.f16777a.d().r().b("Cannot serialize bundle value to SharedPreferences", e8);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f16091c = bundle;
    }
}
