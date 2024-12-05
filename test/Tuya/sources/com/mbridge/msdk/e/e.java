package com.mbridge.msdk.e;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f18866a;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f18869d;

    /* renamed from: i, reason: collision with root package name */
    private h f18874i;

    /* renamed from: b, reason: collision with root package name */
    private int f18867b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f18868c = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f18872g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f18873h = 604800000;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18875j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18876k = false;

    /* renamed from: f, reason: collision with root package name */
    private long f18871f = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private String f18870e = UUID.randomUUID().toString();

    public e(String str) {
        this.f18866a = str;
    }

    public final String a() {
        return this.f18866a;
    }

    public final int b() {
        return this.f18867b;
    }

    public final int c() {
        return this.f18868c;
    }

    public final JSONObject d() {
        JSONObject jSONObject = this.f18869d;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f18869d = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    public final String e() {
        return this.f18870e;
    }

    public final long f() {
        return this.f18871f;
    }

    public final long g() {
        return this.f18872g;
    }

    public final long h() {
        return this.f18873h;
    }

    public final h i() {
        return this.f18874i;
    }

    public final boolean j() {
        return this.f18875j;
    }

    public final boolean k() {
        return this.f18876k;
    }

    public final void a(int i8) {
        this.f18867b = i8;
    }

    public final void b(int i8) {
        this.f18868c = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j8) {
        this.f18873h = j8;
    }

    public final void a(JSONObject jSONObject) {
        this.f18869d = jSONObject;
    }

    public final void b(long j8) {
        this.f18872g = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        this.f18870e = str;
    }

    public final void a(long j8) {
        this.f18871f = j8;
    }

    public final void a(h hVar) {
        this.f18874i = hVar;
    }

    public final void a(boolean z8) {
        this.f18876k = z8;
    }
}
