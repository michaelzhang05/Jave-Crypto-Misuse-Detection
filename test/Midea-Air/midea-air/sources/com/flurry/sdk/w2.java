package com.flurry.sdk;

import com.flurry.sdk.c3;
import com.flurry.sdk.p3;
import com.flurry.sdk.x2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class w2 extends c3 {
    protected p3 s;
    protected x6 t;

    /* loaded from: classes2.dex */
    final class a extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u6 f10233h;

        /* renamed from: com.flurry.sdk.w2$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C0170a implements p3.a {
            C0170a() {
            }

            @Override // com.flurry.sdk.p3.a
            public final void a() {
                w2.this.p = c3.c.f9785h;
                w2.this.s.d();
                w2.this.p = c3.c.f9786i;
                w2.this.v();
            }
        }

        a(u6 u6Var) {
            this.f10233h = u6Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            if (!w2.this.s.c()) {
                if (w2.this.y("currentFile")) {
                    d1.c(4, "FileWriterModule", "File created. Adding counter");
                    w2.this.s.f(t5.h(), null);
                } else {
                    d1.c(4, "FileWriterModule", "File creation failed.");
                }
            }
            if (this.f10233h.a().equals(s6.FLUSH_FRAME)) {
                w2.this.p = c3.c.f9785h;
                d1.c(4, "FileWriterModule", "Adding flush frame:" + this.f10233h.d());
                w2.this.s.f(this.f10233h, new C0170a());
                return;
            }
            d1.c(4, "FileWriterModule", "Adding frame " + this.f10233h.a() + ": " + this.f10233h.d());
            w2.this.s.f(this.f10233h, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w2() {
        super("FileWriterModule", null);
        this.s = null;
        this.t = null;
        this.s = new m3();
        this.t = new x6();
    }

    private static String A() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null || i2 >= 1000 || sb.length() + readLine.length() > 524288) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
                i2++;
            }
            d1.c(4, "FileWriterModule", "Get Logcat lines: ".concat(String.valueOf(i2)));
            return sb.toString();
        } catch (IOException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(String str) {
        if (this.s.c()) {
            d1.c(6, "FileWriterModule", "File was open, closing now.");
            this.s.a();
        }
        return this.s.i(q2.e(), str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:10|(1:12)(1:52)|13|(1:15)(1:51)|16|(2:18|(1:20)(1:21))|22|(2:48|(12:50|25|(1:27)|28|29|30|31|32|(1:34)(1:45)|35|(1:(2:38|39)(2:41|42))(2:43|44)|40))|24|25|(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        com.flurry.sdk.d1.c(4, "FileWriterModule", "Issue parsing session id into start time: ".concat(java.lang.String.valueOf(r7)));
        r19 = r14;
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.flurry.sdk.t3 z() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.w2.z():com.flurry.sdk.t3");
    }

    @Override // com.flurry.sdk.c3
    public final void b(u6 u6Var) {
        if (this.p == c3.c.f9785h) {
            this.q.add(u6Var);
            d1.c(4, "FileWriterModule", "In paused state, cannot process message now. " + u6Var.a());
            return;
        }
        m(new a(u6Var));
    }

    @Override // com.flurry.sdk.c3, com.flurry.sdk.x2
    public final x2.a c(u6 u6Var) {
        m3 m3Var = new m3();
        if (m3Var.i(q2.e(), "crashFile")) {
            m3Var.b(u6Var);
            m3Var.a();
        } else {
            d1.c(4, "FileWriterModule", "Can't create crash file. Cannot write crash frame to disc");
        }
        return x2.a.QUEUED;
    }

    @Override // com.flurry.sdk.c3
    public final void t() {
        q2.a();
        File file = new File(q2.e());
        if (!file.exists()) {
            file.mkdirs();
        }
        q2.a();
        File file2 = new File(q2.c());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        t3 z = z();
        s3 i2 = z != null ? s3.i(z) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(q2.e());
        String str = File.separator;
        sb.append(str);
        sb.append("currentFile");
        if (q2.d(sb.toString())) {
            if (q2.d(q2.e() + str + "crashFile")) {
                w6 w6Var = new w6(q2.e(), "currentFile");
                w6 w6Var2 = new w6(q2.e(), "crashFile");
                if (r2.a(w6Var, w6Var2) && r2.b(w6Var.a, w6Var.f10247b, w6Var2.a, w6Var2.f10247b) && x6.d(w6Var, w6Var2)) {
                    x6.a(w6Var2);
                }
                x6.a(w6Var2);
            }
            this.s.d();
        }
        if (y("currentFile")) {
            this.s.f(t5.h(), null);
            if (i2 != null) {
                this.s.b(i2);
            }
        }
    }
}
