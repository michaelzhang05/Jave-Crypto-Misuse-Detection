package org.apache.cordova;

import android.util.Base64;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    public static String[] f8431g = {"No result", "OK", "Class not found", "Illegal access", "Instantiation error", "Malformed url", "IO error", "Invalid action", "JSON error", "Error"};

    /* renamed from: a, reason: collision with root package name */
    private final int f8432a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8433b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8434c;

    /* renamed from: d, reason: collision with root package name */
    private String f8435d;

    /* renamed from: e, reason: collision with root package name */
    private String f8436e;

    /* renamed from: f, reason: collision with root package name */
    private List f8437f;

    /* loaded from: classes.dex */
    public enum a {
        NO_RESULT,
        OK,
        CLASS_NOT_FOUND_EXCEPTION,
        ILLEGAL_ACCESS_EXCEPTION,
        INSTANTIATION_EXCEPTION,
        MALFORMED_URL_EXCEPTION,
        IO_EXCEPTION,
        INVALID_ACTION,
        JSON_EXCEPTION,
        ERROR
    }

    public f(a aVar) {
        this(aVar, f8431g[aVar.ordinal()]);
    }

    public boolean a() {
        return this.f8434c;
    }

    public String b() {
        if (this.f8436e == null) {
            this.f8436e = JSONObject.quote(this.f8435d);
        }
        return this.f8436e;
    }

    public int c() {
        return this.f8433b;
    }

    public f d(int i6) {
        return (f) this.f8437f.get(i6);
    }

    public int e() {
        return this.f8437f.size();
    }

    public int f() {
        return this.f8432a;
    }

    public String g() {
        return this.f8435d;
    }

    public void h(boolean z5) {
        this.f8434c = z5;
    }

    public f(a aVar, float f6) {
        this.f8434c = false;
        this.f8432a = aVar.ordinal();
        this.f8433b = 3;
        this.f8436e = "" + f6;
    }

    public f(a aVar, int i6) {
        this.f8434c = false;
        this.f8432a = aVar.ordinal();
        this.f8433b = 3;
        this.f8436e = "" + i6;
    }

    public f(a aVar, String str) {
        this.f8434c = false;
        this.f8432a = aVar.ordinal();
        this.f8433b = str == null ? 5 : 1;
        this.f8435d = str;
    }

    public f(a aVar, List list) {
        this.f8434c = false;
        this.f8432a = aVar.ordinal();
        this.f8433b = 8;
        this.f8437f = list;
    }

    public f(a aVar, JSONArray jSONArray) {
        this.f8434c = false;
        this.f8432a = aVar.ordinal();
        this.f8433b = 2;
        this.f8436e = jSONArray.toString();
    }

    public f(a aVar, JSONObject jSONObject) {
        this.f8434c = false;
        this.f8432a = aVar.ordinal();
        this.f8433b = 2;
        this.f8436e = jSONObject.toString();
    }

    public f(a aVar, boolean z5) {
        this.f8434c = false;
        this.f8432a = aVar.ordinal();
        this.f8433b = 4;
        this.f8436e = Boolean.toString(z5);
    }

    public f(a aVar, byte[] bArr) {
        this(aVar, bArr, false);
    }

    public f(a aVar, byte[] bArr, boolean z5) {
        this.f8434c = false;
        this.f8432a = aVar.ordinal();
        this.f8433b = z5 ? 7 : 6;
        this.f8436e = Base64.encodeToString(bArr, 2);
    }
}
