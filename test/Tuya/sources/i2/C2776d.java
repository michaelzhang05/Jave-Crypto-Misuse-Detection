package i2;

import java.io.PrintWriter;

/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2776d {

    /* renamed from: a, reason: collision with root package name */
    public final int f31550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31551b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31552c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31553d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31554e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31555f;

    /* renamed from: g, reason: collision with root package name */
    public final long f31556g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31557h;

    /* renamed from: i, reason: collision with root package name */
    public final long f31558i;

    /* renamed from: j, reason: collision with root package name */
    public final long f31559j;

    /* renamed from: k, reason: collision with root package name */
    public final int f31560k;

    /* renamed from: l, reason: collision with root package name */
    public final int f31561l;

    /* renamed from: m, reason: collision with root package name */
    public final int f31562m;

    /* renamed from: n, reason: collision with root package name */
    public final long f31563n;

    public C2776d(int i8, int i9, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, int i10, int i11, int i12, long j16) {
        this.f31550a = i8;
        this.f31551b = i9;
        this.f31552c = j8;
        this.f31553d = j9;
        this.f31554e = j10;
        this.f31555f = j11;
        this.f31556g = j12;
        this.f31557h = j13;
        this.f31558i = j14;
        this.f31559j = j15;
        this.f31560k = i10;
        this.f31561l = i11;
        this.f31562m = i12;
        this.f31563n = j16;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f31550a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f31551b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f31551b / this.f31550a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f31552c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f31553d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f31560k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f31554e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f31557h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f31561l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f31555f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f31562m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f31556g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f31558i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f31559j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f31550a + ", size=" + this.f31551b + ", cacheHits=" + this.f31552c + ", cacheMisses=" + this.f31553d + ", downloadCount=" + this.f31560k + ", totalDownloadSize=" + this.f31554e + ", averageDownloadSize=" + this.f31557h + ", totalOriginalBitmapSize=" + this.f31555f + ", totalTransformedBitmapSize=" + this.f31556g + ", averageOriginalBitmapSize=" + this.f31558i + ", averageTransformedBitmapSize=" + this.f31559j + ", originalBitmapCount=" + this.f31561l + ", transformedBitmapCount=" + this.f31562m + ", timeStamp=" + this.f31563n + '}';
    }
}
