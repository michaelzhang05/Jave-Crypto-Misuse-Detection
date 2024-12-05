package io.sentry;

/* compiled from: Attachment.java */
/* loaded from: classes2.dex */
public final class s0 {
    private byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private final r2 f19217b;

    /* renamed from: c, reason: collision with root package name */
    private String f19218c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19219d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19220e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19221f;

    /* renamed from: g, reason: collision with root package name */
    private String f19222g;

    public s0(byte[] bArr, String str, String str2, boolean z) {
        this(bArr, str, str2, "event.attachment", z);
    }

    public static s0 a(byte[] bArr) {
        return new s0(bArr, "screenshot.png", "image/png", false);
    }

    public static s0 b(byte[] bArr) {
        return new s0(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static s0 c(io.sentry.protocol.b0 b0Var) {
        return new s0((r2) b0Var, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public String d() {
        return this.f19222g;
    }

    public byte[] e() {
        return this.a;
    }

    public String f() {
        return this.f19220e;
    }

    public String g() {
        return this.f19219d;
    }

    public String h() {
        return this.f19218c;
    }

    public r2 i() {
        return this.f19217b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f19221f;
    }

    public s0(byte[] bArr, String str, String str2, String str3, boolean z) {
        this.f19222g = "event.attachment";
        this.a = bArr;
        this.f19217b = null;
        this.f19219d = str;
        this.f19220e = str2;
        this.f19222g = str3;
        this.f19221f = z;
    }

    public s0(r2 r2Var, String str, String str2, String str3, boolean z) {
        this.f19222g = "event.attachment";
        this.a = null;
        this.f19217b = r2Var;
        this.f19219d = str;
        this.f19220e = str2;
        this.f19222g = str3;
        this.f19221f = z;
    }
}
