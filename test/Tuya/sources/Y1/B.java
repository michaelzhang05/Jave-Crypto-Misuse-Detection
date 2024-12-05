package Y1;

/* loaded from: classes4.dex */
abstract class B {

    /* renamed from: a, reason: collision with root package name */
    final int f12766a;

    /* renamed from: b, reason: collision with root package name */
    final int f12767b;

    /* renamed from: c, reason: collision with root package name */
    final String f12768c;

    /* renamed from: d, reason: collision with root package name */
    final String f12769d;

    /* renamed from: e, reason: collision with root package name */
    final String f12770e;

    /* renamed from: f, reason: collision with root package name */
    final long f12771f;

    /* renamed from: g, reason: collision with root package name */
    int f12772g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(int i8, int i9, String str, String str2, String str3, long j8) {
        this.f12766a = i8;
        this.f12767b = i9;
        this.f12768c = str;
        this.f12769d = str2;
        this.f12770e = str3;
        this.f12771f = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        if (this.f12772g == 0) {
            this.f12772g = D.c(this.f12770e);
        }
        return this.f12772g;
    }
}
