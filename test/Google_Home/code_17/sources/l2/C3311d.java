package l2;

import java.io.PrintWriter;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3311d {

    /* renamed from: a, reason: collision with root package name */
    public final int f34402a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34403b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34404c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34405d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34406e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34407f;

    /* renamed from: g, reason: collision with root package name */
    public final long f34408g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34409h;

    /* renamed from: i, reason: collision with root package name */
    public final long f34410i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34411j;

    /* renamed from: k, reason: collision with root package name */
    public final int f34412k;

    /* renamed from: l, reason: collision with root package name */
    public final int f34413l;

    /* renamed from: m, reason: collision with root package name */
    public final int f34414m;

    /* renamed from: n, reason: collision with root package name */
    public final long f34415n;

    public C3311d(int i8, int i9, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, int i10, int i11, int i12, long j16) {
        this.f34402a = i8;
        this.f34403b = i9;
        this.f34404c = j8;
        this.f34405d = j9;
        this.f34406e = j10;
        this.f34407f = j11;
        this.f34408g = j12;
        this.f34409h = j13;
        this.f34410i = j14;
        this.f34411j = j15;
        this.f34412k = i10;
        this.f34413l = i11;
        this.f34414m = i12;
        this.f34415n = j16;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f34402a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f34403b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f34403b / this.f34402a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f34404c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f34405d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f34412k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f34406e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f34409h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f34413l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f34407f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f34414m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f34408g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f34410i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f34411j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f34402a + ", size=" + this.f34403b + ", cacheHits=" + this.f34404c + ", cacheMisses=" + this.f34405d + ", downloadCount=" + this.f34412k + ", totalDownloadSize=" + this.f34406e + ", averageDownloadSize=" + this.f34409h + ", totalOriginalBitmapSize=" + this.f34407f + ", totalTransformedBitmapSize=" + this.f34408g + ", averageOriginalBitmapSize=" + this.f34410i + ", averageTransformedBitmapSize=" + this.f34411j + ", originalBitmapCount=" + this.f34413l + ", transformedBitmapCount=" + this.f34414m + ", timeStamp=" + this.f34415n + '}';
    }
}
