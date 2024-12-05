package androidx.recyclerview.widget;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes.dex */
public class c implements l {
    final l a;

    /* renamed from: b, reason: collision with root package name */
    int f1503b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f1504c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f1505d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f1506e = null;

    public c(l lVar) {
        this.a = lVar;
    }

    @Override // androidx.recyclerview.widget.l
    public void a(int i2, int i3) {
        e();
        this.a.a(i2, i3);
    }

    @Override // androidx.recyclerview.widget.l
    public void b(int i2, int i3) {
        int i4;
        if (this.f1503b == 1 && i2 >= (i4 = this.f1504c)) {
            int i5 = this.f1505d;
            if (i2 <= i4 + i5) {
                this.f1505d = i5 + i3;
                this.f1504c = Math.min(i2, i4);
                return;
            }
        }
        e();
        this.f1504c = i2;
        this.f1505d = i3;
        this.f1503b = 1;
    }

    @Override // androidx.recyclerview.widget.l
    public void c(int i2, int i3) {
        int i4;
        if (this.f1503b == 2 && (i4 = this.f1504c) >= i2 && i4 <= i2 + i3) {
            this.f1505d += i3;
            this.f1504c = i2;
        } else {
            e();
            this.f1504c = i2;
            this.f1505d = i3;
            this.f1503b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public void d(int i2, int i3, Object obj) {
        int i4;
        if (this.f1503b == 3) {
            int i5 = this.f1504c;
            int i6 = this.f1505d;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.f1506e == obj) {
                this.f1504c = Math.min(i2, i5);
                this.f1505d = Math.max(i6 + i5, i4) - this.f1504c;
                return;
            }
        }
        e();
        this.f1504c = i2;
        this.f1505d = i3;
        this.f1506e = obj;
        this.f1503b = 3;
    }

    public void e() {
        int i2 = this.f1503b;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            this.a.b(this.f1504c, this.f1505d);
        } else if (i2 == 2) {
            this.a.c(this.f1504c, this.f1505d);
        } else if (i2 == 3) {
            this.a.d(this.f1504c, this.f1505d, this.f1506e);
        }
        this.f1506e = null;
        this.f1503b = 0;
    }
}
