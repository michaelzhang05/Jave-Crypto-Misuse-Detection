package eightbitlab.com.blurview;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final float f30946a;

    /* loaded from: classes5.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f30947a;

        /* renamed from: b, reason: collision with root package name */
        final int f30948b;

        /* renamed from: c, reason: collision with root package name */
        final float f30949c;

        a(int i8, int i9, float f8) {
            this.f30947a = i8;
            this.f30948b = i9;
            this.f30949c = f8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f30947a == aVar.f30947a && this.f30948b == aVar.f30948b && Float.compare(aVar.f30949c, this.f30949c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i8;
            int i9 = ((this.f30947a * 31) + this.f30948b) * 31;
            float f8 = this.f30949c;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            } else {
                i8 = 0;
            }
            return i9 + i8;
        }

        public String toString() {
            return "Size{width=" + this.f30947a + ", height=" + this.f30948b + ", scaleFactor=" + this.f30949c + '}';
        }
    }

    public e(float f8) {
        this.f30946a = f8;
    }

    private int a(float f8) {
        return (int) Math.ceil(f8 / this.f30946a);
    }

    private int c(int i8) {
        int i9 = i8 % 64;
        if (i9 == 0) {
            return i8;
        }
        return (i8 - i9) + 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i8, int i9) {
        if (a(i9) != 0 && a(i8) != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a d(int i8, int i9) {
        float f8 = i8;
        int c8 = c(a(f8));
        return new a(c8, (int) Math.ceil(i9 / r4), f8 / c8);
    }
}
