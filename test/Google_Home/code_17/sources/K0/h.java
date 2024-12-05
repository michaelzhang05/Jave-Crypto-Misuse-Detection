package K0;

import J0.AbstractC1275j;
import K0.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
class h implements c {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f5019d = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    private final File f5020a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5021b;

    /* renamed from: c, reason: collision with root package name */
    private g f5022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements g.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f5023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f5024b;

        a(byte[] bArr, int[] iArr) {
            this.f5023a = bArr;
            this.f5024b = iArr;
        }

        @Override // K0.g.d
        public void a(InputStream inputStream, int i8) {
            try {
                inputStream.read(this.f5023a, this.f5024b[0], i8);
                int[] iArr = this.f5024b;
                iArr[0] = iArr[0] + i8;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f5026a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5027b;

        b(byte[] bArr, int i8) {
            this.f5026a = bArr;
            this.f5027b = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(File file, int i8) {
        this.f5020a = file;
        this.f5021b = i8;
    }

    private void f(long j8, String str) {
        if (this.f5022c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i8 = this.f5021b / 4;
            if (str.length() > i8) {
                str = "..." + str.substring(str.length() - i8);
            }
            this.f5022c.l(String.format(Locale.US, "%d %s%n", Long.valueOf(j8), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f5019d));
            while (!this.f5022c.v() && this.f5022c.K() > this.f5021b) {
                this.f5022c.G();
            }
        } catch (IOException e8) {
            G0.h.f().e("There was a problem writing to the Crashlytics log.", e8);
        }
    }

    private b g() {
        if (!this.f5020a.exists()) {
            return null;
        }
        h();
        g gVar = this.f5022c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.K()];
        try {
            this.f5022c.s(new a(bArr, iArr));
        } catch (IOException e8) {
            G0.h.f().e("A problem occurred while reading the Crashlytics log file.", e8);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f5022c == null) {
            try {
                this.f5022c = new g(this.f5020a);
            } catch (IOException e8) {
                G0.h.f().e("Could not open log file: " + this.f5020a, e8);
            }
        }
    }

    @Override // K0.c
    public void a() {
        AbstractC1275j.f(this.f5022c, "There was a problem closing the Crashlytics log file.");
        this.f5022c = null;
    }

    @Override // K0.c
    public String b() {
        byte[] c8 = c();
        if (c8 != null) {
            return new String(c8, f5019d);
        }
        return null;
    }

    @Override // K0.c
    public byte[] c() {
        b g8 = g();
        if (g8 == null) {
            return null;
        }
        int i8 = g8.f5027b;
        byte[] bArr = new byte[i8];
        System.arraycopy(g8.f5026a, 0, bArr, 0, i8);
        return bArr;
    }

    @Override // K0.c
    public void d() {
        a();
        this.f5020a.delete();
    }

    @Override // K0.c
    public void e(long j8, String str) {
        h();
        f(j8, str);
    }
}
