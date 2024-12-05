package b2;

/* renamed from: b2.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC1958B {

    /* renamed from: a, reason: collision with root package name */
    final int f15051a;

    /* renamed from: b, reason: collision with root package name */
    final int f15052b;

    /* renamed from: c, reason: collision with root package name */
    final String f15053c;

    /* renamed from: d, reason: collision with root package name */
    final String f15054d;

    /* renamed from: e, reason: collision with root package name */
    final String f15055e;

    /* renamed from: f, reason: collision with root package name */
    final long f15056f;

    /* renamed from: g, reason: collision with root package name */
    int f15057g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1958B(int i8, int i9, String str, String str2, String str3, long j8) {
        this.f15051a = i8;
        this.f15052b = i9;
        this.f15053c = str;
        this.f15054d = str2;
        this.f15055e = str3;
        this.f15056f = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        if (this.f15057g == 0) {
            this.f15057g = C1960D.c(this.f15055e);
        }
        return this.f15057g;
    }
}
