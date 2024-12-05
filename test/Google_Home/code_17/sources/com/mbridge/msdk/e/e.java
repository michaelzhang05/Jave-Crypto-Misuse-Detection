package com.mbridge.msdk.e;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f19921a;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f19924d;

    /* renamed from: i, reason: collision with root package name */
    private h f19929i;

    /* renamed from: b, reason: collision with root package name */
    private int f19922b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f19923c = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f19927g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f19928h = 604800000;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19930j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19931k = false;

    /* renamed from: f, reason: collision with root package name */
    private long f19926f = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private String f19925e = UUID.randomUUID().toString();

    public e(String str) {
        this.f19921a = str;
    }

    public final String a() {
        return this.f19921a;
    }

    public final int b() {
        return this.f19922b;
    }

    public final int c() {
        return this.f19923c;
    }

    public final JSONObject d() {
        JSONObject jSONObject = this.f19924d;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f19924d = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    public final String e() {
        return this.f19925e;
    }

    public final long f() {
        return this.f19926f;
    }

    public final long g() {
        return this.f19927g;
    }

    public final long h() {
        return this.f19928h;
    }

    public final h i() {
        return this.f19929i;
    }

    public final boolean j() {
        return this.f19930j;
    }

    public final boolean k() {
        return this.f19931k;
    }

    public final void a(int i8) {
        this.f19922b = i8;
    }

    public final void b(int i8) {
        this.f19923c = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j8) {
        this.f19928h = j8;
    }

    public final void a(JSONObject jSONObject) {
        this.f19924d = jSONObject;
    }

    public final void b(long j8) {
        this.f19927g = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        this.f19925e = str;
    }

    public final void a(long j8) {
        this.f19926f = j8;
    }

    public final void a(h hVar) {
        this.f19929i = hVar;
    }

    public final void a(boolean z8) {
        this.f19931k = z8;
    }
}
