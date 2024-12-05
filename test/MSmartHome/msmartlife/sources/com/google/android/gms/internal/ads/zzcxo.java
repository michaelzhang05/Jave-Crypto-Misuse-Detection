package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzcxo {
    public final List<String> a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14560c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14561d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14562e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14563f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxo(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzazc.b(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("response_code".equals(nextName)) {
                i3 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j2 = jsonReader.nextLong();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.a = emptyList;
        this.f14560c = i2;
        this.f14559b = str;
        this.f14561d = str2;
        this.f14562e = i3;
        this.f14563f = j2;
    }
}
