package T4;

import R4.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: w, reason: collision with root package name */
    private static b f10077w;

    /* renamed from: x, reason: collision with root package name */
    private static b f10078x;

    /* renamed from: y, reason: collision with root package name */
    private static b f10079y;

    /* renamed from: a, reason: collision with root package name */
    private int f10081a;

    /* renamed from: b, reason: collision with root package name */
    private e f10082b;

    /* renamed from: c, reason: collision with root package name */
    private d f10083c;

    /* renamed from: d, reason: collision with root package name */
    private String f10084d;

    /* renamed from: e, reason: collision with root package name */
    private final Process f10085e;

    /* renamed from: f, reason: collision with root package name */
    private final BufferedReader f10086f;

    /* renamed from: g, reason: collision with root package name */
    private final BufferedReader f10087g;

    /* renamed from: h, reason: collision with root package name */
    private final OutputStreamWriter f10088h;

    /* renamed from: i, reason: collision with root package name */
    private final List f10089i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10090j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f10091k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10092l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10093m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10094n;

    /* renamed from: o, reason: collision with root package name */
    private int f10095o;

    /* renamed from: p, reason: collision with root package name */
    private int f10096p;

    /* renamed from: q, reason: collision with root package name */
    private int f10097q;

    /* renamed from: r, reason: collision with root package name */
    private int f10098r;

    /* renamed from: s, reason: collision with root package name */
    private int f10099s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10100t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f10101u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f10102v;

    /* renamed from: z, reason: collision with root package name */
    private static String[] f10080z = {null, null};

    /* renamed from: A, reason: collision with root package name */
    public static d f10076A = d.NORMAL;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    try {
                        synchronized (b.this.f10089i) {
                            while (!b.this.f10090j && b.this.f10097q >= b.this.f10089i.size()) {
                                try {
                                    b bVar = b.this;
                                    bVar.f10092l = false;
                                    bVar.f10089i.wait();
                                } finally {
                                }
                            }
                        }
                        if (b.this.f10097q >= b.this.f10095o) {
                            while (b.this.f10096p != b.this.f10097q) {
                                R4.a.c("Waiting for read and write to catch up before cleanup.");
                            }
                            b.this.x();
                        }
                        if (b.this.f10097q < b.this.f10089i.size()) {
                            b bVar2 = b.this;
                            bVar2.f10092l = true;
                            T4.a aVar = (T4.a) bVar2.f10089i.get(b.this.f10097q);
                            aVar.l();
                            R4.a.c("Executing: " + aVar.g() + " with context: " + b.this.f10083c);
                            b.this.f10088h.write(aVar.g());
                            b.this.f10088h.flush();
                            b.this.f10088h.write("\necho F*D^W@#FGF " + b.this.f10098r + " $?\n");
                            b.this.f10088h.flush();
                            b.m(b.this);
                            b.v(b.this);
                        } else if (b.this.f10090j) {
                            b bVar3 = b.this;
                            bVar3.f10092l = false;
                            bVar3.f10088h.write("\nexit 0\n");
                            b.this.f10088h.flush();
                            R4.a.c("Closing shell");
                            b.this.f10097q = 0;
                            b bVar4 = b.this;
                            bVar4.C(bVar4.f10088h);
                            return;
                        }
                    } finally {
                        b.this.f10097q = 0;
                        b bVar5 = b.this;
                        bVar5.C(bVar5.f10088h);
                    }
                } catch (IOException e8) {
                    e = e8;
                    R4.a.d(e.getMessage(), a.c.ERROR, e);
                    b.this.f10097q = 0;
                    b bVar6 = b.this;
                    bVar6.C(bVar6.f10088h);
                    return;
                } catch (InterruptedException e9) {
                    e = e9;
                    R4.a.d(e.getMessage(), a.c.ERROR, e);
                    b.this.f10097q = 0;
                    b bVar62 = b.this;
                    bVar62.C(bVar62.f10088h);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0204b extends Thread {
        C0204b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (b.this.f10089i) {
                b.this.f10089i.notifyAll();
            }
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {
        c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
        
            r9.f10105a.f10085e.waitFor();
            r9.f10105a.f10085e.destroy();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:
        
            r9.f10105a.K(r1);
            r4 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
        
            if (r1.f10060c <= r1.f10061d) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0154, code lost:
        
            if (r4 != 0) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
        
            r4 = r4 + 1;
            R4.a.c("Waiting for output to be processed. " + r1.f10061d + " Of " + r1.f10060c);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
        
            monitor-enter(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x017b, code lost:
        
            wait(com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
        
            monitor-exit(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
        
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
        
            R4.a.c(r5.getMessage());
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: T4.b.c.run():void");
        }
    }

    /* loaded from: classes5.dex */
    public enum d {
        NORMAL("normal"),
        SHELL("u:r:shell:s0"),
        SYSTEM_SERVER("u:r:system_server:s0"),
        SYSTEM_APP("u:r:system_app:s0"),
        PLATFORM_APP("u:r:platform_app:s0"),
        UNTRUSTED_APP("u:r:untrusted_app:s0"),
        RECOVERY("u:r:recovery:s0");


        /* renamed from: a, reason: collision with root package name */
        private String f10114a;

        d(String str) {
            this.f10114a = str;
        }

        public String b() {
            return this.f10114a;
        }
    }

    /* loaded from: classes5.dex */
    public enum e {
        NORMAL,
        ROOT,
        CUSTOM
    }

    /* loaded from: classes5.dex */
    protected static class f extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public int f10119a;

        /* renamed from: b, reason: collision with root package name */
        public b f10120b;

        /* synthetic */ f(b bVar, a aVar) {
            this(bVar);
        }

        private void a() {
            Field declaredField;
            try {
                Class<?> cls = this.f10120b.f10085e.getClass();
                try {
                    declaredField = cls.getDeclaredField("pid");
                } catch (NoSuchFieldException unused) {
                    declaredField = cls.getDeclaredField("id");
                }
                declaredField.setAccessible(true);
                int intValue = ((Integer) declaredField.get(this.f10120b.f10085e)).intValue();
                this.f10120b.f10088h.write("(echo -17 > /proc/" + intValue + "/oom_adj) &> /dev/null\n");
                this.f10120b.f10088h.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
                this.f10120b.f10088h.flush();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f10120b.f10088h.write("echo Started\n");
                this.f10120b.f10088h.flush();
                while (true) {
                    String readLine = this.f10120b.f10086f.readLine();
                    if (readLine != null) {
                        if (!"".equals(readLine)) {
                            if (!"Started".equals(readLine)) {
                                this.f10120b.f10084d = "unknown error occurred.";
                            } else {
                                this.f10119a = 1;
                                a();
                                return;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } catch (IOException e8) {
                this.f10119a = -42;
                if (e8.getMessage() == null) {
                    this.f10120b.f10084d = "RootAccess denied?.";
                } else {
                    this.f10120b.f10084d = e8.getMessage();
                }
            }
        }

        private f(b bVar) {
            this.f10119a = -911;
            this.f10120b = bVar;
        }
    }

    private b(String str, e eVar, d dVar, int i8) {
        this.f10081a = 25000;
        a aVar = null;
        this.f10082b = null;
        d dVar2 = d.NORMAL;
        this.f10083c = dVar2;
        this.f10084d = "";
        this.f10089i = new ArrayList();
        this.f10090j = false;
        this.f10091k = null;
        this.f10092l = false;
        this.f10093m = false;
        this.f10094n = false;
        this.f10095o = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
        this.f10096p = 0;
        this.f10097q = 0;
        this.f10098r = 0;
        this.f10099s = 0;
        this.f10100t = false;
        this.f10101u = new a();
        this.f10102v = new c();
        R4.a.c("Starting shell: " + str);
        R4.a.c("Context: " + dVar.b());
        R4.a.c("Timeout: " + i8);
        this.f10082b = eVar;
        this.f10081a = i8 <= 0 ? this.f10081a : i8;
        this.f10083c = dVar;
        if (dVar == dVar2) {
            this.f10085e = Runtime.getRuntime().exec(str);
        } else {
            String H8 = H(false);
            String H9 = H(true);
            if (I() && H8 != null && H9 != null && H8.endsWith("SUPERSU") && Integer.valueOf(H9).intValue() >= 190) {
                str = str + " --context " + this.f10083c.b();
            } else {
                R4.a.c("Su binary --context switch not supported!");
                R4.a.c("Su binary display version: " + H8);
                R4.a.c("Su binary internal version: " + H9);
                R4.a.c("SELinuxEnforcing: " + I());
            }
            this.f10085e = Runtime.getRuntime().exec(str);
        }
        this.f10086f = new BufferedReader(new InputStreamReader(this.f10085e.getInputStream(), C.UTF8_NAME));
        this.f10087g = new BufferedReader(new InputStreamReader(this.f10085e.getErrorStream(), C.UTF8_NAME));
        this.f10088h = new OutputStreamWriter(this.f10085e.getOutputStream(), C.UTF8_NAME);
        f fVar = new f(this, aVar);
        fVar.start();
        try {
            fVar.join(this.f10081a);
            int i9 = fVar.f10119a;
            if (i9 == -911) {
                try {
                    this.f10085e.destroy();
                } catch (Exception unused) {
                }
                B(this.f10086f);
                B(this.f10087g);
                C(this.f10088h);
                throw new TimeoutException(this.f10084d);
            }
            if (i9 != -42) {
                Thread thread = new Thread(this.f10101u, "Shell Input");
                thread.setPriority(5);
                thread.start();
                Thread thread2 = new Thread(this.f10102v, "Shell Output");
                thread2.setPriority(5);
                thread2.start();
                return;
            }
            try {
                this.f10085e.destroy();
            } catch (Exception unused2) {
            }
            B(this.f10086f);
            B(this.f10087g);
            C(this.f10088h);
            throw new S4.a("Root Access Denied");
        } catch (InterruptedException unused3) {
            fVar.interrupt();
            Thread.currentThread().interrupt();
            throw new TimeoutException();
        }
    }

    public static void A() {
        R4.a.c("Request to close custom shell!");
        b bVar = f10079y;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void D() {
        R4.a.c("Request to close root shell!");
        b bVar = f10077w;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    public static void E() {
        R4.a.c("Request to close normal shell!");
        b bVar = f10078x;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    private synchronized String H(boolean z8) {
        int i8;
        String str;
        i8 = !z8 ? 1 : 0;
        try {
            if (f10080z[i8] == null) {
                String str2 = null;
                try {
                    Runtime runtime = Runtime.getRuntime();
                    if (z8) {
                        str = "su -V";
                    } else {
                        str = "su -v";
                    }
                    Process exec = runtime.exec(str, (String[]) null);
                    exec.waitFor();
                    ArrayList<String> arrayList = new ArrayList();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                arrayList.add(readLine);
                            }
                        } catch (IOException unused) {
                        }
                        try {
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                    bufferedReader.close();
                    exec.destroy();
                    for (String str3 : arrayList) {
                        if (!z8) {
                            if (str3.contains(".")) {
                            }
                        } else {
                            try {
                            } catch (NumberFormatException unused3) {
                                continue;
                            }
                            if (Integer.parseInt(str3) > 0) {
                            }
                        }
                        str2 = str3;
                    }
                    f10080z[i8] = str2;
                } catch (IOException e8) {
                    e8.printStackTrace();
                    return null;
                } catch (InterruptedException e9) {
                    e9.printStackTrace();
                    return null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10080z[i8];
    }

    public static b L() {
        return M(0, 3);
    }

    public static b M(int i8, int i9) {
        return N(i8, f10076A, i9);
    }

    public static b N(int i8, d dVar, int i9) {
        int i10;
        b bVar = f10077w;
        if (bVar == null) {
            R4.a.c("Starting Root Shell!");
            int i11 = 0;
            while (f10077w == null) {
                try {
                    R4.a.c("Trying to open Root Shell, attempt #" + i11);
                    f10077w = new b(DownloadCommon.DOWNLOAD_REPORT_SUCCESS, e.ROOT, dVar, i8);
                } catch (S4.a e8) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        R4.a.c("RootDeniedException, could not start shell");
                        throw e8;
                    }
                    i11 = i10;
                } catch (IOException e9) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        R4.a.c("IOException, could not start shell");
                        throw e9;
                    }
                    i11 = i10;
                } catch (TimeoutException e10) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        R4.a.c("TimeoutException, could not start shell");
                        throw e10;
                    }
                    i11 = i10;
                }
            }
        } else if (bVar.f10083c != dVar) {
            try {
                R4.a.c("Context is different than open shell, switching context... " + f10077w.f10083c + " VS " + dVar);
                f10077w.O(dVar);
            } catch (S4.a e11) {
                if (i9 <= 0) {
                    R4.a.c("RootDeniedException, could not switch context!");
                    throw e11;
                }
            } catch (IOException e12) {
                if (i9 <= 0) {
                    R4.a.c("IOException, could not switch context!");
                    throw e12;
                }
            } catch (TimeoutException e13) {
                if (i9 <= 0) {
                    R4.a.c("TimeoutException, could not switch context!");
                    throw e13;
                }
            }
        } else {
            R4.a.c("Using Existing Root Shell!");
        }
        return f10077w;
    }

    static /* synthetic */ int e(b bVar) {
        int i8 = bVar.f10099s;
        bVar.f10099s = i8 + 1;
        return i8;
    }

    static /* synthetic */ int m(b bVar) {
        int i8 = bVar.f10097q;
        bVar.f10097q = i8 + 1;
        return i8;
    }

    static /* synthetic */ int q(b bVar) {
        int i8 = bVar.f10096p;
        bVar.f10096p = i8 + 1;
        return i8;
    }

    static /* synthetic */ int v(b bVar) {
        int i8 = bVar.f10098r;
        bVar.f10098r = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f10100t = true;
        int i8 = this.f10095o;
        int abs = Math.abs(i8 - (i8 / 4));
        R4.a.c("Cleaning up: " + abs);
        for (int i9 = 0; i9 < abs; i9++) {
            this.f10089i.remove(0);
        }
        this.f10096p = this.f10089i.size() - 1;
        this.f10097q = this.f10089i.size() - 1;
        this.f10100t = false;
    }

    public static void z() {
        R4.a.c("Request to close all shells!");
        E();
        D();
        A();
    }

    public int F(T4.a aVar) {
        return this.f10089i.indexOf(aVar);
    }

    public String G(T4.a aVar) {
        return "Command is in position " + F(aVar) + " currently executing command at position " + this.f10097q + " and the number of commands is " + this.f10089i.size();
    }

    public synchronized boolean I() {
        boolean z8;
        try {
            if (this.f10091k == null) {
                Boolean bool = null;
                if (new File("/sys/fs/selinux/enforce").exists()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream("/sys/fs/selinux/enforce");
                        try {
                            if (fileInputStream.read() == 49) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            bool = Boolean.valueOf(z8);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (Exception unused) {
                    }
                }
                if (bool == null) {
                    bool = true;
                }
                this.f10091k = bool;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f10091k.booleanValue();
    }

    protected void J() {
        new C0204b().start();
    }

    public void K(T4.a aVar) {
        String readLine;
        while (this.f10087g.ready() && aVar != null && (readLine = this.f10087g.readLine()) != null) {
            try {
                aVar.j(aVar.f10071n, readLine);
            } catch (Exception e8) {
                R4.a.d(e8.getMessage(), a.c.ERROR, e8);
                return;
            }
        }
    }

    public b O(d dVar) {
        if (this.f10082b == e.ROOT) {
            try {
                D();
            } catch (Exception unused) {
                R4.a.c("Problem closing shell while trying to switch context...");
            }
            return N(this.f10081a, dVar, 3);
        }
        R4.a.c("Can only switch context on a root shell!");
        return this;
    }

    public T4.a w(T4.a aVar) {
        if (!this.f10090j) {
            if (aVar.f10064g) {
                throw new IllegalStateException("This command has already been executed. (Don't re-use command instances.)");
            }
            do {
            } while (this.f10100t);
            this.f10089i.add(aVar);
            J();
            return aVar;
        }
        throw new IllegalStateException("Unable to add commands to a closed shell");
    }

    public void y() {
        R4.a.c("Request to close shell!");
        int i8 = 0;
        while (this.f10092l) {
            R4.a.c("Waiting on shell to finish executing before closing...");
            i8++;
            if (i8 > 10000) {
                break;
            }
        }
        synchronized (this.f10089i) {
            this.f10090j = true;
            J();
        }
        R4.a.c("Shell Closed!");
        if (this == f10077w) {
            f10077w = null;
        } else if (this == f10078x) {
            f10078x = null;
        } else if (this == f10079y) {
            f10079y = null;
        }
    }
}
