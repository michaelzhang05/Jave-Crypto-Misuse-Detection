package I0;

import H0.AbstractC1176j;
import I0.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
class f implements I0.a {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f3715d = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    private final File f3716a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3717b;

    /* renamed from: c, reason: collision with root package name */
    private e f3718c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements e.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f3719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f3720b;

        a(byte[] bArr, int[] iArr) {
            this.f3719a = bArr;
            this.f3720b = iArr;
        }

        @Override // I0.e.d
        public void a(InputStream inputStream, int i8) {
            try {
                inputStream.read(this.f3719a, this.f3720b[0], i8);
                int[] iArr = this.f3720b;
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
        public final byte[] f3722a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3723b;

        b(byte[] bArr, int i8) {
            this.f3722a = bArr;
            this.f3723b = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(File file, int i8) {
        this.f3716a = file;
        this.f3717b = i8;
    }

    private void f(long j8, String str) {
        if (this.f3718c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i8 = this.f3717b / 4;
            if (str.length() > i8) {
                str = "..." + str.substring(str.length() - i8);
            }
            this.f3718c.g(String.format(Locale.US, "%d %s%n", Long.valueOf(j8), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f3715d));
            while (!this.f3718c.t() && this.f3718c.K() > this.f3717b) {
                this.f3718c.G();
            }
        } catch (IOException e8) {
            E0.f.f().e("There was a problem writing to the Crashlytics log.", e8);
        }
    }

    private b g() {
        if (!this.f3716a.exists()) {
            return null;
        }
        h();
        e eVar = this.f3718c;
        if (eVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[eVar.K()];
        try {
            this.f3718c.o(new a(bArr, iArr));
        } catch (IOException e8) {
            E0.f.f().e("A problem occurred while reading the Crashlytics log file.", e8);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f3718c == null) {
            try {
                this.f3718c = new e(this.f3716a);
            } catch (IOException e8) {
                E0.f.f().e("Could not open log file: " + this.f3716a, e8);
            }
        }
    }

    @Override // I0.a
    public void a() {
        AbstractC1176j.e(this.f3718c, "There was a problem closing the Crashlytics log file.");
        this.f3718c = null;
    }

    @Override // I0.a
    public String b() {
        byte[] c8 = c();
        if (c8 != null) {
            return new String(c8, f3715d);
        }
        return null;
    }

    @Override // I0.a
    public byte[] c() {
        b g8 = g();
        if (g8 == null) {
            return null;
        }
        int i8 = g8.f3723b;
        byte[] bArr = new byte[i8];
        System.arraycopy(g8.f3722a, 0, bArr, 0, i8);
        return bArr;
    }

    @Override // I0.a
    public void d() {
        a();
        this.f3716a.delete();
    }

    @Override // I0.a
    public void e(long j8, String str) {
        h();
        f(j8, str);
    }
}
