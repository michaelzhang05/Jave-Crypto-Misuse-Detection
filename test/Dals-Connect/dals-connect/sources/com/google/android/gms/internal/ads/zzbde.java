package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzbde {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13188b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13189c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13190d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13191e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13192f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13193g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13194h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13195i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13196j;

    public zzbde(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", zzacu.P);
        this.f13188b = c(jSONObject, "byte_buffer_precache_limit", zzacu.y);
        this.f13189c = c(jSONObject, "exo_cache_buffer_size", zzacu.D);
        this.f13190d = c(jSONObject, "exo_connect_timeout_millis", zzacu.u);
        this.f13191e = d(jSONObject, "exo_player_version", zzacu.t);
        this.f13192f = c(jSONObject, "exo_read_timeout_millis", zzacu.v);
        this.f13193g = c(jSONObject, "load_check_interval_bytes", zzacu.w);
        this.f13194h = c(jSONObject, "player_precache_limit", zzacu.x);
        this.f13195i = c(jSONObject, "socket_receive_buffer_size", zzacu.z);
        this.f13196j = a(jSONObject, "use_cache_data_source", zzacu.y3);
    }

    private static boolean a(JSONObject jSONObject, String str, zzacj<Boolean> zzacjVar) {
        return b(jSONObject, str, ((Boolean) zzyt.e().c(zzacjVar)).booleanValue());
    }

    private static boolean b(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    private static int c(JSONObject jSONObject, String str, zzacj<Integer> zzacjVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzyt.e().c(zzacjVar)).intValue();
    }

    private static String d(JSONObject jSONObject, String str, zzacj<String> zzacjVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) zzyt.e().c(zzacjVar);
    }
}
